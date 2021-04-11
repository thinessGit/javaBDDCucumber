package in.tsbu.cucumber.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static in.tsbu.utils.AppVariables.*;

public class Hook  {


    @Before
    public void beforeScenario() {
        System.out.println(">>> Before Scenario");
        appDriver.initDriver();
    }

    @After
    public void afterScenario() {
        System.out.println(">>> After Scenario");
        appDriver.driver.quit();
    }
}
