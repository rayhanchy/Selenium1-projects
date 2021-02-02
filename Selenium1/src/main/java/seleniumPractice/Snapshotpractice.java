package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Snapshotpractice {

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
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
				
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		
		try {		 		
		driver.findElementById("createLeadForm_lastNamel").sendKeys("Malini");
		System.out.println("Last name entered successfuly");	
		} catch (Exception e) {
			System.out.println("Last name not entered successfuly");
		}
		
		
		
		//SNAPSHOT
		
		File scrsht = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\rhcho\\Pictures\\snapshot\\image.jpg");
	
		Files.copy(scrsht, dest);
		
		
		
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
		
																						//Ownership select
		WebElement own = driver.findElementByName("ownershipEnumId");
		Select obj3 = new Select(own);
		obj3.selectByValue("OWN_CCORP");
	//Description		
		driver.findElementById("createLeadForm_descriptiond").sendKeys("     TCS");
			
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("0044");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("02");
		driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");

	//Preferred currency
		WebElement currency = driver.findElementById("createLeadForm_currencyUomId");
		Select obj4 = new Select(currency);
		obj4.selectByVisibleText("USD - American Dollar");
				
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");	
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("8 Sheperds Way");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Austin");

	//State/province
		WebElement stprov = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select obj5 = new Select(stprov);
		obj5.selectByValue("TX");
		
	//Country
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select obj6 = new Select(country);
		obj6.selectByValue("USA");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("61");
		
	//marketing campaign
		WebElement makcam = driver.findElementById("createLeadForm_marketingCampaignId");
		Select obj7 = new Select(makcam);
		obj7.selectByVisibleText("eCommerce Site Internal Campaign");
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("12345");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		
		driver.findElementByName("submitButton").click();
			Thread.sleep(2000);
			
			driver.close();
		}		
	}


