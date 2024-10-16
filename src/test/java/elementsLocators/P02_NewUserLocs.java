package elementsLocators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.D01_registerStepDef;

import java.lang.ref.WeakReference;

public class P02_NewUserLocs {


    public WebElement getTitleLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[value=\"Mr\"]"));
    }
    public WebElement getPassFieldLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[data-qa=\"password\"]"));
    }

    public WebElement getDayofBirthLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("select[name=\"days\"]"));
    }
    public WebElement getMonthofBirthLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("select[id=\"months\"]"));
    }
    public WebElement getYearofBirthLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("select[data-qa=\"years\"]"));
    }

    public WebElement getFirstnameLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[id=\"first_name\"]"));
    }
    public WebElement getLastnameLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[data-qa=\"last_name\"]"));
    }

    public WebElement getAddressLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[id=\"address1\"]"));
    }

    public WebElement getCountryLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("select[name=\"country\"]"));
    }

    public WebElement getStateLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[id=\"state\"]"));
    }
    public WebElement getCityLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[name=\"city\"]"));
    }

    public WebElement getZibcodeLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[id=\"zipcode\"]"));
    }

    public WebElement getMobileNumLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("input[id=\"mobile_number\"]"));
    }

    public WebElement getCreateAccButLoc(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("button[data-qa=\"create-account\"]"));
    }
    public WebElement getRegMessage(){
        return D01_registerStepDef.driver.findElement(By.cssSelector("class=\"result\""));
    }

}


