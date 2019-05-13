package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Sample11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.id("credit2"));
		WebElement b=driver.findElement(By.id("bank"));		
		Actions acc=new Actions(driver);
		acc.dragAndDrop(a, b).perform();
		WebElement c=driver.findElement(By.id("fourth"));
		WebElement d=driver.findElement(By.id("amt7"));
		acc.dragAndDrop(c, d).perform();
		WebElement e=driver.findElement(By.id("credit1"));
		WebElement f=driver.findElement(By.id("loan"));
		acc.dragAndDrop(e, f).perform();
		WebElement g=driver.findElement(By.id("fourth"));
		WebElement h=driver.findElement(By.id("amt8"));
		acc.dragAndDrop(g,h).perform();
		WebElement i=driver.findElement(By.id("equal"));
		String s=i.getText();
		if(s.equals("Perfect!"))
				{
			System.out.println("perfect");
			
		}
		else {
			System.out.println("not perfect");
		}
		
		
	
		
		
			
			
		}
		
	}


