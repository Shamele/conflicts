package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/");
		WebElement edt=driver.findElement(By.xpath("(//a[@href='/editorial-images'])[2]"));
		edt.click();
		WebElement ent=driver.findElement(By.xpath("(//a[@class='landing-secondary-menu__link text-link--sly'])[4]"));
		ent.click();
		
	}
	

}
