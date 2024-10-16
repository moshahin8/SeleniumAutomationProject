package stepDefinitions;

import elementsLocators.P01_SigninSignupLocs;
import elementsLocators.P00_AssertLocs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class D02_LogInStepDef {
    static public ChromeDriver driver;

    P01_SigninSignupLocs SignUpInLocs = new P01_SigninSignupLocs();
    P00_AssertLocs AssertLocs = new P00_AssertLocs();
    @Given("user open the website")
        public void user_open_the_website(){
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
    }
    @And("user go to login page")
        public void user_go_to_login_page(){
        SignUpInLocs.getLogInPageLoc().click();
    }

    @When("user enter valid email")
        public void user_enter_valid_email(){
        SignUpInLocs.getLogInEmail().sendKeys("moshahinn8++@gmail.com");
    }
    @When("user enter valid password")
    public void user_enter_valid_password(){
        SignUpInLocs.getLogInPasswordLoc().sendKeys("P@ssword");
    }
    @And("user click on log in button")
    public void user_click_on_log_in_button(){
        SignUpInLocs.getLoginButtonLoc().click();
    }
    @And("user enter invalid email")
    public void user_enter_invalid_email(){
        SignUpInLocs.getLogInEmail().sendKeys("shahinn8@gmail.com");
    }

    @Then("user logged in as user name is display")
    public void user_logged_in_as_user_name_is_display(){

        SoftAssert softAssert =new SoftAssert();
        Boolean actual_userNameDisplay = AssertLocs.getLoggedInUser().isDisplayed();
        softAssert.assertTrue(actual_userNameDisplay,"Mohamed Shahin display");

        String URL = driver.getCurrentUrl();
        softAssert.assertEquals(URL,"https://automationexercise.com/");
        softAssert.assertAll();
        driver.quit();
    }

    @Then("user cannot login and wrong message appear")
    public void user_cannot_login_and_wrong_message_appear(){
        SoftAssert softAssert =new SoftAssert();
        Boolean actualWrongMessage = AssertLocs.getWrongPassAndEmailMessage().isDisplayed();
        softAssert.assertTrue(actualWrongMessage,"Your email or password is incorrect!");
        softAssert.assertAll();
        driver.quit();
    }










}
