package frameworkpractice;

import org.testng.annotations.Test;

public class Tc001_login extends Generalclas {
	@Test
	public void login () {
		
		launchbrowser("http://leaftaps.com/opentaps");
		
		enterbyid("username", "DemoSalesManager");
		enterbyid("password", "crmsfa");
		clickbyclassname("decorativeSubmit");
		clickbylinktext("CRM/SFA");
		
				
	}
	
	
	

}
