import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() {
        wd.get("http://www.msn.com/?pc=SK216&ocid=SK216DHP&osmkt=en-us");
        wd.findElement(By.id("skypefreclose")).click();
        wd.findElement(By.linkText("Store")).click();
        wd.findElement(By.xpath("//div[@class='meflyouts']/div[2]/div/section/div/ul/li[1]/a/div/h3")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
