package stepDefinitions;

import elementsLocators.P00_AssertLocs;
import elementsLocators.P03_purchasePageLocs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D03_purchaseStepDef {
    static public ChromeDriver driver;


    P03_purchasePageLocs ProductLocs = new P03_purchasePageLocs();
    P00_AssertLocs AssertLocs = new P00_AssertLocs();
    @Given("user open logged in the website")
    public void user_open_logged_in_the_website(){
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.findElement(By.cssSelector("a[href=\"/login\"]")).click();
        driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]")).sendKeys("moshahinn8+1@gmail.com");
        driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]")).sendKeys("ZrJKxLVqxV5gWp@");
        driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]")).click();
    }

    @When("user go to product page")
    public void user_go_to_product_page(){

        driver.findElement(By.cssSelector("a[href=\"/products\"]")).click();
    }
    @And("user select Tshirts from men items")
    public void user_select_Tshirts_from_men_items(){
        ProductLocs.getMenProduct().click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf((ProductLocs.getTshirtProduct())));

        ProductLocs.getTshirtProduct().click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/img")));



    }
    @And("user add 2 items to cart")
    public void user_add_2_items_to_cart(){


        Actions hover = new Actions(driver);
        hover.moveToElement(ProductLocs.getFirstItemLoc()).perform();
        ProductLocs.getAddtoCartButtonFirsItem().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        ProductLocs.getContinueShoppingButtonLoc().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        ProductLocs.getSecondItemLoc().click();


        /*  hover.moveToElement(ProductLocs.getSecondItemLoc()).perform();
        ProductLocs.getAddtoCartButtonSecondItem().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        ProductLocs.getContinueShoppingButtonLoc().click();

        hover.moveToElement(ProductLocs.getThirdItemLoc()).perform();
        ProductLocs.getAddtoCartButtonThirdItem().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        ProductLocs.getContinueShoppingButtonLoc().click();*/
    }
    @And("user go to cart page and apply that 2 items is displayed and price by RS")
    public void user_go_to_cart_page_and_apply_that_2_items_is_displayed_and_price_by_RS(){
        ProductLocs.getCartPageLoc().click();
        for(int x=0; x<2; x++){
           boolean actual=  driver.findElements(By.className("cart_price")).get(x).getText().contains("Rs.");
            Assert.assertTrue(actual);
        }


    }
    @And("user go to the checkout page and makes sure the delivery address")
    public void user_go_to_the_checkout_page_and_makes_sure_the_delivery_address(){
        ProductLocs.getCheckoutPageLoc().click();
        boolean actual_1 = driver.findElements(By.className("address_address1")).get(1).getText().contains("October Gardens");
        Assert.assertTrue(actual_1);
        boolean actual_2 = driver.findElements(By.className("address_city")).get(0).getText().contains("Giza Cairo 12573");
        Assert.assertTrue(actual_2);
    }
    @And("user go to payment page")
    public void user_go_to_payment_page(){
        ProductLocs.getPlaceOrderLoc().click();
    }
    @And("user fill payment data")
    public void user_fill_payment_data(){
        ProductLocs.getCardNameLoc().sendKeys("Mohamed Shahin");
        ProductLocs.getCardNumLoc().sendKeys("123456789");
        ProductLocs.getCVCloc().sendKeys("123");
        ProductLocs.getExpMonthLoc().sendKeys("01");
        ProductLocs.getExpYearLoc().sendKeys("2030");
        ProductLocs.getPayButtonLoc().click();

    }
    @Then("user payed and order placed is display")
    public void user_payed_and_order_placed_is_display(){

        boolean actual= AssertLocs.getOrderPlacedLoc().isDisplayed();
        Assert.assertTrue(actual);
        driver.quit();
    }




}
