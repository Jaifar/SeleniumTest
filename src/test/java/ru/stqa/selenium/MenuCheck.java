package ru.stqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MenuCheck {
    WebDriver wd;

    @BeforeSuite
    public void setUp()  {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("admin");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("admin");
        wd.findElement(By.name("login")).click();

    }


    @DataProvider(name = "menuElements")
    public static Object[][] primeNumbers() {
        return new Object[][]{{"Appearence"}, {"Catalog"}, {"Countries"}, {"Currencies"}, {"Customers"},{"Geo Zones"},{"Geo Zones"}
                ,{"Languages"}, {"Modules"},{"Orders"}, {"Pages"},{"Reports"},{"Settings"},{"Slides"},
                {"Tax"}, {"Translations"},{"Users"},{"vQmods"}};
    }

    @Test(dataProvider = "menuElements")
    public void someTest(String menuElement) {
        wd.findElement(By.linkText(menuElement)).click();
        wd.findElement(By.xpath("//*[@id=\"content\"]/h1"));
    }


    @AfterSuite
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
