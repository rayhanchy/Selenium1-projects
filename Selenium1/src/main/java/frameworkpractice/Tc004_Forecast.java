package frameworkpractice;

import org.testng.annotations.Test;

public class Tc004_Forecast extends Tc003_verify {
	
	
	@Test
	public void forcst () {
		
		//clickbyxpath("//a[text()='Forecasts']");
		clickbylinktext("Forecasts");
		
		clickbylinktext("Find Forecasts");
		
		clickbyname("submitButton");
		
	}

}
