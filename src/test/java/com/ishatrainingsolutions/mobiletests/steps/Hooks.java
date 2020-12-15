package com.ishatrainingsolutions.mobiletests.steps;

import com.ishatrainingsolutions.mobiletests.steps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks extends BaseSteps {

    private BaseSteps baseSteps;

    public Hooks(BaseSteps baseSteps){
        this.baseSteps = baseSteps;
    }


    @Before
    public void setUpAppium() {

        File file = new File("src/Hostelworld.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("AppPackage", "com.hostelworld.app");
        capabilities.setCapability("app", file.getAbsolutePath());
        try {
            baseSteps.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
         baseSteps.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @After
    public void tearDown() {

        baseSteps.driver.quit();

    }
}
