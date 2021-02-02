package parameterTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class suubclas extends Superclas {
	
	@Test (dataProvider = "getdata")
	
	public void sbbc(String cname, String fname, String lname) throws InterruptedException {
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		
		//driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Hema");
		//driver.findElementById("createLeadForm_lastNameLocal").sendKeys("M");
																					//Selecting source
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select obj = new Select(source);
		obj.selectByVisibleText("Existing Customer");
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
																						//Industry Select
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select obj2 = new Select(ind);
		obj2.selectByValue("IND_SOFTWARE");
		
		
	}

}
