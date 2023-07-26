package UBERUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UBERBASE.TestBase1;


public class uberlogin extends TestBase1
{
	@FindBy(xpath="//input[@id='PHONE_NUMBER_or_EMAIL_ADDRESS']")
	WebElement phoneno;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement sumbit;
	
	@FindBy(xpath="//input[@aria-label='Enter your password']")
	WebElement pass;
	
	
	@FindBy(xpath="//button[@data-test='Login with password']")
	WebElement Loginwithpass;
	
	public uberlogin()
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement login()
	{
		return phoneno;
	}
	
	public WebElement Submit_bt()
	{
		return sumbit;
	}
	public WebElement pass_bt()
	{
		return pass;
	}
	public WebElement Loginpass_bt()
	{
		return Loginwithpass;
	}
}
