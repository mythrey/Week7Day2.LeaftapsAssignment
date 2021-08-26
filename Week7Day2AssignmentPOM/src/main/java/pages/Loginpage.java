package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class Loginpage extends ProjectSpecificMethod{
	
	public Loginpage(ChromeDriver driver, Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
	
	public Loginpage giveUsername(String uname) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(uname);
		Thread.sleep(2000);
		return this;
				
	}
	public Loginpage givePassword(String pwd) throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(2000);
		return this;
	}
	public Homepage pressLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new Homepage(driver, prop);
	}

	}


