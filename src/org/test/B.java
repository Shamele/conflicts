package org.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shamele\\eclipse-workspace\\Selenium1day\\Driver\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sc.com/in/bank-with-us/online-banking-login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"page\"]/header/div/nav/div[1]/button")).click();
		Actions ac=new Actions(driver);
		WebElement w=driver.findElement(By.xpath("//*[@id=\"page\"]/header/div/nav/div[1]/div/ul/li[1]/a"));
		ac.moveToElement(w).click().perform();
	}

}
