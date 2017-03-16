package ru.stqa.selenium; /**
 * Created by Owner on 3/12/2017.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest extends TestBase {

    @Test
    public void myFirstTest() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void mySecondTest() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.wait.until((WebDriver d) -> d.findElement(By.name("q"))).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void myThirdTest() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }
}
