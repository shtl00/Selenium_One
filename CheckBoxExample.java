package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class CheckBoxExample {
    WebDriver driver;
    @Before
    public void setupChrome(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openLetsKodIt() throws InterruptedException {
        driver.get("https://www.letskodeit.com/practice");
        driver.findElement(By.id("bmwradio")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("benzradio")).click();
    }
    @After
    public void tesClose(){
        driver.close();
    }
}
