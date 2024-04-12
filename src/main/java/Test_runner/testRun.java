package Test_runner;


//import cucumber.api.CucumberOptions;
//import cucumber.api.*;
//import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;
//import io.cucumber.java.*;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/Login.feature",
        glue="Step_defination",
        monochrome=true,
        dryRun=false,
        plugin= {"pretty", "html:test-output"}
)

public class testRun {

}
