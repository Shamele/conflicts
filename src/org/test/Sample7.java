package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		Actions act=new Actions(driver);
		act.moveToElement(cat).perform();
		WebElement mob=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		act.moveToElement(mob).perform();
		
		
		
	}

}
