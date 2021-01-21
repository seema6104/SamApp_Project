package pageObjects;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;
public class SamLoginPage {
    public WebDriver driver;
	WaitHelper waithelp;
	public SamLoginPage(WebDriver rdriver)
	{
		driver= rdriver;
		PageFactory.initElements(driver, this);
		waithelp= new WaitHelper(driver);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	@FindBy(id="username")
	@CacheLookup
	WebElement userName;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement pwd;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	@CacheLookup
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[@class='banner']//h1[contains(text(),'SAM indicates that you are currently logged in.')]")
	@CacheLookup
	WebElement newSessionText;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	@CacheLookup
	WebElement newSessionOK;
	
	@FindBy(xpath="//button[contains(text(),'Enter later')]")
	@CacheLookup
	WebElement enterKeyCodeLater;
	
	 @FindBy(xpath="//div[@title='Cengage SAM Logo']")
	 @CacheLookup
	 WebElement samLogo;
		
	@FindBy(xpath="//button[@id='cu-sidebar-my-account-button']//div[@class='css-1sg2lsz']")
	@CacheLookup
	WebElement clickStuProfile;
	
	@FindBy(id="cu-sidebar-sign-out-button")
	@CacheLookup
	WebElement signOut;
	public void enterUsername(String uName)
	{   waithelp.waitForElement(userName, 30);
		userName.clear();
		userName.sendKeys(uName);
	}
	public void enterPassword(String password)
	{   
		waithelp.waitForElement(pwd, 30);
		pwd.clear();
		pwd.sendKeys(password);
	}
	public void clickOnLogin()
	{  
		waithelp.waitForElement(LoginBtn, 60);
		LoginBtn.click();	
	}
	
	public void newSessionOKBTN() 
	{
		 try {
			System.out.println("Session Ok button ");
			newSessionOK.click();
		 }catch(NoSuchElementException e)
		 {
			e.printStackTrace(); 
		 }
		}
	
	 public void enterKeyLaterButton()
	{
     waithelp.waitForElement(enterKeyCodeLater, 40);
	 enterKeyCodeLater.click();
	 waithelp.getPageTitle();
	 }

	public void clickOnStuProfile() 
	{
		 waithelp.waitForElement(clickStuProfile, 40);
		 clickStuProfile.click();

	}
	public void signOutButton()
	{
		signOut.click();
		waithelp.waitForElement(signOut, 40);
	}
	
}
