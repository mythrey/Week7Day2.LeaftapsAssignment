package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Loginpage;

public class LoginAndLogout extends ProjectSpecificMethod{
	@Test
	public void runLoginTest() throws InterruptedException{
		
		//Instead creating class objname = new classname, we are creating like below
		
		new Loginpage(driver, prop).
		giveUsername("Demosalesmanager").
		givePassword("crmsfa").
		pressLogin().
		clickLogoutbutton();
		
		
	}

}
