package com.webapp11.webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {

		WebDriver driver;

		@Test
		public void test1() {
			driver.get("https://www.amazon.in");
			String title = driver.getTitle();
			System.out.println(title);
			//Assert.assertEquals(title,
					//"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
			// driver.manage().window().setPosition(new Point(100,30));
		}

		@Test
		public void test22() {
			driver.manage().window().maximize();			
			WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
			SearchBox.sendKeys("Hp Laptop");

		}

		@Test
		public void testJ23() {
			WebElement SearchIcon = driver.findElement(By.id("nav-search-submit-button"));
			SearchIcon.click();
		}

		@Test
		public void test24() {
			WebElement Listbox = driver.findElement(By.id("p_72/1318476031"));
			Listbox.click();
		}

		@Test
		public void testJbkTitlescroll() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(3000);			
			js.executeScript("window.scrollBy(0,5000)");
			Thread.sleep(3000);
		}
		@BeforeTest
		public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		@AfterTest
		public void afterTest() {
			driver.quit();
		}
	}