package dataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class Supaclass {

public ChromeDriver driver;
	
	@Parameters ({"url", "uname", "pwd"})
	@BeforeMethod
	public void supaclass(String url, String uname, String pwd) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");   
		driver = new ChromeDriver();
		
			
															//leaftaps lunch
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
																		//login
	driver.findElementById("username").sendKeys(uname);
	driver.findElementById("password").sendKeys(pwd);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
		
	}	
	@AfterMethod
	public void closing() {
		driver.close();
	}
	
	@DataProvider 
	public String[][] getdata()  {
		
		String [][] data = new String [2][3];
		
		data [0][0] = "TCS";
		data [0][1] = "Rayhan";
		data [0][2] = "Chowdhury";
		
		data [1][0] = "XYZ";
		data [1][1] = "Mamun";
		data [1][2] = "Khan";
		
		return data;
		
	}
}

	
	
	

