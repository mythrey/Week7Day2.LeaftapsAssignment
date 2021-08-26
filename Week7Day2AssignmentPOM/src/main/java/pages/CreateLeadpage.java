package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class CreateLeadpage extends ProjectSpecificMethod{
	
	public CreateLeadpage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}

	public CreateLeadpage enterCompanyName(String company){
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}
	
	public  CreateLeadpage enterFname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}

	public CreateLeadpage enterlname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	
	public ViewLeadpage clickCreateLeadbutton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadpage(driver, prop);
	}
}
