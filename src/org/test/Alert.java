package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		WebElement btnlogin=driver.findElement(By.name("uid"));
		btnlogin.sendKeys("112345");
		WebElement btnpass=driver.findElement(By.name("password"));
		btnpass.sendKeys("112345");
		WebElement btnclk=driver.findElement(By.name("btnLogin"));
		btnclk.click();
		
		
		
	}

	

}
