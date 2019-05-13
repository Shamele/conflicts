package org.test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sample1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\IEDriverServer1.exe");
		WebDriver driver=new InternetExplorerDriver();	
		driver.get("https://www.facebook.com/");
		String title =driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		
		}

}
