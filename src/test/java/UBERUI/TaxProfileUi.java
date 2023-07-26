package UBERUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UBERBASE.TestBase1;

public class TaxProfileUi extends TestBase1
{
@FindBy(xpath="//input[@id='company_name']")
WebElement Name;

@FindBy(xpath="//input[@id='pan_no']")
WebElement Pan;

@FindBy(xpath="//input[@id='address']")
WebElement Address;

@FindBy(xpath="//input[@id='city']")
WebElement City;


@FindBy(xpath="//input[@id='state_code']")
WebElement State;

public TaxProfileUi()
{
	PageFactory.initElements(driver, this);
}
public WebElement Name_enter()
{
	return Name;
}
public WebElement Pan_enter()
{
	return Pan;
}
public WebElement Address_enter()
{
	return Address;
}
public WebElement City_enter()
{
	return City;
}
public WebElement State_enter()
{
	return State;
}
}
