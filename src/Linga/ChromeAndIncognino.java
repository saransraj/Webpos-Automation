package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class ChromeAndIncognino {
	WebDriver driver = null;
	static ArrayList<String> activeCheck= new ArrayList<String>();
	static ArrayList<String> closedCheck= new ArrayList<String>();
	static ArrayList<String> voidCheck= new ArrayList<String>();
	static ArrayList<String> placedMenu= new ArrayList<String>();
	static ArrayList<String> menuName= new ArrayList<String>();
	static ArrayList<String> Payments= new ArrayList<String>();
	
	ExtentReports rep = ExtentManager.getInstance();
	ExtentTest test = rep.startTest("Verify WebPOS ");


	@AfterClass
	public void flushTest() throws Exception
	{
		Thread.sleep(2000);
		rep.endTest(test);
		rep.flush();
	}

	@org.testng.annotations.Parameters("browser")
    @Test(priority = 0)
    public void chrome(String browser) throws Exception {	 
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")) {
    	System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("incognito")) {
			System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			driver = new ChromeDriver(option);	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
    	driver.get(Utility.getProperty("Staging_India_Url")); 
    	Thread.sleep(30000);
    	try {
    		driver.findElement(By.xpath(".//button[text()=\"Sign In\"]")).click();
		} catch (Exception e) {
		}

		driver.findElement(By.xpath(".//input[@type=\"email\"]")).sendKeys("chotu@mail.com");
		driver.findElement(By.xpath(".//input[@type=\"password\"]")).sendKeys("chotu1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(10000);

		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
	}
		@Test(priority = 1)
	    public void QSR_Check_Close() throws Exception {	 

		for (int j = 0; j <250 ; j++){
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
			  String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  activeCheck.add(checkNo11);
			  driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			  Thread.sleep(500);
			  
		 }
		//driver.quit();
		}
		@Test(priority = 2)
	    public void QSR_Check_Close_Available_Or_Not() throws Exception {	
	    	System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
	    	driver = new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.get(Utility.getProperty("Staging_India_Url")); 
	    	Thread.sleep(30000);
	    	try {
	    		driver.findElement(By.xpath(".//button[text()=\"Sign In\"]")).click();
			} catch (Exception e) {
			}

			driver.findElement(By.xpath(".//input[@type=\"email\"]")).sendKeys("chotu@mail.com");
			driver.findElement(By.xpath(".//input[@type=\"password\"]")).sendKeys("chotu1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

			
			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				Thread.sleep(500);
			}
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();	  
			  for(int i=0; i<activeCheck.size(); i++){
				  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				  Thread.sleep(8000);
				  String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				  closedCheck.add(closedcheckno);
			  		}
			  System.out.println(activeCheck);
			  System.out.println(closedCheck);

			  if(activeCheck.equals(closedCheck)) {
				  System.out.println("All the checks available");
			  }
				 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		}

		@Test(priority = 3,groups = {"Later"})
	    public void QSR_Check_Close_reopen_DeletePayment_AgainCloseCheck() throws Exception {	 

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
			  String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  activeCheck.add(checkNo11);
			  driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();	  
			  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo11);
			  Thread.sleep(8000);
			  driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo11+"')]")).click();
			  driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
			  driver.findElement(By.xpath(".//ion-row[@class=\"ng-star-inserted md hydrated\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.xpath(".//button[text()=\"Cash\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();	  
			  for(int i=0; i<activeCheck.size(); i++){
				  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				  Thread.sleep(8000);
				  String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				  closedCheck.add(closedcheckno);
			  }
			  System.out.println(activeCheck);
			  System.out.println(closedCheck);
			  
			  if(activeCheck.equals(closedCheck)) {
				  System.out.println("All the checks available");
			  }
			  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
					}
				
		@Test(priority = 4, groups = {"Later"})
	    public void QSR_Check_Close_reopen_DeletePayment_voidCheck() throws Exception {	 

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
			  String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  activeCheck.add(checkNo11);
			  driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();	  
			  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo11);
			  Thread.sleep(8000);
			  driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo11+"')]")).click();
			  driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
			  driver.findElement(By.xpath(".//ion-row[@class=\"ng-star-inserted md hydrated\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			  Thread.sleep(4000);
			  driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			  driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
			  driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
			  driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				 
				 
			  for(int i=0; i<activeCheck.size(); i++){
				  driver.findElement(By.xpath(".//button[contains(text(),\"Void\")]")).click();
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				  Thread.sleep(5000);
				  String Voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				  voidCheck.add(Voidcheckno);
			  }
			  
			  System.out.println(activeCheck);
			  System.out.println(voidCheck);
			  
			  if(activeCheck.equals(voidCheck)) {
				  System.out.println("All the checks available");
			  }
			  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
					}

		@Test(priority = 5, groups = {"Later"})
	    public void QSR_Check_Place_Menu_DoPayment() throws Exception {	 
			  driver.findElement(By.xpath(".//button[text()=\"Cancel\"]")).click();
			  for(int i=0;i<10;i++) {
			  driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			  js.executeScript("arguments[0].scrollIntoView();", menu1);
			  menu1.click();
			  placedMenu.add(menu1.getText());
			  driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Cash\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			  
			  }
			  int item_count4 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		  		for(int i=1 ;i<=item_count4 ; i++)	{
		  			JavascriptExecutor js4 = (JavascriptExecutor) driver;
		  			WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
		  			js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
		  			menuName.add(menuitemname.getText());
					}
		  		System.out.println(placedMenu);
		  		System.out.println(menuName);

		  		if (placedMenu.equals(menuName)) {
					System.out.println("Menus available");
				} else {
					System.out.println("Menus not available");
				}
			driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			int item_count5 = driver.findElements(By.xpath(".//div/ion-row")).size();
	  		for(int i=1 ;i<=item_count5 ; i++)	{
	  			JavascriptExecutor js4 = (JavascriptExecutor) driver;
	  			WebElement menuitemname = driver.findElement(By.xpath("(.//ion-col[contains(text(),\"Cash\")])" + "[" + i + "]"));
	  			js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
	  			Payments.add(menuitemname.getText());
				}
	  		System.out.println(Payments.size()/2);
	  		System.out.println(item_count5);
	  	    String str3 = String.valueOf(item_count5);


	  		if (str3.equals(Payments.size())) {
				System.out.println("Payments available");
			} else {
				System.out.println("Menus not available");
			}
		  		
		}
		@Test(priority = 6)
	    public void QSR_PlaceMenu_DoManual_Hold_DoPayment_ClickYesForHoldCheckPopup_CloseCheck() throws Exception {	 
			for(int i=0;i<200;i++) {
				driver.findElement(By.xpath(".//button[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			  js.executeScript("arguments[0].scrollIntoView();", menu1);
			  menu1.click();
			  placedMenu.add(menu1.getText());
			  driver.findElement(By.xpath(".//div[contains(@class,\"orderlist-container  highlight\")]/div/div[text()=\"Chai\"]")).click();
			  driver.findElement(By.xpath(".//button/label[text()=\"Hold\"]")).click();
			  driver.findElement(By.xpath(".//span[text()=\"Done\"]")).click();
			  String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  activeCheck.add(itemcheckno1);
			  driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Cash\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			}
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();	  
			for(int i=0; i<activeCheck.size(); i++){
				driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				//Thread.sleep(8000);
				String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				closedCheck.add(closedcheckno);
			  }
			  System.out.println(activeCheck);
			  System.out.println(closedCheck);
			  if(activeCheck.equals(closedCheck)) {
				  System.out.println("All the checks available");
			  }
			  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				
		}
		@Test(priority = 7, groups = {"Later"})
	    public void QSR_PlaceMenu_CloseCheck_Reopen_Check_AddMenu_CloseCheck_Loop() throws Exception {	
			
			test.log(LogStatus.INFO, "QSR_PlaceMenu_CloseCheck_Reopen_Check_AddMenu_CloseCheck_Loop");

			 driver.findElement(By.xpath(".//button[text()=\"Cancel\"]")).click();
			 for(int i = 1;i<5;i++) {
			  driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			  js.executeScript("arguments[0].scrollIntoView();", menu1);
			  menu1.click();
			  placedMenu.add(menu1.getText());
			  String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  activeCheck.add(checkNo11);
			  driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Cash\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();	  
			  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo11);
			  Thread.sleep(8000);
			  driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo11+"')]")).click();
			  driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
			  Thread.sleep(4000);
			 }
			  int item_count4 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			  for(int i=1 ;i<=item_count4 ; i++)	{
			  JavascriptExecutor js4 = (JavascriptExecutor) driver;
			  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
			  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
			  menuName.add(menuitemname.getText());
			  }
		  		System.out.println(placedMenu);
		  		System.out.println(menuName);
		  		if (placedMenu.equals(menuName)) {
					System.out.println("Menus available");
					
					String scn=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
					String s="data:image/png;base64,"+scn;
					test.log(LogStatus.PASS, test.addScreenCapture(s));
				} else {
					System.out.println("Menus not available");
					String scn=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
					String s="data:image/png;base64,"+scn;
					test.log(LogStatus.FAIL, test.addScreenCapture(s));

				}
			driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
			int item_count5 = driver.findElements(By.xpath(".//div/ion-row")).size();
	  		for(int i=1 ;i<=item_count5 ; i++)	{
	  			JavascriptExecutor js4 = (JavascriptExecutor) driver;
	  			WebElement menuitemname = driver.findElement(By.xpath("(.//ion-col[contains(text(),\"Cash\")])" + "[" + i + "]"));
	  			js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
	  			Payments.add(menuitemname.getText());
				}
	  		System.out.println(Payments.size()/2);
	  		System.out.println(item_count5);
	  	    String str3 = String.valueOf(item_count5);
	  		if (str3.equals(Payments.size())) {
				System.out.println("Payments available");
			} else {
				System.out.println("Menus not available");
			}
			 
			  
		}
		}
		


