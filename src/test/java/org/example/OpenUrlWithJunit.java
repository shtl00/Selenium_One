package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlWithJunit {
    WebDriver driver;
    @Before
    public void setUpChrome(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }
    @Test
    public void openNextWebsite(){
        driver.manage().window().maximize();
        driver.get("https://www2.next.co.uk/");
    }
    @Test
    public void openArgosWebsite(){

        driver.get("https://www.argos.co.uk/");
    }
    @After
    public void closeTest(){
        driver.close();
    }

}
