package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.flipkart.com");
		
		WebElement cls=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		cls.click();
		WebElement hme=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(hme).perform();
		
	}

}
