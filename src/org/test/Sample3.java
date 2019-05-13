package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement textusername=driver.findElement(By.id("email"));
		textusername.sendKeys("shamele024@gmail.com");
		WebElement textpass=driver.findElement(By.id("pass"));
		textpass.sendKeys("shamele90");
		WebElement btnlogin=driver.findElement(By.xpath("//input[@id='u_0_2']"));
		btnlogin.click();
		
	} 

}
