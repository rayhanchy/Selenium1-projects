package frameworkpractice;

import org.testng.annotations.Test;

public class Tc002_createlead extends Tc001_login {
	@Test
	public void crtlead () {
		
		clickbylinktext("Create Lead");
		enterbyid("createLeadForm_companyName", "ABC");
		enterbyid("createLeadForm_firstName", "Rayhan");
		enterbyid("createLeadForm_lastName", "C");
		
		Selectvaluebyid("createLeadForm_industryEnumId", "IND_HARDWARE");
		
		clickbyclassname("smallSubmit");
		
	}
	
	

}
