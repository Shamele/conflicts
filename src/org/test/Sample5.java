package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.adactin.com/HotelApp/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("shamele");
		String name=username.getAttribute("value");
		System.out.println(name);
		
		
		
	}

}
