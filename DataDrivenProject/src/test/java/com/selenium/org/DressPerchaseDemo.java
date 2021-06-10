package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClassDemo;

public class DressPerchaseDemo extends BaseClassDemo {

	public static WebDriver driver;
	public static void browserLaunch() {
	driver=getDriver("chrome");
	getUrl("http://automationpractice.com/index.php");
	implicityWait(5, 20);
	}	
	public static void signInMethod() throws InterruptedException 
	{
		
		WebElement signInBtn = driver.findElement(By.xpath("//a[@class='login']"));
		radioButtonOptions(signInBtn);
		Thread.sleep(2000);
	}
	public static void logInBtn() throws InterruptedException 
	{
		WebElement emailName = driver.findElement(By.id("email"));
		inputValueElement(emailName, "sivabalasundaravel@gmail.com");
		WebElement pswd = driver.findElement(By.id("passwd"));
		inputValueElement(pswd, "20102647");
		WebElement sgnIn = driver.findElement(By.id("SubmitLogin"));
		radioButtonOptions(sgnIn);
		Thread.sleep(2000);	
		}
	public static void dresses() throws InterruptedException 
	{
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		actionsOperation("moveToElement", dress, null, null);
		WebElement causal = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		radioButtonOptions(causal);
		Thread.sleep(2000);
	}
	public static void dressSelect() throws InterruptedException {
		WebElement pDress = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		radioButtonOptions(pDress);
		Thread.sleep(2000);
		WebElement sFrame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		singleFramesOption(0);
		Thread.sleep(2000);
		WebElement quantity = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		radioButtonOptions(quantity);
		WebElement size = driver.findElement(By.id("group_1"));
		selectOptions("byValue", "2", size);
		Thread.sleep(2000);
		WebElement addCrt = driver.findElement(By.name("Submit"));
		radioButtonOptions(addCrt);
		Thread.sleep(2000);
		WebElement prcsschkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		radioButtonOptions(prcsschkout);
		Thread.sleep(2000);
		WebElement prcschkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		radioButtonOptions(prcschkout2);
		Thread.sleep(2000);
		WebElement prcschkout3 = driver.findElement(By.name("processAddress"));
		radioButtonOptions(prcschkout3);
		Thread.sleep(2000);
		WebElement agree = driver.findElement(By.id("cgv"));
		radioButtonOptions(agree);
		Thread.sleep(2000);
		WebElement prcschkout4 = driver.findElement(By.name("processCarrier"));
		radioButtonOptions(prcschkout4);
		Thread.sleep(2000);
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		radioButtonOptions(payment);
		Thread.sleep(2000);
		WebElement confirmOrder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		radioButtonOptions(confirmOrder);
		
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		signInMethod();
		logInBtn();
		dresses();
		dressSelect();
	}

}
