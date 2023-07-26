package UBERUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UBERBASE.TestBase1;

public class CharterUi extends TestBase1
{
@FindBy(xpath="//button[text()='New trip'][@class='_css-fJmMUs']")
WebElement Newbt;

@FindBy(xpath="//a[@href='/login-redirect']")
WebElement LogIn;

@FindBy(xpath="//*[@id='wrapper']/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/input")
WebElement Pickdate;

@FindBy(xpath="//button[text()='Set']")
WebElement Set;

@FindBy(xpath="//*[@id='wrapper']/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[1]")
WebElement PickTime;

@FindBy(xpath="//*[@id='10']")
WebElement Picklocation;

@FindBy(xpath="//div[@class='_css-iJqiTD']//input[@id='11']")
WebElement Pickdestination;

@FindBy(xpath="//button[@data-tracking-name='button.additional_stop']")
WebElement Addstop;

@FindBy(xpath="(//input[@placeholder='MM/DD'])[2]")
WebElement Stopdate;

@FindBy(xpath="(//input[@class='_css-hqBMbI'])[4]")
WebElement Stoptime;

@FindBy(xpath="//a[@data-buttonkey='rental']")
WebElement rent;



public CharterUi()
{
	PageFactory.initElements(driver, this);
}
public WebElement New_But()
{
	return Newbt;
}
public WebElement Log_But()
{
	return LogIn;
}
public WebElement Pick_date()
{
	return Pickdate;
}
public WebElement set()
{
	return Set;
}
public WebElement Pick_time()
{
	return PickTime;
}
public WebElement Pick_location()
{
	return Picklocation;
}
public WebElement Pick_Destination()
{
	return Pickdestination;
}
public WebElement Add_Stopbt()
{
	return Addstop;
}
public WebElement Stop_date()
{
	return Stopdate;
}
public WebElement Stop_time()
{
	return Stoptime;
}
public WebElement Rent_bt()
{
	return rent;
}
}