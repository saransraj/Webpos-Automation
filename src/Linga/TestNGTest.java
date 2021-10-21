package Linga;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {
	static WebDriver driver;
	static ArrayList<String> menuName= new ArrayList<String>();
	static ArrayList<String> placedMenu= new ArrayList<String>();
	static ArrayList<String> menuCheck= new ArrayList<String>();

	static ArrayList<String> activeCheck= new ArrayList<String>();
	static ArrayList<String> closedCheck= new ArrayList<String>();
	static ArrayList<String> voidCheck= new ArrayList<String>();
	static ArrayList<String> afterActiveCheck= new ArrayList<String>();
	static ArrayList<String> afterClosedCheck= new ArrayList<String>();
	static ArrayList<String> afterVoidCheck= new ArrayList<String>();
	static ArrayList<String> voidMenu= new ArrayList<String>();
	static ArrayList<String> TransferFrom= new ArrayList<String>();
	static ArrayList<String> TransferTo= new ArrayList<String>();
	JSONObject jsonObject = new JSONObject();
	String checkNo1;
@Test(enabled = false)
	public void login_CashierOut() throws Exception {
	System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(Utility.getProperty("Staging_Url"));
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
@Test(priority=0, groups = {"DineIn"})

public void check_Open_Place_item_Finish_Loop() throws Exception {
	login_CashierOut();
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
	Thread.sleep(500);
	for(int i = 0; i<10; i++) {
		driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
	
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
	  js.executeScript("arguments[0].scrollIntoView();", menu3);
	  menu3.click();
	  placedMenu.add(menu3.getText());
		Thread.sleep(1000);

	  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	  }
	  driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
	  try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
	 
	  int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
	  for(int i=1 ;i<=item_count ; i++)	{
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
		  js.executeScript("arguments[0].scrollIntoView();", menu3);
		  menuName.add(menu3.getText());
		  		  }
	  if(menuName.equals(placedMenu)) {
		  System.out.println("Check Open and Finish - Menu items available - Pass");
		  }
	  else {
			 System.out.println("Check Open and Finish - menu Not available - fail");
		 }
	  placedMenu.clear();
	  menuName.clear();	  
	  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
	  Thread.sleep(1000);
	  driver.quit();
}
@Test(priority=1, groups = {"DineIn"})

public void Browser1_Place_menu_Browser2_Change_service_type_Place_menu_item() throws Exception {
	login_CashierOut();
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));

	driver.get("https://web.lingapos.com/#/auth/pin");
	Thread.sleep(30000);
	driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
	driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(6000);

	for (int i = 0; i < 4; i++){
		driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
		  Thread.sleep(500);
		  }
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(2000);
		
	driver.switchTo().window(tabs.get(0));
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
	
	for(int i=0 ; i<=5 ; i++) {
		try {
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		}catch (Exception e) {
			}
	driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
	js.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
	js1.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
	js2.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	Thread.sleep(2000);
	checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	
	driver.switchTo().window(tabs.get(1));
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
	driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
	driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"TOGO\"]")).click();

	driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
	
	JavascriptExecutor js12 = (JavascriptExecutor) driver;
	WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
	js12.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	JavascriptExecutor js13 = (JavascriptExecutor) driver;
	menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Milk\"]"));
	js13.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	
	JavascriptExecutor js14 = (JavascriptExecutor) driver;
	menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Buu Buu\"]"));
	js14.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	Thread.sleep(2000);

	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	}
	driver.switchTo().window(tabs.get(0));
	
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
	Thread.sleep(10000);
	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
	driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
	for(int j=1 ;j<=item_count ; j++)	{
		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
		js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
		menuName.add(menuitemname.getText());
	}
	placedMenu.removeAll(menuName);
	if(placedMenu.isEmpty()) {
		System.out.println("Menu Available");
			}else {
				System.out.println("Menu not Available");
			}
	placedMenu.clear();
	menuName.clear();
	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	driver.quit();
}

@Test(priority=2, groups = {"DineIn"})

public void Transfer_Check_one_by_one() throws Exception {
	login_CashierOut();
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
	for(int i=1; i<= 3; i++ ) {
		String tableName= "T";
		String fullTableName =  tableName.concat(String.valueOf(i));
	driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
	driver.findElement(By.xpath(".//*[contains(text(),'"+fullTableName+"')]")).click();
	driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
	Thread.sleep(1000);
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
	 Thread.sleep(1500);
	String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	activeCheck.add(itemcheckno1);
	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	
	}
	int checkSizeTotal = (activeCheck.size()-1);
		for(int j=0; j<checkSizeTotal; j++) {
		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//div/span[contains(.,'"+activeCheck.get(j)+"')]")).click();
		int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
		for(int i=1 ;i<=checkSize ; i++)	{
		driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + i + "]")).click();
		}
		j++;
		driver.findElement(By.xpath("(.//div/span[contains(.,'"+activeCheck.get(j)+"')])[2]")).click();
		driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		Thread.sleep(500);
		j--;
	}

		driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
		driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
		String lastCheckNo = activeCheck.get(activeCheck.size()-1);
		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(lastCheckNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//tr/td[contains(.,'"+lastCheckNo+"')]")).click();
		driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
		int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		for(int i=1 ;i<=item_count2 ; i++)	{
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
			js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
			menuName.add(menuitemname.getText());
		}
		placedMenu.removeAll(menuName);   
		if (placedMenu.isEmpty()) {
			System.out.println("Transfer item one by one - Menu items available - Pass");
		  }
		  	else {
		  		System.out.println("Transfer item one by one - fail");
		  	}
		  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		  	driver.quit();
			}

@Test(priority=3, groups = {"DineIn"})

	public void Merge_Check_one_by_one() throws Exception {
	login_CashierOut();

		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
		for(int i=1; i<= 3; i++ ) {
			String tableName= "T";
			String fullTableName =  tableName.concat(String.valueOf(i));
			activeCheck.add(fullTableName);

		driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
		driver.findElement(By.xpath(".//*[contains(text(),'"+fullTableName+"')]")).click();
		driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
		Thread.sleep(1000);
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
		Thread.sleep(2000);
		String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			}
		for(int j=1; j<activeCheck.size(); j++) {
			driver.findElement(By.xpath(".//div[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
			driver.findElement(By.xpath(".//button/p[contains(.,\"T1 \")]")).click();
			
			driver.findElement(By.xpath(".//button/p[text()='"+activeCheck.get(j)+" ']")).click();
			driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();

		}
		driver.findElement(By.xpath(".//button/p[contains(.,\"T1 \")]")).click();

		int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		for(int i=1 ;i<=item_count2 ; i++)	{
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
			js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
			menuName.add(menuitemname.getText());
		}
				
		placedMenu.removeAll(menuName);   
		if (placedMenu.isEmpty()) {
			System.out.println("Merge one by one - Menu items available - Pass");
		  }
		  	else {
		  		System.out.println("Check one by one - fail");
		  	}
		  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		  	driver.quit();	
		
	}
@Test(priority=4, groups = {"DineIn"})

public void Place_menu_completepayment_closeCheck_Reopen_Check_placeMenu_closeSale() throws Exception {
	login_CashierOut();
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
	Thread.sleep(2000);
	for(int i=1; i<=3;i++) {

	driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
	js.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
	js1.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
	js2.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	String checkreopen = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();

	driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();

	driver.findElement(By.xpath(".//*[text()= \"Closed\"]")).click();
	Thread.sleep(8000);

	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkreopen);
	Thread.sleep(2000);

	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkreopen+"')]")).click();		
	driver.findElement(By.xpath(".//*[text()= \" Re-open Check \"]")).click();
	Thread.sleep(5000);
	
	
	//String checkreopen1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	}
	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
	for(int j=1 ;j<=item_count ; j++)	{
		String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
		menuName.add(menuitemname);
	}
	if(placedMenu.equals(menuName)) {
		System.out.println("CheckReopen_Menu_Available_Or_Not - pass");
	}else {
		System.out.println("CheckReopen_Menu_Available_Or_Not - Fail");
	}
	placedMenu.clear();
	menuName.clear();
	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	driver.quit();
	
}

@Test(priority=5, groups = {"DineIn"})

public void Browser1_Place_menu__attachCustomer1_Browser2_Change_service_type_Place_menu_item_attachCustomer2() throws Exception {
	login_CashierOut();
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));

	driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
	Thread.sleep(30000);
	driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
	driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(6000);

	for (int i = 0; i < 4; i++){
		driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
		  Thread.sleep(500);
		  }
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(2000);
		
	driver.switchTo().window(tabs.get(0));
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
	
	for(int i=0 ; i<=10 ; i++) {
		try {
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(10000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		}catch (Exception e) {
			}
	driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
	js.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
	js1.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
	js2.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
	driver.findElement(By.xpath(".//div[contains(text(),\"Chotu Bhai 8883441421\")]")).click();

	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	
	driver.switchTo().window(tabs.get(1));
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
	driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
	driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"TOGO\"]")).click();

	driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
	
	JavascriptExecutor js12 = (JavascriptExecutor) driver;
	WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
	js12.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	JavascriptExecutor js13 = (JavascriptExecutor) driver;
	menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Milk\"]"));
	js13.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	
	JavascriptExecutor js14 = (JavascriptExecutor) driver;
	menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Buu Buu\"]"));
	js14.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
	driver.findElement(By.xpath(".//div[contains(text(),\"Chinnu Saran 98745632103\")]")).click();

	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	}
	driver.switchTo().window(tabs.get(0));
	
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
	Thread.sleep(10000);
	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
	driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
	for(int j=1 ;j<=item_count ; j++)	{
		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
		js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
		menuName.add(menuitemname.getText());
	}
	placedMenu.removeAll(menuName);
	if(placedMenu.isEmpty()) {
		System.out.println("Menu Available");
			}else {
				System.out.println("Menu not Available");
			}
	placedMenu.clear();
	menuName.clear();
	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	driver.quit();
}

@Test(priority=6, groups = {"DineIn"})

public void Place_Menu_Do_Payment_VoidPaymnet_DoAnotherPaymnet() throws Exception {
	login_CashierOut();
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
	js.executeScript("arguments[0].scrollIntoView();", menu3);
	menu3.click();
	placedMenu.add(menu3.getText());
	driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
	
	for(int i = 0; i<3; i++) {
		
		driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Cash\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Gift Card\")]")).click();
		driver.findElement(By.xpath(".//input[@id=\"cardInput\"]")).sendKeys("1234");
		driver.findElement(By.xpath("(.//span[text()=\"Process\"])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Side CC\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Others\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Rs.5.00\")]")).click();
		driver.findElement(By.xpath(".//button[text()=\"HA Payment\"]")).click();
		driver.findElement(By.xpath(".//input[@id=\"cardInput\"]")).sendKeys("1234");
		driver.findElement(By.xpath("(.//span[text()=\"Process\"])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"Others\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"Cash\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"Side CC\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"HA Payment\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
		Thread.sleep(1000);
		
		  driver.findElement(By.xpath(".//ion-col[contains(text(),\"Gift Card\")]")).click();
		  driver.findElement(By.xpath(".//button[contains(text(),\"Delete\")]")).click();
		  Thread.sleep(1500);

			}
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  
		  driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
		  try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			} catch (Exception e) {
			}
		 
		  int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		  for(int i=1 ;i<=item_count ; i++)	{
			  JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  WebElement menu31 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
			  js1.executeScript("arguments[0].scrollIntoView();", menu31);
			  menuName.add(menu3.getText());
			  		  }
		  if(menuName.equals(placedMenu)) {
			  System.out.println("Check Open and Finish - Menu items available - Pass");
			  }
		  else {
				 System.out.println("Check Open and Finish - menu Not available - fail");
			 }
		  placedMenu.clear();
		  menuName.clear();	  
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		  Thread.sleep(1000);
		  driver.quit();
}
@Test(priority=7, groups = {"DineIn"})

public void Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment_HA_payment() throws Exception {
	login_CashierOut();
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));

	driver.get("https://pre-webpos.lingapos.com/#/auth/login");
	Thread.sleep(30000);
	driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
	driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(6000);

	for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
	Thread.sleep(500);
	}
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(2000);
	
	for(int i=0 ; i<=10 ; i++) {
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		Thread.sleep(1000);
		try {
	driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
}catch (Exception e) {
	}
driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
js.executeScript("arguments[0].scrollIntoView();", menu1);
menu1.click();
placedMenu.add(menu1.getText());
JavascriptExecutor js1 = (JavascriptExecutor) driver;
menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
js1.executeScript("arguments[0].scrollIntoView();", menu1);
menu1.click();
placedMenu.add(menu1.getText());
JavascriptExecutor js2 = (JavascriptExecutor) driver;
menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
js2.executeScript("arguments[0].scrollIntoView();", menu1);
menu1.click();
placedMenu.add(menu1.getText());
checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
driver.findElement(By.xpath(".//button[text()=\"Rs.50.00\"]")).click();

driver.findElement(By.xpath(".//button[text()=\"HA Payment\"]")).click();
driver.findElement(By.xpath(".//input[@id=\"cardInput\"]")).sendKeys("1234");
driver.findElement(By.xpath("(.//span[text()=\"Process\"])[1]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

driver.switchTo().window(tabs.get(1));
driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
Thread.sleep(6000);
driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();

JavascriptExecutor js12 = (JavascriptExecutor) driver;
WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
js12.executeScript("arguments[0].scrollIntoView();", menu2);
menu2.click();
placedMenu.add(menu2.getText());
JavascriptExecutor js13 = (JavascriptExecutor) driver;
menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Milk\"]"));
js13.executeScript("arguments[0].scrollIntoView();", menu2);
menu2.click();
placedMenu.add(menu2.getText());

JavascriptExecutor js14 = (JavascriptExecutor) driver;
menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Buu Buu\"]"));
js14.executeScript("arguments[0].scrollIntoView();", menu2);
menu2.click();
placedMenu.add(menu2.getText());
driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
driver.findElement(By.xpath(".//ion-col[contains(text(),\"HA Payment\")]")).click();
driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
Thread.sleep(1500);
driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
}
driver.switchTo().window(tabs.get(0));

driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
Thread.sleep(5000);
driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
for(int j=1 ;j<=item_count ; j++)	{
	
	JavascriptExecutor js14 = (JavascriptExecutor) driver;
	WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
	js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
	menuName.add(menuitemname.getText());
}
placedMenu.removeAll(menuName);
if(placedMenu.isEmpty()) {
	System.out.println("Menu Available");
		}else {
			System.out.println("Menu not Available");
		}
placedMenu.clear();
menuName.clear();
driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
driver.quit();
}

@Test(priority=8, groups = {"DineIn"})

public void Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment_SideCC_payment() throws Exception {
	login_CashierOut();
	((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/login");
	Thread.sleep(30000);
	driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
	driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(6000);

	for (int i = 0; i < 4; i++){
		driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
		  Thread.sleep(500);
		  }
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(2000);
		
	for(int i=0 ; i<=5 ; i++) {
	driver.switchTo().window(tabs.get(0));
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
	Thread.sleep(1000);
	try {
		driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
	}catch (Exception e) {
		}
	driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
	js.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
	js1.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
	js2.executeScript("arguments[0].scrollIntoView();", menu1);
	menu1.click();
	placedMenu.add(menu1.getText());
	checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	driver.findElement(By.xpath(".//div[text()=\"Side CC\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	
	driver.switchTo().window(tabs.get(1));
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
	driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
	
	JavascriptExecutor js12 = (JavascriptExecutor) driver;
	WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
	js12.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	JavascriptExecutor js13 = (JavascriptExecutor) driver;
	menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Milk\"]"));
	js13.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	
	JavascriptExecutor js14 = (JavascriptExecutor) driver;
	menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Buu Buu\"]"));
	js14.executeScript("arguments[0].scrollIntoView();", menu2);
	menu2.click();
	placedMenu.add(menu2.getText());
	driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
	driver.findElement(By.xpath(".//ion-col[contains(text(),\"Side CC\")]")).click();
	driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	}
	driver.switchTo().window(tabs.get(0));
	
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
	Thread.sleep(5000);
	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
	driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
	for(int j=1 ;j<=item_count ; j++)	{
		
		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
		js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
		menuName.add(menuitemname.getText());
	}
	placedMenu.removeAll(menuName);
	if(placedMenu.isEmpty()) {
		System.out.println("Menu Available");
			}else {
				System.out.println("Menu not Available");
			}
	placedMenu.clear();
	menuName.clear();
	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	driver.quit();
}
@Test(priority=9, groups = {"DineIn"})

public void Browser1_Place_menu_Do_Payment_Browser2_Place_menu_item_Delete_payment() throws Exception {
	login_CashierOut();
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));

	driver.get("https://pre-webpos.lingapos.com/#/auth/login");
Thread.sleep(30000);
driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
Thread.sleep(6000);

for (int i = 0; i < 4; i++){
	driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
	  Thread.sleep(500);
	  }
driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
Thread.sleep(2000);
	
for(int i=0 ; i<=5 ; i++) {
driver.switchTo().window(tabs.get(0));
driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
Thread.sleep(500);
driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
Thread.sleep(1000);
try {
	driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
}catch (Exception e) {
	}
driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
js.executeScript("arguments[0].scrollIntoView();", menu1);
menu1.click();
placedMenu.add(menu1.getText());
JavascriptExecutor js1 = (JavascriptExecutor) driver;
menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
js1.executeScript("arguments[0].scrollIntoView();", menu1);
menu1.click();
placedMenu.add(menu1.getText());
JavascriptExecutor js2 = (JavascriptExecutor) driver;
menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
js2.executeScript("arguments[0].scrollIntoView();", menu1);
menu1.click();
placedMenu.add(menu1.getText());
checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

driver.switchTo().window(tabs.get(1));
driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
Thread.sleep(5000);
driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();

JavascriptExecutor js12 = (JavascriptExecutor) driver;
WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
js12.executeScript("arguments[0].scrollIntoView();", menu2);
menu2.click();
placedMenu.add(menu2.getText());
JavascriptExecutor js13 = (JavascriptExecutor) driver;
menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Milk\"]"));
js13.executeScript("arguments[0].scrollIntoView();", menu2);
menu2.click();
placedMenu.add(menu2.getText());

JavascriptExecutor js14 = (JavascriptExecutor) driver;
menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Buu Buu\"]"));
js14.executeScript("arguments[0].scrollIntoView();", menu2);
menu2.click();
placedMenu.add(menu2.getText());
driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
driver.findElement(By.xpath(".//ion-col[contains(text(),\"Others\")]")).click();
driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
}
driver.switchTo().window(tabs.get(0));

driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
Thread.sleep(5000);
driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
for(int j=1 ;j<=item_count ; j++)	{
	
	JavascriptExecutor js14 = (JavascriptExecutor) driver;
	WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
	js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
	menuName.add(menuitemname.getText());
}
placedMenu.removeAll(menuName);
if(placedMenu.isEmpty()) {
	System.out.println("Menu Available");
		}else {
			System.out.println("Menu not Available");
		}
placedMenu.clear();
menuName.clear();
driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
driver.quit();
}


@Test(priority=10, groups = {"DineIn"})

public void Place_menu_Do_Payment_Finish_CheckOpen_Place_menu_item_Delete_payment() throws Exception {
	login_CashierOut();
	for(int i=0 ; i<=5 ; i++) {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try {
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
		}catch (Exception e) {
			}
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

		driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
		driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
		
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
		js12.executeScript("arguments[0].scrollIntoView();", menu2);
		menu2.click();
		placedMenu.add(menu2.getText());
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Milk\"]"));
		js13.executeScript("arguments[0].scrollIntoView();", menu2);
		menu2.click();
		placedMenu.add(menu2.getText());
		
		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Buu Buu\"]"));
		js14.executeScript("arguments[0].scrollIntoView();", menu2);
		menu2.click();
		placedMenu.add(menu2.getText());
		driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"Others\")]")).click();
		driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

		driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		}
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
	driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
	driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
	for(int j=1 ;j<=item_count ; j++)	{
		
		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
		js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
		menuName.add(menuitemname.getText());
	}
	
	placedMenu.removeAll(menuName);
	if(placedMenu.isEmpty()) {
		System.out.println("Menu Available");
			}else {
				System.out.println("Menu not Available");
			}
	placedMenu.clear();
	menuName.clear();
	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	driver.quit();

}

@Test(priority=11, groups = {"DineIn"})

public void Browser1_Place_menu_Browser2_addSeat_Place_menu_item() throws Exception {
	login_CashierOut();
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));

	driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
	Thread.sleep(30000);
	driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
	driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);

		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			  Thread.sleep(500);
			  }
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		for(int i=0 ; i<=5 ; i++) {

		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try {
		driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
		}catch (Exception e) {
		}
		driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
		driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
		
		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
		js12.executeScript("arguments[0].scrollIntoView();", menu2);
		menu2.click();
		placedMenu.add(menu2.getText());
		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Milk\"]"));
		js13.executeScript("arguments[0].scrollIntoView();", menu2);
		menu2.click();
		placedMenu.add(menu2.getText());
		
		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Buu Buu\"]"));
		js14.executeScript("arguments[0].scrollIntoView();", menu2);
		menu2.click();
		placedMenu.add(menu2.getText());
		driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		}
		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
		driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
		int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		for(int j=1 ;j<=item_count ; j++)	{
			JavascriptExecutor js14 = (JavascriptExecutor) driver;
			WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
			js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
			menuName.add(menuitemname.getText());
		}
		placedMenu.removeAll(menuName);
		if(placedMenu.isEmpty()) {
			System.out.println("Menu Available");
				}else {
					System.out.println("Menu not Available");
				}
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		driver.quit();
}

@Test(priority=12, groups = {"DineIn"})

public void Browser1_Place_menu_activeCheck_Browser2_Place_menu_item_close_Check() throws Exception {
	login_CashierOut();
	((JavascriptExecutor) driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));

	driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
	Thread.sleep(30000);
	driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
	driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(6000);
	
	for (int i = 0; i < 4; i++){
		driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
		Thread.sleep(500);
	}
	driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	Thread.sleep(2000);
	
	for (int j = 0; j < 5; j++){
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		
		driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		menuName.add(checkNo11);
		driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		
		driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();
		
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		WebElement menu7 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
		js6.executeScript("arguments[0].scrollIntoView();", menu7);
		menu7.click();
		String checkNo12 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		placedMenu.add(checkNo12);
		driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		 Thread.sleep(1000);
	}
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

	  
	  	for(int i=0; i<placedMenu.size(); i++){
	  		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(placedMenu.get(i));
	  		Thread.sleep(8000);
	  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+placedMenu.get(i)+"')]")).getText();
	  		closedCheck.add(closedcheckno);
	  	}
	  if(placedMenu.equals(closedCheck)) {
		  System.out.println("All the checks available");
	  }
	  driver.quit();

}
@Test(priority=13, groups = {"DineIn"})

public void Place_menu_Do_hold_Loop() throws Exception {
	login_CashierOut();
 	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
	Thread.sleep(500);
	for(int i = 0; i<5; i++) {
		driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu3);
		menu3.click();
		placedMenu.add(menu3.getText());
		driver.findElement(By.xpath(".//div[contains(@class,\"orderlist-container  highlight\")]/div/div[text()=\"Chai\"]")).click();
		driver.findElement(By.xpath(".//button/label[text()=\"Hold\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Done\"]")).click();

	  
		driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	  	}
	  	driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
	  	try
	  	{
	  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		} catch (Exception e) {
		// Code for Handling exception
		}
	 
	  	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
	  	for(int i=1 ;i<=item_count ; i++)	{
	  		JavascriptExecutor js = (JavascriptExecutor) driver;
	  		WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
	  		js.executeScript("arguments[0].scrollIntoView();", menu3);
	  		menuName.add(menu3.getText());
	  	}
	  	if(menuName.equals(placedMenu)) {
	  		System.out.println("Check Open and Finish - Menu items available - Pass");
	  	}
	  	else {
	  		System.out.println("Check Open and Finish - menu Not available - fail");
	  	}
	  	placedMenu.clear();
	  	menuName.clear();	  
	  	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	  	driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
	  	Thread.sleep(1000);
	  	driver.quit();
		}

@Test(priority=14, groups = {"DineIn"})

public void Browser1_Place_menu_hold_Browser2_menu_sendToKitchen() throws Exception {
	login_CashierOut();
	 ((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);

		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			  Thread.sleep(500);
			  }
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);

		for(int i = 0; i<5; i++) {
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			}catch (Exception e) {
			}
			
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu3);
			menu3.click();
			placedMenu.add(menu3.getText());
			driver.findElement(By.xpath(".//div[contains(@class,\"orderlist-container  highlight\")]/div/div[text()=\"Chai\"]")).click();
			driver.findElement(By.xpath(".//button/label[text()=\"Hold\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Done\"]")).click();

		  
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

		  	}
		  	driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
		  	try
			{
		  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			} catch (Exception e) {
			}
		 
		  	int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		  	for(int i=1 ;i<=item_count ; i++)	{
		  		JavascriptExecutor js = (JavascriptExecutor) driver;
		  		WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
		  		js.executeScript("arguments[0].scrollIntoView();", menu3);
		  		menuName.add(menu3.getText());
		  	}
		  	if(menuName.equals(placedMenu)) {
		  		System.out.println("Check Open and Finish - Menu items available - Pass");
			  	}
		  	else {
		  		System.out.println("Check Open and Finish - menu Not available - fail");
		  	}
		  	placedMenu.clear();
		  	menuName.clear();	  
		  	driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  	driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		  	Thread.sleep(1000);
		  	driver.quit();
			}

@Test(priority=15, groups = {"DineIn"})

public void Browser1_Place_menu_activeCheck_Browser2_Place_menu_item_void_check() throws Exception {
	login_CashierOut();
	 ((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		for (int j = 0; j < 5; j++){
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			Thread.sleep(500);

			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			Thread.sleep(1000);

			driver.switchTo().window(tabs.get(1));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			voidCheck.add(checkNo11);
			
			driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
			driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
			driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		}
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			  System.out.println(voidCheck);
			  System.out.println(afterVoidCheck);

		  
		  	for(int i=0; i<voidCheck.size(); i++){
		  		driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
		  		Thread.sleep(3000);
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(voidCheck.get(i));
		  		Thread.sleep(5000);
		  		String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+voidCheck.get(i)+"')]")).getText();
		  		afterVoidCheck.add(voidcheckno);
		  	}
		  if(voidCheck.equals(afterVoidCheck)) {
			  System.out.println("All the checks available");
		  }
driver.quit();

	 
}

@Test(priority=16, groups = {"DineIn"})

public void Browser1_CreateChecks_TransferAllItem_FromOneTable_To_AnotherTable_Browser2_TransferAllItem_FromOneTable_To_AnotherTable() throws Exception {
	login_CashierOut(); 
	((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		for (int j = 0; j < 5; j++){
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();

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
		String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(itemcheckno1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		}

		int checkSizeTotal = (activeCheck.size()-1);
			for(int j=0; j<checkSizeTotal; j++) {
				if((j%2==0)) {
				driver.switchTo().window(tabs.get(0));
				}else {
				driver.switchTo().window(tabs.get(1));
				}
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
				
			driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/span[contains(.,'"+activeCheck.get(j)+"')]")).click();
			int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
			for(int i=1 ;i<=checkSize ; i++)	{
			driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + i + "]")).click();
			}
			j++;
			driver.findElement(By.xpath("(.//div/span[contains(.,'"+activeCheck.get(j)+"')])[2]")).click();
			driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			Thread.sleep(500);
		  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			j--;
		}
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			String lastCheckNo = activeCheck.get(activeCheck.size()-1);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(lastCheckNo);
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+lastCheckNo+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int i=1 ;i<=item_count2 ; i++)	{
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
				js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
			}
			
			 for(int i=0;i<placedMenu.size();i++) {
		        	for(int j=0; j<menuName.size();j++) {
		        		if(placedMenu.get(i).equals(menuName.get(j))){
		        			menuCheck.add(menuName.get(j));
		        			break;
		        		}
		        			
		        	}

		        }
			if (placedMenu.equals(menuCheck)) {
				System.out.println("Transfer item one by one - Menu items available - Pass");
			  }
			  	else {
			  		System.out.println("Transfer item one by one - fail");
			  	}
			  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
driver.quit();
	 
}

@Test(priority=17, groups = {"DineIn"})

public void Browser1_CreateChecks_Merge_Two_Checks_Browser2_Merge_Two_Checks() throws Exception {
	login_CashierOut();
	 ((JavascriptExecutor) driver).executeScript("window.open()");
	 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	 driver.switchTo().window(tabs.get(1));

	 driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
	 Thread.sleep(30000);
	 driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
	 driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
	 Thread.sleep(6000);
	 
	 for (int i = 0; i < 4; i++){
		 driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
		 Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

	 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	 Thread.sleep(500);
	 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
	 for(int i=1; i<= 5; i++ ) {
		 String tableName= "T";
		 String fullTableName =  tableName.concat(String.valueOf(i));
		 activeCheck.add(fullTableName);
		 driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
		 driver.findElement(By.xpath(".//*[contains(text(),'"+fullTableName+"')]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
		 Thread.sleep(1000);
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
		 String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	 }
	  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	 for(int j=1; j<activeCheck.size(); j++) {
		 if(j%2==0) {
				driver.switchTo().window(tabs.get(0));
		 }
		 else {
				driver.switchTo().window(tabs.get(1));
		 }
		 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();

		 driver.findElement(By.xpath(".//div[text()=\"Merge\"]")).click();
		 driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
		 driver.findElement(By.xpath(".//button/p[contains(.,\"T1 \")]")).click();
		 driver.findElement(By.xpath(".//button/p[text()='"+activeCheck.get(j)+" ']")).click();
		 driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
		 driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
		 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		}	
	 	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
		driver.findElement(By.xpath(".//button/p[contains(.,\"T1 \")]")).click();
		int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		for(int i=1 ;i<=item_count2 ; i++)	{
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
			js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
			menuName.add(menuitemname.getText());
		}
				
		placedMenu.removeAll(menuName);   
		if (placedMenu.isEmpty()) {
			System.out.println("Merge one by one - Menu items available - Pass");
		  }
		  	else {
		  		System.out.println("Check one by one - fail");
		  	}
		  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
driver.quit(); 
}

@Test(priority=18, groups = {"DineIn"})

public void Transfer_server_In_Loop() throws Exception {
	login_CashierOut();
	 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	 Thread.sleep(500);
	 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
	 
	 driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
	 driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
	 driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
	 checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	 driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();

	 int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span")).size();
	 for(int j=1; j<=size; j++) {
		 String FromUserName = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom\")]/ul/div/div/div/span)"+"["+j+"]")).getText();
		 TransferFrom.add(FromUserName);
		 	}
	 System.out.println(TransferFrom);
		

		 
	 String conts = "Shivam 1";
	 int count = 1;
	 for(int k =1; k<TransferFrom.size(); k++) {
		 try {
			 driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			 	}catch(Exception e) {
				 
			 }
			 
			 int index = TransferFrom.indexOf(conts);
			 System.out.println("index"+index);

			 index ++;
			 TransferTo.clear();
			 driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span)"+"["+index+"]")).click();
			 int size1 = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span")).size();
			 for(int s=1; s<=size1; s++) {
				 String ToUserName = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span)"+"["+s+"]")).getText();
				 TransferTo.add(ToUserName);
			 }				 	
			 System.out.println(TransferTo);	
			 driver.findElement(By.xpath(".//div/p[contains(.,'"+checkNo1+"')]")).click();
				for(int m=1; m<= TransferTo.size();m++) {

				WebElement text = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span)"+"["+count+"]"));
				text.click();
				 if(k >= 2) {
					 count ++;
				 }
				conts = text.getText();
				 driver.findElement(By.xpath(".//*[text()=\"Yes\"]")).click();
				  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			 
				break;
				}
		 }
	 driver.quit();
}

@Test(priority=19, groups = {"DineIn"})

public void Transfer_Table_In_Loop() throws Exception {
login_CashierOut();
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	
	driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
	Thread.sleep(500);
	
	driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
	
	  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
	  checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
	  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
	  int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span")).size();
	 
	  for(int j=1; j<size; j++) {
		  try{
		  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		  }
		  catch(Exception e) {
			  
		  }
	  driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom\")]/ul/div/div/div/span)"+"["+j+"]")).click();
		 
	  driver.findElement(By.xpath(".//div/p[contains(.,'"+checkNo1+"')]")).click();
	  driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span)"+"["+j+"]")).click();
	  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
	  }	
	  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
	  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
	 
	  String tableNo = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom\")]/ul/div/div/div/span)"+"["+size+"]")).getText();
	  driver.findElement(By.xpath(".//button[@class=\"cancel\"]")).click();
	  driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
	  driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
	  Thread.sleep(500);

	  driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
	  Thread.sleep(500);

	  String tableName = driver.findElement(By.xpath("(.//tr/td)[1]")).getText();
	  if(tableNo.contains(tableName)) {
			 System.out.println("Check available in :" +tableName);
	  }
	  driver.quit();
	 
}

@Test(priority=20, groups = {"DineIn"})

public void Browser1_Create_100Checks_Browser2_Close_100Check() throws Exception {
	login_CashierOut();
	 ((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/login");
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
			for (int k = 0; k < 100; k++){
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
	        js.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();
	        menuName.add(menu1.getText());
	        
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
	        js1.executeScript("arguments[0].scrollIntoView();", menu2);
	        menu2.click();
	        menuName.add(menu2.getText());

	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
	        js2.executeScript("arguments[0].scrollIntoView();", menu3);
	        menu3.click();
	        menuName.add(menu3.getText());
	        String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	        activeCheck.add(itemcheckno1);
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			Thread.sleep(1000);
			}
			driver.switchTo().window(tabs.get(0));
			for(int m=0;m<activeCheck.size();m++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
			
				driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				try {
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				}catch(Exception e) {
					
				}
				driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				 Thread.sleep(1000);
			}
			
			
		
			driver.switchTo().window(tabs.get(1));

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	
		  
		  	for(int i=0; i<activeCheck.size(); i++){
		  		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
		  		Thread.sleep(8000);
		  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
		  		closedCheck.add(closedcheckno);
		  	}
		  if(activeCheck.equals(closedCheck)) {
			  System.out.println("All the checks available");
		  }
		  driver.quit();
}

@Test(priority=21, groups = {"DineIn"})

public void Browser1_Create_100holdChecks_Browser2_send_100Check_ToKitchen() throws Exception {
	login_CashierOut();
	 ((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
			driver.switchTo().window(tabs.get(0));
			for (int k = 0; k < 100; k++){
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"menuItem-col\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu3);
			menu3.click();
			placedMenu.add(menu3.getText());
			driver.findElement(By.xpath(".//div[contains(@class,\"orderlist-container  highlight\")]/div/div[text()=\"Chai\"]")).click();
			driver.findElement(By.xpath(".//button/label[text()=\"Hold\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Done\"]")).click();

	        String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	        activeCheck.add(itemcheckno1);

	        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			Thread.sleep(1000);
			}
			driver.switchTo().window(tabs.get(1));
			for(int m=0;m<activeCheck.size();m++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//button[text()=\"Hold\"]")).click();
			
				driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				 Thread.sleep(1000);
			}
				
			driver.switchTo().window(tabs.get(0));

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	
		  
		  	for(int i=0; i<activeCheck.size(); i++){
		  		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
		  		Thread.sleep(8000);
		  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
		  		closedCheck.add(closedcheckno);
		  	}
		  if(activeCheck.equals(closedCheck)) {
			  System.out.println("All the checks available");
		  }
		  driver.quit();

}

@Test(priority=22, groups = {"DineIn"})

public void Browser1_Create_100Checks_Browser2_void_100Check() throws Exception {
	login_CashierOut();
	 ((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/");
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
			for (int k = 0; k < 100; k++){
				driver.switchTo().window(tabs.get(1));

				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				
				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		        js.executeScript("arguments[0].scrollIntoView();", menu1);
		        menu1.click();
		        menuName.add(menu1.getText());
		        
		        JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		        js1.executeScript("arguments[0].scrollIntoView();", menu2);
		        menu2.click();
		        menuName.add(menu2.getText());

		        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		        WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		        js2.executeScript("arguments[0].scrollIntoView();", menu3);
		        menu3.click();
		        menuName.add(menu3.getText());
		        String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		        activeCheck.add(itemcheckno1);

		        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				Thread.sleep(1000);
			}
			driver.switchTo().window(tabs.get(0));
			for(int m=0;m<activeCheck.size();m++) {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
				
					driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
					driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
					try {
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
					}catch(Exception e) {
						
					}
					
					driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
				driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
				driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				Thread.sleep(1000);
			}
								
			driver.switchTo().window(tabs.get(0));

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	
		  
		  	for(int i=0; i<activeCheck.size(); i++){
		  		driver.findElement(By.xpath(".//button[contains(text(),\"Void\"])")).click();
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
		  		Thread.sleep(8000);
		  		String Voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
		  		voidCheck.add(Voidcheckno);
		  	}
		  if(activeCheck.equals(voidCheck)) {
			  System.out.println("All the checks available");
		  }
		  driver.quit();
	 
}

@Test(priority=23, groups = {"DineIn"})

public void Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale() throws Exception {
	login_CashierOut(); 
	((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		for (int j = 0; j < 50; j++){
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			Thread.sleep(1000);
			driver.switchTo().window(tabs.get(1));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();
			
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			WebElement menu7 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
			js6.executeScript("arguments[0].scrollIntoView();", menu7);
			menu7.click();
			String checkNo12 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			closedCheck.add(checkNo12);
			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.switchTo().window(tabs.get(0));
				 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					
					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(j));
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(j)+"')]")).click();
					driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
					Thread.sleep(3000);
					driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
					driver.findElement(By.xpath(".//ion-row[@class=\"ng-star-inserted md hydrated\"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
					driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
					driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
					driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					 Thread.sleep(1000);

			 

			 
		}
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  	driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	
		  
			for(int i=0; i<closedCheck.size(); i++){
		  		driver.findElement(By.xpath(".//button[contains(text(),\"Void\"])")).click();
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(i));
		  		Thread.sleep(5000);
		  		String Voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(i)+"')]")).getText();
		  		voidCheck.add(Voidcheckno);
		  	}
		  if(closedCheck.equals(voidCheck)) {
			  System.out.println("All the checks available");
		  }
driver.quit();


}



}
