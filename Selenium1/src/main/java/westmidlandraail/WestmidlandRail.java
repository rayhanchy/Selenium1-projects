package westmidlandraail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class WestmidlandRail {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rhcho\\eclipse-workspace\\Selenium1\\Driver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.westmidlandsrailway.co.uk/");
		
		driver.findElementByLinkText("I'm fine with this").click();
		
		/*driver.findElementByXPath("//span[text()='Tickets & discounts ']").click();
		driver.findElementByLinkText("Tickets & discounts").click();
		
		driver.findElementById("from-buy-booking-form").sendKeys("Birmingham New Street");
		driver.findElementById("to-booking-form").sendKeys("London Euston");
		driver.findElementByLinkText("Return").click();
		driver.findElementByPartialLinkText("Outbound journey");
		driver.findElementByXPath("(//i[@class='fa fa-calendar'])[1]").click();
		driver.findElementByLinkText("1").click();
		driver.findElementByLinkText("22:30").click();
		driver.findElementByXPath("(//button[text()='Set'])[1]").click();
		*/
		

		driver.findElementByXPath("//input[@type='text' and @placeholder='Enter origin station' ]").click();
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter origin station' ]")).sendKeys("london");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter origin station' ]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter destination station' ]")).click();
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter destination station' ]")).sendKeys("B");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter destination station' ]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter destination station' ]")).sendKeys(Keys.DOWN);
	
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Enter destination station' ]")).sendKeys(Keys.ENTER);
		
		
	
		
	     	//System.out.println("Title :" );
		
		//calendar 
		driver.findElement(By.xpath("(//div[@class='display-group'])[1]/a/span[7]/i")).click();
		driver.findElementByLinkText("7").click();
		driver.findElementByXPath("(//span[text()='Departing after'])[4]").click();
		driver.findElementByXPath("(//a[@class='chosen-single'])[10]").click();
		
		WebElement starttime = driver.findElementById("out_time_modal-booking-form");
		Select dd = new Select(starttime);
		dd.selectByVisibleText("20:00");
		
		
		
		/*start_time = 
				driver.find_element_by_xpath("//div[@class='xdsoft_time']//div[@data- 
				hour='22'][@data-minute='00']")
				driver.implicitly_wait(4)
				start_time.click()
		*/
		
		//driver.findElementByXPath("(//div[@class='input-group add-on time'])[2]/div/a/span").click();
		
		//driver.findElementByXPath("(//div[@class='input-group add-on time'])[2]/div/a/span").click();
		
	     	//driver.findElement(By.xpath("(//div[@class='outbound form-group'])/div/a/span[7]/i")).click();
	     	Thread.sleep(1000);
	     	driver.findElement(By.cssSelector("button.btn.btn-default.set")).click();
	     	
	     	
	     	
	     	
	     	Thread.sleep(2000);
	     	driver.findElement(By.xpath("(//div[@class='fade-content'])/div/a/span[7]/i")).click();
	     	System.out.println("Title222" );
	     	Thread.sleep(2000);
	     	driver.findElementByLinkText("8").click();
	     	//driver.findElement(By.xpath("(//div[@class='ui-datepicker-group ui-datepicker-group-first'])/table/tbody/tr[2]/td[5]/a")).click();
	     	//driver.findElementByXPath("(//button[text()='Set'])[1]").click();
	     	//System.out.println("T" );
	     	Thread.sleep(2000);
	     	driver.findElementByXPath("(//button[@type='button'])[21]").click();
	     	
	     		
	     	//driver.findElement(By.xpath("(//div[@class='ui-datepicker-group ui-datepicker-group-first'])/table/tbody/tr[6]/td[8]/a")).click();
	     	//driver.findElement(By.cssSelector("button.btn.btn-default.set")).click();
	     	//driver.findElementByXPath("(//div[@class='btn btn-default set'])").click();
		
	     	
	     	
				
			}
		
	}


		
		
		
	


