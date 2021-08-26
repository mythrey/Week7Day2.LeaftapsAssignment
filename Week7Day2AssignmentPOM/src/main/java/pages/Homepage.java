package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Homepage extends ProjectSpecificMethod {

	public Homepage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;

	}

	public MyHomepage clickCRMSFAlink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomepage(driver, prop);

	}

//This method is just to check whether log out works fine and returns to correct page, not used under CreateLeadTC
	public Loginpage clickLogoutbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Loginpage(driver, prop);
	}

}
