package stepDefinitions;

import elementsLocators.P01_SigninSignupLocs;
import elementsLocators.P02_NewUserLocs;
import elementsLocators.P00_AssertLocs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {
    static public ChromeDriver driver;

    P01_SigninSignupLocs SignUpInLocs = new P01_SigninSignupLocs();
    P02_NewUserLocs Registerlocs = new P02_NewUserLocs();
    P00_AssertLocs AssertLocs = new P00_AssertLocs();

    @Given("user open website")
    public void user_open_website() {
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
    }

    @And("user go to signup page")
    public void user_go_to_signup_page() {
        SignUpInLocs.getSignupPageLoc().click();
    }

    @When("user send his name")
    public void user_send_his_name() {
        SignUpInLocs.getSignupNameLoc().sendKeys("Mohamed Shahin");
    }

    @And("send his email")
    public void send_his_email() {
        SignUpInLocs.getSignupEmailLoc().sendKeys("moshahinn8uu+1e56ss52@gmail.com");
    }

    @Then("click signup button")
    public void click_signup_button() {
        SignUpInLocs.getsignupButt().click();
    }

    @When("user select title type")
    public void user_select_title_type() {
        Registerlocs.getTitleLoc().click();
    }

    @And("user fills Password fields")
    public void user_fills_Password_fields() {
        Registerlocs.getPassFieldLoc().sendKeys("P@ssword");
    }

    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
        Select selDay = new Select(Registerlocs.getDayofBirthLoc());
        selDay.selectByIndex(1);
        Select selMonth = new Select(Registerlocs.getMonthofBirthLoc());
        selMonth.selectByIndex(8);
        Select selYear = new Select(Registerlocs.getYearofBirthLoc());
        selYear.selectByValue("1994");
    }

    @And("user enter first name")
    public void user_enter_first_name() {
        Registerlocs.getFirstnameLoc().sendKeys("Mohamed");
    }

    @And("user enter last name")
    public void user_enter_last_name() {
        Registerlocs.getLastnameLoc().sendKeys("Shahin");
    }

    @And("user enter address")
    public void user_enter_address() {
        Registerlocs.getAddressLoc().sendKeys("6th October City");
    }

    @And("user choose country")
    public void user_choose_country(){
        Select selCountry = new Select(Registerlocs.getCountryLoc());
        selCountry.selectByValue("United States");
    }

    @And("user enter state")
    public void user_enter_state(){
        Registerlocs.getStateLoc().sendKeys("Cairo");
    }

    @And("user enter city")
    public void user_enter_city(){
        Registerlocs.getCityLoc().sendKeys("6th October");
    }
    @And("user enter Zipcode")
    public void user_enter_Zipcode(){
        Registerlocs.getZibcodeLoc().sendKeys("12573");
    }

    @And("user enter mobile number")
    public void user_enter_mobile_number(){
        Registerlocs.getMobileNumLoc().sendKeys("0111111111");
    }

    @Then("user clicks on create account button")
        public void user_clicks_on_create_account_button(){
        Registerlocs.getCreateAccButLoc().click();
    }

    @Then("Account Created is displayed")
        public void Account_Created_is_displayed() {
        //for hard assertion
        Boolean actulal_greenMessage = AssertLocs.getAccountCreatedMessage().isDisplayed();
        Assert.assertTrue(actulal_greenMessage, "Account Created is not displayed");

        Boolean actual_ConButton = AssertLocs.getContinueButLoc().isDisplayed();
        Assert.assertEquals(actual_ConButton, true,"Button is not  appears");

        //for soft assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actulal_greenMessage,"Green message");
        soft.assertTrue(actual_ConButton, "Continue Button");
        soft.assertAll();
        driver.quit();

    }
}