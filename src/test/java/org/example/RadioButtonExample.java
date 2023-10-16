package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class RadioButtonExample {
    WebDriver driver;
    @Before
    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
    }
    @Test
    public void openLetskodeitWebsite() throws InterruptedException {

       driver.findElement(By.id("bmwradio")).click();
       Boolean isBmwSelected = driver.findElement(By.id("bmwradio")).isSelected();
        System.out.println(isBmwSelected);
      assertTrue(isBmwSelected);
       Thread.sleep(4000);
       driver.findElement(By.id("benzradio")).click();
       Thread.sleep(4000);
   }
   @After
    public void closeTest(){
        driver.close();
   }
}
