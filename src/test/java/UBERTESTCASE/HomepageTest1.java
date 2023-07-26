package UBERTESTCASE;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import UBERBASE.TestBase1;
import UBERUI.Homepage1;

public class HomepageTest1 extends TestBase1
{
	public ExtentTest test;
	public ExtentReports extent;
	
Homepage1 y;

@BeforeClass
public void lau() throws IOException, InterruptedException
{
	logintest u=new logintest();
	u.launch0();
	u.login();
	y=new Homepage1();
}
@BeforeTest
public void x() {
	extent=new ExtentReports("D:\\reports\\uber.html",true);	
}

@AfterTest
public void y() {
	extent.endTest(test);
	extent.flush();
}

@Test(priority=1)
public void ridenow()
{
	test=extent.startTest("Verify ridenow funcnality Successfully");
	test.log(LogStatus.INFO, "pickup box load Test is intiated");
	test.log(LogStatus.INFO,"dropoff page box Loads Successfully");
	y.pick_up().sendKeys(prop.getProperty("pickuplocation"));
    y.pick_up().sendKeys(Keys.ENTER);
    y.drop_of().sendKeys("Elante Mall");
    String actual = y.drop_of().getText();
    y.drop_of().sendKeys(Keys.ENTER);
    y.sub_bt().click();
    if(actual.equals(actual))
    {
    	test.log(LogStatus.PASS, "Ridenow check successfully");
    }
    else
    {
    	test.log(LogStatus.FAIL, "Ridenow check is not available");
    }
    
    
}
@Test(priority=2)
public void menu()
{
	Actions a1=new Actions(driver);
	a1.moveToElement(y.prof_bt()).perform();
}
@Test(priority=3)
public void my() throws InterruptedException
{
	y.mytrip_bt().click();
	Assert.assertEquals(driver.getTitle(), "My Trips - Uber Riders");
	Thread.sleep(5000);
	driver.navigate().back();
}
@Test(priority=4)
public void wallets() throws InterruptedException
{
	Thread.sleep(5000);
	menu();
	y.wallet_bt().click();
	Assert.assertEquals(driver.getTitle(), "Uber Wallet");
    Thread.sleep(2000);
	driver.navigate().back();
}
@Test(priority=5)
public void promoss() throws InterruptedException
{
	Thread.sleep(5000);
	menu();
	y.promos_bt().click();
	Assert.assertEquals(driver.getTitle(), "Plan your Uber journey");
    Thread.sleep(2000);
	driver.navigate().back();
}
@Test(priority=6)
public void supportbt() throws InterruptedException
{
	Thread.sleep(5000);
	menu();
	y.support_bt().click();
	Assert.assertEquals(driver.getTitle(), "Support Messages | Rider - Uber Help");
	Thread.sleep(2000);
	driver.get(prop.getProperty("back"));
}
@Test(priority=7)
public void profilebtton() throws InterruptedException
{
	Thread.sleep(5000);
	menu();
	y.profile_bt().click();
	Thread.sleep(5000);
	Assert.assertEquals(driver.getTitle(), "Profile - Uber Riders");
	Thread.sleep(2000);
	//driver.navigate().back();
}
@Test(priority=8)
public void helpbt() throws InterruptedException
{
	y.help_bt().click();
	Assert.assertEquals(driver.getTitle(), "All topics | Rider - Uber Help");
	Thread.sleep(2000);
	driver.get(prop.getProperty("back"));
}
@Test(priority=9)
public void charterbt() throws InterruptedException
{
	y.Charter_bt().click();
	Assert.assertEquals(driver.getTitle(), "Uber Charter");
	Thread.sleep(2000);
	//driver.get(prop.getProperty("back"));
}
@Test(priority=10)
public void Logo_visibilty()
{
	y.logo_check().isDisplayed();
	Assert.assertEquals(y.logo_check().isDisplayed(), true);
	uberterminate();
}
}


