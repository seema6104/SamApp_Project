package stepdefinitions;
import com.pages.LaunchContentPlayer;
import org.apache.log4j.Logger;
import com.pages.LoginPage;
import com.qa.facory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.en.*;

public class SamSteps{
	private LoginPage login= new LoginPage(DriverFactory.getDriver());
	private LaunchContentPlayer cpPage = new LaunchContentPlayer(DriverFactory.getDriver());
	private ConfigReader config;
	public Logger logger;
	@When("User Launch SAM URL")
	public void user_launch_sam_url(String url) throws InterruptedException {
		config= new ConfigReader();
		logger.info("************ Launching Browser ***************");
		DriverFactory.getDriver().get(url);
		Thread.sleep(5000);
		}

	@When("User Login as (.*)")
	public void user_login_as() {
		
    	 config.getStuUserName();
    	 config.getStuUserPWD();
	}
     
	@When("Clicks on login")
	public void clicks_on_login() throws Exception {
		login.clickOnLogin();
		logger.info("*********** New session link ******************");
    	login.newSessionOKBTN();
    	logger.info("*********** Enter key later *******************");
    	login.enterKeyLaterButton();
    	Thread.sleep(4000);
	}

	@Then("Student user can see Dashboard")
	public void student_user_can_see_dashboard(){
		try {
		String actualTitle= login.getPageTitle();
		logger.info("Title of the page : " + actualTitle);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

   // Launch content player

	@Then("Student user Navigates to Activity List")
	public void student_user_navigates_to_activity_list() {
		cpPage.clickOnActivityListTab();
		cpPage.selectCourseTab();
	}

	@Then("Student user clicks on SAM assignment and dialog box opens")
	public void student_user_clicks_on_sam_assignment_and_dialog_box_opens() {
		cpPage.selectSamExam();
		cpPage.examDialBox();

	}

	@Then("Retake of the assignment should not get reduced")
	public void retake_of_the_assignment_should_not_get_reduced() {
		
	}
	
	


}
