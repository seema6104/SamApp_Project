package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitHelper;

public class LaunchContentPlayerPage {
	public WebDriver driver;
	public WaitHelper waithelper;
	   public LaunchContentPlayerPage(WebDriver rdriver) 
		  {
			driver=rdriver;
			PageFactory.initElements(driver, this);
			waithelper= new WaitHelper(driver);
	        }
	                    //a[contains(text(),'"+ +"')]
	    @FindBy(xpath="//a[contains(text(),'Activity List')]")
	    @CacheLookup
		WebElement ActivityListTab;
	    
	    @FindBy(id="sectiondropList")
	    @CacheLookup
	    WebElement selectCourse;
	                    //span[contains(text(),'"+ +"')]"
	    @FindBy(xpath="//span[contains(text(),'Training EXAM 123T Training Training')]")
	    @CacheLookup
		WebElement samExamSel;
	    
	    @FindBy(xpath="//span[@title='ECTraning']")
	    @CacheLookup
	    WebElement samAssignment;
		
		public void clickOnActivityListTab()
		{
			ActivityListTab.click();
		}
		public void selectCourseTab()
		{
			Select selCourse= new Select (selectCourse);
			waithelper.waitForElement(selectCourse, 30);
			selCourse.selectByVisibleText("Fundamental of Java Programming (4 2021)");
		}
		public void selectSamExam()
		{
			waithelper.waitForElement(samExamSel, 10);
			samExamSel.click();// not clickable
		}
	 
		

}
