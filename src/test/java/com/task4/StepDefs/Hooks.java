package com.task4.StepDefs;

import com.task4.Utilities.BrowserUtils;
import com.task4.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Hooks {

    @Before
    public void setUp() {
        // we put a logic that should apply to every scenario
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        // only takes a screenshot if the scenario fails
        if (scenario.isFailed()) {
            // taking a screenshot
            BrowserUtils.getScreenshot(scenario.getName());
        }
        Driver.closeDriver();
    }


}
