package UBERTESTCASE;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import UBERBASE.FreightBase;
import UBERUI.FreightUi;

public class FreightTest extends FreightBase
{
	FreightUi callFreight;
	@BeforeClass
	public void launchf() throws IOException, InterruptedException
	{
		uberintilizationf();
		callFreight= new FreightUi();
	}
	@AfterClass
	public void khtam() throws InterruptedException
	{
		Thread.sleep(3000);
		uberterminate2();
	}
	@Test(priority=1)
	public void LogoF_check()
	{
		Assert.assertEquals(callFreight.Logo_Freightcheck().isDisplayed(), true);
	}
	@Test(priority=2)
	public void Shipperb_Check()
	{
		callFreight.Shipper_check().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.uberfreight.com/shipper/");
		driver.navigate().back();
	}
//	@Test(priority=3,dependsOnMethods="Shipperb_Check")
//	public void GetAnInstant_check()
//	{
//		callFreight.Getinstant_check().click();
//	//Assert.assertEquals(driver.getTitle(), "Instant Freight Quote");
//	}
//	
//	@Test(priority=4,dependsOnMethods="GetAnInstant_check")
//	public void quote_details() throws InterruptedException
//	{
//		callFreight.Equiptment_check().click();
//		callFreight.pickuplocation_check().sendKeys("America");
//		Thread.sleep(3000);
//		callFreight.pickuplocation_check().sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		callFreight.dropoff_check().sendKeys("America");
//		Thread.sleep(3000);
//		callFreight.dropoff_check().sendKeys(Keys.ENTER);
//	    Thread.sleep(3000);
//	    System.out.println(callFreight.dropoff_check().getAttribute("aria-label"));
//		Assert.assertEquals(callFreight.dropoff_check().getAttribute("aria-label"), "Selected American Fork, UT. ");
//	}
//	@Test(priority=5,dependsOnMethods="quote_details")
//	public void GetFreightbutton()
//	{
//		Assert.assertEquals(callFreight.GetAFreightbutton_check().isDisplayed(), true);
//		callFreight.GetAFreightbutton_check().click();
//		driver.navigate().back();
//	}
	@Test(priority=6)
	public void Carrierbt_Check() throws InterruptedException
	{
		callFreight.Carrier_check().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.uberfreight.com/carrier/");
		driver.navigate().back();
	}
	@Test(priority=7)
	public void Resourcebt_ch()
	{
         callFreight.resource_check().click();
		Assert.assertEquals(callFreight.resource_lib().isDisplayed(), true);
	}
	@Test(priority=8,dependsOnMethods="Resourcebt_ch")
	public void resourceitems_check()
	{
		callFreight.resource_lib().click();
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.uberfreight.com/resource-library/");
	    driver.navigate().back();
	}
	@Test(priority=9)
	public void Company_btCheck()
	{
		callFreight.company_bt().click();
		Assert.assertEquals(callFreight.company_item().isDisplayed(), true);
	}
	@Test(priority=10,dependsOnMethods="Company_btCheck")
	public void CompanuItem_ch()
	{
		callFreight.company_item().click();
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.uberfreight.com/about-us/");
	    driver.navigate().back();
	}
	@Test(priority=11)
	public void support_btCheck()
	{
		callFreight.support_bt().click();
		Assert.assertEquals(callFreight.support_item().isDisplayed(), true);
	}
	@Test(priority=12,dependsOnMethods="support_btCheck")
	public void supportItem_ch() throws InterruptedException
	{
		callFreight.support_item().click();
	    //Assert.assertEquals(driver.getTitle(), "All topics | Carrier - Uber Help");
	    driver.get("https://www.uberfreight.com/");
	}
	@Test(priority=13)
	public void ship_with()
	{
		callFreight.Ship_withCh().click();
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.uber.com/freight/platform/join-us/");
		driver.navigate().back();
	}
	@Test(priority=14)
	public void Request_demo()
	{
		callFreight.Request_demo().click();
		Assert.assertEquals(driver.getTitle(), "Request a Demo - Uber Freight");
		//driver.navigate().back();
	}
	@Test(priority=15,dependsOnMethods="Request_demo")
	public void Request_details() throws InterruptedException
	{
		WebElement w0= driver.findElement(By.xpath("//iframe[@class='hs-form-iframe']"));
		driver.switchTo().frame(w0);
		callFreight.name_ch().sendKeys("Ashrey");
		callFreight.last_check().sendKeys("sood");
		callFreight.email_ch().sendKeys("Ashrey@Sood.com");
		callFreight.phone_ch().sendKeys("1234567897");
		callFreight.company_ch().sendKeys("Sood&Sons Pvt. ltd.");
		Select indus = new Select(callFreight.industry_ch());
		indus.selectByValue("Food");
		Select countr = new Select(callFreight.country_ch());
		countr.selectByValue("Asia");
		Assert.assertEquals(callFreight.company_ch().getAttribute("value"), "Sood&Sons Pvt. ltd.");
		callFreight.submit_ch().click();
		driver.navigate().back();
				
	}
	@Test(priority=16)
	public void CoonectWithexpert()
	{
		callFreight.experts_ch().click();
		Assert.assertEquals(driver.getTitle(), "Contact us - Uber Freight");
		driver.navigate().back();
	}
	@Test(priority=17)
	public void playvideo() throws InterruptedException
	{
		callFreight.video_ch().click();
		Assert.assertEquals(driver.getTitle(), "Transportation & Logistics Solutions | Uber Freight");
		Thread.sleep(4000);
		driver.get("https://www.uberfreight.com");
	}
	@Test(priority=18)
	public void language_cha() throws InterruptedException
	{
		callFreight.langauge_ch().click();
		Thread.sleep(2000);
		Actions ac= new Actions(driver);
		WebElement w1= driver.findElement(By.xpath("//a[normalize-space()='Français']"));
        ac.moveToElement(w1).click().perform();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "Accueil - Uber Freight");
         driver.get("https://www.uberfreight.com/");
	}
	@Test(priority=19)
	public void Modes_chec()
	{
		callFreight.modes_ch().click();
		Assert.assertEquals(driver.getTitle(), "Available Shipping Modes and Types of Freight | Uber Freight");
		driver.navigate().back();
	}
	@Test(priority=20)
	public void cross_chec()
	{
		callFreight.cross_ch().click();
		Assert.assertEquals(driver.getTitle(), "Cross Border Freight Logistics | Uber Freight");
		
	}
	@Test(priority=21)
	public void sc_check()
	{
         driver.get("https://www.uberfreight.com/");
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[@class='ot-sdk-show-settings']")));
	}
	
}
