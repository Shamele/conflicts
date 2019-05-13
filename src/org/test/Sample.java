package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String title=driver.getTitle();
	System.out.println(title);
	String url =driver.getCurrentUrl();
	System.out.println(url);
	driver.quit();
	}

}
