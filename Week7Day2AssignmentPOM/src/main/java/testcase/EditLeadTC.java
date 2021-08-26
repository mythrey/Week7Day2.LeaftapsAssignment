package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Loginpage;

public class EditLeadTC extends ProjectSpecificMethod {

	@BeforeTest
	public void setFilename() {
		excelFilename = "EditLead";
	}

	@Test(dataProvider = "fetchdata")
	public void runEditLeadTC(String Phno, String company)
			throws InterruptedException {
		new Loginpage(driver, prop).giveUsername(prop.getProperty("username"))
				.givePassword(prop.getProperty("password")).pressLogin().clickCRMSFAlink().clickLeadsLink()
				.clickfindleads().clickphonetab().enterphoneNo(Phno).clickFindLeadstab().clickfirstvalue()
				.clickEditTab().enterNewcompanyname(company).clickUpdatebutton().verifyCompname();
	}
}