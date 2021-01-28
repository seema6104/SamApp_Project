package stepdefinitions;

import com.pages.LaunchStudentReportPage;
import com.qa.facory.DriverFactory;
import io.cucumber.java.en.*;
public class LaunchStudentReportStep {
	private LaunchStudentReportPage lsReport= new LaunchStudentReportPage(DriverFactory.getDriver());


	@When("Student Clicking on the report under reports link")
	public void student_clicking_on_the_report_under_reports_link() {
		lsReport.clickReportTab();
	}

	@And("launch the instructor reports screen")
	public void launch_the_instructor_reports_screen() {
		lsReport.selSectionDropDown();
		lsReport.examReport();
	}

	@Then("Screen reader support enabled.")
	public void screen_reader_support_enabled() {
		lsReport.verifyLaunchReport();
	}


}
