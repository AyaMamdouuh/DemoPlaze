package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends Base {
    WebElement userName =driver.findElement(By.id("loginusername"));
    WebElement password =driver.findElement(By.id("loginpassword"));
    WebElement login=driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
    WebElement SamsungGalaxys6=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img"));

    public Login(WebDriver driver)
    {
    }
    public Home clickOnLogin() throws InterruptedException {
        login.click();
        Thread.sleep(5000);
        return new Home(driver);
    }
    public void clickOnItem(){ SamsungGalaxys6.click();}
    public void enterUserName(String name)
    {
        userName.sendKeys(name);
    }
    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }
}
