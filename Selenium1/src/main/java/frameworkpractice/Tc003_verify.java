package frameworkpractice;

import org.testng.annotations.Test;

public class Tc003_verify extends Tc002_createlead {
	
	
	@Test
	public void verify () {
		verifybyid("viewLead_firstName_sp", "Rayhan");
	
		
	}

}
