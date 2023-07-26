package UBERUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UBERBASE.TestBase1;

public class ProfileUI extends TestBase1
{
@FindBy(xpath="//p[@class='_css-dTqljZ']")
WebElement phoneupdate;

@FindBy(xpath="(//div[@data-baseweb='select'])[1]")
WebElement locationupdate;

@FindBy(xpath="(//div[@data-baseweb='select'])[2]")
WebElement languageupdate;


@FindBy(xpath="//button[@class='_css-gARaLg']")
WebElement Addanotheremail;

@FindBy(xpath="//input[@placeholder='Email']")
WebElement email;

@FindBy(xpath="(//div[@class='_css-cfYfYI'])[3]")
WebElement receipt;

@FindBy(xpath="//button[@class='_css-jlMATT']")
WebElement save;

@FindBy(xpath="(//div[@class='_css-jvDoyb'])[4]")
WebElement Tax;		
		
		
public ProfileUI()
{
	PageFactory.initElements(driver, this);
}

public WebElement Phone_update()
{
	return phoneupdate;
}
public WebElement location_update()
{
	return locationupdate;
}
public WebElement language_update()
{
	return languageupdate;
}
public WebElement Addemailbt()
{
	return Addanotheremail;
}
public WebElement email_ch()
{
	return email;
}
public WebElement receipt_ch()
{
	return receipt;
}
public WebElement save_ch()
{
	return save;
}
public WebElement Tax_bt()
{
	return Tax;
}
}
