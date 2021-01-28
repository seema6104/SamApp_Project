package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features=".//Features/Login.feature", 
		 // features=".//Features/LaunchContentPlayer.feature",
		 //features=".//Features/EditingExam.feature", 
		  //features=".//Features/LaunchStudentReport.feature",
		   //features=".//Features/CustomQuestion.feature",
		  glue={"stepdefinitions", "AppHooks"},
		  dryRun=false,
		  monochrome=true,
		  plugin= {"pretty","html:test-output" }
		  
		  )
public class TestRun {
	

}
