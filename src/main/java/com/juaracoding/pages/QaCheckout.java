package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaCheckout {

    private WebDriver driver;

    public QaCheckout(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //locator use Page Factory
    // Back To Home Web DemoQa
    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    private WebElement beranda;
    @FindBy(xpath = "//a[normalize-space()='Tokyo Talkies']")
    private WebElement addProduct;
    @FindBy(xpath = "(//select[@id='color'])[1]")
    private WebElement addColorProduct;
    @FindBy(xpath = "(//select[@id='size'])[1]")
    private WebElement addSizeProduct;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    private WebElement addToCart;
    @FindBy(xpath = "//span[@class='cart-name-and-total']")
    private WebElement viewCart;
    @FindBy(xpath = "//a[normalize-space()='Proceed to checkout']")
    private WebElement btnCeckout;
    @FindBy(xpath = "//h3[normalize-space()='Billing details']")
    private WebElement txtBillingDetails;

    //ubah menjadi method params
    public void clickHalamanBeranda(){
        beranda.click();
    }

    public void clickAddProduct(){
        addProduct.click();
    }
    public void clickAddColorProduct(){
        addColorProduct.click();
    }
    public void clickaddSizeProduct(){
        addSizeProduct.click();
    }
    public void clickaddToCart(){
        addToCart.click();
    }
    public void clickViewCart(){
        viewCart.click();
    }
    public void clickBtnCeckout(){
        btnCeckout.click();
    }

    public String getTxtBillingDetails(){
        return txtBillingDetails.getText();
    }

}
