package parameterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Superclas {
	public 	ChromeDriver driver;
	
	@Parameters ({"url", "uname", "pwd"})
	@BeforeMethod
	
	public void sscc (String url, String uname, String pwd) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
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
	public void closebb () {
		
		driver.close();

	}
	
	@DataProvider 
	
	public String[][] getdata () {
		
	
		
		String [] [] obj = new String[2] [3];
		
		obj [0][0] = "Tauhid";
		obj [0][1] = "Chowdhury";
		obj [0][2] = "abc company";
		
		obj [1][0] = "Ehram";
		obj [1][1] = "Khan";
		obj [1][2] = "xyz and co";
		
		
			return obj;	
			
	}
 
}
