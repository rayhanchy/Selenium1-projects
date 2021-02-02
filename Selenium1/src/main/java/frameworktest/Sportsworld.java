package frameworktest;

public interface Sportsworld {
	
	public void launchbrowser (String url) ;
	
	public void enterbyid (String locatorvalue, String data);
	public void enterbyname (String locatorvalue, String data);
	public void enterbyclassname (String locatorvalue, String data);
	public void enterbylinktext (String locatorvalue, String data);
	public void enterbypartiallinktext (String locatorvalue, String data);
	public void enterbyxpath (String locatorvalue, String data);
	
	public void clickbyid (String locatorvalue);
	public void clickbyname (String locatorvalue);
	public void clickbyclassname (String locatorvalue);
	public void clickbylinktext (String locatorvalue);
	public void clickbyxpath (String locatorvalue);
	
	public void Selectvisibletextbyid (String locatorvalue, String data);
	public void Selectvisibletextbyname (String locatorvalue, String data);
	public void Selectvisibletextbyclassname (String locatorvalue, String data);
	
	public void Selectvaluebyid (String locatorvalue, String data);
	public void Selectvaluebyname (String locatorvalue, String data);
	public void Selectvaluebyclassname (String locatorvalue, String data);
	
	public void Selectindexbyid (String locatorvalue, int value);
	public void Selectindexbyxpath (String locatorvalue, int value);
	
	public void verifybyid (String locatorvalue, String data);
	public void verifybyname (String locatorvalue, String data);
	public void verifybyclassname (String locatorvalue, String data);
	
	
	public void closebrowser();
	
	
	
	
	
	
	
	
	
	

}
