package UBERUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UBERBASE.FreightBase;

public class FreightUi extends FreightBase 
{
@FindBy(xpath="//a[@class='logo']")
WebElement flogo;

@FindBy(xpath="//a[text()='Shipper']")
WebElement Shipper;

@FindBy(xpath="//a[@class='btn-link is-white _large ']")
WebElement get;

@FindBy(xpath="(//label[@class='_css-dDLNRG'])[2]")
WebElement equiptment;

@FindBy(xpath="//input[@id='pickupLocation']")
WebElement pickup;

@FindBy(xpath="//input[@id='dropoffLocation']")
WebElement dropoff;

@FindBy(xpath="//button[@id='bui14__anchor']")
WebElement Getfrbutton;

@FindBy(xpath="(//a[text()='Carrier'])[1]")
WebElement Carrierbut;

@FindBy(xpath="//a[text()='Resources']")
WebElement resourcebt;

@FindBy(xpath="//li[@id='menu-item-990131']//a[normalize-space()='Resource library']")
WebElement resourcelib;

@FindBy(xpath="//a[text()='Company']")
WebElement Companybt;

@FindBy(xpath="(//a[text()='About us'])[1]")
WebElement Companyitem;


@FindBy(xpath="//a[text()='Support']")
WebElement Supportbt;

@FindBy(xpath="//a[text()='Uber Freight Carrier']")
WebElement Supportitem;

@FindBy(xpath="//a[@class='btn btn-primary w-auto ']")
WebElement Shipbt;

@FindBy(xpath="(//a[@class='btn-link '])[4]")
WebElement request;

@FindBy(xpath="//input[@name='firstname']")
WebElement name;

@FindBy(xpath="//input[@name='lastname']")
WebElement lastname;

@FindBy(xpath="//input[@name='email']")
WebElement email;

@FindBy(xpath="//input[@name='phone']")
WebElement phone;

@FindBy(xpath="//input[@name='company']")
WebElement company;

@FindBy(xpath="//select[@name='industry']")
WebElement industry;

@FindBy(xpath="//select[@name='country']")
WebElement country;

@FindBy(xpath="//input[@value='Submit']")
WebElement submitbt;

@FindBy(xpath="//a[@href='https://www.uberfreight.com/contact-us/']")
WebElement expert;

@FindBy(xpath="//a[@class='btn btn-white is-icon']")
WebElement video;

@FindBy(xpath="(//button[@data-target='#language-popup'])[2]")
WebElement language;

@FindBy(xpath="//a[text()='Modes']")
WebElement mode;

@FindBy(xpath="//a[text()='Cross-border logistics']")
WebElement cross;

public FreightUi()
{
	PageFactory.initElements(driver, this);
}

public WebElement Logo_Freightcheck()
{
	return flogo;
}
public WebElement Shipper_check()
{
	return Shipper;
}
public WebElement Getinstant_check()
{
	return get;
}
public WebElement Equiptment_check()
{
	return equiptment;
}
public WebElement pickuplocation_check()
{
	return pickup;
}
public WebElement dropoff_check()
{
	return dropoff;
}
public WebElement GetAFreightbutton_check()
{
	return Getfrbutton;
}
public WebElement Carrier_check()
{
	return Carrierbut;
}
public WebElement resource_check()
{
	return resourcebt;
}
public WebElement resource_lib()
{
	return resourcelib;
}
public WebElement company_bt()
{
	return Companybt;
}
public WebElement company_item()
{
	return Companyitem;
}
public WebElement support_bt()
{
	return Supportbt;
}
public WebElement support_item()
{
	return Supportitem;
}
public WebElement Ship_withCh()
{
	return Shipbt;
}
public WebElement Request_demo()
{
	return request;
}
public WebElement name_ch()
{
	return name;
}
public WebElement last_check()
{
	return lastname;
}
public WebElement email_ch()
{
	return email;
}
public WebElement phone_ch()
{
	return phone;
}
public WebElement company_ch()
{
	return company;
}
public WebElement industry_ch()
{
	return industry;
}
public WebElement country_ch()
{
	return country;
}
public WebElement submit_ch()
{
	return submitbt;
}
public WebElement experts_ch()
{
	return expert;
}
public WebElement video_ch()
{
	return video;
}
public WebElement langauge_ch()
{
	return language;
}
public WebElement modes_ch()
{
	return mode;
}
public WebElement cross_ch()
{
	return cross;
}
}



