package com.orangehrm.baseclasses;



import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.Addemployeepage;
import com.orangehrm.pom.Menu;

public class Addemployee extends constants {
	@Test
	public void addemploytest1() throws IOException
	{
String runmode=eo.getcelldata(dataenginepath, 0, 2, 2);
if (runmode.equals("N")) {
	throw new SkipException("skip addemployee test");
}
else{
Menu menu=PageFactory.initElements(driver, Menu.class);
Addemployeepage ae=PageFactory.initElements(driver, Addemployeepage.class);
int rowcount=eo.rowcount(employeelistpath, 0);
for (int i = 1; i <=rowcount; i++) {
	menu.Pin();
	Row r=eo.getRow(employeelistpath, 0, i);
	ae.Addemployee(r);
}




}
}}