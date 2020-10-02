package com.fblogin.tests.init;

import com.fblogin.utility.PropertiesFileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.net.URL;
import java.util.Properties;

public class Init {

    public static  AppiumDriver <MobileElement> appiumDriver;

    public Init(){}
    public Init(AppiumDriver _driver) {
        this.appiumDriver = _driver;
    }
    static PropertiesFileReader propertiesFileReader = new PropertiesFileReader();

    public static Properties getProperties() throws Throwable {
        Properties properties = propertiesFileReader.getProperties();
        return properties;
    }

    public static void initProperties() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(CapabilityType.APPLICATION_NAME, "ANDROID");
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "7.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pace_2");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "FPC02000017K0280");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1800);
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        appiumDriver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
        Thread.sleep(3000);
    }
}
