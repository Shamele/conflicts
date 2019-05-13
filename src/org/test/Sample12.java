package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample12 {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		WebElement a=driver.findElement(By.xpath("(//li[@class='sprint-menu__float'])[1]"));
		Actions acc=new Actions(driver);
		acc.moveToElement(a).perform();
		Thread.sleep(2000);
		WebElement b=driver.findElement(By.xpath("//a[text()='Pay bill']"));
		b.click();
		
	

}
}
