package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart extends Base {
    WebElement delete=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a"));
    WebElement placeOrderbtn=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
    public Cart(WebDriver driver) {
    }
    public void clickOnDelete()
    {
        delete.click();
    }
    public PlaceOrder clickOnPlaceOrder() throws InterruptedException {
        Thread.sleep(3000);
        placeOrderbtn.click();
        return new PlaceOrder(driver);
    }
}
