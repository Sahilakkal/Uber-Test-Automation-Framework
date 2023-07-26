package UBERUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import UBERBASE.TestBase1;

public class Homepage1 extends TestBase1
{

	@FindBy(xpath="//*[@id=\"wrapper\"]/div[1]/div/main/div/section/div/section/div[1]/div/div[1]/div[1]/div/div[2]/div[1]/input")
	WebElement pickup;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[1]/div/main/div/section/div/section/div[1]/div/div[1]/div[2]/div/div[2]/div[1]/input")
	WebElement drop;
	
	@FindBy(xpath="//img[@alt='Ashrey']")
	WebElement prof;
	
	@FindBy(xpath="//Button[@data-baseweb=\"button\"][@class=\"_css-hGiXMo\"]")
	WebElement sub;
	
	@FindBy(xpath="//a[@href='https://riders.uber.com/trips']")
	WebElement mytrip;
	
	@FindBy(xpath="//a[@href='https://wallet.uber.com/']")
	WebElement wallet;
	
	@FindBy(xpath="//a[@href='/promos']")
	WebElement promo;
	
	@FindBy(xpath="//a[@href='https://help.uber.com/riders/inbox']")
	WebElement support;
	
	@FindBy(xpath="//a[@href='https://riders.uber.com/profile']")
	WebElement profile;
	
	@FindBy(xpath="//a[@href='https://help.uber.com/riders']")
	WebElement help;
	
	@FindBy(xpath="//a[@data-buttonkey='https://charter.uber.com']")
	WebElement charter;
	
	
	@FindBy(xpath="//a[text()='Uber']")
	WebElement logo;
	
	public Homepage1()
{
	PageFactory.initElements(driver, this);
}
public WebElement pick_up()
{
	return pickup;
}
public WebElement drop_of()
{
	return drop;
}
public WebElement sub_bt()
{
	return sub;
}
public WebElement prof_bt()
{
	return prof;
}
public WebElement mytrip_bt()
{
	return mytrip;
}
public WebElement wallet_bt()
{
	return wallet;
}
public WebElement promos_bt()
{
	return promo;
}
public WebElement support_bt()
{
	return support;
}
public WebElement profile_bt()
{
	return profile;
}
public WebElement help_bt()
{
	return help;
}
public WebElement Charter_bt()
{
	return charter;
}
public WebElement logo_check()
{
	return logo;
}
}