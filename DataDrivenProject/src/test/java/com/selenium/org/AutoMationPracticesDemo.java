package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.automation.pom.SignIn;
import com.baseclass.BaseClassDemo;

public class AutoMationPracticesDemo extends BaseClassDemo {
	public static WebDriver driver;

	public static void browserLaunch() throws InterruptedException {
	 driver = getDriver("chrome");
	 getUrl("http://automationpractice.com/index.php");
		SignIn s = new SignIn(driver);
		radioButtonOptions(s.getSignInBtn());
		Thread.sleep(2000);
	}

	public static void createAnAccount() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[@class='login']"));
		radioButtonOptions(element);
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.id("email_create"));
		inputValueElement(element2, "sivabalasundaravel133@gmail.com");
		WebElement element3 = driver.findElement(By.id("SubmitCreate"));
		radioButtonOptions(element3);
		Thread.sleep(2000);
	}

	public static void webElement() {

	}

	public static void profileCreate() throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("id_gender1"));
		radioButtonOptions(element);
		WebElement element2 = driver.findElement(By.id("customer_firstname"));
		inputValueElement(element2, "siva");
		WebElement element3 = driver.findElement(By.id("customer_lastname"));
		inputValueElement(element3, "bala");
		WebElement element4 = driver.findElement(By.id("email"));
		radioButtonOptions(element4);
		WebElement element5 = driver.findElement(By.name("passwd"));
		inputValueElement(element5, "12345678");

		WebElement day = driver.findElement(By.id("days"));
		selectOptions("byIndex", "29", day);
		WebElement month = driver.findElement(By.id("months"));
		selectOptions("byValue", "4", month);
		WebElement year = driver.findElement(By.id("years"));
		selectOptions("byValue", "1994", year);
		Thread.sleep(2000);

		WebElement newsletter = driver.findElement(By.id("newsletter"));
		radioButtonOptions(newsletter);
		WebElement optn = driver.findElement(By.id("optin"));
		radioButtonOptions(optn);
		WebElement frstnme = driver.findElement(By.id("firstname"));
		inputValueElement(frstnme, "subramaniam");
		WebElement lstnme = driver.findElement(By.id("lastname"));
		inputValueElement(lstnme, "arumugam");
		WebElement cmpny = driver.findElement(By.id("company"));
		inputValueElement(cmpny, "greens");
		WebElement add1 = driver.findElement(By.id("address1"));
		inputValueElement(add1, "adayar");
		WebElement add2 = driver.findElement(By.id("address2"));
		inputValueElement(add2, "maduarai");
		WebElement city = driver.findElement(By.id("city"));
		inputValueElement(city, "madurai");
		Thread.sleep(2000);

		WebElement state = driver.findElement(By.id("id_state"));
		selectOptions("byValue", "18", state);
		WebElement pincode = driver.findElement(By.id("postcode"));
		inputValueElement(pincode, "00000");

		WebElement country = driver.findElement(By.id("id_country"));
		selectOptions("byValue", "21", country);
		WebElement others = driver.findElement(By.id("other"));
		inputValueElement(others, "this is spartans");
		WebElement phone = driver.findElement(By.id("phone"));
		inputValueElement(phone, "1234555555");
		WebElement phone2 = driver.findElement(By.id("phone_mobile"));
		inputValueElement(phone2, "1234567890");
		WebElement box = driver.findElement(By.id("alias"));
		inputValueElement(box, "onnu solurathukku illa");
		WebElement sbmtacc = driver.findElement(By.id("submitAccount"));
		radioButtonOptions(sbmtacc);
		Thread.sleep(2000);

		WebElement hmebtn = driver.findElement(By.xpath("//a[@title='Home']"));
		radioButtonOptions(hmebtn);

	}

	public static void main(String[] args) throws InterruptedException {

		browserLaunch();
		createAnAccount();
		profileCreate();
	}

}
