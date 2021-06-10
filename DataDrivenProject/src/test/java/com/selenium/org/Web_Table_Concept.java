package com.selenium.org;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Concept {
	public static WebDriver dr;

	public static void main(String[] args) {
		browser();
columns();
	rows();
		heading();
		particular();

	}

	public static void rows() {
		
		int a=2;
		List<WebElement> rows = dr.findElements(By.xpath("//table/tbody/tr["+a+"]/td"));
		for (WebElement rowData : rows) {

			System.out.println(rowData.getText());
		}

	}

	public static void heading() {
		List<WebElement> header = dr.findElements(By.xpath("//table/thead/tr/th"));
		for (WebElement headerdetails : header) {
			System.out.println(headerdetails.getText());

		}
	}

	public static void browser() {
		System.setProperty("webdriver.chrome.driver","./src/browserDrivers/chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");

	}

	public static void columns() {
		List<WebElement> office = dr.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (WebElement officeLocation : office) {
			String text = officeLocation.getText();

			System.out.println(text);

		}

	}
public static void particular() {
WebElement particularData = dr.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
System.out.println(particularData.getText());
}
}
