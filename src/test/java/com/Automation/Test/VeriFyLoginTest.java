package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.LoginPage;

public class VeriFyLoginTest extends BaseTest{
	
	@Test
	public void Validation_Login_Testcase()
	{
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		LoginPage lp=new LoginPage();
		
		lp.doLogin("Admin");
		lp.doLogin1("admin123");
		lp.clickbtnLogin();
		
	}

}
