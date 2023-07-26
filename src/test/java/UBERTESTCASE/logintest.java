package UBERTESTCASE;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import UBERBASE.TestBase1;
import UBERUI.uberlogin;

public class logintest extends TestBase1
{
uberlogin k;

@BeforeClass
public void launch0() throws IOException, InterruptedException
{
	uberintilization();
	k= new uberlogin();
}
@Test(priority=1)
public void login() throws InterruptedException
{
	k.login().sendKeys(prop.getProperty("phone"));
	k.Submit_bt().click();
	
	k.Loginpass_bt().click();
	k.pass_bt().sendKeys(prop.getProperty("password"));
	k.pass_bt().sendKeys(Keys.ENTER);
	Thread.sleep(10000);
	}
}