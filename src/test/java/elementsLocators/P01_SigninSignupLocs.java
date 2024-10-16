package elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.D01_registerStepDef;
import stepDefinitions.D02_LogInStepDef;
import stepDefinitions.D03_purchaseStepDef;

public class P01_SigninSignupLocs {
    public WebElement getSignupPageLoc() {
        return D01_registerStepDef.driver.findElement(By.cssSelector("a[href=\"/login\"]"));
    }
    public WebElement getLogInPageLoc(){
        return D02_LogInStepDef.driver.findElement(By.cssSelector("a[href=\"/login\"]"));
    }

    public WebElement getSignupNameLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[data-qa=\"signup-name\"]"));
    }

    public WebElement getSignupEmailLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]"));
    }

    public WebElement getsignupButt(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]"));
    }
     public WebElement getLogInEmail(){
        return D02_LogInStepDef.driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]"));
     }

     public WebElement getLogInPasswordLoc(){
        return D02_LogInStepDef.driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]"));
     }

     public WebElement getLoginButtonLoc(){
        return D02_LogInStepDef.driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]"));
     }



}
