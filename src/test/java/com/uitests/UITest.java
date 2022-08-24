package com.uitests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class UITest {

    @Test
    public void startBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(8000);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(8000);
        Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
        System.out.println("The actual title matches the exact");
        driver.quit();
    }
}
