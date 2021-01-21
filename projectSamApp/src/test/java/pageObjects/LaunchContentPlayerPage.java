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
   WaitHelper waithelp;
   public LaunchContentPlayerPage(WebDriver rdriver) 
	  {
		driver=rdriver;
		PageFactory.initElements(driver, this);
		 waithelp=new WaitHelper(driver);
        }

    @FindBy(xpath="//a[contains(text(),'Activity List')]")
    @CacheLookup
	WebElement ActivityListTab;
    
    @FindBy(id="sectiondropList")
    @CacheLookup
    WebElement selectCourse;
	
    @FindBy(xpath="//span[contains(text(),'Training EXAM 123T Training Training')]")
    @CacheLookup
	WebElement samExamSel;
    
     @FindBy(xpath="//h3[contains(text(),'Exam Details')]")
    @CacheLookup
	WebElement verifyDialoOpen;
	
	public void clickOnActivityListTab()
	{
		waithelp.waitForElement(ActivityListTab, 30);
		ActivityListTab.click();
	}
	public void selectCourseTab()
	{
		Select selCourse= new Select (selectCourse);
		selCourse.selectByVisibleText("Fundamental of Java Programming (4 2021)");
	}
	public void selectSamExam()
	{    
		waithelp.waitForElement(samExamSel, 30);
		samExamSel.click();
	}
	
	public void verifyDialogBoxOpen() {
		waithelp.waitForElement(verifyDialoOpen, 50);
		// boolean assignmentOpen= verifyDialoOpen.isDisplayed(); 
		 String examOpen="Exam Details";
		 if( verifyDialoOpen.equals(examOpen))
		 {
			 System.out.println("Exam dialouge is open successfully!!");
		 }
		 else {
			 System.out.println("Exam dialouge is not opened");
		 }
	 }
	
}
