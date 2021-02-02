package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrioriytyTest {
	
	public ChromeDriver driver;
	
	@BeforeMethod

	public  void prioty() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
															//leaftaps lunch
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
																		//login
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	
	}
	
	@Test (priority = 1)
	
	public void createlead () {
		
	driver.findElementByLinkText("Create Lead").click();
	
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	driver.findElementById("createLeadForm_lastName").sendKeys("M");
	
	
	
	//driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Hema");
	//driver.findElementById("createLeadForm_lastNameLocal").sendKeys("M");
																				//Selecting source
	WebElement source = driver.findElementById("createLeadForm_dataSourceId");
	Select obj = new Select(source);
	obj.selectByVisibleText("Existing Customer");
	
	driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
																					//Industry Select
	WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
	Select obj2 = new Select(ind);
	obj2.selectByValue("IND_SOFTWARE");
	}
	
	@Test (priority = 2)
	
	public void editlead () {	
		
		driver.findElementByLinkText("Create Lead").click();	
		
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
	}
	
	@Test (priority = 0)
	
	public void confirmalert () throws InterruptedException {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByLinkText("Merge").click();
		
		Alert ttt = driver.switchTo().alert();
		System.out.println(ttt.getText());
		Thread.sleep(2000);
		
		ttt.accept();
			
		}
		
	@AfterMethod 	
		public void close() {
		driver.close();
	}

	}


