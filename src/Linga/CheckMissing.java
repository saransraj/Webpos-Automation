package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckMissing {
	static WebDriver driver;
	static String checkNo1;
	static ArrayList<String> menuName= new ArrayList<String>();
	static ArrayList<String> placedMenu= new ArrayList<String>();
	static ArrayList<String> activeCheck= new ArrayList<String>();
	static ArrayList<String> closedCheck= new ArrayList<String>();
	static ArrayList<String> voidCheck= new ArrayList<String>();
	static ArrayList<String> afterActiveCheck= new ArrayList<String>();
	static ArrayList<String> afterClosedCheck= new ArrayList<String>();
	static ArrayList<String> afterVoidCheck= new ArrayList<String>();
	static ArrayList<String> voidMenu= new ArrayList<String>();
	 
			@BeforeTest
			public void login() throws Exception {
				System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Chrome\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://staging-webpos-india.lingapos.com/#/auth/pin");
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
			//Table_change_from_one_table_to_another_table_Check_Available_or_Not
			@Test(priority = 4)
			public void Table_change_from_one_table_to_another_table_Check_Available_or_Not() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

				  driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				  Thread.sleep(500);
				  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				  Thread.sleep(500);
				  driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
				  driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
				  driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

				  JavascriptExecutor js6 = (JavascriptExecutor) driver;
				  WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
				  js6.executeScript("arguments[0].scrollIntoView();", menu2);
				  menu2.click();
				  placedMenu.add(menu2.getText());
				  
				  JavascriptExecutor js7 = (JavascriptExecutor) driver;
				  menu2 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
				  js7.executeScript("arguments[0].scrollIntoView();", menu2);
				  menu2.click();
				  placedMenu.add(menu2.getText());

				  JavascriptExecutor js8 = (JavascriptExecutor) driver;
				  menu2 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
				  js8.executeScript("arguments[0].scrollIntoView();", menu2);
				  menu2.click();	
				  placedMenu.add(menu2.getText());

				  String checkNo5 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			        
				  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
				  Thread.sleep(500);
				  driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				  Thread.sleep(500);
				  driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				  Thread.sleep(500);
				  driver.findElement(By.xpath(".//*[text()=\"T4 \"]")).click();
				  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath(".//*[text()=\"T4 \"]")).click();
				  
				  String checkNo6 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				  if(checkNo5.equals(checkNo6)) {
					  System.out.println("Table change from T3 to T4 - Check Available - Pass");
					}	
				  else {
						System.out.println("Table change from T3 to T4 - Check not Available - Fail");

					}
				}
					
					//Table_change_from_one_table_to_another_table_Menu_Available_or_Not
					@Test(priority=5)
					public static void Table_change_from_one_table_to_another_table_Menu_Available_or_Not() throws InterruptedException {

				  int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  for(int i=1 ;i<=item_count ; i++)	{
					  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
					  menuName.add(menuitemname);
					  		  }
				  if(menuName.equals(placedMenu)) {
					  System.out.println("Table change from T3 to T4 - Menu items available - Pass");
					  	}
				  else {
						 System.out.println("Table change from T3 to T4 - menu not available - fail");
					 }
				  
				  placedMenu.clear();
				  menuName.clear();
						
				  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
				  Thread.sleep(1000);
			}
			//Check_Open_and_Finish_Loop_Check_Available_Or_Not
			@Test(priority = 6)
			public void Check_Open_and_Finish_Loop_Check_Available_Or_Not() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);
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

				  this.checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				  }
				  driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				  String checkNo8 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				  if(checkNo1.equals(checkNo8)) {
					  System.out.println("Check Open and Finish - Check available - Pass");
					}
				  else {
						System.out.println("Check Open and Finish - Check not Available - Fail");

					}
				}
					
					//Check_Open_and_Finish_Loop_Menu_Available_Or_Not
					@Test(priority=7)
					public static void Check_Open_and_Finish_Loop_Menu_Available_Or_Not() throws InterruptedException {
						int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  for(int i=1 ;i<=item_count ; i++)	{
					  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
					  menuName.add(menuitemname);
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

			}	
			//Single_table_multiple_checks_Check_Available_or_Not
			@Test(priority = 8)
			public void Single_table_multiple_checks_Check_Available_or_Not() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
				js.executeScript("arguments[0].scrollIntoView();", menu1);
				menu1.click();
				String checkNo9 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				activeCheck.add(checkNo9);
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
					 
				JavascriptExecutor js9 = (JavascriptExecutor) driver;
				WebElement menu4 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
				js9.executeScript("arguments[0].scrollIntoView();", menu4);
				menu4.click();
				String checkNo10 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				activeCheck.add(checkNo10);

				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

				JavascriptExecutor js6 = (JavascriptExecutor) driver;
				WebElement menu7 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
				js6.executeScript("arguments[0].scrollIntoView();", menu7);
				menu7.click();

				String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				activeCheck.add(checkNo11);

				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
				String checkNo12 = driver.findElement(By.xpath(".//div/p[contains(.,'"+checkNo9+"')]")).getText();
				afterActiveCheck.add(checkNo12);
				String checkNo13 = driver.findElement(By.xpath(".//div/p[contains(.,'"+checkNo10+"')]")).getText();
				afterActiveCheck.add(checkNo13);
				String checkNo14 = driver.findElement(By.xpath(".//div/p[contains(.,'"+checkNo11+"')]")).getText();
				afterActiveCheck.add(checkNo14);

				if(activeCheck.equals(afterActiveCheck)) {
					System.out.println("Single table multiple checks - Pass");
				}else {
					 System.out.println("Single table multiple checks - fail");
				 }
				
				activeCheck.clear();
				afterActiveCheck.clear();
				driver.findElement(By.xpath("(.//linga-icon[@class=\"linga-icon linga-icon--color--icon-white linga-icon--size--small\"])[9]")).click();
				driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
			}
			
			//Create_active_check_closed_check_active_check_Loop_Check_Available_or_Not
			@Test(priority = 9)
			public void Create_active_check_closed_check_active_check_Loop_Check_Available_or_Not() throws InterruptedException {
				for (int j = 0; j < 2; j++){
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
					activeCheck.add(checkNo11);
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
						
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					Thread.sleep(1000);

					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
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
				}	
				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				  for(int i=0; i<activeCheck.size(); i++){
					  driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
					  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
					  String activecheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
					  afterActiveCheck.add(activecheckno);
					  
					 			  }
				  
				  for(int i=0; i<closedCheck.size(); i++){
					  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
					  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(i));
					  String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(i)+"')]")).getText();
					  afterClosedCheck.add(closedcheckno);
					  
					 			  }
				  if(afterActiveCheck.equals(activeCheck)&& afterClosedCheck.equals(closedCheck)) {
					  System.out.println("Make active checks, closed check, active checks - Check Available - Pass");
				  }
				  else {
						 System.out.println("Make active checks, closed check, active checks - Check Not available - fail");
					 }
				  afterActiveCheck.clear();
				  afterClosedCheck.clear();
				  activeCheck.clear();
				  closedCheck.clear();
				  driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();

			}
			//Create_multiple_checks_with_different_category_Loop_Check_available_or_Not
			@Test(priority = 10)
			public void Create_multiple_checks_with_different_category_Loop_Check_available_or_Not() throws InterruptedException {
				for (int j = 0; j < 2; j++){
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
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
				 
					String number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					activeCheck.add(number);
				 	 
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
				  
					JavascriptExecutor js3 = (JavascriptExecutor) driver;
					WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
					js3.executeScript("arguments[0].scrollIntoView();", menu2);
					menu2.click();
					placedMenu.add(menu2.getText());
				  			        
					JavascriptExecutor js4 = (JavascriptExecutor) driver;
					menu2 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
					js4.executeScript("arguments[0].scrollIntoView();", menu2);
					menu2.click();
					placedMenu.add(menu2.getText());

					JavascriptExecutor js5 = (JavascriptExecutor) driver;
					menu2 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
					js5.executeScript("arguments[0].scrollIntoView();", menu2);
					menu2.click();
					placedMenu.add(menu2.getText());

					number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					activeCheck.add(number);
				  
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"T10 \"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

					JavascriptExecutor js6 = (JavascriptExecutor) driver;
					WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
					js6.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText());
			        
					JavascriptExecutor js7 = (JavascriptExecutor) driver;
					menu3 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
					js7.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText());
			        
					JavascriptExecutor js8 = (JavascriptExecutor) driver;
					menu3 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
					js8.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText());
			  
					number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					activeCheck.add(number);
			        
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					Thread.sleep(1000);

			}
				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

				  for(int i=0; i<activeCheck.size(); i++){
					  driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
					  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
					  driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
					  driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
					  int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
					  for(int j=1 ;j<=item_count ; j++)	{
						  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
						  menuName.add(menuitemname);
						  		  }
						
					  String activecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					  afterActiveCheck.add(activecheckno);
					  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();

					 			  }
				if(afterActiveCheck.equals(activeCheck)) {
					System.out.println("Create multiple checks with different category - Check Available - Pass");
				  }
				else {
					  System.out.println("Create multiple checks with different category - Check Not Available - Fail");
				}
			}
				//Create_multiple_checks_with_different_category_Loop_Mneu_available_or_Not
				@Test(priority =11)
				public void Create_multiple_checks_with_different_category_Loop_Menuu_available_or_Not() throws InterruptedException {
				if(placedMenu.equals(menuName)) {
					  System.out.println("Create multiple checks with different category - item Available - Pass");
				  }
				else {
					 System.out.println("Create multiple checks with different category - menu not available - fail");
				 }
				placedMenu.clear();
				menuName.clear();
				activeCheck.clear();
				afterActiveCheck.clear();
				driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
			}
						 	
				//Create_activecheck_closedcheck_VoidCheck_Loop_Check_Available_or_Not
			@Test(priority = 12)
			public void Create_activecheck_closedcheck_VoidCheck_Loop_Check_Available_or_Not() throws InterruptedException {
				for (int j = 0; j < 2; j++){
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					  
					driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"T11 \"]")).click();
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
					String number = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					activeCheck.add(number);
				 
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"T12 \"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();

					JavascriptExecutor js3 = (JavascriptExecutor) driver;
					WebElement menu4 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
					js3.executeScript("arguments[0].scrollIntoView();", menu4);
					menu4.click();
			        
					JavascriptExecutor js4 = (JavascriptExecutor) driver;
					WebElement menu5 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
					js4.executeScript("arguments[0].scrollIntoView();", menu5);
					menu5.click();
			        
					JavascriptExecutor js5 = (JavascriptExecutor) driver;
					WebElement menu6 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
					js5.executeScript("arguments[0].scrollIntoView();", menu6);
					menu6.click();
					String number1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					closedCheck.add(number1);
					driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
				  
					driver.findElement(By.xpath(".//*[text()= \"New Check\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"T13 \"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
				  
					JavascriptExecutor js12 = (JavascriptExecutor) driver;
					WebElement menu11 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
					js12.executeScript("arguments[0].scrollIntoView();", menu11);
					menu11.click();
				  
					JavascriptExecutor js13 = (JavascriptExecutor) driver;
					WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
					js13.executeScript("arguments[0].scrollIntoView();", menu12);
					menu12.click();
				  
					JavascriptExecutor js14 = (JavascriptExecutor) driver;
					WebElement menu13 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
					js14.executeScript("arguments[0].scrollIntoView();", menu13);
					menu13.click();
					String number3 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
					voidCheck.add(number3);
					driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
					driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
					driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");
					driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					Thread.sleep(1000);
				}	
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					for(int i=0; i<activeCheck.size(); i++){
						driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
						driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
						driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
						driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
						int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
						for(int j=1 ;j<=item_count ; j++)	{
							String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
							menuName.add(menuitemname);
						}
							
						String activecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
						afterActiveCheck.add(activecheckno);
						driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					 			  }
					for(int i=0; i<closedCheck.size(); i++){
						driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(i));
						String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(i)+"')]")).getText();
						afterClosedCheck.add(closedcheckno);
					}
					for(int i=0; i<voidCheck.size(); i++){
						driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
						driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(voidCheck.get(i));
						String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+voidCheck.get(i)+"')]")).getText();
						afterVoidCheck.add(voidcheckno);
					}
					if(afterActiveCheck.equals(activeCheck)&& (afterClosedCheck.equals(closedCheck))&&(afterVoidCheck.equals(voidCheck))) {
						System.out.println("Create active check_closedcheck_VoidCheck - Check Available - Pass");
				  }
				  else {
					  	System.out.println("Create active check_closedcheck_VoidCheck - Check not Available - fail");
				  }
			}
			//Create_activecheck_closedcheck_VoidCheck_Loop_Menu_Available_or_Not
			@Test(priority = 13)
			public void Create_activecheck_closedcheck_VoidCheck_Loop_Menu_Available_or_Not() throws InterruptedException {
							
				if(placedMenu.equals(menuName)) {
					  System.out.println("Create active check_closedcheck_VoidCheck - item Available - Pass");
				  }
				else {
					 System.out.println("Create active check_closedcheck_VoidCheck - menu not available - fail");
					 
				 }
				placedMenu.clear();
				menuName.clear();
				activeCheck.clear();
				closedCheck.clear();
				afterActiveCheck.clear();
				afterClosedCheck.clear();
				voidCheck.clear();
				afterVoidCheck.clear();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				
			}
			//Placemenu_Finish_Placemenu_finish_syncCheck_opencheck_Menu_Availabe_Or_Not
			@Test(priority = 14)
			public void Placemenu_Finish_Placemenu_finish_syncCheck_opencheck_Menu_Availabe_Or_Not() throws InterruptedException {
				
				 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				 driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath(".//*[text()=\"T14 \"]")).click();
				 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
				 js.executeScript("arguments[0].scrollIntoView();", menu1);
				 menu1.click();
				 placedMenu.add(menu1.getText());
				 
				 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				 WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
				 js1.executeScript("arguments[0].scrollIntoView();", menu2);
				 menu2.click();
				 placedMenu.add(menu2.getText());
				 
				 JavascriptExecutor js2 = (JavascriptExecutor) driver;
				 WebElement menu3 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
				 js2.executeScript("arguments[0].scrollIntoView();", menu3);
				 menu3.click();
				 placedMenu.add(menu3.getText());
				 Thread.sleep(1500);
				 
				 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//button/p[text()=\"T14 \"]")).click();
				 Thread.sleep(1000);
				 JavascriptExecutor js4 = (JavascriptExecutor) driver;
				 WebElement menu4 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
				 js.executeScript("arguments[0].scrollIntoView();", menu4);
				 menu4.click();
				 placedMenu.add(menu4.getText());
				 
				 JavascriptExecutor js5 = (JavascriptExecutor) driver;
				 WebElement menu5 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
				 js1.executeScript("arguments[0].scrollIntoView();", menu5);
				 menu5.click();
				 placedMenu.add(menu5.getText());
				 
				 JavascriptExecutor js6 = (JavascriptExecutor) driver;
				 WebElement menu6 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
				 js2.executeScript("arguments[0].scrollIntoView();", menu6);
				 menu6.click();
				 placedMenu.add(menu6.getText());
				 
				 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//button/linga-icon[@symbol=\"sync\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//button[text()=\"Cancel\"]")).click();
				 driver.findElement(By.xpath(".//button/p[text()=\"T14 \"]")).click();
				 Thread.sleep(1000);
				 int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				 for(int j=1 ;j<=item_count ; j++)	{
					 String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]")).getText();
					 menuName.add(menuitemname);
					 
				 }
				 if(menuName.equals(placedMenu)) {
					 System.out.println("Placemenu_Finish_Placemenu_finish_syncCheck_opencheck - menu available - pass");
					 
				 }
				 else {
					 System.out.println("Placemenu_Finish_Placemenu_finish_syncCheck_Opencheck - menu available - fail");
					 
				 }
				 placedMenu.clear();
				 menuName.clear();
				 driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				 		 
			}	
			//transfersingle_multiitem
			@Test(priority = 15)
			public static void transfer_single_multiitem_Menu_Available_Or_Not() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T15 \"]")).click();
				Thread.sleep(2000);
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
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T16 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				Thread.sleep(2000);
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
				String itemcheckno2 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//div/span[contains(.,'"+itemcheckno1+"')]")).click();
				driver.findElement(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]/p[text()=\"Chai \"]")).click();
				driver.findElement(By.xpath("(.//div/span[contains(.,'"+itemcheckno2+"')])[2]")).click();
				driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
				driver.findElement(By.xpath(".//button/p[text()=\"T15 \"]")).click();
				int item_count1 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				for(int i=1 ;i<=item_count1 ; i++)	{
					String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
					menuName.add(menuitemname);
				}
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				Thread.sleep(500);
				
				driver.findElement(By.xpath(".//button/p[text()=\"T16 \"]")).click();
				int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				for(int i=1 ;i<=item_count2 ; i++)	{
					String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
					menuName.add(menuitemname);
				}
				placedMenu.removeAll(menuName);   
				if (placedMenu.isEmpty()) {
					System.out.println("Transfersingleitem - Menu items available - Pass");
				}
				else {
					System.out.println("Transfersingleitem - fail");
				}
				placedMenu.clear();
				menuName.clear();
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
				
			}
			
			//Transfer_allitem_from_one_table_to_another_table
			@Test(priority = 16)
			public static void Transfer_allitem_from_one_table_to_another_table_Menu_Available_or_Not() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

				driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
				Thread.sleep(2000);
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
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				Thread.sleep(2000);
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
				String itemcheckno2 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				Thread.sleep(1000);
				
				  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
				  driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath(".//div/span[contains(.,'"+itemcheckno1+"')]")).click();
				  int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
					 for(int i=1 ;i<=checkSize ; i++)	{
					driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + i + "]")).click();
					  		  }
				  driver.findElement(By.xpath("(.//div/span[contains(.,'"+itemcheckno2+"')])[2]")).click();
				  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
				  driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
				  Thread.sleep(500);
				  driver.findElement(By.xpath(".//button/p[text()=\"T2 \"]")).click();
				  int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
					 for(int i=1 ;i<=item_count2 ; i++)	{
						  String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
					  menuName.add(menuitemname);
					  		  }
					 placedMenu.removeAll(menuName);   
					  if (placedMenu.isEmpty()) {
						  System.out.println("Transferallitem - Menu items available - Pass");
					  }
					  else {
							 System.out.println("Transferallitem - fail");
						 }
					  placedMenu.clear();
					  menuName.clear();
					  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
					  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			}
			
			//Merge_Three_checks_Menu_item_Available
			@Test(priority = 17)
			public static void Merge_Three_checks_Menu_item_Available_Or_Not() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
				Thread.sleep(2000);
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
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T4 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				Thread.sleep(2000);
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
				Thread.sleep(1500);

				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();
				
				JavascriptExecutor js6 = (JavascriptExecutor) driver;
				WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
				js6.executeScript("arguments[0].scrollIntoView();", menu3);
				menu3.click();
				placedMenu.add(menu3.getText());
					
				JavascriptExecutor js7 = (JavascriptExecutor) driver;
				menu3 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
				js7.executeScript("arguments[0].scrollIntoView();", menu3);
				menu3.click();
				placedMenu.add(menu3.getText());
				
				JavascriptExecutor js8 = (JavascriptExecutor) driver;
				menu3 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
				js8.executeScript("arguments[0].scrollIntoView();", menu3);
				menu3.click();
				placedMenu.add(menu3.getText());
				Thread.sleep(1500);

				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				Thread.sleep(1000);
				
				
				driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T4 \"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
				driver.findElement(By.xpath(".//button/p[text()=\"T3 \"]")).click();
				int item_count2 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				for(int i=1 ;i<=item_count2 ; i++)	{
					String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
					menuName.add(menuitemname);
				}
				if(menuName.equals(placedMenu)) {
					System.out.println("Merge - Menu items available - Pass");
				}
				else {
					System.out.println("Merge - menu available - fail");
				}
				placedMenu.clear();
				menuName.clear();
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
			//CheckReopen_Menu_Available_Or_Not
			@Test(priority = 18)
			private static void CheckReopen_Menu_Available_Or_Not() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
				Thread.sleep(2000);
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
				String checkreopen = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();

				driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();

				driver.findElement(By.xpath(".//*[text()= \"Closed\"]")).click();
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkreopen);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkreopen+"')]")).click();		
				driver.findElement(By.xpath(".//*[text()= \" Re-open Check \"]")).click();
				Thread.sleep(1000);
				String checkreopen1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();

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

					}
			//Create_multiple_seat_with_different_category_menu_availabe_or_Not
			@Test(priority = 18)
			public static void Create_multiple_seat_with_different_category_menu_availabe_or_Not() throws InterruptedException {
				for (int j = 0; j < 2; j++){
					driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

					driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
					Thread.sleep(500);
					driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					try
					{
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

					} catch (Exception e) {
					}
					try {
						driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
						driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
					}catch (Exception e) {
						driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
						}
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
					Thread.sleep(1000);

					checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					try
					{
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

					} catch (Exception e) {
					// Code for Handling exception
					}
					driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
				  
					JavascriptExecutor js3 = (JavascriptExecutor) driver;
					WebElement menu2 = driver.findElement(By.xpath(".//*[text()= \"Retail\"]"));
					js3.executeScript("arguments[0].scrollIntoView();", menu2);
					menu2.click();
					placedMenu.add(menu2.getText());
				  			        
					JavascriptExecutor js4 = (JavascriptExecutor) driver;
					menu2 = driver.findElement(By.xpath(".//*[text()= \"Milk\"]"));
					js4.executeScript("arguments[0].scrollIntoView();", menu2);
					menu2.click();
					placedMenu.add(menu2.getText());

					JavascriptExecutor js5 = (JavascriptExecutor) driver;
					menu2 = driver.findElement(By.xpath(".//*[text()= \"Buu Buu\"]"));
					js5.executeScript("arguments[0].scrollIntoView();", menu2);
					menu2.click();
					placedMenu.add(menu2.getText());
					Thread.sleep(1000);

					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
					try
					{
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

					} catch (Exception e) {
					// Code for Handling exception
					}
					driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();

					JavascriptExecutor js6 = (JavascriptExecutor) driver;
					WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
					js6.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText());
			        
					JavascriptExecutor js7 = (JavascriptExecutor) driver;
					menu3 = driver.findElement(By.xpath(".//*[text()= \"Onion pizza\"]"));
					js7.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText());
			        
					JavascriptExecutor js8 = (JavascriptExecutor) driver;
					menu3 = driver.findElement(By.xpath(".//*[text()= \"Chicken\"]"));
					js8.executeScript("arguments[0].scrollIntoView();", menu3);
					menu3.click();
					placedMenu.add(menu3.getText()); 
					Thread.sleep(1000);

					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					Thread.sleep(1000);
					}
				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				  driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
				  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
				  driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
				  driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
				  try
					{
						driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

					} catch (Exception e) {
					}
				  int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  for(int j=1 ;j<=item_count ; j++)	{
					  JavascriptExecutor js = (JavascriptExecutor) driver;
					  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
					  js.executeScript("arguments[0].scrollIntoView();", menuitemname);
					  menuName.add(menuitemname.getText());
				  }
				  
				  if(placedMenu.equals(menuName)) {
					  System.out.println("Create multiple seat with different category - item Available - Pass");
				  	}
				  else {
					 System.out.println("Create multiple seat with different category - menu not available - fail");
				  }
				placedMenu.clear();
				menuName.clear();
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
					
			}
			
			//Place_menu_finish_check_open_void_2_menu_finish_check_open_check_menu
			@Test(priority = 19)
			public static void Place_menu_finish_check_open_void_2_menu_finish_check_open_check_menu() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				}
				try {
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				}catch (Exception e) {
					}
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
				Thread.sleep(1000);

				checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  for(int j=1 ;j<item_count ; j++)	{
					  JavascriptExecutor js4 = (JavascriptExecutor) driver;
					  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
					  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
					  menuitemname.click();
					  voidMenu.add(menuitemname.getText());
				  }
				  placedMenu.removeAll(voidMenu);
				driver.findElement(By.xpath("(.//button[@class=\"menu-option-content-button\"])[3]")).click();
				driver.findElement(By.xpath(".//div/textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");

				driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				int item_count1 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  for(int j=1 ;j<=item_count1 ; j++)	{
					  JavascriptExecutor js4 = (JavascriptExecutor) driver;
					  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
					  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
					  menuName.add(menuitemname.getText());
				  }
				  menuName.removeAll(placedMenu);
				  
				  if(voidMenu.equals(menuName)) {
					  System.out.println("Place_menu_finish_check_open_void_2_menu_finish_check_open_check_menu - Pass");
				  	}
				  else {
					 System.out.println("Place_menu_finish_check_open_void_2_menu_finish_check_open_check_menu - fail");
				  }
				placedMenu.clear();
				menuName.clear();
				voidMenu.clear();
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
		
			}
			//Place_menu_finish_check_open_void_2_menu_closesale_check_Reopen_check_menu
			@Test(priority = 20)
			public static void Place_menu_finish_check_open_void_2_menu_closesale_check_Reopen_check_menu() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				try {
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				}catch (Exception e) {
					driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
					}
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
			 
				checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
				int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  for(int j=1 ;j<item_count ; j++)	{
					  JavascriptExecutor js4 = (JavascriptExecutor) driver;
					  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
					  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
					  menuitemname.click();
					  voidMenu.add(menuitemname.getText());
				  }
				  placedMenu.removeAll(voidMenu);
				
				driver.findElement(By.xpath("(.//button[@class=\"menu-option-content-button\"])[3]")).click();
				driver.findElement(By.xpath(".//div/textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");

				driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
				driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Re-open Check \"]")).click();
				Thread.sleep(5000);
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				int item_count1 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				for(int j=1 ;j<=item_count1 ; j++)	{
					JavascriptExecutor js4 = (JavascriptExecutor) driver;
					WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
					js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
					menuName.add(menuitemname.getText());
				  }
				 menuName.removeAll(placedMenu);
				  
				 if(voidMenu.equals(menuName)) {
					  System.out.println("Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu - Pass");
				  	}
				  else {
					 System.out.println("Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu - fail");
				  }
				placedMenu.clear();
				menuName.clear();
				voidMenu.clear();
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();

			}
			
			//Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu
			@Test(priority = 21)
			public static void Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu() throws InterruptedException {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"T10 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				// Code for Handling exception
				}
				try {
					driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
					driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
				}catch (Exception e) {
					driver.findElement(By.xpath(".//button[text()=\" + \"]")).click();
					}
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
			 
				checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		 	 
				driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Re-open Check \"]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
				driver.findElement(By.xpath("(.//ion-col[@class=\"md hydrated\"])[5]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

				int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				  for(int j=1 ;j<item_count ; j++)	{
					  JavascriptExecutor js4 = (JavascriptExecutor) driver;
					  WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
					  js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
					  menuitemname.click();
					  voidMenu.add(menuitemname.getText());
				  }
				  placedMenu.removeAll(voidMenu);
				driver.findElement(By.xpath("(.//button[@class=\"menu-option-content-button\"])[3]")).click();
				driver.findElement(By.xpath(".//div/textarea[contains(@class,\"mat-input-element\")]")).sendKeys("Saran");

				driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
				driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
				Thread.sleep(1000);

				driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
				driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
				driver.findElement(By.xpath(".//button[text()=\" Re-open Check \"]")).click();
				Thread.sleep(5000);
				int item_count1 = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
				for(int j=1 ;j<=item_count1 ; j++)	{
					JavascriptExecutor js4 = (JavascriptExecutor) driver;
					WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
					js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
					menuName.add(menuitemname.getText());
				  }
				 menuName.removeAll(placedMenu);
				  
				 if(voidMenu.equals(menuName)) {
					  System.out.println("Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu - Pass");
				  	}
				  else {
					 System.out.println("Place_menu_closesale_check_reopen_void_2_menu_closesale_check_Reopen_check_menu - fail");
				  }
				placedMenu.clear();
				menuName.clear();
				voidMenu.clear();
				driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
				driver.findElement(By.xpath(".//*[text()=\" QSR \"]")).click();
			}
			

}
