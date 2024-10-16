package elementsLocators;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.D01_registerStepDef;
import stepDefinitions.D02_LogInStepDef;
import stepDefinitions.D03_purchaseStepDef;
import stepDefinitions.D04_UploadFile_DragDropDef;

public class P00_AssertLocs {

    public WebElement getAccountCreatedMessage(){
        return D01_registerStepDef.driver.findElement(By.className("text-center"));
    }
    public WebElement getContinueButLoc(){
        return D01_registerStepDef.driver.findElement(By.xpath("//b"));
    }

    public WebElement getLoggedInUser(){
        return D02_LogInStepDef.driver.findElement(By.xpath("//b[text()]//parent::a//b"));
    }
    public WebElement getWrongPassAndEmailMessage(){
        return D02_LogInStepDef.driver.findElement(By.cssSelector("p[style=\"color: red;\"]"));
    }
    public WebElement getOrderPlacedLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("h2[data-qa=\"order-placed\"]"));
    }

    public WebElement getFileUploadedLoc(){
        return D04_UploadFile_DragDropDef.driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
    }


}
