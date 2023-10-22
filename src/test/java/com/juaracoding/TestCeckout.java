package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginQa;
import com.juaracoding.pages.QaCheckout;
import com.juaracoding.utils.Constants;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCeckout {
    private static WebDriver driver;
    private static QaCheckout qaCheckout;
    private static LoginQa loginQa;

    @BeforeAll
    public static void setup() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        loginQa = new LoginQa();
        qaCheckout = new QaCheckout();
    }

    @AfterAll
    public static void finish() {
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

    // TCC.DEMOQA.004
    @When("User login")
    public void user_login() {
       loginQa.clickBtnLogin();
    }
    @And("User click halaman beranda web")
    public void user_halaman_beranda_web(){
        qaCheckout.clickHalamanBeranda();
    }
    @And("User click product")
    public void user_click_product(){
        qaCheckout.clickAddProduct();
    }
    @And("User click color product")
    public void user_click_color_product(){
        qaCheckout.clickAddColorProduct();
    }
    @And("User click size product")
    public void user_click_size_product(){
        qaCheckout.clickaddSizeProduct();
    }
    @And("User click add to cart")
    public void user_click_add_to_cart(){
        qaCheckout.clickaddToCart();
    }
    @And("User click view cart")
    public void user_click_view_cart(){
        qaCheckout.clickViewCart();
    }
    @And("User click button ceckout product")
    public void user_click_button_ceckout_product(){
        qaCheckout.clickBtnCeckout();
    }
    @Then("User get text billing details")
    public void User_get_text_billing_details(){
        Assert.assertEquals(qaCheckout.getTxtBillingDetails(),"BILLING DETAILS");
    }
}
