package stepDifinitions;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CustomQuestionPage;
import pageObjects.EditExamPage;
import pageObjects.LaunchContentPlayerPage;
import pageObjects.LaunchStudentReportPage;
import pageObjects.SamLoginPage;
public class BaseClass {
	public WebDriver driver;
	public SamLoginPage login;
	public LaunchContentPlayerPage contentPlayer;
	public CustomQuestionPage cqPage;
	public EditExamPage examPage;
	public LaunchStudentReportPage lsReport;
    
	/*@Before
	  public void launchBrowser()
	  {
		  WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			login= new SamLoginPage(driver);
			System.out.println("Sam Login Steps class");
			driver.get("https://sam.cengage.com/App/login?ReturnUrl=%2f");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  }
	
	@After
	public void tearDown()
	{
		driver.quit();
	}*/
	
}
