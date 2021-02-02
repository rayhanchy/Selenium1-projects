package parameterTest;

import org.testng.annotations.Test;

public class Subclasstesting2 extends Superclas{
	
	@Test 
	//(dataProvider = "getdata")
	
	public void leadtest (String foname, String sname) {
	
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Request Catalog ").click();
		driver.findElementByName("firstName").sendKeys(foname);
		driver.findElementByName("lastName").sendKeys(sname);
		
		
	}
	}
	
	


