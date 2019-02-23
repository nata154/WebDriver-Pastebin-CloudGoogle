package com.training.epam.pastebin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageObject_Runner {
    String base_url = "https://pastebin.com";
    WebDriver driver = null;

    @BeforeClass
    public void beforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "c:/Users/Тоха/IdeaProjects/webDriver/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void tstPastebin() throws InterruptedException {
        driver.get(base_url);

        PageObject page = PageFactory.initElements(driver, PageObject.class);
        //PageObject page = new PageObject(driver);
        page.clickButtonCreateNew();
       // Thread.sleep(1000);
        page.enterCode("Hello from WebDriver");
        page.pasteExpiration();
        page.pasteName("helloWeb");
        page.clickSubmit();
    }
}
