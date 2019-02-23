package com.training.epam.googleCloud;

import com.training.epam.pastebin.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class PageObject_forGoogleCloud {
    private WebDriver driver;

    public PageObject_forGoogleCloud (WebDriver driver){
        this.driver = driver;
    }

    @FindBy (xpath = "//div[@class='cloud-section-header__link']/a[@track-name='exploreProducts']")
    private WebElement buttonExploreAllProducts;

    @FindBy (xpath = "//div[@class='cloud-button__set']//a[contains(text(),'See Pricing')]")
    //*[@id="cloud-site"]/nav/div/div/ul/li[3]/a
    //(xpath = "//div[@class='cloud-button__set']//a(text(),'See Pricing')")
    //(xpath = "//div[@class='cloud-button__set']//a[contains(text(),'See Pricing')]"
    private WebElement buttonSeePricing;

    @FindBy (xpath = "//li//a[contains(text(), 'Calculators')]")
    //article[@id='cloud-site']//li//a[contains(text(), 'Calculators')]"
    //li//a[contains(text(), 'Calculators')]"   element not interactable
    //article[@id='cloud-site']/nav/div/div/ul/li[3]/a
    private WebElement findCalculator;

    public void getToComputeEngine() throws InterruptedException {
        buttonExploreAllProducts.click();
        buttonSeePricing.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        findCalculator.click();//element not interactable
        Thread.sleep(5000);
        //return this;
    }



}
