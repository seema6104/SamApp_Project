package stepdefinitions;
import com.pages.EditExamPage;
import com.qa.facory.DriverFactory;

import io.cucumber.java.en.*;

public class EditExamSteps{
	  private EditExamPage examPage= new EditExamPage(DriverFactory.getDriver());
	  
	@When("Instructor user is on Dash board")
	public void instructor_user_is_on_dash_board()
	{
		
	}
	@When("User is clicking on Edit under Actions on assignment")
	public void user_is_clicking_on_edit_under_actions_on_assignment() {
		
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
	public void user_can_view_the_assignment_under_assignment()
	{
		
	}

}
