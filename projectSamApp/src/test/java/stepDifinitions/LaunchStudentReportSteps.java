package stepDifinitions;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LaunchStudentReportPage;
import pageObjects.SamLoginPage;
public class LaunchStudentReportSteps extends BaseClass{
	
	@Given("student user Launch browser")
	public void student_user_launch_browser() {
		lsReport= new LaunchStudentReportPage(driver);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		login= new SamLoginPage(driver);
		System.out.println("Sam Login Steps class");
	}

	@When("Student Clicking on the report under reports link")
	public void student_clicking_on_the_report_under_reports_link() {
		lsReport.clickReportTab();
	}

	@When("launch the instructor reports screen")
	public void launch_the_instructor_reports_screen() {
		lsReport.selSectionDropDown();
		lsReport.examReport();
	}

	@Then("Screen reader support enabled.")
	public void screen_reader_support_enabled() {
		lsReport.verifyLaunchReport();
	}

}
