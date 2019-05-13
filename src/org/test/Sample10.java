package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		Thread.sleep(3000);
		WebElement spt=driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(spt).perform();
		WebElement clk=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		clk.click();
	
		
	}

}
