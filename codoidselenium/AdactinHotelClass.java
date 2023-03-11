package org.codoidselenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//6. Select multiple options from the dropdown

public class AdactinHotelClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\eclipse-workspace\\SeleniumAdactinHotel\\Driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://adactinhotelapp.com/SearchHotel.php");

		d.findElement(By.id("username")).sendKeys("MohamedShahid");
		d.findElement(By.id("password")).sendKeys("Asdf@1234");
		d.findElement(By.id("login")).click();

		WebElement location = d.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(2);
		WebElement hotels = d.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Sunshine");
		WebElement room = d.findElement(By.id("room_nos"));
		Select s2 = new Select(room);
		s2.selectByIndex(1);

		d.findElement(By.xpath("//input[@value='10/03/2023']")).sendKeys("11/03/2023");

		d.findElement(By.xpath("//input[@value='11/03/2023']")).sendKeys("12/03/2023");

		WebElement adltroom = d.findElement(By.id("adult_room"));
		Select s3 = new Select(adltroom);
		s3.selectByIndex(2);
		Thread.sleep(3000);
		WebElement search = d.findElement(By.id("Submit"));
		search.click();
		WebElement radbtn = d.findElement(By.id("radiobutton_1"));
		radbtn.click();
		Thread.sleep(3000);

		WebElement continuebtn = d.findElement(By.id("continue"));
		continuebtn.click();
		d.findElement(By.xpath("//input[@class='reg_input']")).sendKeys("Mohamed");

		d.findElement(By.id("last_name")).sendKeys("Shahid");
		d.findElement(By.id("address")).sendKeys("No:1, Chepauk, Chennai-05");

		d.findElement(By.name("cc_num")).sendKeys("1234567891098765");

		WebElement cctype = d.findElement(By.id("cc_type"));
		Select s4 = new Select(cctype);
		s4.selectByIndex(2);

		WebElement expmonth = d.findElement(By.id("cc_exp_month"));
		Select s5 = new Select(expmonth);
		s5.selectByIndex(3);

		WebElement expyear = d.findElement(By.id("cc_exp_year"));
		Select s6 = new Select(expyear);
		s6.selectByValue("2022");

		WebElement cvv = d.findElement(By.id("cc_cvv"));
		cvv.sendKeys("453");
		Thread.sleep(3000);

		WebElement booknowclk = d.findElement(By.id("book_now"));
		booknowclk.click();
		Thread.sleep(5000);

		d.close();

	}

}
