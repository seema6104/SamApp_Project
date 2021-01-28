package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.WaitHelper;
public class EditExamPage {
	public WebDriver driver;//BDD
	   WaitHelper waithelp;
		public EditExamPage(WebDriver rdriver)
		{
			driver= rdriver;
			PageFactory.initElements(rdriver, this);
			waithelp= new WaitHelper(driver);
		}
		
		@FindBy(xpath="//button[contains(text(),'Login')]")
		@CacheLookup
		WebElement LoginBtn;
		
		@FindBy(xpath="//button[contains(text(),'OK')]")
		@CacheLookup
		WebElement newSessionOK;
		
		@FindBy(id="instructorlogoBox")
		@CacheLookup
		WebElement validLogo;
		
		@FindBy(xpath="//a[contains(text(),'SAM Assignments')]")
		@CacheLookup
		WebElement clikSamAssTab;
		
		@FindBy(id="sectiondropList")
		@CacheLookup
		WebElement selSection;
		
		@FindBy(xpath="//a[@id='aAssignmentDetail48990644']/ancestor::tr")
		@CacheLookup
		WebElement selAssignment;
		
		public void clickOnLogin()
		{  
			waithelp.waitForElement(LoginBtn, 30);
			LoginBtn.click();	
		}
		
		public void newSessionOKBTN() 
		{
			 try {
				System.out.println("Session Ok button ");
				newSessionOK.click();
			 }catch(Exception e)
			 {
				e.printStackTrace(); 
			 }
			}
		
	   public void validateDashboard()
		{    
		 waithelp.waitForElement(validLogo, 20);
	     validLogo.isDisplayed();
	     System.out.println("Capturing logo Text: "+validLogo.getText());
		}
		public void assigmentTab() 
		{
			waithelp.waitForElement(clikSamAssTab, 20);
			clikSamAssTab.click();
		}
		public void selSectioOpt() 
		{
		 Select selsection= new Select(selSection);
		 selsection.selectByValue("SAM Prod1129 (3 2020)");
		
		}
		
		public void selectExam()
		{
			waithelp.waitForElement(selAssignment, 20);
			selAssignment.isDisplayed();
		}

}
