package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class ViewLeadpage extends ProjectSpecificMethod {

	public ViewLeadpage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}

	public ViewLeadpage verifyfname() {
		String confirmFName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Firstname under Viewlead Page is " + confirmFName);
		return this;

	}

	public EditLeadpage clickEditTab() {
		driver.findElement(By.linkText(prop.getProperty("ViewLeadpage.ClickEdit.LinkText"))).click();
		return new EditLeadpage(driver, prop);
	}

	public ViewLeadpage verifyCompname() {
		String ConfirmCompname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("New company name is :" + ConfirmCompname);
		return this;
	}
	
	public MyLeadspage deleteID() {
		driver.findElement(By.linkText(prop.getProperty("ViewLeadpage.Delete.LinkText"))).click();
		return new MyLeadspage(driver, prop);
	}
}
