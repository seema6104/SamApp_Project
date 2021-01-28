package AppHooks;
import java.util.Properties;
/*By Naveen
 * https://www.youtube.com/watch?v=NhiIAZRoc0g&t=3921s
 */
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.qa.facory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class ApplicationHooks {
	/**
	 * Private because these are specific to hooks only
	 */
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order=0)
	public void getProperty() {
		configReader = new ConfigReader(); 
		prop=configReader.init_prop();
	}

	@Before(order=1)
	public void launchBrowser()
	{
		String browserName= prop.getProperty("browser");
		driverfactory= new DriverFactory();
		driver=driverfactory.init_driver(browserName);
	}

	// order=1 will execute first, order=0 after lower to high
	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}

	@After(order=1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed()) {
			//take screenshot
			String screenshotName=scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}
