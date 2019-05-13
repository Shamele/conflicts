package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		a.click();
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.xpath("(//p[contains(text(),'Our')])[1]"));
		String text = b.getText();
		System.out.println(text);
	}

}
