package com.orangehrm.pom;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addemployeepage {
	@FindBy(xpath=".//*[@id='menu_pim_addEmployee']")
	WebElement addemploy;
	@FindBy(id="firstName")
	WebElement firstname;
	@FindBy(id="middleName")
	WebElement middlename;
	@FindBy(id="lastName")
	WebElement lastname;
	@FindBy(id="employeeId")
    WebElement employeeid;
	@FindBy(id="chkLogin")
	WebElement checklogin;
	@FindBy(id="user_name")
	WebElement username;
	@FindBy(id="user_password")
	WebElement password;
	@FindBy(id="re_password")
	WebElement confirempassword;
	@FindBy(id="status")
	WebElement status;
	@FindBy(id="btnSave")
	WebElement save;
	public void Addemployee(Row r)
	{
		addemploy.click();
		firstname.sendKeys(r.getCell(0).getStringCellValue());
		middlename.sendKeys(r.getCell(1).getStringCellValue());
		lastname.sendKeys(r.getCell(2).getStringCellValue());
		employeeid.sendKeys(r.getCell(3).getStringCellValue());
		if (r.getCell(4).getStringCellValue().equals("Y")) {
			
			if (!checklogin.isSelected()) {
				checklogin.click();
			}
			username.sendKeys(r.getCell(5).getStringCellValue());
			password.sendKeys(r.getCell(6).getStringCellValue());
			confirempassword.sendKeys(r.getCell(7).getStringCellValue());
		}
		else {
			if (checklogin.isSelected()) {
				checklogin.click();
				
			}
		}
		save.click();
	}
}
