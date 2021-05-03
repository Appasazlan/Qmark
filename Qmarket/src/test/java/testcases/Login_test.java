package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Login_page;

public class Login_test extends TestBase {
	
	Login_page loginpage;
	
	
	public Login_test() {
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new Login_page();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, " Login your Account ");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
