package com.training.epam.pastebin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
    private WebDriverWait wait;
    private WebDriver driver;

    public PageObject(WebDriver driver) {
        //PageObject page = PageFactory.initElements(driver, PageObject.class);
        this.driver = driver;
        //this.wait = new WebDriverWait(this.driver, 30);
    }

    @FindBy(xpath = "//*[@id='header_new_paste']")
    private WebElement buttonCreateNew;

    @FindBy(xpath = "//*[@id='float-box-1']/span")
    private WebElement cookie;

    @FindBy(xpath = "//*[@id='float-box-3']/div[3]")
    private WebElement advert;

    @FindBy(xpath = "//form[@id='myform']//div[@class='textarea_border']/textarea[@id='paste_code']")
    private WebElement enterCodeField;

    @FindBy(xpath = "//form[@id='myform']/div[3]/div[2]/div[2]/span/span[1]/span/span[2]")
    private WebElement pasteExpirationField;

    @FindBy(xpath = "//span[@title='10 Minutes' and contains(text(), '10 Minutes')]")
//doesn't work
    //span[@title='10 Minutes' and contains(text(), '10 Minutes')]"
    //@FindBy(xpath = "//button[@class='btn btn-primary' and contains(text(), 'Submit')]") private WebElementFacade submitButton;
    //[@id='select2-paste_expire_date-1u-container'] and
    //span[@id='select2-paste_expire_date-1u-container' and contains(text(), '10 Minutes')]
    //span[text() = '10 Minutes'] and [@id='select2-paste_expire_date-1u-container']")
    //span[text()[contains(.,'10 Minutes')]]")
    //*[@id="select2-paste_expire_date-1u-container"]
    // <span class="select2-selection__rendered" id="select2-paste_expire_date-1u-container" title="1 Month">1 Month</span>
    private WebElement pasteExpirationMinutesField;

    @FindBy(xpath = "//form[@id='myform']//div//input[@name='paste_name']")

    private WebElement pasteNameField;

    @FindBy(xpath = "//form[@id='myform']//div[@class='form_right']/input[@id='submit']")
    private WebElement buttonSubmit;

    public PageObject clickButtonCreateNew() throws InterruptedException {
        cookie.click();
        advert.click();
        buttonCreateNew.click();
        return this;
    }

    public PageObject enterCode(String code) throws InterruptedException {
        enterCodeField.clear();
        enterCodeField.sendKeys(code);
        return this;
    }

    public PageObject pasteExpiration() {
        pasteExpirationField.click();
        pasteExpirationMinutesField.click();
        return this;
    }

    public PageObject pasteName(String name) {
        pasteNameField.clear();
        pasteNameField.sendKeys(name);
        return this;
    }

    public PageObject clickSubmit() {
        buttonSubmit.submit();
        // buttonSubmit.click();//not clickable
        return this;
    }

}
