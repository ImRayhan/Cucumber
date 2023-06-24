package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"},
                 glue =  {"steps"} ,
                 plugin = {"pretty", "junit:Report"},
                 dryRun = false,
                 monochrome = true,
                 tags = "@regression4"
//                 name = {"Advanced Search"}
                 
                                
                 
		)
public class TestRunner {

}
