package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class CustomQuestionPage {
	 public WebDriver driver;
	 WaitHelper waithelp;
	 public CustomQuestionPage(WebDriver rdriver)
	 {
		 driver=rdriver;
		 PageFactory.initElements(driver, this);
		 waithelp= new WaitHelper(driver);
		 
	 }
	 
	 
	 
	

}
