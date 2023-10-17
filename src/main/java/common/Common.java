package common;

import base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common extends Base {
    public void clickOnOk() throws InterruptedException {
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }
    public void waitDocumentReady() {
        new WebDriverWait(driver, 80).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                JavascriptExecutor js = (JavascriptExecutor) d;
//                System.out.println(js.executeScript("return document.readyState").toString());
                return js.executeScript("return document.readyState").toString().contains("complete");
            }
        });
    }
    public boolean validateStateOfElement(ExpectedCondition<WebElement> condition) {
        try {
            new WebDriverWait(driver, 30).until(condition);
            return true;
        } catch (Exception e) {
            throw new Error("Can't find Element with this condition: " + condition);
        }
    }
    public void clickOnWebElement(WebElement element) {
       waitDocumentReady();
        if (element == null) {
            throw new Error("Couldn't get Element");
        } else if (validateStateOfElement(ExpectedConditions.elementToBeClickable(element))) {
            try{
                element.click();
                }
            catch (Exception e){
                String javaScript = "var evObj = document.createEvent('MouseEvents');" +
                        "evObj.initMouseEvent('click',true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
                        "arguments[0].focus(); " +
                        "arguments[0].dispatchEvent(evObj);";
                ((JavascriptExecutor) driver).executeScript(javaScript, element);
            }
        }
    }
}
