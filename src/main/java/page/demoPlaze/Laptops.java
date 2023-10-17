package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Laptops extends Base {
    WebElement SonyVaioi5= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]"));
    WebElement SonyVaioi7= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]"));
    WebElement MacBookAir= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]"));
    WebElement DellI78gb= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]"));
    WebElement Dell156Inch2017= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]"));
    WebElement MacBookPro=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[6]"));
    public Laptops(WebDriver driver) {
    }
    public WebElement getSonyVaioi5()
    {
        return SonyVaioi5;
    }
    public WebElement getSonyVaioi7(){return SonyVaioi7;}
    public WebElement getMacBookAir(){return MacBookAir;}
    public WebElement getDellI78gb(){return DellI78gb;}
    public WebElement getDell156Inch2017(){return Dell156Inch2017;}
    public WebElement getMacBookPro(){return MacBookPro;}
}