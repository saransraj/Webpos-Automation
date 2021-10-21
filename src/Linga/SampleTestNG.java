package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleTestNG {

	static WebDriver driver;
	static ArrayList<String> menuName= new ArrayList<String>();
	static ArrayList<String> placedMenu= new ArrayList<String>();
	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = rep.startTest("Sample Run");
	
	@AfterClass
	public void flushTest() throws Exception
	{
		Thread.sleep(2000);
		rep.endTest(test);
		rep.flush();
	}
			@BeforeTest
			public void login() throws Exception {
				
				ExcelDataConfig excel=new ExcelDataConfig(Utility.getProperty("Excel_Sheet_Path_For_Xpath"));
				
				test.log(LogStatus.INFO, "Sample Run starting");
				
				System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://web.lingapos.com");
				Thread.sleep(10000);
				driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				Thread.sleep(10000);

				for (int i = 0; i < 4; i++){
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					  Thread.sleep(1000);
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
			
				  test.log(LogStatus.FAIL, "Sample run ended successfully");
	}
			//Double_click_Finish_button_Check_Available_or_Not
			@Test(priority = 0)
			  public void Double_click_Finish_button_Check_Available_or_Not() throws Exception {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
				
				//test.log(LogStatus.PASS, "Table Selected & Table Name is : "+driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).getText());
				
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
				js.executeScript("arguments[0].scrollIntoView();", menu1);
				menu1.click();
				placedMenu.add(menu1.getText());
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
				js1.executeScript("arguments[0].scrollIntoView();", menu1);
				menu1.click();
				placedMenu.add(menu1.getText());
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
				js2.executeScript("arguments[0].scrollIntoView();", menu1);
				menu1.click();
				placedMenu.add(menu1.getText());
				String checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				Actions action = new Actions(driver);
				action.doubleClick(driver.findElement(By.xpath(".//*[text()= \"Finish\"]"))).perform();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
				String checkNo2 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				if(checkNo1.equals(checkNo2)) {
						System.out.println("Double click the finish button - check available - Pass");
					}
				else {
					System.out.println("Double click the finish button - check not available - Fail");

				}
			}
				
				//Double_click_Finish_button_Menu_Available_or_Not
				@Test(priority=1)
				public static void Double_click_Finish_button_Menu_Available_or_Not() throws InterruptedException {
				
					
					int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				 for(int i=1 ;i<=item_count ; i++)	{
					  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
				  menuName.add(menuitemname);
				  		  }
				  if(menuName.equals(placedMenu)) {
					  System.out.println("Double click the finish button - Menu items available - Pass");
				  }
				  else {
						 System.out.println("Double click the finish button - menu not available - fail");
					 }
				  
				  placedMenu.clear();
				  menuName.clear();
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				Thread.sleep(1000);
					 

			}
			//Double_click_All_button_check_available
			@Test(priority = 2)
			public static void Double_click_All_button_check_available() throws InterruptedException{
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);

				driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
				driver.findElement(By.xpath(".//div[text()=\"Laddu\"]")).click();

				JavascriptExecutor js3 = (JavascriptExecutor) driver;
				WebElement menu = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
				js3.executeScript("arguments[0].scrollIntoView();", menu);
				menu.click();
				placedMenu.add(menu.getText());
			        
				JavascriptExecutor js4 = (JavascriptExecutor) driver;
				menu = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
				js4.executeScript("arguments[0].scrollIntoView();", menu);
				menu.click();
				placedMenu.add(menu.getText());

				JavascriptExecutor js5 = (JavascriptExecutor) driver;
				menu = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
				js5.executeScript("arguments[0].scrollIntoView();", menu);
				menu.click();
				placedMenu.add(menu.getText());

				String checkNo3 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				Actions action = new Actions(driver);
				action.doubleClick(driver.findElement(By.xpath(".//button[text()=\"All\"]"))).perform();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
				String checkNo4 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				if(checkNo3.equals(checkNo4)) {
					System.out.println("Double click the All button - check available - Pass");
						}
				else {
					System.out.println("Double click the All button - check not available - Fail");

				}
			}
				
				//Double_click_All_button_Menu_Available_or_Not
				@Test(priority=3)
				public static void Double_click_All_button_Menu_Available_or_Not() throws InterruptedException {
					int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				 for(int i=1 ;i<=item_count ; i++)	{
					  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
				  menuName.add(menuitemname);
				  		  }
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();

				  if(menuName.equals(placedMenu)) {
					  System.out.println("Double click the All button - Menu items available - Pass");
				  }
				  else {
						 System.out.println("Double click the All button - menu not available - fail");
					 }
				  placedMenu.clear();
				  menuName.clear();
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				Thread.sleep(1000);
					 
			}


}
