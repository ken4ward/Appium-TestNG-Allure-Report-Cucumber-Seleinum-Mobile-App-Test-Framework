package com.fblogin.tests.testcases;

import com.fblogin.tests.init.Init;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import com.fblogin.testrunner.TestRunners;

public class TestCases extends Init {

    public TestCases(){}
    public TestCases( AppiumDriver appiumDriver ) { super(appiumDriver); }

    public static void assertProject(String myprops, String props ) throws Throwable {
        String facebook = appiumDriver.findElement(By.cssSelector(myValues(myprops))).getText();
        Assert.assertEquals(facebook, getProperties().getProperty(props));
    }

    private static void insertValues(String field, String value ) throws Throwable {
        appiumDriver.findElement(By.name(myValues(field))).clear();
        appiumDriver.findElement(By.name(myValues(field))).sendKeys(myValues(value));
    }

    public static void searchField () throws Throwable {
        insertValues("google.search.field", "google.search.query");
    }

    public static void searchButton () throws Throwable {
        appiumDriver.findElement(By.name(myValues("google.submit.button"))).click();
    }

    private static String myValues(String values) throws Throwable {
       return TestRunners.getProperties().getProperty(values );
    }
}
