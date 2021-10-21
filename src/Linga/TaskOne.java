package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TaskOne {

	static WebDriver driver;
	static ArrayList<String> dateList = new ArrayList<String>();
	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = rep.startTest("Select dates of September");


	@AfterClass
	public void flushTest() throws Exception
	{
		driver.quit();
		Thread.sleep(2000);
		rep.endTest(test);
		rep.flush();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void TestCase1() throws Exception {
		driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		driver.findElement(By.id("datepicker")).click();

		for(int i=1;i<=12;i++) {
			String month =  driver.findElement(By.xpath("(//div/span)[1]")).getText();
			String Sep ="September";
			if(month.equals(Sep)) {
				int date = driver.findElements(By.xpath("//table/tbody/tr/td[@data-month=\"8\"]/a")).size();
				for (int j = 1; j <= date; j++) {
					driver.findElement(By.xpath("(//table/tbody/tr/td[@data-month=\"8\"]/a)"+"["+j+"]")).click();
					WebElement selecteddate = driver.findElement(By.xpath("//input[@type=\"text\"]"));
					String selecteddata = selecteddate.getAttribute("value");
					System.out.println(selecteddata);
					test.log(LogStatus.PASS,selecteddata );
					driver.findElement(By.id("datepicker")).click();

				}
				break;
			}

			driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/a/span[text()=\"Next\"]")).click();			        
		}
	}

}
