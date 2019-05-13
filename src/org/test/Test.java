

	package org.test;

	import java.awt.AWTException;
	import java.awt.RenderingHints.Key;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Test {
		public static void main(String[] args) throws AWTException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement btnclk=driver.findElement(By.xpath("//input[@id='email']"));
			btnclk.sendKeys("java");
			Robot r=new Robot();
			Actions acc=new Actions(driver);
			acc.doubleClick(btnclk).perform();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_X);
			WebElement btnpass=driver.findElement(By.xpath("//input[@id='pass']"));
			
			acc.moveToElement(btnpass).perform();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
			
			
			
			
			

	}
	}


}
