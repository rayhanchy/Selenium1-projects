package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.Projectspecificwrapper;

public class EditleadHomework extends Projectspecificwrapper {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	@Test	
//public void editlead () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\Users\rhcho\git\repository\Selenium\drivers\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
																	//leaftaps lunch
				driver.get("http://leaftaps.com/opentaps");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
																				//login
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
		*/
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("//body[@class=' ext-safari']").click();
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
			driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
			
			
			driver.findElementByLinkText("Hema").click();
		driver.findElementByLinkText("Edit").click();
		

		
		
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
		driver.findElementByName("submitButton").click();
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View")) {
			System.out.println("Title matched");
		}
		else {System.out.println("Title not been matched");
		}
		
		
		//driver.findElementByLinkText("Edit").click();
		//driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
		//driver.findElementByName("submitButton").click();
				
		

		
		//driver.close();
		
		
		
		
	}
	
	
}
