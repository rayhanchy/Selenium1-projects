package seleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Browsertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		
		//finding all links
		 /*List<WebElement> listlink = driver.findElementsByTagName("a");
		System.out.println(listlink.size());
		
		for (int i = 0; i < listlink.size(); i++) {
			String listlink1 = listlink.get(i).getText();
			System.out.println(listlink1);
			*/
			//Window Handle
			
		//String windowHandle = driver.getWindowHandle();
		//System.out.println(windowHandle);
			
		Set<String> allwindo = driver.getWindowHandles();
		for(String eachwin : allwindo) {
		System.out.println(eachwin);
		
		driver.switchTo().window(eachwin);
		System.out.println(eachwin);
		
		}
			
		
		}
		
		}
		
		
		
			
		
		
		
			
			
			
		
		
		
	


