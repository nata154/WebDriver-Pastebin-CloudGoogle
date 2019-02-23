package com.training.epam.googleCloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageObject_forGoogleCloud_Runner {
    WebDriver driver = null;
    String base_url = "https://cloud.google.com/";

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver",
                "c:/Users/Тоха/IdeaProjects/webDriver/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }

    @Test
    public void testGoogleCloud() throws InterruptedException {
        driver.get(base_url);
        PageObject_forGoogleCloud page = PageFactory.initElements(driver, PageObject_forGoogleCloud.class);
        page.getToComputeEngine();
    }
}
