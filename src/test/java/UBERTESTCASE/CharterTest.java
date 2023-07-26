package UBERTESTCASE;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import UBERBASE.TestBase1;
import UBERUI.CharterUi;

public class CharterTest extends TestBase1
{
CharterUi j;
SoftAssert s=new SoftAssert();
@BeforeClass
public void launch44() throws InterruptedException, IOException
{
	HomepageTest1 t= new HomepageTest1();
	t.lau();
    j = new CharterUi();
    t.charterbt();
	
}
@Test(priority=1)
public void Newtrip() throws InterruptedException
{
	j.Log_But().click();
	Thread.sleep(3000);
    s.assertEquals(j.New_But().isDisplayed(), true);
	j.New_But().click();
}
@Test(priority=2)
public void datetime() throws InterruptedException
{
	Thread.sleep(6000);
	j.Pick_date().click();
	j.set().click();
	j.Pick_time().click();
	Actions a2= new Actions(driver);
			WebElement w1=driver.findElement(By.xpath("//div[text()='12:00 PM']"));
			a2.moveToElement(w1).click().perform();
			Thread.sleep(3000);
			j.Pick_location().sendKeys("American Dream");
			Thread.sleep(2000);
			j.Pick_location().sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			j.Pick_Destination().sendKeys("The Educational Fund to Stop Gun Violence");
			Thread.sleep(2000);
			j.Pick_Destination().sendKeys(Keys.ENTER);
			Thread.sleep(5000);
}
@Test(priority=3)
public void AddStop()
{
	s.assertEquals(j.Add_Stopbt().isDisplayed(), true);
	j.Add_Stopbt().click();
	
}
@Test(priority=4)
public void dropoffdetails() throws InterruptedException
{
	
	j.Stop_date().click();
	j.set().click();
	j.Stop_time().click();
	Actions a3= new Actions(driver);
	WebElement w2=driver.findElement(By.xpath("//div[text()='11:45 PM']"));
	a3.moveToElement(w2).click().perform();
    Thread.sleep(5000);
	
}
@Test(priority=5)
public void rent() throws InterruptedException
{
	j.Rent_bt().click();
	Thread.sleep(5000);
	uberterminate();
}

}
