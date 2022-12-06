package com.Automation.GenericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
public class DriverUtils {
	
		static WebDriver driver;
		public static void createDriver()
		{
			/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Plabani\\eclipse-workspace\\OrangeHRM_B3\\Driver\\chromedriver.exe");
		    driver=new ChromeDriver();
			//driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
			
					System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Plabani\\\\eclipse-workspace\\\\OrangeHRM_B3\\\\Driver\\\\chromedriver.exe");
					ChromeOptions option = new ChromeOptions();
					option.addArguments("start-maximized");
					option.addArguments("--disable-blink-features=AutomationControlled");
					option.addArguments("--disable-notifications");// Disabling any notifications
				       driver = new ChromeDriver(option);
				
					  driver.manage().window().maximize();

		}
		
		public static WebDriver getDriver()
		{
			if(driver== null) {
			createDriver();
			}
			return driver;
		}

	}


