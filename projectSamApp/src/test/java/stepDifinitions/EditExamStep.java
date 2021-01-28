package stepDifinitions;
import org.junit.Assert;

import io.cucumber.java.en.*;
import pageObjects.EditExamPage;

public class EditExamStep extends BaseClass{
	/*
	@When("Clicks on login")
	public void clicks_on_login() throws InterruptedException {
		login.clickOnLogin();
		System.out.println("Now Clicking on New session link");
    	login.newSessionOKBTN();
    	System.out.println("Clicking on Enter key later");
    	login.enterKeyLaterButton();
    	Thread.sleep(3000);
	}*/

	@Then("User will be on Dashboard")
	public void user_will_be_on_dashboard() {
		String actual= login.getPageTitle();
        System.out.println("Printing Sam Page title "+ login.getPageTitle());
        Assert.assertEquals(actual, "SAM - Activity Calendar");
	   
	}

	@When("User is clicking on Edit under Actions on assignment")
	public void user_is_clicking_on_edit_under_actions_on_assignment() {
		examPage= new EditExamPage(driver);
		examPage.validateDashboard();
		examPage.assigmentTab();
		examPage.selSectioOpt();
		examPage.selectExam();
	}

	@When("User is on Edit page and editing the info")
	public void user_is_on_edit_page_and_editing_the_info() {
	   
	}

	@When("User clicks on save assignment will be created.")
	public void user_clicks_on_save_assignment_will_be_created() {
	    
	}

	@Then("User can view the assignment under Assignment")
	public void user_can_view_the_assignment_under_assignment() {
	    
	}


}
