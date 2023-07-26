package UBERTESTCASE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import UBERBASE.TestBase1;
import UBERUI.TaxProfileUi;

public class TaxProfileTest extends TestBase1
{
TaxProfileUi TaxProfile;

@BeforeClass
public void launch9() throws IOException, InterruptedException
{
	ProfileTest call_Profile= new ProfileTest();
	call_Profile.launch7();
	call_Profile.Tax_Button();
	TaxProfile = new TaxProfileUi();
	WebElement w0= driver.findElement(By.xpath("//iframe[@title='Tax Profiles - Uber Riders']"));
	driver.switchTo().frame(w0);
}
@Test(priority=1)
public void Name_entercheck() throws InterruptedException
{
	
	TaxProfile.Name_enter().click();
	TaxProfile.Name_enter().sendKeys("Sahil");
	Thread.sleep(3000);
	Assert.assertEquals(TaxProfile.Name_enter().getAttribute("Value"), "Sahil");
}
@Test(priority=2)
public void Pan_Check() throws InterruptedException
{
	TaxProfile.Pan_enter().click();
	TaxProfile.Pan_enter().sendKeys("QWTE2344");
	Thread.sleep(3000);
	Assert.assertEquals(TaxProfile.Pan_enter().getAttribute("Value"), "QWTE2344");
	
}
@Test(priority=3)
public void Street() throws InterruptedException
{
	TaxProfile.Address_enter().click();
	TaxProfile.Address_enter().sendKeys("Ward no 2 rakkar colony una");
	Thread.sleep(3000);
	Assert.assertEquals(TaxProfile.Address_enter().getAttribute("Value"), "Ward no 2 rakkar colony una");
}
@Test(priority=4)
public void CityEnter() throws InterruptedException
{
	TaxProfile.City_enter().click();
	TaxProfile.City_enter().sendKeys("Una");
	Thread.sleep(3000);
	Assert.assertEquals(TaxProfile.City_enter().getAttribute("Value"), "Una");
}
@Test(priority=5)
public void StateEnter() throws InterruptedException
{
	TaxProfile.State_enter().click();
	TaxProfile.State_enter().sendKeys("Assam");
	TaxProfile.State_enter().sendKeys(Keys.ENTER);
	Thread.sleep(5000);
//     Actions a1= new Actions(driver);
//	Thread.sleep(5000);
//     WebElement w0= driver.findElement(By.xpath("//div[text()='Assam']"));
//     System.out.println(w0.getText());
//     a1.moveToElement(w0).click().perform();
	Assert.assertEquals(TaxProfile.State_enter().getText(), "Assam");
}

}
