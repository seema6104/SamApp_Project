package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.WaitHelper;
public class LaunchStudentReportPage {
	public WebDriver driver;
	 WaitHelper waithelp;
	 public LaunchStudentReportPage(WebDriver rdriver)
	 {
		PageFactory.initElements(driver, this);
		waithelp= new WaitHelper(driver);
	 }
	 
	 @FindBy(xpath="//a[contains(text(),'Reports')]")
	 @CacheLookup
	 WebElement reportTab;
	 
	 @FindBy(id="sectiondropList")
	 @CacheLookup
	 WebElement selSection;
	 
	 
	 @FindBy(id="add-user-button")
	 @CacheLookup
	 WebElement launchReport;
	  
	 public void clickReportTab() 
	 {
		 waithelp.waitForElement(reportTab, 30);
		 reportTab.click();
	 }
	 public void selSectionDropDown() 
	 {
		 waithelp.waitForElement(selSection, 30);
		 Select selctSec= new Select(selSection);
		 selctSec.selectByValue("Fundamental of Java Programming (4 2021)"); 
	 }
	 
	 public void examReport()
	 {
		 waithelp.waitForElement(launchReport, 30); 
		 launchReport.click();// how to click all the menu in one tab/ is this going to work
	 }
	 
	 public void verifyLaunchReport()
	 {
		 String winHandleBefore = driver.getWindowHandle();
		 for(String winHandle : driver.getWindowHandles()){
			  driver.switchTo().window(winHandle);
		 if(driver.getPageSource().contains("Fundamental of Java Programming")) {
			 System.out.println("Student report is launched");
		 }
		 else {
			 System.out.println("Student Report is not launched");
		 }
	 }
	     driver.switchTo().window(winHandleBefore); 
      }

}
