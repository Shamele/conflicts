package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(3000);
		WebElement inter=driver.findElement(By.className("red_text"));
		inter.click();
		Thread.sleep(3000);
		WebElement cts=driver.findElement(By.xpath("\\a[@data-toggle='modal']"));
		cts.click();
		
		
		
		
}
}