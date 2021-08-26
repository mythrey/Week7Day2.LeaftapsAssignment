package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Loginpage;

public class CreateleadTC extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setFilename() {
	excelFilename = "CreateLead";
	}
	
@Test(dataProvider="fetchdata")
	public void runcreateLeadTC (String username, String password, String company, String fname, String lname) throws InterruptedException{
		new Loginpage(driver, prop).
		giveUsername(prop.getProperty("username")).
		givePassword(prop.getProperty("password")).
		pressLogin().
		clickCRMSFAlink().
		clickLeadsLink().
		clickCreateLead().
		enterCompanyName(company).
		enterFname(fname).
		enterlname(lname).
		clickCreateLeadbutton().
		verifyfname();

	}

}
