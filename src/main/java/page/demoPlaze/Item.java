package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Item extends Base {
    WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
    WebElement cart= driver.findElement(By.id("cartur"));
    public Item(WebDriver driver) {

    }
    public void clickOnAddToCart()
    {
        addToCart.click();
    }
    public Cart clickOnCart()
    {
        cart.click();
        return new Cart(driver);
    }

}
