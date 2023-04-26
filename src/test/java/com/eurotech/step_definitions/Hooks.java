package com.eurotech.step_definitions;

import com.eurotech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.time.Duration;


public class Hooks {//it runs all time
    @Before//cucumber
    public void setup() {
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// in the before wait comment

    }


    @After//cucumber
    public void tearDown(Scenario scenario) {
        //take the ss
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDB() {//for need to connecting with DB
        System.out.println("This is DB before");
        System.out.println("connecting Database");
    }

    @After("@db")
    public void tearDownDB() {
        System.out.println("This is DB after");
        System.out.println("Disconnecting Database");
    }
}
