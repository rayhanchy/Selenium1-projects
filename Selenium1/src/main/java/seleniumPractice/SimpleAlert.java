package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
	driver.manage().window().maximize();
	
	driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	Thread.sleep(2000);
	alert.accept();
	//System.out.println(alert.getText());
	
		
		
	}

}
