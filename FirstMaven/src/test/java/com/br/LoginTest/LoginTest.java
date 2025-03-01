package com.br.LoginTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Browser is launched");
	}
	@Test(groups= {"login"})
	public void enterCorrectUserName()
	{
		System.out.println("Entered successufully");
	}
	
	@Test(groups= {"login"})
	public void enterInvalidCredentials()
	{
		System.out.println("Invalid User name and Passwords");
	}
	
	@Test(priority=1)
	public void getThreadExecution()
	{
		System.out.println("Invalid User name and Passwords"+Thread.currentThread().threadId());
	}
	@AfterMethod
	public void KillBrowser()
	{
		System.out.println("Browser is Killed");
	}
}
