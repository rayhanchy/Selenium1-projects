package frameworktest;

import org.testng.annotations.Test;

public class Test02_createlead extends Test01_login{
	
	@Test
	public void crtled () {
		
		clickbylinktext ("Create Lead");
		enterbyid("createLeadForm_companyName", "Abultabul");
		enterbyid("createLeadForm_firstName", "Mamun");
		enterbyid("createLeadForm_lastName", "Chow");
		clickbyname("submitButton");
		
	}
	
	

}	
