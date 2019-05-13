package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


	public class Sample9 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.shopclues.com/wholesale.html");
			WebElement mob=driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
			Actions acc=new Actions(driver);
			acc.moveToElement(mob).perform();
			Thread.sleep(3000);
			WebElement clk=driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
			clk.click();
}
}