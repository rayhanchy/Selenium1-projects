package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptAlertparactice {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	@Test
	
	public void aaatest() throws InterruptedException {
	
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.findElementById("accept-choices").click();
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert promalert = driver.switchTo().alert();
		
		System.out.println(promalert.getText());
		Thread.sleep(2000);
		promalert.sendKeys("Rayhan");
		promalert.accept();
		Thread.sleep(1000);
	}

}
