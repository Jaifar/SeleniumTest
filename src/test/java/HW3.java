import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HW3 {
    FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

    @Test
    public void HW3() {
        wd.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).sendKeys("\\undefined");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).sendKeys("\\undefined");
        wd.findElement(By.cssSelector("td.content")).click();
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("admin");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("admin");
        wd.findElement(By.name("login")).click();
        wd.findElement(By.xpath("//li[@id='widget-stats']//td[.='Number of Customers:']")).click();
        wd.navigate().back();
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).sendKeys("\\undefined");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).sendKeys("\\undefined");
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
