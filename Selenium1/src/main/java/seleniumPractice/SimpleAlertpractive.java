package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleAlertpractive {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  @Test
	void simple() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		driver.findElementById("searchBtn").click();
		 
		
		 Alert alert = driver.switchTo().alert();
		
		 
		 alert.getText();
		System.out.println(alert.getText());
		
		Thread.sleep(3000);
		alert.accept();
		
		
	}

}
