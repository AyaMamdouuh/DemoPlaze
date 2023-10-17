package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Landing extends Base {
    WebElement signup= driver.findElement(By.id("signin2"));
    WebElement login= driver.findElement(By.id("login2"));
    WebElement SamsungGalaxys6=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img"));

    public Landing(WebDriver driver)
    {
    }
    public SignUp clickOnSignup()
    {
        signup.click();
        return new SignUp(driver);
    }
    public Login clickOnLogin()
    {
        login.click();
        return new Login(driver);
    }
    public Item clickOnItem() throws InterruptedException {
        //Thread.sleep(10000);
        SamsungGalaxys6.click();
        //common.clickOnWebElement(SamsungGalaxys6);
        return new Item(driver);
    }


}
