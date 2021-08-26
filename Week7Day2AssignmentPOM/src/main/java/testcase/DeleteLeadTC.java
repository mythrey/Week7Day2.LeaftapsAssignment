package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Loginpage;

public class DeleteLeadTC extends ProjectSpecificMethod {

	@BeforeTest
	public void setFilename() {
		excelFilename = "DeleteLead";
	}

	@Test(dataProvider = "fetchdata")
	public void runDeleteLeadTC(String Phno)
			throws InterruptedException {
		new Loginpage(driver, prop).giveUsername(prop.getProperty("username"))
				.givePassword(prop.getProperty("password")).pressLogin().clickCRMSFAlink().clickLeadsLink()
				.clickfindleads().clickphonetab().enterphoneNo(Phno).clickFindLeadstab().getLeadID()
				.clickfirstvalue()
				.deleteID().clickfindleads().enterdelID().clickFindLeadstab().records();
	}
}
