package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Monitors extends Base {
    WebElement AppleMonitor24 =driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]"));
    WebElement ASUSFullHD=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]"));
    public Monitors(WebDriver driver) {
    }
    public WebElement getAppleMonitor24()
    {
        return AppleMonitor24;
    }
    public WebElement getASUSFullHD()
    {
        return ASUSFullHD;
    }
}
