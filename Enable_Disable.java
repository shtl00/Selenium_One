package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Enable_Disable {
    WebDriver driver;
    String baseURL="https://www.letskodeit.com/practice";
    @Before
    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);
    }
    @Test
    public void enableTest() throws InterruptedException {

        driver.findElement(By.id("enabled-button")).click();
        Boolean isTexInputboxEnabled = driver.findElement(By.id("enabled-example-input")).isEnabled();
        System.out.println(isTexInputboxEnabled);
        assertTrue(isTexInputboxEnabled);
        Thread.sleep(4000);
        driver.findElement(By.id("enabled-example-input")).sendKeys("sheetal");
        Thread.sleep(4000);
        String myActulURL=driver.getCurrentUrl();
        System.out.println(myActulURL);
        System.out.println(baseURL);
        assertEquals(baseURL,myActulURL);
    }
    @Test
    public void disabledTest(){
        driver.findElement(By.id("disabled-button")).click();
        Boolean isTextInputboxDisabled=driver.findElement(By.id("enabled-button")).isEnabled();
    }
    @After
    public void closeTest(){
        driver.close();
    }
}


