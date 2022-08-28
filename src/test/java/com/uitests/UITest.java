package com.uitests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class UITest {

    @Parameters("Browser")
    @Test
    public void startBrowser(String browserName) throws InterruptedException {

        WebDriver driver = null;
        if(browserName.contains("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserName.contains("Edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--remote-debugging-port=9222");
            driver = new EdgeDriver(edgeOptions);

        }

        driver.manage().window().maximize();
        Thread.sleep(8000);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(8000);
        Assert.assertTrue(driver.getTitle().contains("Orange"),"Title does not match");
        System.out.println("The actual title matches the exact");
        driver.quit();
    }
}
