package ru.stqa.selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class OilBudha {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    @Test
    public void OilBudha() {
        wd.get("http://localhost/litecart/admin/login.php?redirect_url=%2Flitecart%2Fadmin%2F%3Fapp%3Dcatalog%26doc%3Dcatalog%26category_id%3D0");
        wd.findElement(By.cssSelector("td.content")).click();
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys("admin");
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).sendKeys("admin");
        wd.findElement(By.name("login")).click();
        wd.findElement(By.xpath("//a[normalize-space(.)='Add New Product']")).click();
        wd.findElement(By.name("name[en]")).click();
        if (!wd.findElement(By.name("status")).isSelected()) {
            wd.findElement(By.name("status")).click();
        }
        wd.findElement(By.name("name[en]")).click();
        wd.findElement(By.name("name[en]")).clear();
        wd.findElement(By.name("name[en]")).sendKeys("Oil Budha");
        wd.findElement(By.name("code")).click();
        wd.findElement(By.name("code")).clear();
        wd.findElement(By.name("code")).sendKeys("123456");
        if (!wd.findElement(By.name("product_groups[]")).isSelected()) {
            wd.findElement(By.name("product_groups[]")).click();
        }
        wd.findElement(By.name("quantity")).click();
        wd.findElement(By.name("quantity")).clear();
        wd.findElement(By.name("quantity")).sendKeys("3");
        wd.findElement(By.name("new_images[]")).click();
        wd.findElement(By.linkText("Information")).click();
        if (!wd.findElement(By.xpath("//div[@id='tab-information']//select[normalize-space(.)='-- Select -- ACME Corp.']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='tab-information']//select[normalize-space(.)='-- Select -- ACME Corp.']//option[2]")).click();
        }
        wd.findElement(By.linkText("Data")).click();
        wd.findElement(By.name("dim_x")).click();
        wd.findElement(By.name("dim_x")).clear();
        wd.findElement(By.name("dim_x")).sendKeys("400");
        wd.findElement(By.name("dim_y")).click();
        wd.findElement(By.name("dim_y")).clear();
        wd.findElement(By.name("dim_y")).sendKeys("566");
        wd.findElement(By.name("dim_z")).click();
        wd.findElement(By.name("dim_z")).clear();
        wd.findElement(By.name("dim_z")).sendKeys("566");
        wd.findElement(By.linkText("Prices")).click();
        wd.findElement(By.name("purchase_price")).click();
        wd.findElement(By.name("purchase_price")).clear();
        wd.findElement(By.name("purchase_price")).sendKeys("20");
        wd.findElement(By.linkText("General")).click();
        wd.findElement(By.name("save")).click();
        wd.findElement(By.linkText("Catalog")).click();
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
