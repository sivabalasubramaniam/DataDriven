package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo
{

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "./src/browserDrivers/chromedriver.exe");
		  WebDriver	driver=new ChromeDriver();
		  driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		  
		  
		  Actions act=new Actions(driver);
		  WebElement first = driver.findElement(By.xpath("(//span[@draggable='true'])[1]"));
		  WebElement second = driver.findElement(By.xpath("(//span[@draggable='true'])[2]"));
		  WebElement third = driver.findElement(By.xpath("(//span[@draggable='true'])[3]"));
		  WebElement fourth = driver.findElement(By.xpath("(//span[@draggable='true'])[4]"));
		  WebElement drop = driver.findElement(By.xpath("//div[@dropzone='move']"));
	
	act.dragAndDrop(first, drop);
	act.dragAndDrop(second, drop);
	act.dragAndDrop(third, drop);
	act.dragAndDrop(fourth, drop);
	
	
	
	}

}
