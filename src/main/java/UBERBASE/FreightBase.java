package UBERBASE;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreightBase
{
	public static WebDriver driver;
	public static Properties prop;
	
	public void uberintilizationf() throws IOException, InterruptedException
	{
		try
		{
		FileInputStream fs= new FileInputStream("D:\\workspace\\UBER\\UberConfrigration.properties");
		prop=new Properties();
		prop.load(fs);
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Available");
		}
		 WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
		    chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		      driver = new ChromeDriver(chromeOptions);
		
		
		
	    driver.get(prop.getProperty("UberFreight"));
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	    		  
	}
	
	public void uberterminate2()
	{
		driver.quit();
	}

}
