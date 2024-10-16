package elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.D03_purchaseStepDef;

public class P03_purchasePageLocs {


    public WebElement getMenProduct(){
        return  D03_purchaseStepDef.driver.findElement(By.cssSelector("a[href=\"#Men\"]"));
    }

    public WebElement getTshirtProduct(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("a[href=\"/category_products/3\"]"));
    }
    public WebElement hoverProducts(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("div[class=\"product-overlay\"]"));
    }
    public WebElement getAddToCart01(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("a[data-product-id=\"2\"]"));
    }

    public WebElement getFirstItemLoc(){
        return D03_purchaseStepDef.driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]"));
    }
    public WebElement getAddtoCartButtonFirsItem(){
        return D03_purchaseStepDef.driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/a"));
    }
    public WebElement getContinueShoppingButtonLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("button[class=\"btn btn-success close-modal btn-block\"]"));
    }
    public WebElement getSecondItemLoc(){
        return D03_purchaseStepDef.driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[1]/div[1]/a"));
    }
    public WebElement getAddtoCartButtonSecondItem(){
        return D03_purchaseStepDef.driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/a"));
    }

    public WebElement getThirdItemLoc(){
        return D03_purchaseStepDef.driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[4]/div/div[1]/div[2]"));
    }
    public WebElement getAddtoCartButtonThirdItem(){
        return D03_purchaseStepDef.driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[4]/div/div[1]/div[2]/div/a"));
    }
    public WebElement getCartPageLoc(){
        return D03_purchaseStepDef.driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a"));
    }
    public WebElement getCheckoutPageLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("a[class=\"btn btn-default check_out\"]"));
    }
    public WebElement getPlaceOrderLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("a[class=\"btn btn-default check_out\"]"));
    }

    public WebElement getCardNameLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("input[class=\"form-control\"]"));
    }

    public WebElement getCardNumLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("input[data-qa=\"card-number\"]"));
    }

    public WebElement getCVCloc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("input[name=\"cvc\"]"));
    }
    public WebElement getExpMonthLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("input[name=\"expiry_month\"]"));
    }
    public WebElement getExpYearLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("input[data-qa=\"expiry-year\"]"));
    }
    public WebElement getPayButtonLoc(){
        return D03_purchaseStepDef.driver.findElement(By.cssSelector("button[data-qa=\"pay-button\"]"));
    }

}
/*public WebElement getsignupButt(){
    return D03_purchaseStepDef.driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]"));
}
public WebElement getLogInEmail(){
    return D03_purchaseStepDef.driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]"));
}

public WebElement getLogInPasswordLoc(){
    return D03_purchaseStepDef.driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]"));
}

public WebElement getLoginButtonLoc(){
    return D03_purchaseStepDef.driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]"));
}*/









