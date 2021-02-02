package frameworkpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Generalclas {

	public ChromeDriver driver;
	
	public void launchbrowser(String url) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
															//leaftaps launch
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

	public void enterbyid(String locatorValue, String data) {
		driver.findElementById(locatorValue).sendKeys(data);
		
	}

	public void enterbyname(String locatorValue, String data) {
		driver.findElementByName(locatorValue).sendKeys(data);
		
	}

	public void enterbyclassname(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterbylinktext(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterbyxpath(String locatorValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void clickbyid(String locatorValue) {
		
		
	}

	public void clickbyname(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void clickbyclassname(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();
		
	}
	
	public void clickbylinktext (String locatorValue) {
		
		driver.findElementByLinkText(locatorValue).click();
		
	}

	public void clickbyxpath(String locatorValue) {
		// TODO Auto-generated method stub
		
	}

	public void Selectbyvisibletextbyid(String id, String Value) {
		
		WebElement elemen = driver.findElementById(id);
		Select dd = new Select(elemen);
		dd.selectByVisibleText(Value);
		
	}

	public void Selectbyvisibletextbyname(String name, String Value) {
		// TODO Auto-generated method stub
		
		
		
	}

	public void Selectbyvaluebyname(String id, String Value) {
		
		
	}

	public void Selectbyindex(String name, int Value) {
		// TODO Auto-generated method stub
		
		WebElement eleindex = driver.findElementById(name);
		
		Select dd2 = new Select(eleindex);
		dd2.selectByIndex(Value);
		
	}
	

	
	public void verifybyid(String locatorValue, String Data) {
		
		String text2 = driver.findElementById(locatorValue).getText();
		if(text2.equals(Data)) {
		System.out.println("Name is matched");
	} else
	{System.out.println("Name not matched");}
	
	}

	public void Selectvaluebyid(String id, String Value) {
		
		WebElement byId = driver.findElementById(id);
		Select ddd =new Select(byId);
		ddd.selectByValue(Value);
			
		
		
		
	}

	public void closebrowser() {
		driver.close();
	}

		
	}
	
	


