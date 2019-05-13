package org.test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		WebElement btnclk=driver.findElement(By.name("q"));
		btnclk.sendKeys("gmail");
		Actions acc=new Actions(driver);
		acc.doubleClick();
		acc.moveToElement(btnclk).perform();
		WebElement btn=driver.findElement(By.name("q"));
		
		
		

}
}
