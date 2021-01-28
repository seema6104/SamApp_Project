package stepdefinitions;
import com.pages.CustomQuestionPage;
import com.pages.LoginPage;
import com.qa.facory.DriverFactory;
import io.cucumber.java.en.*;
public class CustomQuestionSteps {
	private  CustomQuestionPage cqPage;
    private LoginPage login = new LoginPage(DriverFactory.getDriver());
    
//	@Given("user has already logged in to application")
//	public void user_has_already_logged_in_to_application(DataTable dataTable) throws Exception {
//	 List<Map<String, String>> credList = dataTable.asMaps();
//	 String uname= credList.get(0).get("Email");
//	 String pwd= credList.get(0).get("Password");
//	 DriverFactory.getDriver().get("https://sam.cengage.com/App/login?ReturnUrl=%2f");
//	 cqPage= login.doLogin(uname, pwd);
//	
//	}

    @Then("user can see Dashboard")
    public void user_can_see_dashboard() {
       
    }

    @Then("Non student user is on Sam Assignment page")
    public void non_student_user_is_on_sam_assignment_page() {
        
    }

    @Then("User clicks on exam tab under assignments tab")
    public void user_clicks_on_exam_tab_under_assignments_tab() {
       
    }

    @Then("Click on Add Custom Questions tab")
    public void click_on_add_custom_questions_tab() {
        
    }

    @Then("User enters all the Required Fields")
    public void user_enters_all_the_required_fields() {
       
    }

    @Then("Save and Close saves questions")
    public void save_and_close_saves_questions() {
      
    }

    @Then("message display {string}")
    public void message_display(String string) {
       
    }

    @Then("Takes users to a custom questions list")
    public void takes_users_to_a_custom_questions_list() {
        
    }

}
