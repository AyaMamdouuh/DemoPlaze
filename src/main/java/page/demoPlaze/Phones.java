package page.demoPlaze;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Phones extends Base {
    WebElement samsungGalaxyS6= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]"));
    WebElement nokiaLumia1520= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]"));
    WebElement nexus6= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]"));
    WebElement samsungGalaxyS7= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]"));
    WebElement sonyXperiaZ5= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]"));
    WebElement HTCOneM9= driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[6]"));
    public Phones(WebDriver driver) {
    }
    public WebElement getSamsungGalaxyS6()
    {
        return samsungGalaxyS6;
    }
    public WebElement getNokiaLumia1520()
    {
        return nokiaLumia1520;
    }
    public  WebElement getNexus6()
    {
        return nexus6;
    }
    public WebElement getSamsungGalaxyS7()
    {
        return samsungGalaxyS7;
    }
    public WebElement getSonyXperiaZ5()
    {
        return sonyXperiaZ5;
    }
    public WebElement getHTCOneM9()
    {
        return HTCOneM9;
    }

}
