package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Login_page extends TestBase{
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div/div[2]/p")
	WebElement Login_Title;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div/div[2]/div[1]/div/input")
	WebElement Email_Input;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div/div[2]/div[2]/div/input")
	WebElement Password_Input;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div/div[2]/div[2]/div/svg/path")
	WebElement Password_Hide_Unhide;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div/div[2]/div[3]/label/span")
	WebElement Remember_Textbox;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div/button")
	WebElement Login_Button;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div/p/span")
	WebElement Signup_Link;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/form/div/div[2]/div[3]/span")
	WebElement Forgotpassword_Link;

	
	public Login_page(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public void LoginCheck() 
	{
		Email_Input.clear();
		Email_Input.click();
		Email_Input.clear();
		Email_Input.sendKeys(prop.getProperty("username"));
		Password_Input.clear();
		Password_Input.click();
		Password_Input.clear();
		Password_Input.sendKeys(prop.getProperty("password"));
		Login_Button.click();

	}
}
