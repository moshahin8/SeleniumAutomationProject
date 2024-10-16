package stepDefinitions;

import elementsLocators.P00_AssertLocs;
import elementsLocators.P04_UploadFile_DragDropLocs;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class D04_UploadFile_DragDropDef {


   static public ChromeDriver driver;
    P04_UploadFile_DragDropLocs UploadDragLocs = new P04_UploadFile_DragDropLocs();
    P00_AssertLocs AssertLoc = new P00_AssertLocs();

   @Given("user open upload website")
    public void user_open_upload_website(){
       driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/");
   }

    @And("user go to upload page")
        public void user_go_to_upload_page() {
        UploadDragLocs.getUploadFilePageLoc().click();
    }

   @And("user choose the file to upload")
    public void user_choose_the_file_to_upload() {
       UploadDragLocs.getChooseFileLoc().sendKeys("C:\\Users\\Shahin\\Downloads\\sheet.csv");
   }
    @And("user click upload button")
    public void user_click_upload_button(){
    UploadDragLocs.getUploadButtonLoc().click();
   }

    @Then("file uploaded appears")
    public void file_uploaded_appears(){
       boolean actual = AssertLoc.getFileUploadedLoc().isDisplayed();
       Assert.assertTrue(actual);
       driver.quit();

    }
}
