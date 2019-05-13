package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles", Keys.ENTER);
		goToPage("3");
		Thread.sleep(2000);
	}

	private static void goToPage(String pageNum) throws InterruptedException {
		List<WebElement> pageele = driver.findElements(By.xpath("//div[@class='pagnHy']//span"));
		for (int i = 0; i < pageele.size() ; i++) {
			if(pageele.get(i).getText().equals(pageNum)) {
				pageele.get(i).click();
				break;
				
			
			}
		}
		WebDriverWait w=new WebDriverWait(driver, 66);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='s-item-container'])[3]"))));
	driver.findElement(By.xpath("(//div[@class='s-item-container'])[3]")).click();
	
	
	
		}
}
	

