package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceOrder extends Base {
    WebElement name= driver.findElement(By.id("name"));
    WebElement country=driver.findElement(By.id("country"));
    WebElement city=driver.findElement(By.id("city"));
    WebElement card=driver.findElement(By.id("card"));
    WebElement month=driver.findElement(By.id("month"));
    WebElement year=driver.findElement(By.id("year"));
    WebElement purchase=driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    WebElement successPopup=driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));

    public PlaceOrder(WebDriver driver) {
    }
   public WebElement getSuccessPopup(){return successPopup;}
    public void clickOnPurchase(){purchase.click();}
    public void enterName(String userName)
    {
        name.sendKeys(userName);
    }
    public void enterCountry(String countryValue)
    {
        country.sendKeys(countryValue);
    }
    public void enterCity(String cityValue)
    {
        city.sendKeys(cityValue);
    }
    public void enterMonth(String monthValue)
    {
        month.sendKeys(monthValue);
    }
    public void enterYear(String yearValue)
    {
        year.sendKeys(yearValue);
    }
    public void enterCreditCard(String cardValue)
    {
        card.sendKeys(cardValue);
    }
}
