import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFirefox3 {
    WebDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    // 1.        System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
// 2.        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
// 2.       capabilities.setCapability("marionette", false);
// 2.       capabilities.setCapability("firefox_binary", new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());
// 2.       WebDriver driver = new FirefoxDriver(capabilities);

    @Test
    public void TestFirefox3() {
        wd.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F");
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("admin");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys("admin");
        wd.findElement(By.name("login")).click();
        wd.findElement(By.xpath("//li[@id='app-']//span[.='Appearence']")).click();
        wd.findElement(By.xpath("//ul[@id='box-apps-menu']//span[.='Catalog']")).click();
        wd.findElement(By.xpath("//ul[@id='box-apps-menu']//span[.='Countries']")).click();
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
