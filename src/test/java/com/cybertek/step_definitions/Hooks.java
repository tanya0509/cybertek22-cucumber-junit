package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import form io.cucumber.java not from junit

    //will comment the hooks so they dont run every time

    @Before (value = "@librarian", order = 1)//this is applied only to the scenario that has the @librarian tag
    public void setupLoginScenario(){
      //  System.out.println("login scenario");
    }
    @Before
    public void setupScenario(){
       // System.out.println(" Before - Setting up browser with further details...");
    }
    @After
    public void tearDownScenario(Scenario scenario){
//        System.out.println("-- After - Teardown steps are being applied...");
//        Driver.closeDriver();

        //if scenario fails returns true
        // if it passes returns false
        //if it fails goes inside and takes screenshot

        //scenario.isFailed()

        if(scenario.isFailed()){
            //downcast TakeScreenshot
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());//accepts 3 arguments
        }


    }

    @BeforeStep
    public void setupStep(){
//        System.out.println("----setup applying for each step----");
    }

    @AfterStep
    public void afterStep(){
       // System.out.println("---teardown applying for each step");
    }
}
