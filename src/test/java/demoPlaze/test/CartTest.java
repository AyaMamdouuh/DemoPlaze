package demoPlaze.test;

import base.Base;
import common.Common;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.demoPlaze.Landing;
public class CartTest extends Base {
    Common common=new Common();
    @Test(priority = 1)
    public void addItemToCart() throws InterruptedException {
        demoPlaze.landing=new Landing(driver);
        demoPlaze.login=demoPlaze.landing.clickOnLogin();
        demoPlaze.login.enterUserName(sheet.getRow(1).getCell(1).toString());
        demoPlaze.login.enterPassword(sheet.getRow(2).getCell(1).toString());
        demoPlaze.home=demoPlaze.login.clickOnLogin();
        Assert.assertTrue(demoPlaze.home.getLogout().isDisplayed());
        demoPlaze.item=demoPlaze.home.clickOnItem();
        demoPlaze.item.clickOnAddToCart();
        common.clickOnOk();
    }
    @Test(priority = 1)
    public void removeItemFromCart() throws InterruptedException {
        demoPlaze.landing=new Landing(driver);
        demoPlaze.login=demoPlaze.landing.clickOnLogin();
        demoPlaze.login.enterUserName(sheet.getRow(1).getCell(1).toString());
        demoPlaze.login.enterPassword(sheet.getRow(2).getCell(1).toString());
        demoPlaze.home=demoPlaze.login.clickOnLogin();
        Assert.assertTrue(demoPlaze.home.getLogout().isDisplayed());
        demoPlaze.item=demoPlaze.home.clickOnItem();
        demoPlaze.item.clickOnAddToCart();
        common.clickOnOk();
        demoPlaze.cart=demoPlaze.item.clickOnCart();
        demoPlaze.cart.clickOnDelete();
    }
    @Test(priority = 1)
    public void checkOut() throws InterruptedException {
        demoPlaze.landing=new Landing(driver);
        demoPlaze.login=demoPlaze.landing.clickOnLogin();
        demoPlaze.login.enterUserName(sheet.getRow(1).getCell(1).toString());
        demoPlaze.login.enterPassword(sheet.getRow(2).getCell(1).toString());
        demoPlaze.home=demoPlaze.login.clickOnLogin();
        Assert.assertTrue(demoPlaze.home.getLogout().isDisplayed());
        demoPlaze.item=demoPlaze.home.clickOnItem();
        demoPlaze.item.clickOnAddToCart();
        common.clickOnOk();
        demoPlaze.cart=demoPlaze.item.clickOnCart();
        demoPlaze.placeOrder=demoPlaze.cart.clickOnPlaceOrder();
        demoPlaze.placeOrder.enterName(sheet.getRow(3).getCell(1).toString());
        demoPlaze.placeOrder.enterCountry(sheet.getRow(4).getCell(1).toString());
        demoPlaze.placeOrder.enterCity(sheet.getRow(5).getCell(1).toString());
        demoPlaze.placeOrder.enterCreditCard(sheet.getRow(6).getCell(1).toString());
        demoPlaze.placeOrder.enterMonth(sheet.getRow(7).getCell(1).toString());
        demoPlaze.placeOrder.enterYear(sheet.getRow(8).getCell(1).toString());
        demoPlaze.placeOrder.clickOnPurchase();
        Assert.assertTrue(demoPlaze.placeOrder.getSuccessPopup().isDisplayed());
    }


}