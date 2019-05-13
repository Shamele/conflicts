package org.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class I {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions ac=new Actions(driver);
		WebElement w=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
		ac.moveToElement(w).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[2]/ul/li[11]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div/div/div[2]/div[1]/div/div[1]/a/div/img[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a[2]")).click();
		String s=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
		for (String x : all) 
			if(!s.equals(x)) {
			driver.switchTo().window(x);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"swatch-0-size\"]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div/div[3]/form/button")).click();
		}
			
		
		
		
	}

}
