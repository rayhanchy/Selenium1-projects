package frameworktest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Genericclass1 implements Sportsworld {
	
	public  ChromeDriver driver;

	public void launchbrowser(String url) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(url);
		
	}

	public void enterbyid(String locatorvalue, String data) {
		driver.findElementById(locatorvalue).sendKeys(data);
		
	}

	public void enterbyname(String locatorvalue, String data) {
		driver.findElementByName(locatorvalue).sendKeys(data);
		
	}

	public void enterbyclassname(String locatorvalue, String data) {
		driver.findElementByClassName(locatorvalue).sendKeys(data);
		
	}

	public void enterbylinktext(String locatorvalue, String data) {
		driver.findElementByLinkText(locatorvalue).sendKeys(data);
		
	}

	public void enterbypartiallinktext(String locatorvalue, String data) {
		driver.findElementByPartialLinkText(locatorvalue).sendKeys(data);
		
	}

	public void enterbyxpath(String locatorvalue, String data) {
		driver.findElementByXPath(locatorvalue).sendKeys(data);
		
	}

	public void clickbyid(String locatorvalue) {
		driver.findElementById(locatorvalue).click();
				
	}

	public void clickbyname(String locatorvalue) {
		driver.findElementByName(locatorvalue).click();
		
	}

	public void clickbyclassname(String locatorvalue) {
		driver.findElementByClassName(locatorvalue).click();
		
	}

	public void clickbylinktext(String locatorvalue) {
		driver.findElementByLinkText(locatorvalue).click();
		
	}

	public void clickbyxpath(String locatorvalue) {
		driver.findElementByXPath(locatorvalue).click();
		
	}

	public void Selectvisibletextbyid(String locatorvalue, String data) {
		WebElement element = driver.findElementById(locatorvalue);
		Select ddd = new Select(element);
		ddd.selectByVisibleText(data);
		
	}

	public void Selectvisibletextbyname(String locatorvalue, String data) {
		WebElement ele = driver.findElementByName(locatorvalue);
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText(data);
		
		
	}

	public void Selectvisibletextbyclassname(String locatorvalue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void Selectvaluebyid(String locatorvalue, String data) {
		WebElement webele = driver.findElementById(locatorvalue);
		Select dd3 = new Select(webele);
		dd3.selectByValue(data);
		
		
	}

	public void Selectvaluebyname(String locatorvalue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void Selectvaluebyclassname(String locatorvalue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void Selectindexbyid(String locatorvalue, int value) {
		WebElement byid = driver.findElementById(locatorvalue);
		Select dd4 = new Select(byid);
		dd4.selectByIndex(value);
		
		
	}

	public void Selectindexbyxpath(String locatorvalue, int value) {
		// TODO Auto-generated method stub
		
	}

	public void verifybyid(String locatorvalue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void verifybyname(String locatorvalue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void verifybyclassname(String locatorvalue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void closebrowser() {
		driver.close();
		
	}
	
	

}
