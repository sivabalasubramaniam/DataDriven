package com.selenium.org;
import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/browserDrivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	driver.get("http:/demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	WebElement openAlert = driver.findElement(By.xpath("//a[@href='#OKTab']"));
	openAlert.isDisplayed();
	openAlert.click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("completed");
	
	
	driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	WebElement confrimAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	confrimAlert.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	System.out.println("confirmation alert executed");
	
	WebElement promptAlert = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	promptAlert.click();
	driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	driver.switchTo().alert().sendKeys("spartans");
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	System.out.println("Prompt Alert Executed");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
