package elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.D04_UploadFile_DragDropDef;

public class P04_UploadFile_DragDropLocs {

    public WebElement getUploadFilePageLoc(){
        return D04_UploadFile_DragDropDef.driver.findElement(By.cssSelector("a[href=\"/upload\"]"));
    }

    public WebElement getChooseFileLoc(){
        return D04_UploadFile_DragDropDef.driver.findElement(By.cssSelector("input[id=\"file-upload\"]"));
    }
    public WebElement getUploadButtonLoc(){
        return D04_UploadFile_DragDropDef.driver.findElement(By.id("file-submit"));
    }
}
