package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement w=driver.findElement(By.xpath("//*[@id=\"page\"]/header/div/nav/ul/li[2]/button[2]/span[1]"));
		ac.moveToElement(w).perform();
		driver.findElement(By.xpath("//*[@id=\"page\"]/header/div/nav/ul/li[2]/div/div/div[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"promotional-masthead-1\"]/a/div[2]/h3")).click();
	}

}
