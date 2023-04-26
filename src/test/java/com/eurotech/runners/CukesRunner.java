package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},//gets failed information of last test execution
        //responsible that create json(type of storing info) file about cases result info and html report
        //if we want to get report we must run from cukes runner
        features = "src/test/resources/Features",//login.feature path
        glue = "com/eurotech/step_definitions",
        dryRun = false,//if I write true I won't see the definitions of steps
        tags = "@Developer"
        /*  @Student key sensitive
            after tagged scenarios if ı need to run all of them, @login first tag
            for run one scenario @smoke and @teacher
            'and not @wip' - 'and not @wip and not @ developer'
         */
)


//it is runner class we can run our cases in here.
public class CukesRunner {

}
