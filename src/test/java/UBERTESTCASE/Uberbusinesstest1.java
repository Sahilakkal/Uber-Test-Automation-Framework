package UBERTESTCASE;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UBERBASE.BuisnessBase1;
import UBERUI.UberbuinessUi1;
import UBERUI.uberlogin;


public class Uberbusinesstest1 extends BuisnessBase1
{
   UberbuinessUi1 callbusinessi;
  @BeforeClass
   public void launch01() throws IOException, InterruptedException
   
   {
	   uberintilizationb();
	   callbusinessi = new  UberbuinessUi1();
	   
   }
  
   @BeforeTest
   public void wait1() throws InterruptedException
   {
	   Thread.sleep(3000);
   }
   @AfterClass
   public void close() throws InterruptedException
   {
	   Thread.sleep(4000);
	   uberterminate1();
   }
	
   @Test(priority=1)
   public void navigate()
   {
	 Assert.assertEquals(driver.getTitle(), "Corporate Travel, Food, & Delivery Services | Uber for Business");
   }
   @Test(priority=2)
   public void logoVisiblity()
   {
	   Assert.assertEquals(callbusinessi.Logo_visible().isDisplayed(), true);
   }
   @Test(priority=3)
   public void how() throws InterruptedException
   {
	  Assert.assertEquals(callbusinessi.How_check().isDisplayed(), true);
	   callbusinessi.How_check().click();
	   Thread.sleep(5000);
	   callbusinessi.How_check().click();
   }
   @Test(priority=4)
   public void solutions() throws InterruptedException
   {
	   Assert.assertEquals(callbusinessi.Solution_check().isDisplayed(), true);
	   callbusinessi.Solution_check().click();
	    Thread.sleep(5000);
	   callbusinessi.Solution_check().click();
   }
   @Test(priority=5)
   public void industry() throws InterruptedException
   {
	   Assert.assertEquals(callbusinessi.Industry_check().isDisplayed(), true);
	   callbusinessi.Industry_check().click();
	   Thread.sleep(5000);
	   callbusinessi.Industry_check().click();
   }
   @Test(priority=6)
   public void resources() throws InterruptedException
   {
	   Assert.assertEquals(callbusinessi.Custombersuport_check().isDisplayed(), true);
	   callbusinessi.Custombersuport_check().click();
	   Thread.sleep(5000);
	   callbusinessi.Custombersuport_check().click();
   }
   @Test(priority=7)
   public void Language_change1() throws InterruptedException
   {
	   callbusinessi.Language_change().click();
	   Thread.sleep(2000);
	   Actions a1= new Actions(driver);
	   a1.moveToElement( callbusinessi.Language_toHindi()).click().perform();
	   Thread.sleep(2000);
	   Assert.assertEquals(callbusinessi.Language_change().getText(), "HI-IN");
	   driver.navigate().back();
   }
   @Test(priority=8)
   public void Contactus_Check() throws InterruptedException
   {
	   callbusinessi.Contact().click();
	   Thread.sleep(6000);
	   WebElement w0= driver.findElement(By.xpath("//h3[@data-lang-key='form.header']"));
	   Assert.assertEquals(w0.getText(), "Get in touch with us");
        driver.navigate().back();
   }
   @Test(priority=9,enabled=false)
   public void Getstarted() throws InterruptedException
   {
	   callbusinessi.Get_started().click();
	   Thread.sleep(3000);
	   WebElement w1= driver.findElement(By.xpath("(//h2[@class='css-fOwPKV'])[1]"));
	   //System.out.println(w1.getText());
	   Assert.assertEquals(w1.getText(), "Get started with no upfront costs");
	   
        driver.get("https://www.uber.com/in/en/business/");
	  
   }
   @Test(priority=10)
   public void Login_Check() throws InterruptedException
   {
	   callbusinessi.login_check().click();
	   Thread.sleep(5000);
	   String parent= driver.getWindowHandle();
	   Set<String> child= driver.getWindowHandles();
	   for(String childwindow:child) 
	   {
		   if(!childwindow.equals(parent))
		   {
			   driver.switchTo().window(childwindow);
		   }
		  
	   }
	   WebElement w2= driver.findElement(By.xpath("//input[@id='PHONE_NUMBER_or_EMAIL_ADDRESS']"));
	   Assert.assertEquals(w2.getAttribute("id"), "PHONE_NUMBER_or_EMAIL_ADDRESS");
	   driver.navigate().back();
	   
   }
   @Test(priority=11,dependsOnMethods = "Login_Check")
   public void login_do() throws InterruptedException
   {
	   callbusinessi.login_do().sendKeys(prop.getProperty("phone"));
	   callbusinessi.Submit_bt2().click();
	   
	   callbusinessi.Loginpass_bt2().click();
	   
	   callbusinessi.pass_bt2().sendKeys(prop.getProperty("password"));
	   callbusinessi.pass_bt2().sendKeys(Keys.ENTER);
	   driver.navigate().back();
   }
   
   @Test(priority=12)
   public void Check_Solution() throws InterruptedException
   {
	   driver.get("https://www.uber.com/in/en/business/");
	   callbusinessi.Checkout_Solution().click();
	   Thread.sleep(4000);
	   Assert.assertEquals(driver.getCurrentUrl(), "https://www.uber.com/in/en/business/#solutions");
	   //driver.navigate().back();
   }
   @Test(priority=13,dependsOnMethods = "Check_Solution")
   public void Buisness_travel() throws InterruptedException
   {
	   callbusinessi.Buisness_travel().click();
	   Thread.sleep(2000);
	   Assert.assertEquals(driver.getCurrentUrl(), "https://www.uber.com/us/en/business/solutions/rides/business-travel/");
	   driver.navigate().back();
   }
   @Test(priority=14,dependsOnMethods = "Check_Solution")
   public void courtsey() throws InterruptedException
   {
	   callbusinessi.Courtesy_check().click();
	   Thread.sleep(2000);
	 Assert.assertEquals(driver.getCurrentUrl(), "https://www.uber.com/us/en/business/products/central/");
	   driver.navigate().back();
   }
   @Test(priority=15,dependsOnMethods = "Check_Solution")
   public void Meal_ch() throws InterruptedException
   {
	   callbusinessi.Meal_check().click();
	   Thread.sleep(2000);
	   Assert.assertEquals(driver.getCurrentUrl(), "https://www.uber.com/us/en/business/solutions/eats/overview/");
	   driver.navigate().back();
	   
   }
   @Test(priority=16)
   public void see_how() throws InterruptedException
   {
	   driver.get("https://www.uber.com/in/en/business/");
	   Assert.assertEquals(callbusinessi.seehow_check().isDisplayed(), true);
	   callbusinessi.seehow_check().click();
	   Thread.sleep(3000);
	   driver.navigate().back();
   }
   @Test(priority=17)
   public void Find_out() throws InterruptedException
   {
	   
	   Assert.assertEquals(callbusinessi.findout_check().isDisplayed(), true);
	   callbusinessi.findout_check().click();
	   Thread.sleep(3000);
	   String parent= driver.getWindowHandle();
	   Set<String> child= driver.getWindowHandles();
	   for(String childwindow:child) 
	   {
		   if(!childwindow.equals(parent))
		   {
			   driver.switchTo().window(childwindow);
			   driver.close();
		   }
		   driver.switchTo().window(parent);
		  
	   }
	   Thread.sleep(3000);
   }
   @Test(priority=18)
   public void Keep_read() throws InterruptedException
   {
	  
       Assert.assertEquals(callbusinessi.keepreading_check().isDisplayed(), true);
	   callbusinessi.keepreading_check().click();
	   Thread.sleep(3000);
	   String parent= driver.getWindowHandle();
	   Set<String> child= driver.getWindowHandles();
	   for(String childwindow:child) 
	   {
		   if(!childwindow.equals(parent))
		   {
			   driver.switchTo().window(childwindow);
			   driver.close();
		   }
		   driver.switchTo().window(parent);
		  }
	   Thread.sleep(3000);
   }
   @Test(priority=19)
   public void VistHelp_check() throws InterruptedException
   {
	   Thread.sleep(4000);
	   Assert.assertEquals(callbusinessi.visithelp_check().isDisplayed(), true);
	   callbusinessi.visithelp_check().click();
	   Thread.sleep(3000);
	   String parent= driver.getWindowHandle();
	   Set<String> child= driver.getWindowHandles();
	   for(String childwindow:child) 
	   {
		   if(!childwindow.equals(parent))
		   {
			   driver.switchTo().window(childwindow);
			   driver.close();
		   }
		   driver.switchTo().window(parent);
		  }
	   Thread.sleep(3000);
   }
   @Test(priority=20)
   public void About_ch() throws InterruptedException
   {
	   driver.get("https://www.uber.com/in/en/business/");
	   Assert.assertEquals(callbusinessi.about_check().isDisplayed(), true);
	   callbusinessi.about_check().click();
	   Thread.sleep(3000);
	   driver.navigate().back();
   }
   @Test(priority=21)
   public void NewsRoom_ch() throws InterruptedException
   {
	   Assert.assertEquals(callbusinessi.Newsroom_check().isDisplayed(), true);
	   callbusinessi.Newsroom_check().click();
	   Thread.sleep(3000);
	   driver.navigate().back();
   }
   @Test(priority=22)
   public void Blog_ch() throws InterruptedException
   {
	   Assert.assertEquals(callbusinessi.Blog_check().isDisplayed(), true);
	   callbusinessi.Blog_check().click();
	   Thread.sleep(3000);
	   driver.navigate().back();
   }
   @Test(priority=23)
   public void careers_ch() throws InterruptedException
   {
	   Assert.assertEquals(callbusinessi.Careers_check().isDisplayed(), true);
	   callbusinessi.Careers_check().click();
	   Thread.sleep(3000);
	   driver.navigate().back();
   }
   
}
