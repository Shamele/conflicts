package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiions {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		WebElement btnclk=driver.findElement(By.xpath("//div[text()='Gmail']"));
		Actions acc=new Actions(driver);
		acc.contextClick(btnclk).perform();
		Robot r=new Robot();
		
		  r.keyPress(KeyEvent.VK_DOWN);
          r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
          
		
	}
}
