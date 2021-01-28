package stepDifinitions;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.SamLoginPage;
public class SamSteps extends BaseClass{
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		login= new SamLoginPage(driver);
		System.out.println("Sam Login Steps class");
		driver.get("https://sam.cengage.com/App/login?ReturnUrl=%2f");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	
	}
	@When("User Launch SAM URL {string}")
	public void user_launch_sam_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
		
	}
    @When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String userName, String pwd) {
    	login.enterUsername(userName);
		login.enterPassword(pwd);
	  }
    @When("Click on Login")
	public void click_on_login() throws InterruptedException  {
    	login.clickOnLogin();
		System.out.println("Now Clicking on New session link");
    	login.newSessionOKBTN();
    	System.out.println("Clicking on Enter key later");
    	login.enterKeyLaterButton();
    	Thread.sleep(3000);
 		
	 }
     @Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
    	  String actual= login.getPageTitle();
          System.out.println("Printing Sam Page title "+ login.getPageTitle());
          Assert.assertEquals(title, actual);
    	}
   
    @When("User click on Sign out Button")
	public void user_click_on_sign_out_button() throws Exception {
		login.clickOnStuProfile();
		login.signOutButton();
//		String actualTitle= driver.getTitle();
//		System.out.println("actualTitle after signout" +actualTitle);
//		Assert.assertEquals(0, 0);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	    login.clickOnStuProfile();
	    
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		login.signOutButton();
	}
	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
	
}
