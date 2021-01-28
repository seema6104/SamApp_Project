package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.util.WaitHelper;
public class LaunchContentPlayer {
	private WebDriver driver;
	 WaitHelper waithelper;
	   public LaunchContentPlayer(WebDriver rdriver) 
		  {
			driver=rdriver;
			PageFactory.initElements(rdriver, this);
			waithelper= new WaitHelper(driver);
	        }
	             
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
	
	    @FindBy(xpath="//button[@id='btnStart']")
	    @CacheLookup
	    WebElement examDialougeBox;
	    
	    public void clickOnActivityListTab()
		{   
	    	waithelper.waitForElement(ActivityListTab, 50);
			ActivityListTab.click();
		}
		public void selectCourseTab()
		{
			Select selCourse= new Select (selectCourse);
			waithelper.waitForElement(selectCourse, 40);
			selCourse.selectByVisibleText("Fundamental of Java Programming (4 2021)");
		}
		public void selectSamExam()
		{
			waithelper.waitForElement(samExamSel, 40);
			samExamSel.click();
		}
	   public void examDialBox()
	   {
//		   Alert alert= driver.switchTo().alert();
//		   System.out.println(alert.getText());
		   waithelper.waitForElement(examDialougeBox, 40);
		   examDialougeBox.click();
	   }
	

}
