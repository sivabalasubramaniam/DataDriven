package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 


public class ActionDemo {
	
 
public static  void chromeBrowser() {
	
	System.setProperty("webdriver.chrome.driver","./src/browserDriver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    
	Actions act = new Actions(driver);
	WebElement accountMouseOver = driver.findElement(By.id("nav-link-accountList"));
	act.moveToElement(accountMouseOver).build().perform();
    
	driver.findElement(By.xpath("//span[text()='Create a Wish List']")).click();
	
 }


public static void main(String[] args) {
	chromeBrowser();
	
	
	
	
	
	
}

}