package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Tax {
	static WebDriver driver;
	static ArrayList<String> dateList = new ArrayList<String>();
	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = rep.startTest("Tax");
	ExcelDataConfig excel = new ExcelDataConfig("E:\\Selenium\\Webpos\\LingaProject\\Webpos\\ExcelData\\Tax calculator sheet.xlsx");


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
		driver.get(Utility.getProperty("Production_URL"));
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(10000);
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//linga-icon[@symbol=\"operations\"][1]")).click();
		driver.findElement(By.xpath(".//label[text()=\"Close Day\"]")).click();
		driver.findElement(By.xpath(".//button/span[text()=\"Close All Cashiers\"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button/span[text()=\"Cash\"]")).click();
			Thread.sleep(8000);
		} catch (Exception e) {
			Thread.sleep(5000);
		}
		driver.findElement(By.xpath(".//linga-icon[@symbol=\"menu-icon\"]")).click();
		driver.findElement(By.xpath(".//label[text()=\"POS\"]")).click();

	}

	@Test
	public void TestCase1() throws Exception {

		excel.getData(1, 5, 0);
		excel.getNumericData(1, 2, 1);
		driver.findElement(By.xpath(".//button[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();		

	}

}
