package demoPlaze.test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.demoPlaze.DemoPlaze;
import page.demoPlaze.Landing;
import common.Common;

import java.util.UUID;

public class Onboarding extends Base {
    Common common=new Common();
    @Test(priority = 1)
    public void signup() throws InterruptedException {
        demoPlaze.landing=new Landing(driver);
        demoPlaze.signup=demoPlaze.landing.clickOnSignup();
        demoPlaze.signup.enterUserName(sheet.getRow(0).getCell(1).toString()+ UUID.randomUUID().toString());
        demoPlaze.signup.enterPassword(sheet.getRow(2).getCell(1).toString());
        demoPlaze.signup.clickOnSignup();
        common.clickOnOk();
    }
    @Test (priority = 2)
    public void login() throws InterruptedException {
        demoPlaze.landing=new Landing(driver);
        demoPlaze.login=demoPlaze.landing.clickOnLogin();
        demoPlaze.login.enterUserName(sheet.getRow(1).getCell(1).toString());
        demoPlaze.login.enterPassword(sheet.getRow(2).getCell(1).toString());
        demoPlaze.home=demoPlaze.login.clickOnLogin();
        System.out.println(demoPlaze.home.getLogout().isDisplayed());
        Assert.assertTrue(demoPlaze.home.getLogout().isDisplayed());

    }
}
