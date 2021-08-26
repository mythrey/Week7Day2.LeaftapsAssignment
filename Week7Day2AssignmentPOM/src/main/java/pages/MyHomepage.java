package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.ProjectSpecificMethod;

public class MyHomepage extends ProjectSpecificMethod {

	public MyHomepage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
	}

	public MyLeadspage clickLeadsLink() {

		// english : Leads || French : Prospects
		driver.findElement(By.xpath(prop.getProperty("MyHomepage.Leads.Xpath"))).click();
		return new MyLeadspage(driver, prop);
	}

}
