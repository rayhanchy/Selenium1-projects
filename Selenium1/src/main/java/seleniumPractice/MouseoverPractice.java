package seleniumPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://mrbool.com");
		driver.manage().window().maximize();
		
		
		
		WebElement content = driver.findElementByXPath("//a[@class ='menulink']");
		Actions action = new Actions (driver);
		action.moveToElement(content).perform();
			
	}

}
