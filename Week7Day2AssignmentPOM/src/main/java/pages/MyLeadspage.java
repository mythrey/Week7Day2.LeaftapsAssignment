package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class MyLeadspage extends ProjectSpecificMethod{

	public MyLeadspage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}
	public CreateLeadpage clickCreateLead() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadspage.CreateLead.LinkText"))).click();
		return new CreateLeadpage(driver, prop) ;

	}
	
	public FindLeadspage clickfindleads() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadspage.ClickFindLeads.LinkText"))).click();
		return new FindLeadspage(driver, prop);
	}

}
