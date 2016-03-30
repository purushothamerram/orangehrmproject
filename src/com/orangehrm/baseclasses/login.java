package com.orangehrm.baseclasses;

import java.io.IOException;
import java.net.URL;



import org.mockito.internal.stubbing.answers.ThrowsException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orangehrm.pom.loginpage;

public class login extends constants {
@Test
@Parameters("browser")
public void logintest(String b) throws IOException
{
	DesiredCapabilities cap=null;
	if (b.equals("firefox")) {
	cap=DesiredCapabilities.firefox();
	cap.setBrowserName("firefox");
	cap.setPlatform(Platform.WINDOWS);
	}
	else if (b.equals("chrome")) {
		cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
	}
	 driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	driver.get("http://opensource.demo.orangehrm.com/");
	driver.manage().window().maximize();
	
	loginpage lp=PageFactory.initElements(driver, loginpage.class);
	System.out.println("dddddddddddd");
	String runmode=eo.getcelldata(dataenginepath, 0, 1, 2);
	
	System.out.println(runmode);
	if (runmode.equals("N")) 
	{
	throw new SkipException("skip login test");	
	}
	else
	{
	lp.LOGINPanel("Admin","admin");
  }
	}
}
