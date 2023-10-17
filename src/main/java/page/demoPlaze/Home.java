package page.demoPlaze;

import base.Base;
import common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home extends Base {
    Common common=new Common();
    WebElement logout= driver.findElement(By.id("logout2"));
    WebElement phones=driver.findElement(By.xpath("//*[@id='itemc'][1]"));
    WebElement laptops=driver.findElement(By.xpath("//*[@id='itemc'][2]"));
    WebElement monitors=driver.findElement(By.xpath("//*[@id='itemc'][2]"));
    WebElement SamsungGalaxys6=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img"));

    public Home(WebDriver driver)
    {
    }
    public WebElement getLogout() throws InterruptedException {
        return logout;
    }
    public Phones clickOnPhones()
    {
        phones.click();
        return new Phones(driver);
    }
    public Laptops clickOnLaptops()
    {
        laptops.click();
        return new Laptops(driver);
    }
    public Monitors clickOnMonitors()
    {
        monitors.click();
        return new Monitors(driver);
    }
    public Item clickOnItem() throws InterruptedException {
        //SamsungGalaxys6.click();
        common.clickOnWebElement(SamsungGalaxys6);
        return new Item(driver);
    }


}
