package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Login {
	static WebDriver driver;

	public static String loginAndCashier() throws Exception {
		System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Utility.getProperty("Production_URL"));
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(10000);
		for (int i = 1; i <= 4; i++){
			driver.findElement(By.xpath(".//button[text()="+i+"]")).click();
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
		return null;
	}
	public static String preProdLogIn() throws Exception {
		
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 1; i <= 4; i++){
			driver.findElement(By.xpath(".//button[text()="+i+"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);

		return null;
		
	}

}