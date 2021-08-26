package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class FindLeadspage extends ProjectSpecificMethod {
			// Declaring global variables "driver" and "Properties" file to access from base class
	public FindLeadspage(ChromeDriver driver, Properties prop) {
		this.driver = driver;
		this.prop = prop;
		}

	public FindLeadspage clickphonetab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public FindLeadspage enterphoneNo(String phNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		return this;
	}

	public FindLeadspage clickFindLeadstab() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("FindLeadspage.ClickFindLead.Xpath"))).click();
		Thread.sleep(2000);
		return this;
	}

	public FindLeadspage getLeadID() {
		delID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println("ID to be Deleted :" +delID);
		return this;
	}

	public ViewLeadpage clickfirstvalue() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadpage(driver, prop);
	}

	public FindLeadspage enterdelID() {
		System.out.println(delID);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(delID);
		return this;
	}

	public FindLeadspage records() {
		String recordText = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div")).getText();
		System.out.println("Text after deleting leadid :" + recordText);
		if (recordText.equals("No records to display")) {
			System.out.println("Text matched");
			System.out.println("Delete LeadID is success");
		} else {
			System.out.println("Text not matched");
			System.out.println("Delete LeadID is unsuccess");
		}
		return this;
	}

}
