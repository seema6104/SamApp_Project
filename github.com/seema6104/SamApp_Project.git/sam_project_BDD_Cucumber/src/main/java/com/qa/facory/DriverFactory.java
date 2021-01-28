package com.qa.facory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver>tlDriver= new ThreadLocal<>();
	/**
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser valus is " + browser);
	   if (browser.equals("chrome"))
	   {
		   WebDriverManager.chromedriver().setup();
		   tlDriver.set(new ChromeDriver());
	   }
	   else if (browser.equals("firefox"))
	   {
		   WebDriverManager.firefoxdriver().setup();
		   tlDriver.set(new FirefoxDriver());
	   }
	
	   else if (browser.equals("edge"))
	   {
		   WebDriverManager.edgedriver().setup();
		   tlDriver.set(new EdgeDriver());
	   }
	   else {
		   System.out.println("Please pass the correct browser value: " + browser);
	   }
	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
	}
	/**
	 * this is used to get the driver with ThreadLocal
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		
		return tlDriver.get();
	}

}
