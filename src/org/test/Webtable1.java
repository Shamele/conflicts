package org.test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		java.util.List<WebElement> tRows=driver.findElements(By.tagName("tr"));
		WebElement  w=tRows.get(tRows.size()-1);
		java.util.List<WebElement> tData=w.findElements(By.tagName("td"));
		for (WebElement x : tData) {
			System.out.println(x.getText());
			
		}
		
	     
}
}
