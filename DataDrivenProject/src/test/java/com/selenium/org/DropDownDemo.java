package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static WebDriver driver;

	public static void driver() {

		System.setProperty("webdriver.chrome.driver","./src/browserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	public static void dropDown() {

		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("29");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("4");
	
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1994");
		
		WebElement gender = driver.findElement(By.id("u_0_8"));
		gender.click();
		
		Select dropbox =new Select( driver.findElement(By.name("preferred_pronoun")));
		dropbox.selectByIndex(2);
				
	}

	public static void main(String[] args) {
		driver();
		dropDown();
	}

}
