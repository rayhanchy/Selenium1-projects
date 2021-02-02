package frameworktest;

import org.testng.annotations.Test;

public class Test01_login extends Genericclass1{
	
	@Test
	public void lgin () {
		
		
		launchbrowser("http://leaftaps.com/opentaps");
		
		enterbyid("username", "DemoSalesManager");
		enterbyid("password", "crmsfa");
		clickbyclassname("decorativeSubmit");
		clickbylinktext("CRM/SFA");
		
		
			}
	

}
