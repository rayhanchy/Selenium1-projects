package seleniumPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDroppractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		
		//driver.findElementByLinkText("Droppable").click();
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		
		Actions action = new Actions (driver);
		action.dragAndDrop(drag, drop).perform();
		
				
	}

}
