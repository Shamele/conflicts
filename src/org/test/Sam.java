package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sam {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.findElement(By.xpath(("(//a[text()='Add Customer'])[1]"))).click();
	    driver.findElement(By.id("fname")).sendKeys("shamele");
	    driver.findElement(By.id("lname")).sendKeys("sanjesh");
	    driver.findElement(By.id("email")).sendKeys("shamele024@gmail.com");
	    driver.findElement(By.id("message")).sendKeys("chennai");
	    driver.findElement(By.id("telephoneno")).sendKeys("12345678");
	    driver.findElement(By.name("submit")).click();
	}

}
