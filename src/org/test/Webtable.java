package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
	     java.util.List<WebElement> tRows=driver.findElements(By.tagName("tr"));
	     for (WebElement x : tRows) {
	    	 System.out.println(x.getText());
	    	 WebElement s = driver.findElement(By.tagName("td"));
	    	 for (WebElement w: tRows) {
	    		 System.out.println(w.getText());
	    		 
				
			}
	    	 
			
		}
	     
		
		

		

}
}
