package demoPlaze.test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.demoPlaze.Landing;
public class CategoriesItems extends Base {
    SoftAssert softAssert=new SoftAssert();
    @Test (priority = 1 )
    public void phoneItems() throws InterruptedException {
        demoPlaze.landing=new Landing(driver);
        demoPlaze.login=demoPlaze.landing.clickOnLogin();
        demoPlaze.login.enterUserName(sheet.getRow(1).getCell(1).toString());
        demoPlaze.login.enterPassword(sheet.getRow(2).getCell(1).toString());
        demoPlaze.home=demoPlaze.login.clickOnLogin();
        Assert.assertTrue(demoPlaze.home.getLogout().isDisplayed());
        demoPlaze.phones=demoPlaze.home.clickOnPhones();
        softAssert.assertTrue(demoPlaze.phones.getSamsungGalaxyS6().isDisplayed());
        softAssert.assertTrue(demoPlaze.phones.getNexus6().isDisplayed());
        softAssert.assertTrue(demoPlaze.phones.getHTCOneM9().isDisplayed());
        softAssert.assertTrue(demoPlaze.phones.getNokiaLumia1520().isDisplayed());
        softAssert.assertTrue(demoPlaze.phones.getSamsungGalaxyS7().isDisplayed());
        Assert.assertTrue(demoPlaze.phones.getSonyXperiaZ5().isDisplayed());
    }
    @Test(priority = 1)
    public void laptopItems()throws InterruptedException {
        demoPlaze.landing=new Landing(driver);
        demoPlaze.login=demoPlaze.landing.clickOnLogin();
        demoPlaze.login.enterUserName(sheet.getRow(1).getCell(1).toString());
        demoPlaze.login.enterPassword(sheet.getRow(2).getCell(1).toString());
        demoPlaze.home=demoPlaze.login.clickOnLogin();
        Assert.assertTrue(demoPlaze.home.getLogout().isDisplayed());
        demoPlaze.laptops=demoPlaze.home.clickOnLaptops();
        softAssert.assertTrue(demoPlaze.laptops.getSonyVaioi5().isDisplayed());
        softAssert.assertTrue(demoPlaze.laptops.getSonyVaioi7().isDisplayed());
        softAssert.assertTrue(demoPlaze.laptops.getMacBookAir().isDisplayed());
        softAssert.assertTrue(demoPlaze.laptops.getDellI78gb().isDisplayed());
        softAssert.assertTrue(demoPlaze.laptops.getDell156Inch2017().isDisplayed());
        Assert.assertTrue(demoPlaze.laptops.getMacBookPro().isDisplayed());
    }
    @Test(priority = 1)
    public void monitorsItems()throws InterruptedException {
        demoPlaze.landing = new Landing(driver);
        demoPlaze.login = demoPlaze.landing.clickOnLogin();
        demoPlaze.login.enterUserName(sheet.getRow(1).getCell(1).toString());
        demoPlaze.login.enterPassword(sheet.getRow(2).getCell(1).toString());
        demoPlaze.home = demoPlaze.login.clickOnLogin();
        Assert.assertTrue(demoPlaze.home.getLogout().isDisplayed());
        demoPlaze.monitors = demoPlaze.home.clickOnMonitors();
        softAssert.assertTrue(demoPlaze.monitors.getAppleMonitor24().isDisplayed());
        Assert.assertTrue(demoPlaze.monitors.getASUSFullHD().isDisplayed());
    }
}
