package com.TestUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {

	public static long page_Load_Timeout = 20;
	public static long implicitly_Wait= 20;
	
	public static void takescreenshot(WebDriver driver, String screenshot) {
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		String currentdir= System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(srcfile, new File(currentdir+"/Screenshot/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
