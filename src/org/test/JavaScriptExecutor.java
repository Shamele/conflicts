package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\geckodriver1.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		WebElement btnlogin=driver.findElement(By.name("uid"));
		btnlogin.sendKeys("112345");
		WebElement btnpass=driver.findElement(By.name("password"));
		btnpass.sendKeys("112345");
		WebElement btnclk=driver.findElement(By.name("btnLogin"));
		btnclk.click();
		
		
		
		
		
		
		
		
	}

}
