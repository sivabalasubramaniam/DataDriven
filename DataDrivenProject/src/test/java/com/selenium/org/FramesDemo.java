package com.selenium.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver","./src/browserDrivers/chromedriver.exe");		
		WebDriver  dr = new ChromeDriver();
		dr.get("http://demo.automationtesting.in/Frames.html");
		
		dr.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		dr.switchTo().frame("singleframe");
		Thread.sleep(3000);
		dr.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("helo");
		
		dr.switchTo().parentFrame();
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement firstFrame = dr.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		dr.switchTo().frame(firstFrame);
		
		WebElement secondFrame = dr.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		dr.switchTo().frame(secondFrame);
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("spartans");
	}

}
