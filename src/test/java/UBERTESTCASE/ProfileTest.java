package UBERTESTCASE;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import UBERBASE.TestBase1;
import UBERUI.ProfileUI;

public class ProfileTest extends TestBase1
{
ProfileUI profilesetting;


@BeforeClass
public void launch7() throws IOException, InterruptedException
{
	HomepageTest1 call_home= new HomepageTest1();
	call_home.lau();
	profilesetting= new ProfileUI();
	call_home.profilebtton();
}
@Test(priority=1)
public void phone()
{
   System.out.println(profilesetting.Phone_update().isDisplayed());
   Assert.assertEquals(profilesetting.Phone_update().isSelected(), true);
}
@Test(priority=2)
public void location_change()
{
	profilesetting.location_update().click();
	WebElement w0= driver.findElement(By.xpath("//div[text()='Italy']"));
	Actions a4= new Actions(driver);
	a4.moveToElement(w0).click().perform();
	Assert.assertEquals(profilesetting.location_update().getText(), "Italy");
}
@Test(priority=3)
public void language_change()
{
	profilesetting.language_update().click();
	WebElement w1= driver.findElement(By.xpath("//div[text()='Greek']"));
	Actions a5= new Actions(driver);
	a5.moveToElement(w1).click().perform();
	Assert.assertEquals(profilesetting.language_update().getText(), "Greek");
}
@Test(priority=4)
public void Add_Email() throws InterruptedException
{
	profilesetting.Addemailbt().click();
	profilesetting.email_ch().sendKeys("AshreyBhoil@gmail.com");
	profilesetting.receipt_ch().click();
	Thread.sleep(3000);
	Actions a6= new Actions(driver);
	WebElement w2= driver.findElement(By.xpath("//div[text()='No receipts']"));
	a6.moveToElement(w2).click().perform();
	Thread.sleep(4000);
	Assert.assertEquals(profilesetting.receipt_ch().getText(), "No receipts");
	Thread.sleep(5000);
	profilesetting.save_ch().click();
	Thread.sleep(5000);
}
@Test(priority=5)
public void Tax_Button() throws InterruptedException
{
	profilesetting.Tax_bt().click();
	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle(), "Tax Profiles - Uber Riders");
	
}





}
