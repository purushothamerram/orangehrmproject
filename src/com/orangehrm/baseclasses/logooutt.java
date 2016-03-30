package com.orangehrm.baseclasses;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.Menu;

public class logooutt extends constants {
@Test
public void logouttes() throws IOException
{
	String runmode=eo.getcelldata(dataenginepath, 0, 4, 2);
	if (runmode.equals("N")) {
		throw new SkipException("skip logout test");
		
	}
	Menu menu=PageFactory.initElements(driver, Menu.class);
	Sleeper.sleepTightInSeconds(12);
	menu.logout();
}
}
