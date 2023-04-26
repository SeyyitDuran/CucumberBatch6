package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //for this class we don't need all test cases, cucumber picks failed scenarios from this file
        // from maven clean verify get failed cases and run from failed runner
        //always run from maven
        features= "@target/rerun.txt",
        glue = "com/eurotech/step_definitions"

)

public class FailedTestRunner {//must match with pom name, change the number also


}
