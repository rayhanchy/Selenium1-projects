package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;




public class ParameterPractice {

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
}
