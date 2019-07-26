package smruti_runners;




import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber .class)
@CucumberOptions(features="myfeatures",glue="ddc2_mystepdefinition",tags= {"@Sanity,@Regression"},
plugin={"html:target/cucumber-htmlreport.html"})






public class Myrunners {

}
