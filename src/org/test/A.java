package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"shopAllLinks\"]/tbody/tr/td[2]/div[1]/ul/li[1]/a")).click();
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"dealTitle\"]/span")).click();
	String s=driver.getWindowHandle();
	Set<String> all=driver.getWindowHandles();
	for (String a : all) {
		if(!s.equals(a)) {
			driver.switchTo().window(a);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		}
		
	}
	
	
	
	
	
	}

}
