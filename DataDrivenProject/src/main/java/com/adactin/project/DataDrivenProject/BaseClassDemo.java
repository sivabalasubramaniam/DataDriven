package com.adactin.project.DataDrivenProject;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.css.ElementCSSInlineStyle;

public class BaseClassDemo {

	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./src/browserDrivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("/src/browserDrivers/chromedriver.exe"));
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("/src/browserDrivers/chromedriver.exe"));
				driver = new FirefoxDriver();
			} else {
				System.out.println("browser name is invalid");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}
	

	public static void getUrl(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void selectOptions(String option, String value, WebElement element) {
		Select sc = new Select(element);
		try {
			if (option.equalsIgnoreCase("byIndex"))  {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			} else if (option.equalsIgnoreCase("byValue")) {
				sc.selectByValue(value);
			} else if (option.equalsIgnoreCase("byVisibleText")) {
				sc.selectByVisibleText(value);
			} else {
				System.out.println("Invalid option");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
 
	}

	public static void getTitle() {
		System.out.println(driver.getTitle());

	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refreshOption() {
		driver.navigate().refresh();
	}

	public static void quitOption() {
		driver.quit();
	}

	public static void closeOption() {
		driver.close();
	}

	public static void xpathOption( WebElement element,String path) {
		element = driver.findElement(By.xpath(path));
	}

	public static void scrollUpOption( WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();", element);
		System.out.println("done");

	}

	public static void radioButtonOptions(WebElement element) {
		element.click();
	}

	public static void actionsOperation(String action, WebElement element, WebElement source, WebElement target) 
	{
		try {
			Actions act = new Actions(driver);
			if (action.equalsIgnoreCase("doubleClick")) {
				act.doubleClick(element).build().perform();
			} else if (action.equalsIgnoreCase("rightClick")) {
				act.contextClick(element).build().perform();
			} else if (action.equalsIgnoreCase("moveToElement")) {
				act.moveToElement(element).build().perform();
			} else if (action.equalsIgnoreCase("click")) {
				act.click(element).build().perform();
			} else if (action.equalsIgnoreCase("clickAndHold")) {
				act.clickAndHold(element).build().perform();
			} else if (action.equalsIgnoreCase("dragAndDrop")) {
				act.dragAndDrop(source, target).build().perform();
			} else if (action.equalsIgnoreCase("release")) {
				act.release(element).build().perform();
			} else {
				System.out.println("Action Operation invalid");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
	public static void elementIsEnable(WebElement element) {
		System.out.println(element.isDisplayed());
	}

	public static void elementIsDisplayed(WebElement element) {
		System.out.println(element.isEnabled());
	}

	public static void elementIsSelected(WebElement element) {
		System.out.println(element.isSelected());
	}

	public static void getTextOption( WebElement element) {

		System.out.println(element.getText());
	}

	public static void getAttributeOption( WebElement element,String name) {

		System.out.println(element.getAttribute(name));
	}

	public static void implicityWait( int sec1, int sec2) {
		driver.manage().timeouts().implicitlyWait(sec1, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(sec2, TimeUnit.SECONDS);

	}


  public static void explicityWait( WebElement element, int sec ) {
  
  
  WebDriverWait wait1 = new WebDriverWait(driver,sec);
  wait1.until(ExpectedConditions.visibilityOf(element));
  
  } 
  public static void screenShotOption(String location) throws IOException { 
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File sourceFile=ts.getScreenshotAs(OutputType.FILE); 
	  File desFile=new File(location);
	  FileUtils.copyFile(sourceFile, desFile);
  System.out.println("done");
  }
  public static void windowHandlesOption(Set<String> allId) 
  {
	  allId=driver.getWindowHandles();

}
  public static void windowHandleOption(String id) 
  {
	  id=driver.getWindowHandle();
}
  public static void alertOpen() 
  {
	  driver.switchTo().alert().accept();
}
  public static void alertConfirm(String confirm) 
  {
	  if (confirm.equalsIgnoreCase("ok")) 
	  {
		driver.switchTo().alert().accept();
	}else if (confirm.equalsIgnoreCase("dismiss")) 
	{
		driver.switchTo().alert().dismiss();
		
	}else {
		System.out.println("confirm alert invalid ");
	}
}
  public static void alertPrompt(String prompt, String value) 
  {
	  if (prompt.equalsIgnoreCase("ok")) 
	  {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
	}else if (prompt.equalsIgnoreCase("dismiss")) 
	{
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().dismiss();	
	}else 
	{
	System.out.println("prompt alert invalid");	
	}

  }
 public static void singleFramesOption(int index) {
	 driver.switchTo().frame(index);
	
 }
 

}
 