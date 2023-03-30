package com.teledocHealth.stepsDefinitions;

import com.teledocHealth.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.teledocHealth.utilities.Driver;



public class Hooks {



    @Before
    public void navigateToRegistration(){
    }


    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");

        }

       Driver.closeDriver();
    }
}