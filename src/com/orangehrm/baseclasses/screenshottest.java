package com.orangehrm.baseclasses;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class screenshottest extends constants{
@Test
public void screen() throws IOException
{
String runmode=eo.getcelldata(dataenginepath, 0, 3, 2);	
if (runmode.equals("N")) {
	throw new SkipException("skip screenshot test");
	
}
ss.screenshot(driver, sc, "orange");
}
}
