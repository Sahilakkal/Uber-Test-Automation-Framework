package UBERUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UBERBASE.BuisnessBase1;

public class UberbuinessUi1 extends BuisnessBase1
{
@FindBy(xpath="//img[@class='css-dfLdpM']")
WebElement logo;

@FindBy(xpath="(//button[@class='css-eMVmlR'])[1]")
WebElement How;

@FindBy(xpath="(//button[@class='css-eMVmlR'])[2]")
WebElement Solution;

@FindBy(xpath="(//button[@class='css-eMVmlR'])[3]")
WebElement Industry;

@FindBy(xpath="(//button[@class='css-eMVmlR'])[4]")
WebElement resources;

@FindBy(xpath="(//button)[5]")
WebElement language;

@FindBy(xpath="//a[@href='/in/hi/business/']")
WebElement hindi;

@FindBy(xpath="//a[@class='css-eMVmlR']")
WebElement Contactus;

@FindBy(xpath="//a[text()='Get started']")
WebElement Get;

@FindBy(xpath="//a[@aria-label='Log in to your Uber for Business account']")
WebElement login;

@FindBy(xpath="//input[@id='PHONE_NUMBER_or_EMAIL_ADDRESS']")
WebElement logindo;

@FindBy(xpath="//button[@type='submit']")
WebElement sumbit2;

@FindBy(xpath="//input[@aria-label='Enter your password']")
WebElement pass2;

@FindBy(xpath="//button[@data-test='Login with password']")
WebElement Loginwithpass2;

@FindBy(xpath="(//a[@class='css-mOjhT'])[1]")
WebElement Checksolution2;		

@FindBy(xpath="(//img[@class='css-ddSBRI'])[1]")
WebElement Buisnesstravel;

@FindBy(xpath="(//img[@class='css-ddSBRI'])[2]")
WebElement courtesy;

@FindBy(xpath="(//img[@class='css-ddSBRI'])[3]")
WebElement meal;

@FindBy(xpath="(//a[@class='css-mOjhT'])[2]")
WebElement seehow;

@FindBy(xpath="(//a[@class='css-mOjhT'])[3]")
WebElement findout;

@FindBy(xpath="(//a[@class='css-mOjhT'])[4]")
WebElement keep;

@FindBy(xpath="//a[@class='css-dZztKs']")
WebElement visit;

@FindBy(xpath="//a[@class='css-hGuFTn']")
WebElement about;

@FindBy(xpath="(//a[@class='css-qNlYD'])[1]")
WebElement room;

@FindBy(xpath="(//a[@class='css-qNlYD'])[2]")
WebElement blog;

@FindBy(xpath="(//a[@class='css-qNlYD'])[3]")
WebElement career;
		

public UberbuinessUi1()
{
	PageFactory.initElements(driver, this);
}
public WebElement Logo_visible()
{
	return logo;
}
public WebElement How_check()
{
	return How;
}
public WebElement Solution_check()
{
	return Solution;
}
public WebElement Industry_check()
{
	return Industry;
}
public WebElement Custombersuport_check()
{
	return resources;
}
public WebElement Language_change()
{
	return language;
}
public WebElement Language_toHindi()
{
	return hindi;
}
public WebElement Contact()
{
	return Contactus;
}
public WebElement Get_started()
{
	return Get;
}
public WebElement login_check()
{
	return login;
}
public WebElement login_do()
{
	return logindo;
}
public WebElement Submit_bt2()
{
	return sumbit2;
}
public WebElement pass_bt2()
{
	return pass2;
}
public WebElement Loginpass_bt2()
{
	return Loginwithpass2;
}
public WebElement Checkout_Solution()
{
	return Checksolution2;
}
public WebElement Buisness_travel()
{
	return Buisnesstravel;
}
public WebElement Courtesy_check()
{
	return courtesy;
}
public WebElement Meal_check()
{
	return meal;
}
public WebElement seehow_check()
{
	return seehow;
}
public WebElement findout_check()
{
	return findout;
}
public WebElement keepreading_check()
{
	return keep;
}
public WebElement visithelp_check()
{
	return visit;
}
public WebElement about_check()
{
	return about;
}
public WebElement Newsroom_check()
{
	return room;
}
public WebElement Blog_check()
{
	return blog;
}
public WebElement Careers_check()
{
	return career;
}
}
