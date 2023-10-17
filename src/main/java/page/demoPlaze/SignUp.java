package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp extends Base {
    WebElement userName= driver.findElement(By.id("sign-username"));
    WebElement password= driver.findElement(By.id("sign-password"));
    WebElement signup= driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
    public SignUp(WebDriver driver)
    {
    }
    public void enterUserName(String name)
    {
        userName.sendKeys(name);
    }
    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }
    public void clickOnSignup()  {
        signup.click();
    }
}
