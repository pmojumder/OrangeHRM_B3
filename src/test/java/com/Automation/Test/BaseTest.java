package com.Automation.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() throws FileNotFoundException, IOException
	{
		com.Automation.GenericUtils.DriverUtils.createDriver();
}
	}