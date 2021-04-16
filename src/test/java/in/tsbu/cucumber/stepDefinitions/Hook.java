package in.tsbu.cucumber.stepDefinitions;

import in.tsbu.selenium.WebAppDriver;
import in.tsbu.utils.Log;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static in.tsbu.utils.AppVariables.*;

public class Hook  {

    private static int TESTCASE_COUNT = 1;

    public Hook()
    {
        Log.setLogDate();
    }

    @Before
    public void beforeScenario() {
        Log.info(Log.ARROW_RIGHT+"Testcase"+Log.COLON+(TESTCASE_COUNT++));
        Log.info(Log.ARROW_RIGHT+"Before Scenario"+Log.ARROW_LEFT);
    }

    @After
    public void afterScenario() {
        Log.info(Log.ARROW_RIGHT+"After Scenario"+Log.ARROW_LEFT);
    }

}
