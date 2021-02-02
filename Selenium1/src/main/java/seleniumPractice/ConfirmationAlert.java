package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.testng.annotations.Test;


public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByLinkText("Merge").click();
		
		Alert ttt = driver.switchTo().alert();
		System.out.println(ttt.getText());
		Thread.sleep(2000);
		
		ttt.accept();
		
		
		
	}
	

}
