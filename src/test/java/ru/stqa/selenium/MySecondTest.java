package ru.stqa.selenium; /**
 * Created by Owner on 3/12/2017.
 */

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MySecondTest extends TestBase {

    @Test
    public void myFirstTest() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void mySecondTest() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
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

    @Test
    public void test4() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test5() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test6() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test7() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test8() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test9() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test10() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test11() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test12() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test13() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test14() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }

    @Test
    public void test15() {
        TestBase.driver.navigate().to("http://www.google.com");
        TestBase.driver.findElement(By.name("q")).sendKeys("webdriver");
        TestBase.driver.findElement(By.name("btnG")).click();
        TestBase.wait.until(titleIs("webdriver - Поиск в Google"));
    }
}