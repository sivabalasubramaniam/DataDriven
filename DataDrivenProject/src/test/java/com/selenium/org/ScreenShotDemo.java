package com.selenium.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {
	 public static WebDriver driver;
	public static void screenShotDemo() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./src/browserDrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.in/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File desFile=new File("C:\\Users\\SIVA BALASUBRAMANIAM\\eclipse-workspace\\MyTopics\\Screenshot\\ss.png");
		FileUtils.copyFile(sourceFile, desFile);
		System.out.println("done");
		
		
		
	}

	public static void main(String[] args) throws IOException {
screenShotDemo();
	}

}
