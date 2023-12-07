package com.unstop.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("src/main/java/com/unstop/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static WebElement acceptCookies = null;
    public static void initialization() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("URL"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        try{
            acceptCookies = driver.findElement(By.xpath("//*[@class='desk']"));
        } catch (Exception e)
        {
            // Cookies popup not found, continue with your script

        }
        if(acceptCookies!=null)
        {
            acceptCookies.click();
        }

    }
}
