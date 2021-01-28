package stepDifinitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LaunchContentPlayerPage;
import pageObjects.SamLoginPage;

public class LaunchContentPlayerSteps  extends BaseClass{
	
	@Given("Strudent user launched browser")
	public void strudent_user_launched_browser(String url) throws Exception {
		contentPlayer= new LaunchContentPlayerPage(driver);
		login = new SamLoginPage(driver);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("LaunchContentPlayerSteps ");
		driver.get(url);
		Thread.sleep(5000);
		
	    
	     
	}

	@When("Student user Navigates to Activity List under Activities")
	public void student_user_navigates_to_activity_list_under_activities() {
		contentPlayer.clickOnActivityListTab();
		contentPlayer.selectCourseTab();
	}

	@When("Student user clicks on SAM assignment")
	public void student_user_clicks_on_sam_assignment() {
		contentPlayer.selectSamExam();
	    
	}

	@When("Assignment Start dialog box opens")
	public void assignment_start_dialog_box_opens() {
		contentPlayer.verifyDialogBoxOpen();
	}

	@Then("Retake of the assignment should not get reduced")
	public void retake_of_the_assignment_should_not_get_reduced() {
	    
	}


	
}
