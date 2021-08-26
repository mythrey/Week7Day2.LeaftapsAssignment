package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class EditLeadpage extends ProjectSpecificMethod {

	public EditLeadpage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;

	}

	public EditLeadpage enterNewcompanyname(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
		return this;
	}

	public ViewLeadpage clickUpdatebutton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadpage(driver, prop);
	}
}
