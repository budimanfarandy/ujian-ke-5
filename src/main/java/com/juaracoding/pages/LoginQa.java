package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginQa {

    private WebDriver driver;

    public LoginQa(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    //locator use Page Factory
    // Halaman Login
    @FindBy(xpath = "//a[normalize-space()='My Account']")
    private WebElement myAccount;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement btnLogin;
    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']//a[contains(text(),'Log out')]")
    private WebElement btnLogout;
    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[2]")
    private WebElement txtAccount;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")
    private WebElement txtPasswordIncorret;

    @FindBy(xpath = "//div[@id='primary']//li[1]")
    private WebElement TxtPasswordEmpty;


    //ubah menjadi method params
    public void loginform(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
    }

    public void inputUsername(String username) {

        this.username.sendKeys(username);
    }

    public void inputPassword(String password) {

        this.password.sendKeys(password);
    }

    public void clickBtnLogin() {
        btnLogin.click();
    }

    public void logout(){
        btnLogout.click();
    }
    public String getTxtAccount(){
        return txtAccount.getText();
    }

    public String getTxtPasswordIncorret(){
        return txtPasswordIncorret.getText();
    }
    public String getTxtPasswordEmpty(){
        return TxtPasswordEmpty.getText();
    }


}
