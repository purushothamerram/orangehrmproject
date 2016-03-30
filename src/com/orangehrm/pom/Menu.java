package com.orangehrm.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(id="welcome")
	WebElement welcomeadmin;
	@FindBy(id="aboutDisplayLink")
	WebElement about;
	public void about()
	{
		welcomeadmin.click();
		about.click();
	}
	@FindBy(xpath="html/body/div[1]/div[1]/div/ul/li[2]/a")
	WebElement logout;
	public void logout()
	{
		welcomeadmin.click();
		System.out.println(8);
		logout.click();
	}
	@FindBy(xpath="html/body/div[1]/div[2]/ul/li[1]/a/b")
	WebElement admin;
	public void Admin()
	{
		admin.click();
	}
	@FindBy(xpath=".//*[@id='menu_pim_viewPimModule']/b")
	WebElement pin;
	public void Pin()
	{
		pin.click();
	}
	@FindBy(xpath=".//*[@id='menu_leave_viewLeaveModule']/b")
	WebElement leave;
	public void Leave()
	{
		leave.click();
	}
	@FindBy(xpath=".//*[@id='menu_time_viewTimeModule']")
	WebElement view;
	public void View()
	{
		view.click();
	}
	@FindBy(xpath=".//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement requirement;
	public void Requirement()
	{
		requirement.click();
	}
	@FindBy(xpath=".//*[@id='menu__Performance']/b")
	WebElement performance;
	public void Performance()
	{
		performance.click();
	}
	@FindBy(xpath=".//*[@id='menu_dashboard_index']/b")
	WebElement dashboard;
	public void Dashboard()
	{
		dashboard.click();
	}
	

	}


