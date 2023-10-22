package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginQa;
import com.juaracoding.utils.Constants;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static LoginQa loginQa;

    @BeforeAll
    public static void setup() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        loginQa = new LoginQa();
    }

    @AfterAll
    public static void finish() {
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }

    // TCC.DEMOQA.001
    @Given("User enter url DEMOQA")
    public void user_enter_url_DEMOQA() {
        driver.get(Constants.URL);
    }
    @When("User input valid username")
    public void user_input_valid_username() {
        loginQa.inputUsername("farandy");
    }

    @And("User input valid password")
    public void user_input_valid_password() {
        loginQa.inputPassword("Farandy10_");
    }

    // Click button login cukup hanya satu
    @And("User click button login")
    public void user_click_button_login() {
        loginQa.clickBtnLogin();
    }

    @Then("User get text account on dashboard")
    public void user_get_text_account_on_dashboard() {
        Assert.assertEquals(loginQa.getTxtAccount(), "From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.");
    }

    // TCC.HRM.002
    @Given("User logout")
    public void user_logout() {
        loginQa.logout();
    }

    @And("User input invalid password")
    public void user_input_invalid_password() {
        loginQa.inputPassword("farandy100");
    }

    @Then("User get text password incorret")
    public void user_get_text_password_incorret() {
        Assert.assertEquals(loginQa.getTxtPasswordIncorret(), "ERROR: The username or password you entered is incorrect. Lost your password?");
    }

    //TCC.HRM.003
    @Given("User input empty password")
    public void user_input_empty_password(){
        loginQa.inputPassword("");
    }
    @Then("User get text password empty")
    public void user_get_text_password_empty(){
        Assert.assertEquals(loginQa.getTxtPasswordEmpty(), "Error: The password field is empty.");
    }
}
