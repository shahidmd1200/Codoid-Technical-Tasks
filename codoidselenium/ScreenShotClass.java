package org.codoidselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//8. Write code for taking Screenshot

public class ScreenShotClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\Selenium\\Driver\\chromedrivernew.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("shahid");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		TakesScreenshot t =  (TakesScreenshot) driver;
		File screenshot = t.getScreenshotAs(OutputType.FILE);
		File des2 = new File("D:\\ScreenShot\\Facebook.png");
		FileUtils.copyFile(screenshot, des2);
		
		
	}
}
