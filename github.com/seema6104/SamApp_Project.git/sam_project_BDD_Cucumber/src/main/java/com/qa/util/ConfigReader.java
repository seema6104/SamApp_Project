package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties prop;
    /**
     * https://www.toolsqa.com/cucumber-video-tutorials/
     * @return
     */
	public Properties init_prop()  {
		prop= new Properties();
		
		try {
		FileInputStream ip= new FileInputStream("./src/test/resources/config/config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	  
    //Student User userName
    public String getStuUserName()
    {
   	 String username=prop.getProperty("stuEmail");
		return username;
    }
    public String getStuUserPWD()
    {
   	 String password=prop.getProperty("StuPassword");
		return password;
    }
    
    //Instructor userName
    public String getInstUserName()
    {
   	 String username=prop.getProperty("instEmail");
		return username;
    }
    public String getInstUserPWD()
    {
   	 String password=prop.getProperty("instPassword");
		return password;
    }
	
	
	

}
