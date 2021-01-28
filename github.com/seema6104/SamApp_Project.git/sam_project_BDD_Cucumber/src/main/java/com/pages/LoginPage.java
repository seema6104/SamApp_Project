package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ConfigReader;
import com.qa.util.WaitHelper;
public class LoginPage {
	private WebDriver driver;
	WaitHelper waithelp;
	private ConfigReader configRea;
	
	
	public LoginPage(WebDriver rdriver)
	{
		driver= rdriver;
		PageFactory.initElements(driver, this);
		waithelp= new WaitHelper(driver);
		configRea= new ConfigReader();
	}
	@FindBy(id="username")
	@CacheLookup
	WebElement userName;

	@FindBy(id="password")
	@CacheLookup
	WebElement pwd;

	@FindBy(xpath="//button[contains(text(),'Login')]")
	@CacheLookup
	WebElement loginBtn;

	@FindBy(xpath="//div[@class='banner']//h1[contains(text(),'SAM indicates that you are currently logged in.')]")
	@CacheLookup
	WebElement newSessionText;

	//@FindBy(css="button.highlight")
	@FindBy(xpath="//button[contains(text(),'OK')]")
	@CacheLookup
	WebElement newSessionOK;

	@FindBy(xpath="//button[contains(text(),'Enter later')]")
	@CacheLookup
	WebElement enterKeyCodeLater;

	@FindBy(xpath="//div[@title='Cengage SAM Logo']")
	@CacheLookup
	WebElement samLogo;

	@FindBy(xpath="//span[@class='css-h7o02a']")
	@CacheLookup
	WebElement clickStuProfile;

	@FindBy(id="cu-sidebar-sign-out-button")
	@CacheLookup
	WebElement signOut;
	
	public String getPageTitle() 
	{
		return driver.getTitle();
	}
	public void enterUsername(String uName)
	  { 
		waithelp.waitForElement(userName, 30);
		userName.clear();
		userName.sendKeys(uName);
	  }
	public void enterPassword(String password)
	{   
		waithelp.waitForElement(pwd, 30);
		pwd.clear();
		pwd.sendKeys(password);
	}
	public void clickOnLogin() throws Exception
	{  
		waithelp.waitForElement(loginBtn, 50);
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", loginBtn);
	     loginBtn.click();	
	     waithelp.threadWait(5000);
	}

	public void newSessionOKBTN() 
	{
		try {
			System.out.println("Session Ok button ");
			
//			JavascriptExecutor js= (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click()", newSessionOK);
			newSessionOK.click();
		}catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	public void enterKeyLaterButton()
	{
		waithelp.waitForElement(enterKeyCodeLater, 40);
		enterKeyCodeLater.click();
	}

	public String getLoginPageTitle() 
	{
		waithelp.getPageTitle();
		return driver.getTitle();
		
	}
	public void clickOnStuProfile() throws Exception
	{
		clickStuProfile.click();
		Thread.sleep(5000);
	}
	public void signOutButton()
	{
		signOut.click();
	}
    public CustomQuestionPage doLogin(String un, String pd) throws Exception
    {
    	enterUsername(un);
    	enterPassword(pd);
    	clickOnLogin();
    	newSessionOKBTN();
    	
    	return new CustomQuestionPage(driver);
		
    }
//    public void StuserLogin() {
//    	configRea.getStuUserName();
//    	configRea.getStuUserPWD();
//    }
//    public void InstUserLogin()
//    {
//    	configRea.getInstUserName();
//    	configRea.getInstUserPWD();
//    }

}
