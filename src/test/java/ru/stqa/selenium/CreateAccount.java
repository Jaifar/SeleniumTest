package ru.stqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateAccount {
    FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    @Test
    public void CreateAccount() {
        wd.get("http://localhost/litecart/en/");
        wd.findElement(By.linkText("New customers click here")).click();
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("Tetiana");
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys("Teti");
        wd.findElement(By.name("address1")).click();
        wd.findElement(By.name("address1")).clear();
        wd.findElement(By.name("address1")).sendKeys("99 crossing");
        wd.findElement(By.name("postcode")).click();
        wd.findElement(By.name("postcode")).clear();
        wd.findElement(By.name("postcode")).sendKeys("03079");
        wd.findElement(By.name("city")).click();
        wd.findElement(By.name("city")).clear();
        wd.findElement(By.name("city")).sendKeys("Salem");
        wd.findElement(By.cssSelector(".select2-selection__arrow")).click();
        wd.findElement(By.xpath("//li[text() = 'United States']")).click();
//        wd.findElement(By.cssSelector("input.select2-search__field")).click();
//        wd.findElement(By.cssSelector("input.select2-search__field")).clear();
//        wd.findElement(By.cssSelector("input.select2-search__field")).sendKeys("United States");
//        wd.findElement(By.cssSelector("span.select2-selection.select2-selection--single")).click();
//        wd.findElement(By.cssSelector("span.select2-selection.select2-selection--single")).sendKeys("\n");
//        if (!wd.findElement(By.xpath("//div[@id='create-account']/div/form/table/tbody/tr[5]/td[2]/select//option[40]")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='create-account']/div/form/table/tbody/tr[5]/td[2]/select//option[40]")).click();
//        }
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys("t.kravchuk@gmail.com");
        wd.findElement(By.name("phone")).click();
        wd.findElement(By.name("phone")).clear();
        wd.findElement(By.name("phone")).sendKeys("+1978-9685469");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("JavaJava1987");
        wd.findElement(By.name("confirmed_password")).click();
        wd.findElement(By.name("confirmed_password")).clear();
        wd.findElement(By.name("confirmed_password")).sendKeys("JavaJava1987");
        wd.findElement(By.name("create_account")).click();
        wd.findElement(By.linkText("Logout")).click();
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys("teti.kravchuk@gmail.com");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("JavaJava1987");
        wd.findElement(By.name("login")).click();
        wd.findElement(By.linkText("Logout")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
