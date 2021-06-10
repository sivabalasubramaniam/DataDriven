package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownDemo {
	 
	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "./src/browserDrivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  WebElement amazon = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		  
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("argument[0].scrollIntoView();",amazon);
		  Thread.sleep(2000);
		  System.out.println("done");
		  
		  
		  WebElement toykeys = driver.findElement(By.xpath("(//a[@class='nav-a'][1])"));
		  js.executeAsyncScript("argument[0].scrollIntoView();", toykeys);
		  
	}

}
