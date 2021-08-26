package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

	public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String excelFilename;
	public Properties prop;
	public static String delID;
	
	@DataProvider(name = "fetchdata", indices=1)
	public String[][] sendData() throws IOException {
		ReadExcel re = new ReadExcel();  // create object for ReadExcel
		return re.readData(excelFilename);

	}
	@Parameters({"language"})
	@BeforeMethod
	public void preCondition(String lang) throws IOException{
		FileInputStream fis = new FileInputStream("./src/main/resources/"+lang+".properties"); // this class name is to read data from a file
		prop = new Properties(); // Create object for properties also since declared globally, removed local declaration
		prop.load(fis); //Load the properties
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
