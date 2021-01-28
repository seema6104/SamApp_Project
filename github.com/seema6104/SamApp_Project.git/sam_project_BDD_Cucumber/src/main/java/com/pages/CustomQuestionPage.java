package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.WaitHelper;
import com.sun.tools.javac.tree.Tree.Assert;


public class CustomQuestionPage {
	public WebDriver driver;
	WaitHelper waithelp;
	public CustomQuestionPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(driver, this);
		waithelp= new WaitHelper(driver);
	}
	@FindBy(xpath="//a[contains(text(),'SAM Assignments')]")
	@CacheLookup
	WebElement samAssignTab;

	@FindBy(id="aExams")
	@CacheLookup
	WebElement examTab;

	@FindBy(xpath="//a[@id='aExams']/following::a[5]")
	@CacheLookup
	WebElement cusQueTab;

	@FindBy(id="ctl00_ContentPlaceHolder1_customQuestion_remediationsFilter_ctlSubject_ddSubject")
	@CacheLookup
	WebElement selSubject;

	@FindBy(id="ctl00_ContentPlaceHolder1_customQuestion_remediationsFilter_ddSeries")
	@CacheLookup
	WebElement selSeries;

	@FindBy(id="ctl00_ContentPlaceHolder1_customQuestion_remediationsFilter_ddBooks")
	@CacheLookup
	WebElement selTextBook;

	@FindBy(id="ctl00_ContentPlaceHolder1_customQuestion_remediationsFilter_ddChapters")
	@CacheLookup
	WebElement  selChapUnit ;

	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder1$customQuestion$remediationsFilter$pageTextBox']")
	@CacheLookup
	WebElement remPage ;
	
	@FindBy(id="//ctl00_ContentPlaceHolder1_customQuestion_ddObjItemTypes")
	@CacheLookup
	WebElement selType ;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_customQuestion_questionHeader_privateRadioButton']")
	@CacheLookup
	WebElement typePrivateRadio;


	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_customQuestion_questionHeader_publicRadioButton']")
	@CacheLookup
	WebElement typePublicRadio;
   
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_customQuestion_booleanQuestion_trueRadioButton']")
	@CacheLookup
	WebElement correctYesRad;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_customQuestion_booleanQuestion_falseRadioButton']")
	@CacheLookup
	WebElement correctNoRad;
	
	@FindBy(xpath="//textarea[@id='ctl00_ContentPlaceHolder1_customQuestion_questionHeader_questionTextTextBox']")
	@CacheLookup
	WebElement textarea;

	@FindBy(id="ctl00_ContentPlaceHolder1_customQuestion_saveCloseImageButton")
	@CacheLookup
	WebElement saveAndCloseBtn;
	
	
    
	public void clickSamAssignmentTab()
	{
		waithelp.waitForElement(samAssignTab, 30);
		samAssignTab.click();
	}

    public void clickExamTab()
    {
    	waithelp.waitForElement(examTab, 20);
    	examTab.click();
    }

    public void customQueTab()
    {
    	cusQueTab.click();
    }
    public void selectSubject() 
    {
    	Select selSub= new Select(selSubject);
    	selSub.selectByIndex(1);
    }

    public void selectSeries() 
    {
    	Select selSer= new Select(selSeries);
    	selSer.selectByIndex(4);
    }
    public void selectTextBook() 
    {
    	Select selTBook= new Select(selTextBook);
    	selTBook.selectByIndex(4);
    }
    public void selectChapUnit() 
    {
    	Select selchap= new Select(selChapUnit);
    	selchap.selectByIndex(4);
    }

    public void remPageText() 
    {
    	waithelp.waitForElement(remPage, 20);
    	remPage.sendKeys("Custom question");
    }

    public void typeDropDown() 
    {
    	Select slctTyp= new Select(selType);
    	slctTyp.selectByIndex(1);
    }
    
    public void privateRadioBtn()
    {
    	typePrivateRadio.click();
    }
    public void publicRadioBtn()
    {
    	typePublicRadio.click();
    }
  
    public void corrtAnsYesRadio()
    {
    	correctYesRad.click();
    }
    public void corrtAnsNoRadio()
    {
    	correctNoRad.click();
    }
    public void SaveAndCloseBtn()
    {
    	saveAndCloseBtn.click();
    	
    }
    
    public void verifySucessMessage() throws InterruptedException
    {
     Alert alert = driver.switchTo().alert();
     String alertMessage= driver.switchTo().alert().getText();
     Thread.sleep(3000);
     alert.accept();	
     
     
    }













}
