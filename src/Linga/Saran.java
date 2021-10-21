package Linga;

import java.sql.Date;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Saran {
	static WebDriver driver;
	static String checkNo1;

	static ExtentReports rep = ExtentManager.getInstance();
	static ExtentTest test = rep.startTest("Test Run");
	static ArrayList<String> placedMenu= new ArrayList<String>();
	static ArrayList<String> menuName= new ArrayList<String>();
	static ArrayList<String> item= new ArrayList<String>();
	static ArrayList<String> menuItem= new ArrayList<String>();
	static ArrayList<String> itemName= new ArrayList<String>();
	static ArrayList<String> activeCheck= new ArrayList<String>();
	static ArrayList<String> closedCheck= new ArrayList<String>();
	static ArrayList<String> voidCheck= new ArrayList<String>();
	static ArrayList<String> TransferFrom= new ArrayList<String>();
	static ArrayList<String> TransferTo= new ArrayList<String>();
	static ArrayList<String> Payments= new ArrayList<String>();

	public void flushTest() throws Exception
	{
		Thread.sleep(2000);
		rep.endTest(test);
		rep.flush();
	}
	
	public static void main(String[] args) throws Throwable  {
		// Login call = new Login();
		// call.loginAndCashier();

			System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Utility.getProperty("Staging_India_Url"));
			Thread.sleep(15000);
			try {
	    		driver.findElement(By.xpath(".//button[text()=\"Sign In\"]")).click();
			} catch (Exception e) {
			}
			driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Staging_Store_id"));
			driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Staging_Store_password"));
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(10000);
			for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
			}
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(2000);
//			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
//			driver.findElement(By.xpath(".//linga-icon[@symbol=\"operations\"][1]")).click();
//			driver.findElement(By.xpath(".//label[text()=\"Close Day\"]")).click();
//			driver.findElement(By.xpath(".//button/span[text()=\"Close All Cashiers\"]")).click();
//			try
//			{
//				driver.findElement(By.xpath(".//button/span[text()=\"Cash\"]")).click();
//				Thread.sleep(8000);
//			} catch (Exception e) {
//				Thread.sleep(5000);
//			}
//			driver.findElement(By.xpath(".//linga-icon[@symbol=\"menu-icon\"]")).click();
//			driver.findElement(By.xpath(".//label[text()=\"POS\"]")).click();
//			
			// Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale();
			// Place_Menu_Split_item_SeatWise();
			// Place_Menu_Split_item_Groupseat();
			// Place_Menu_SplitEvenly();
			// Place_Menu_SeparateItem();
			// Browser1_placeMenu_Browser2_opensameCheck_PlaceMenu_afterloop_Finish();
			// Browser1_placeMenu_TaxExempt_activecheck_Browser2_Placemenu_ServiceExempt_closeCheck();
			// Browser1_placeMenu_Finish_Browser2_CheckInOpen_Browser1_CheckClose_Browser2_ClickDone();
			// Browser1_placeMenu_Finish_Browser2_CheckInOpen_Browser1_voidCheck_Browser2_ClickDone();
			// Browser1_placeMenu_PartialPay_Browser2_CheckInOpen_Complete_payment_Browser1_ClickDone();
			// Browser1_PlaceMenu_Finish_Browser2_PlaceMenu_Finish();
			// Browser1_PlaceMenu_Finish_Browser2_syncCheck_PlaceMenu_Finish();
			// Browser1_syncCheck_activeCheck_Browser2_syncCheck_closeCheck();
			// Browser1_holdCheck_Browser2_activeCheck_Browser1_closeCheck_Browser2_reopenCheck_VoidCheck();
			//Browser1_CreateChecks_Transfercheck_FromOneTable_To_AnotherTable_Browser2_Transfercheck_FromOneTable_To_AnotherTable();
			// Browser1_CreateChecks_Transfercheck_FromOneserver_To_Anotherserver_Browser2_Transfercheck_FromOneserver_To_Anotherserver();
			// Browser1_Create_50holdCheck_Browser2_Send_all_the_Hold_ChecktoKitchen_Browser1_closeAllTheCheck_Browser2_reopenAllTheCheck_VoidAllTheCheck();
			//Browser1_Create_50Checks_Browser2_Merge_All_the_Checks();
			// Browser1_Create_50Checks_Browser2_Transfer_menu_from_oneTable_to_another();
			// Browser1_Create40plusChecks_Browser2_Merge_byTwo_Two_Checks();
			// Browser1_CreateActiveChecks_Browser2_Transfercheck_FromOneTable_To_AnotherTable();
			// Create_and_Close_QSR_Check_In_loop();
			// Browser1_CreateActiveChecksInSingleTable_Browser2_TransferAllThecheck_ToDifferentTableInFloor2();
			// Create_50Check_Merge_two_Checks_and_closeIt_Loop();
			// Create_50Check_Transfer_allTheMenuFromOneCheckToAnotherCheck_and_closeIt_Loop();
			// Create_50Check_Transfer_CheckFromOneTableToAnotherTable_and_closeIt_Loop();
			// Create_50Checks_Merge_All_the_Checks_Transfer_merged_CheckFromOneServerToAnotherServer();
			// Create_50Checks_Merge_All_the_Checks_Transfer_merged_CheckFromOneTableToAnotherTable();
			// CreateActiveChecks_Transfercheck_FromOneTable_To_AnotherTable_AndMerge_All_Checks();
			// Browser1_Create_multipleActiveChecks_Browser2_Merge_two_Checks_and_closeIt_Loop_Browser1_ClosedChecksAreAvailableOrNot();
			// Create_TwoCheck_MergeIt_Again_Create_Check_MergeItWithAlreadyCreatedCheck();
			// Browser1_Create_50Check_Browser2_Transfer_allTheMenuFromOneCheckToAnotherCheck_and_closeIt_LoopBrowser1_ClosedChecksAreAvailableOrNot();
			// Browser1_Create_50Check_Browser2_Transfer_CheckFromOneTableToAnotherTable_and_closeIt_Loop_Browser1_ClosedChecksAreAvailableOrNot();
			// Browser1_Create_50Checks_Browser2_Merge_All_the_Checks_Bowser1_Transfer_merged_CheckFromOneServerToAnotherServer();
			// Browser1_Create_50Checks_Browser2_Merge_All_the_Checks_Browser1_Transfer_merged_CheckFromOneTableToAnotherTable();
			// Browser1_CreateActiveChecks_Browser2_Transfercheck_FromOneTable_To_AnotherTable_Browser1_Merge_All_Checks();
			// Browser1_Create_TwoCheck_MergeIt_Browser2_Create_Check_MergeItWithAlreadyCreatedCheck();
			// Place_menu_Do_payment_OpenSameCheck_PlaceMenu_Do_Payment();
			// Place_menu_Do_payment_OpenSameCheck_PlaceMenu_DeletePayment_Do_Payment();
			// Browser1_Place_menu_Do_payment_Browser2_OpenSameCheck_PlaceMenu_DeletePayment_Do_Payment();
			// CreateCheck_TransfertablefromOnetableToAnotherTable_Create_Check_MergeBoththeCheck_Loop();
			// CreateCheck_TransferitemfromOnetableToAnotherTable_Create_Check_MergeBoththeCheck_Loop();
			// Create_Two_Check_merge_both_the_ChecksAndCloseIt();
			// Browser1_CreateCheck_Browser2_TransfertablefromOnetableToAnotherTable_Browser1_Create_Check_MergeBoththeCheck_Loop();
			// Browser1_CreateCheck_Browser2_TransferitemfromOnetableToAnotherTable_Browser1_Create_Check_MergeBoththeCheck_Loop();
			// Create_Two_CheckWithPayment_merge_both_the_ChecksAndCloseIt();
			// Create_Two_CheckWithTaxExempt_merge_both_the_ChecksAndCloseIt();
			// Create_Two_CheckWithServiceExempt_merge_both_the_ChecksAndCloseIt();
			// Create_TwoCheck_TransferAllTheMenuFromOneTableToAnotherTable2_OpenTransferredTableAndCloseTheCheck();
			// Browser1_Create_Two_CheckWithPayment_Browser2_merge_both_the_ChecksAndCloseItInBrowser1();
			// Browser1_Create_Two_CheckWithTaxExempt_Browser2_merge_both_the_ChecksAndCloseItBrowser1();
			// Browser1_create_Two_checksWithServiceExempt_Browser2_merge_both_the_ChecksAndCloseIt();
			// Browser1_Create_TwoCheck_Browser2_TransferAllTheMenuFromOneTableToAnotherTable2_Browser1_OpenTransferredTableAndCloseTheCheck();
			// Create_ActiveCheck_TransferTable_Create_ActiveCheck_TransferMenuItem_inLoop();
			// Create_TwoActiveCheck_MergeBothChecks_Again_Create_TwoActiveCheck_MergeBothChecks_MergeAllTheMergedChecks();
			// CreateCheck_AddExistingCustomer_DoRepeatOrder_CloseCheck();
			//	CreateCheck_AddExistingCustomer_DoRepeatOrder_VoidCheck();
			// CreateCheck_AddExistingCustomer_placemenu_CloseCheck();
			// CreateCheck_AddExistingCustomer_placemenu_VoidCheck();
			// CreateCheck_AddExistingCustomer_placemenu_closeCheck_ReopenCheck_Void_Payment_Void_Check();
			// Create50CheckWith_AddExistingCustomer_DoRepeatOrder_CloseCheck_Again_ReopenAllTheCheck_Void_Payment_Void_Check();
			 CreateCheckWith_AddExistingCustomer_DoRepeatOrder_CloseCheck_Again_ReopenTheCheck_Void_Payment_Void_Check();
			 QSR_PlaceMenu_DoCashPayment_Submit_Reopen_DeleteCashPayment_DoSideCCPayment_Loop();
			
	}
			 
   public static  void QSR_PlaceMenu_DoCashPayment_Submit_Reopen_DeleteCashPayment_DoSideCCPayment_Loop() throws InterruptedException {
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
	   driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"Cash\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
	   Thread.sleep(500);
	   for(int k=0; k<1;k++) {
	   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();	  
	   driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo11);
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo11+"')]")).click();
	   driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
	   Thread.sleep(4000);
	   driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
	   driver.findElement(By.xpath(".//ion-row[@class=\"ng-star-inserted md hydrated\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
	   Thread.sleep(4000);
	   driver.findElement(By.xpath(".//button[text()=\"Side CC\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
	   Thread.sleep(500);
	   }
	   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();	  
	   driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo11);
	   Thread.sleep(8000);
	   driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo11+"')]")).click();
	   driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
	   Thread.sleep(4000);
	   driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
	   int item_count5 = driver.findElements(By.xpath(".//div/ion-row")).size();
 		for(int i=1 ;i<=item_count5 ; i++)	{
 			JavascriptExecutor js4 = (JavascriptExecutor) driver;
 			boolean dte = i >= 2 ? true : false ;
 			if (!!dte) {
 				i=i+2;
 			WebElement menuitemname = driver.findElement(By.xpath("(.//div/ion-row/ion-col)" + "[" + i + "]"));
 			i=i-2;
 			js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
 			Payments.add(menuitemname.getText());
 			}
 			else {
 	 		WebElement menuitemname = driver.findElement(By.xpath("(.//div/ion-row/ion-col)" + "[" + i + "]"));
 	 		js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
 			Payments.add(menuitemname.getText());
			}
		}
 		System.out.println(Payments.get(0));
 	    String Payment1 = "Side CC(#1)";
 		if (Payment1.equals(Payments.toString())) {
			System.out.println("Payments available");
		} else {
			System.out.println("Menus not available");
		}
	}	

   public static void CreateCheckWith_AddExistingCustomer_DoRepeatOrder_CloseCheck_Again_ReopenTheCheck_Void_Payment_Void_Check() throws InterruptedException {
	   for(int i= 0; i<100; i++) {
		   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  
		   driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
		   driver.findElement(By.xpath(".//div[contains(text(),\"YO YO\")]")).click();
		   Thread.sleep(1000);

		   driver.findElement(By.xpath(".//p[contains(text(),\"YO Y\")]")).click();
		   Thread.sleep(5000);
		   try {
			   driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();			
			
		} catch (Exception e) {
		}

		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement customer = driver.findElement(By.xpath(".//label[text()=\"Previous Orders\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", customer);
		   
		   driver.findElement(By.xpath("(.//ion-list/ion-item[@class=\"ng-star-inserted item md in-list ion-focusable hydrated\"])[1]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"Repeat Order\"]")).click();
		   Thread.sleep(6000);
		   checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		   activeCheck.add(checkNo1);
		   
		   driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		   Thread.sleep(500);
		   driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
		   //Thread.sleep(1000);
		   driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
		   Thread.sleep(3000);
		   driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
		   driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
		   Thread.sleep(10000);
		   driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
		   driver.findElement(By.xpath(".//ion-row[@class=\"ng-star-inserted md hydrated\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
		   driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
		   driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
		   driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
		   Thread.sleep(1000);
		   
	   }	
	   		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	   		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	   		for(int i=0; i<activeCheck.size(); i++){
			driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			Thread.sleep(1000);
			String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
			voidCheck.add(voidcheckno);
		}
	   		System.out.println(activeCheck);
	   		System.out.println(voidCheck);
	   		if(activeCheck.equals(voidCheck)) {
			System.out.println("All the checks available");
		}
 		 
  
	}

public static void Create50CheckWith_AddExistingCustomer_DoRepeatOrder_CloseCheck_Again_ReopenAllTheCheck_Void_Payment_Void_Check() throws InterruptedException {
	   for(int i= 1; i<=50; i++) {
		   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  
		   driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
		   driver.findElement(By.xpath(".//div[contains(text(),\"YO YO\")]")).click();
		   Thread.sleep(1000);

		   driver.findElement(By.xpath(".//p[contains(text(),\"YO Y\")]")).click();
		   Thread.sleep(5000);
		   try {
			   driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();			
		} catch (Exception e) {
		}
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement customer = driver.findElement(By.xpath(".//label[text()=\"Previous Orders\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", customer);
		   
		   driver.findElement(By.xpath("(.//ion-list/ion-item[@class=\"ng-star-inserted item md in-list ion-focusable hydrated\"])[1]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"Repeat Order\"]")).click();
		   Thread.sleep(7000);
		   checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		   activeCheck.add(checkNo1);
		   
		   driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		   }
	   for(int m= 0; m<activeCheck.size() ;m++) {
		   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
			 driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
			 driver.findElement(By.xpath(".//ion-row[@class=\"ng-star-inserted md hydrated\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			 driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
			 driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
			 driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			 Thread.sleep(1000);
			
			}			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			for(int i=0; i<activeCheck.size(); i++){
				driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				Thread.sleep(1000);
				String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				voidCheck.add(voidcheckno);
			}
			System.out.println(activeCheck);
			System.out.println(voidCheck);
			if(activeCheck.equals(voidCheck)) {
				System.out.println("All the checks available");
			}


	}

   public static void CreateCheck_AddExistingCustomer_placemenu_closeCheck_ReopenCheck_Void_Payment_Void_Check() throws InterruptedException {
	   for(int i= 1; i<=100; i++) {
		   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		   driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		   Thread.sleep(500);
		   driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		   driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
		   driver.findElement(By.xpath(".//div[contains(text(),\"Chinnu Saran\")]")).click();
		   Thread.sleep(1000);

		   driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", menu1);
		   menu1.click();
		   placedMenu.add(menu1.getText());
				
		   menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", menu1);
		   menu1.click();
		   placedMenu.add(menu1.getText());
			 
		   menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", menu1);
		   menu1.click();
		   placedMenu.add(menu1.getText());
		   Thread.sleep(1000);
		   checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		   activeCheck.add(checkNo1);
		   driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		   }
		   for(int m= 0; m<100 ;m++) {
		   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
			 driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
			 Thread.sleep(5000);
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
			for(int i=0; i<activeCheck.size(); i++){
				driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				Thread.sleep(1000);
				String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				voidCheck.add(voidcheckno);
			}
			System.out.println(activeCheck);
			System.out.println(voidCheck);
			if(activeCheck.equals(voidCheck)) {
				System.out.println("All the checks available");
			}

	}

public static void CreateCheck_AddExistingCustomer_placemenu_VoidCheck() throws InterruptedException {
	   for(int i= 1; i<=100; i++) {
		   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		   driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		   Thread.sleep(500);
		   driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		   driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
		   driver.findElement(By.xpath(".//div[contains(text(),\"Chinnu Saran\")]")).click();
		   Thread.sleep(1000);

		   driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", menu1);
		   menu1.click();
		   placedMenu.add(menu1.getText());
				
		   menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", menu1);
		   menu1.click();
		   placedMenu.add(menu1.getText());
			 
		   menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", menu1);
		   menu1.click();
		   placedMenu.add(menu1.getText());
		   Thread.sleep(1000);
		   checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		   activeCheck.add(checkNo1);
		   driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
		   driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
		   driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
		   driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		   Thread.sleep(1000);
			}
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			for(int i=0; i<activeCheck.size(); i++){
				driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				Thread.sleep(1000);
				String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				voidCheck.add(voidcheckno);
			}
			System.out.println(activeCheck);
			System.out.println(voidCheck);
			if(activeCheck.equals(voidCheck)) {
				System.out.println("All the checks available");
			}
	}

  public static void CreateCheck_AddExistingCustomer_placemenu_CloseCheck() throws InterruptedException {
	   for(int i= 1; i<=100; i++) {
	   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	   driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
	   Thread.sleep(500);
	   driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
	   driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
	   driver.findElement(By.xpath(".//div[contains(text(),\"Chinnu Saran\")]")).click();
	   Thread.sleep(1000);

	   driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
	   js.executeScript("arguments[0].scrollIntoView();", menu1);
	   menu1.click();
	   placedMenu.add(menu1.getText());
			
	   menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
	   js.executeScript("arguments[0].scrollIntoView();", menu1);
	   menu1.click();
	   placedMenu.add(menu1.getText());
		 
	   menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
	   js.executeScript("arguments[0].scrollIntoView();", menu1);
	   menu1.click();
	   placedMenu.add(menu1.getText());
	   Thread.sleep(1000);
	   checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	   activeCheck.add(checkNo1);
	   driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	   }
	   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	   driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
	   for(int k=0; k<activeCheck.size(); k++) {
		  	
		   driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		   Thread.sleep(500);
		   driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
		   Thread.sleep(2000);
		   String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
		   closedCheck.add(closedcheckno);	 
		}
	
		System.out.println(activeCheck);
		System.out.println(closedCheck);

	if(activeCheck.equals(closedCheck))
	{
		System.out.println("Checks available");
	}
	}

public static void CreateCheck_AddExistingCustomer_DoRepeatOrder_VoidCheck() throws InterruptedException {
	   for(int i= 1; i<=100; i++) {
		   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		   driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		   Thread.sleep(500);
		   driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		   driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
		   driver.findElement(By.xpath(".//div[contains(text(),\"Chinnu Saran\")]")).click();
		   Thread.sleep(1000);

		   driver.findElement(By.xpath(".//p[contains(text(),\"Chinnu S\")]")).click();
		   Thread.sleep(2000);

		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   WebElement customer = driver.findElement(By.xpath(".//label[text()=\"Previous Orders\"]"));
		   js.executeScript("arguments[0].scrollIntoView();", customer);
		   
		   driver.findElement(By.xpath("(.//ion-list/ion-item[@class=\"ng-star-inserted item md in-list ion-focusable hydrated\"])[1]")).click();
		   driver.findElement(By.xpath(".//button[text()=\"Repeat Order\"]")).click();
		   Thread.sleep(4000);
		   checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		   activeCheck.add(checkNo1);
		   driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
		   driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
		   driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
		   driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		   Thread.sleep(1000);
			}
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			for(int i=0; i<activeCheck.size(); i++){
				driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
				Thread.sleep(1000);
				String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
				voidCheck.add(voidcheckno);
			}
			System.out.println(activeCheck);
			System.out.println(voidCheck);
			if(activeCheck.equals(voidCheck)) {
				System.out.println("All the checks available");
			}

	}

public static void CreateCheck_AddExistingCustomer_DoRepeatOrder_CloseCheck() throws InterruptedException {
	   for(int i= 1; i<=100; i++) {
	   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	   driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
	   Thread.sleep(500);
	   driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
	   driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//linga-icon[@symbol=\"add-user\"]")).click();
	   driver.findElement(By.xpath(".//div[contains(text(),\"Chinnu Saran\")]")).click();
	   Thread.sleep(1000);

	   driver.findElement(By.xpath(".//p[contains(text(),\"Chinnu S\")]")).click();
	   Thread.sleep(2000);

	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   WebElement customer = driver.findElement(By.xpath(".//label[text()=\"Previous Orders\"]"));
	   js.executeScript("arguments[0].scrollIntoView();", customer);
	   
	   driver.findElement(By.xpath("(.//ion-list/ion-item[@class=\"ng-star-inserted item md in-list ion-focusable hydrated\"])[1]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"Repeat Order\"]")).click();
	   Thread.sleep(4000);
	   checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
	   activeCheck.add(checkNo1);
	   
	   driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	   }
	   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	   driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	   driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
	   for(int k=0; k<activeCheck.size(); k++) {
		  	
		   driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		   Thread.sleep(500);
		   driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
		   Thread.sleep(2000);
		   String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
		   closedCheck.add(closedcheckno);	 
		}
	
		System.out.println(activeCheck);
		System.out.println(closedCheck);

	if(activeCheck.equals(closedCheck))
	{
		System.out.println("Checks available");
	}
		
	}


	   

public static void Create_TwoActiveCheck_MergeBothChecks_Again_Create_TwoActiveCheck_MergeBothChecks_MergeAllTheMergedChecks() throws InterruptedException {
	  for(int i= 1; i<=40; i++) {
		  try {
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
		} catch (Exception e) {
		}
		 String tableName= "T";
		 String fullTableName =  tableName.concat(String.valueOf(i));
		 item.add(fullTableName);
		 driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();
		 driver.findElement(By.xpath(".//*[contains(text(),'"+fullTableName+"')]")).click();
		 driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		 driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		 js.executeScript("arguments[0].scrollIntoView();", menu1);
		 menu1.click();
		 placedMenu.add(menu1.getText());
			
		 menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		 js.executeScript("arguments[0].scrollIntoView();", menu1);
		 menu1.click();
		 placedMenu.add(menu1.getText());
			
		 menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		 js.executeScript("arguments[0].scrollIntoView();", menu1);
		 menu1.click();
		 placedMenu.add(menu1.getText());
		 Thread.sleep(1000);
		 checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		 activeCheck.add(checkNo1);
		 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		 if(i%2==0){
			 driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			 driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();
			 i=i-2;		
			 driver.findElement(By.xpath(".//*[contains(text(),'"+item.get(i)+"')]")).click();
			 i=i+1;
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			 driver.findElement(By.xpath(".//*[contains(text(),'"+item.get(i)+"')]")).click();
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 
			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			i=i+1;
			}
	  		}
	  		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
	  		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();
	  		driver.findElement(By.xpath(".//*[contains(text(),\"T1\")]")).click();
	  		try
	  		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

	  		} catch (Exception e) {
	  		}
	  		Thread.sleep(500);

	  		for(int j = 2; j<40;j++)
	  		{
	  			if(j%2!=0) {
	  				j--;
	  				driver.findElement(By.xpath(".//*[contains(text(),'"+item.get(j)+"')]")).click();
	  		try
	  		{
	  			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

	  		} catch (Exception e) {
	  		}
	  		j++;
	  		}
	  		}
	  		Thread.sleep(1000);
	  		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();
	  		Thread.sleep(500);
	  		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
	  		Thread.sleep(4000);
	  		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
	  		Thread.sleep(500);
	  		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
	  		try
	  		{
	  			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
	  				
	  		} catch (Exception e) {
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

				if(placedMenu.equals(menuName)) {
					System.out.println("Menu items available - Pass");
				}
				else {
					System.out.println("Menu available - fail");
				}
			
				placedMenu.clear();
				menuName.clear();
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click(); 
	  
	}

   public static void Create_ActiveCheck_TransferTable_Create_ActiveCheck_TransferMenuItem_inLoop() throws InterruptedException {
	   driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
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
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		for(int i = 0; i<10 ; i++) {
		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Floor 1-T1\"]")).click();

		driver.findElement(By.xpath(".//div/p[contains(.,'"+activeCheck.get(i)+"')]")).click();
		 
		driver.findElement(By.xpath(".//ion-col[@class=\"tabletransfer-itemrow-transferto ion-no-padding md hydrated\"]//ul//div//div/div//span[text()=\" Floor 1-T2\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//span[contains(text(),\"T2\")]")).click();
		int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
		for(int j=1 ;j<=checkSize ; j++)	{
		driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + j + "]")).click();
		}
		driver.findElement(By.xpath("(.//span[contains(text(),\"T1\")])[2]")).click();
		driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		Thread.sleep(500);	
		}
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
			System.out.println("Menu items available - Pass");
		}
		else {
			System.out.println("Menu available - fail");
		}
	
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		   
	}

public static void Browser1_Create_TwoCheck_Browser2_TransferAllTheMenuFromOneTableToAnotherTable2_Browser1_OpenTransferredTableAndCloseTheCheck() throws Exception {
	   ((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
				
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);


	   for(int j = 0; j<5 ; j++) {
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(500);
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
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(itemcheckno1);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			Thread.sleep(500);
			JavascriptExecutor js3 = (JavascriptExecutor) driver;
			WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js3.executeScript("arguments[0].scrollIntoView();", menu3);
			menu3.click();
			placedMenu.add(menu3.getText());
			
			menu3 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js3.executeScript("arguments[0].scrollIntoView();", menu3);
			menu3.click();
			placedMenu.add(menu3.getText());
			
			menu3 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js3.executeScript("arguments[0].scrollIntoView();", menu3);
			menu3.click();
			placedMenu.add(menu3.getText());

			Thread.sleep(1000);
			String itemcheckno2 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(itemcheckno2);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.switchTo().window(tabs.get(1));
			try {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
				
			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//span[contains(text(),\"T1\")]")).click();
			int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
			for(int i=1 ;i<=checkSize ; i++)	{
				driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + i + "]")).click();
			}
			driver.findElement(By.xpath("(.//span[contains(text(),\"T2\")])[2]")).click();
			driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			Thread.sleep(500);
			
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		try {
			driver.findElement(By.xpath("(.//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div)[1]")).click();
			Thread.sleep(1000);
		 }catch(Exception e) {
		 			 }
		 try
		 {
			 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			 
		 }	 catch (Exception e) {
		 }
		 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
	   }
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	 	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	 	Thread.sleep(500);
	 	
	 	for(int k=0; k<activeCheck.size(); k++) {
	 		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	 		Thread.sleep(500);
	 		driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 		Thread.sleep(2000);
	 		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 		closedCheck.add(closedcheckno);	 
	 		String active = activeCheck.get(k);
	 		item.add(active);
	 		}
	 	
			System.out.println(item);
			System.out.println(closedCheck);

	 	if(item.equals(closedCheck))
	 	{
	 		System.out.println("Checks available");
	 	}

	   
	}

   public static void Browser1_create_Two_checksWithServiceExempt_Browser2_merge_both_the_ChecksAndCloseIt() throws Exception {
	   ((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
				
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);

	   for(int i = 1; i<=10; i++) {
			driver.switchTo().window(tabs.get(0));

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(500);
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
			driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
			driver.findElement(By.xpath(".//label[text()=\"Service Exempt\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();

			Thread.sleep(1000);
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu12);
			menu12.click();
			placedMenu.add(menu12.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
			driver.findElement(By.xpath(".//label[text()=\"Service Exempt\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();

			Thread.sleep(1000);
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.switchTo().window(tabs.get(1));
			try {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			} catch (Exception e) {
			}
			
			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();

			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();

			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.switchTo().window(tabs.get(0));

			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 
			 }	 catch (Exception e) {
			 }
			 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			}
		
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();	
			for(int k=0; k<activeCheck.size(); k++) {
				if ( k % 2 == 0 ) {
					driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
					Thread.sleep(500);
		 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
		 	Thread.sleep(2000);
		 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
		 	closedCheck.add(closedcheckno);	 
		 	String active = activeCheck.get(k);
		 	item.add(active);
		 		}
		 	}
	 		System.out.println(item);
	 		System.out.println(closedCheck);

		 	if(item.equals(closedCheck))
		 	{
		 		System.out.println("Checks available");
		 	}

	}

	public static void Browser1_Create_Two_CheckWithTaxExempt_Browser2_merge_both_the_ChecksAndCloseItBrowser1() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
				
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);

		for(int i = 1; i<=50; i++) {
			driver.switchTo().window(tabs.get(0));

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(500);
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
			driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
			driver.findElement(By.xpath(".//label[text()=\"Tax Exempt\"]")).click();

			Thread.sleep(1000);
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu12);
			menu12.click();
			placedMenu.add(menu12.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
			driver.findElement(By.xpath(".//label[text()=\"Tax Exempt\"]")).click();

			Thread.sleep(1000);
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

				driver.switchTo().window(tabs.get(0));
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 
			 }	 catch (Exception e) {
			 }
			 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			}
		
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();	
			for(int k=0; k<activeCheck.size(); k++) {
				if ( k % 2 == 0 ) {
					driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
					Thread.sleep(500);
		 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
		 	Thread.sleep(2000);
		 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
		 	closedCheck.add(closedcheckno);	 
		 	String active = activeCheck.get(k);
		 	item.add(active);
		 		}
		 	}
	 		System.out.println(item);
	 		System.out.println(closedCheck);

		 	if(item.equals(closedCheck))
		 	{
		 		System.out.println("Checks available");
		 	}

	}

	public static void Browser1_Create_Two_CheckWithPayment_Browser2_merge_both_the_ChecksAndCloseItInBrowser1() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
				
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		

		for(int i = 1; i<=50; i++) {
			driver.switchTo().window(tabs.get(0));

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(500);
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
			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu12);
			menu12.click();
			placedMenu.add(menu12.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			driver.findElement(By.xpath(".//div[text()=\"Side CC\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();	
			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();	
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 
			 }	 catch (Exception e) {
			 }
			 driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();

			 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			}
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();	
		for(int k=0; k<activeCheck.size(); k++) {
			if ( k % 2 == 0 ) {
				driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				Thread.sleep(500);
	 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 	Thread.sleep(2000);
	 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 	closedCheck.add(closedcheckno);	 
	 	String active = activeCheck.get(k);
	 	item.add(active);
	 		}
	 	}
 		System.out.println(item);
 		System.out.println(closedCheck);

	 	if(item.equals(closedCheck))
	 	{
	 		System.out.println("Checks available");
	 	}

	}

	public static void Create_TwoCheck_TransferAllTheMenuFromOneTableToAnotherTable2_OpenTransferredTableAndCloseTheCheck() throws InterruptedException {
		for(int j = 0; j<=50 ; j++) {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(500);
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
		String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(itemcheckno1);

		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		Thread.sleep(500);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		WebElement menu3 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js3.executeScript("arguments[0].scrollIntoView();", menu3);
		menu3.click();
		placedMenu.add(menu3.getText());
		
		menu3 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js3.executeScript("arguments[0].scrollIntoView();", menu3);
		menu3.click();
		placedMenu.add(menu3.getText());
		
		menu3 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js3.executeScript("arguments[0].scrollIntoView();", menu3);
		menu3.click();
		placedMenu.add(menu3.getText());

		Thread.sleep(1000);
		String itemcheckno2 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(itemcheckno2);

		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		Thread.sleep(1000);
		
	driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
	driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//span[contains(text(),\"T1\")]")).click();
	int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
	for(int i=1 ;i<=checkSize ; i++)	{
	driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + i + "]")).click();
	}
	driver.findElement(By.xpath("(.//span[contains(text(),\"T2\")])[2]")).click();
	
	driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
	 driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
	 try {
	 driver.findElement(By.xpath("(.//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div)[1]")).click();
	 Thread.sleep(1000);
	 }catch(Exception e) {
	 			 }
	 try
	 {
		 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		 
	 }	 catch (Exception e) {
	 }
	 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
	 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
	 Thread.sleep(500);
  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	
}
	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
 	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
 	Thread.sleep(500);
 	
 	for(int k=0; k<activeCheck.size(); k++) {
 			driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
 			Thread.sleep(500);
 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
 	Thread.sleep(2000);
 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
 	closedCheck.add(closedcheckno);	 
 	String active = activeCheck.get(k);
 	item.add(active);
 		}
 	
		System.out.println(item);
		System.out.println(closedCheck);

 	if(item.equals(closedCheck))
 	{
 		System.out.println("Checks available");
 	}
		
	}

	public static void Create_Two_CheckWithServiceExempt_merge_both_the_ChecksAndCloseIt() throws InterruptedException {
		for(int i = 1; i<=10; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(500);
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
			driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
			driver.findElement(By.xpath(".//label[text()=\"Service Exempt\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();

			Thread.sleep(1000);
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu12);
			menu12.click();
			placedMenu.add(menu12.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
			driver.findElement(By.xpath(".//label[text()=\"Service Exempt\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();

			Thread.sleep(1000);
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();

			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();

			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 
			 }	 catch (Exception e) {
			 }
			 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			}
		
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();	
			for(int k=0; k<activeCheck.size(); k++) {
				if ( k % 2 == 0 ) {
					driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
					Thread.sleep(500);
		 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
		 	Thread.sleep(2000);
		 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
		 	closedCheck.add(closedcheckno);	 
		 	String active = activeCheck.get(k);
		 	item.add(active);
		 		}
		 	}
	 		System.out.println(item);
	 		System.out.println(closedCheck);

		 	if(item.equals(closedCheck))
		 	{
		 		System.out.println("Checks available");
		 	}

	}

	public static void Create_Two_CheckWithTaxExempt_merge_both_the_ChecksAndCloseIt() throws InterruptedException {
		for(int i = 1; i<=50; i++) {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(500);
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
		driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
		driver.findElement(By.xpath(".//label[text()=\"Tax Exempt\"]")).click();

		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu12);
		menu12.click();
		placedMenu.add(menu12.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
		driver.findElement(By.xpath(".//label[text()=\"Tax Exempt\"]")).click();

		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		 try
		 {
			 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			 
		 }	 catch (Exception e) {
		 }
		 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
		}
	
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();	
		for(int k=0; k<activeCheck.size(); k++) {
			if ( k % 2 == 0 ) {
				driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				Thread.sleep(500);
	 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 	Thread.sleep(2000);
	 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 	closedCheck.add(closedcheckno);	 
	 	String active = activeCheck.get(k);
	 	item.add(active);
	 		}
	 	}
 		System.out.println(item);
 		System.out.println(closedCheck);

	 	if(item.equals(closedCheck))
	 	{
	 		System.out.println("Checks available");
	 	}
	
	}

	public static void Create_Two_CheckWithPayment_merge_both_the_ChecksAndCloseIt() throws InterruptedException {
		for(int i = 1; i<=50; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(500);
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
			 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			Thread.sleep(1000);
			 driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu12);
			menu12.click();
			placedMenu.add(menu12.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			driver.findElement(By.xpath(".//div[text()=\"Side CC\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();

			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 
			 }	 catch (Exception e) {
			 }
			 driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();

			 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			}
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();	
		for(int k=0; k<activeCheck.size(); k++) {
			if ( k % 2 == 0 ) {
				driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				Thread.sleep(500);
	 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 	Thread.sleep(2000);
	 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 	closedCheck.add(closedcheckno);	 
	 	String active = activeCheck.get(k);
	 	item.add(active);
	 		}
	 	}
 		System.out.println(item);
 		System.out.println(closedCheck);

	 	if(item.equals(closedCheck))
	 	{
	 		System.out.println("Checks available");
	 	}

	}

	public static void Browser1_CreateCheck_Browser2_TransferitemfromOnetableToAnotherTable_Browser1_Create_Check_MergeBoththeCheck_Loop() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
				
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(500);
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
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu12);
		menu12.click();
		placedMenu.add(menu12.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		
		for(int i = 0; i<100 ; i++) {
			driver.switchTo().window(tabs.get(1));
			try {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();	
			} catch (Exception e) {
				// TODO: handle exception
			}		
			driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//span[contains(text(),\"T1\")]")).click();
			int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
			for(int j=1 ;j<=checkSize ; j++)	{
			driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + j + "]")).click();
			}
			driver.findElement(By.xpath("(.//span[contains(text(),\"T2\")])[2]")).click();
			driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			Thread.sleep(500);	
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//div[text()=\"New Check\"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();			
		
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		Thread.sleep(3000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
		}
		driver.switchTo().window(tabs.get(1));

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
			System.out.println("Menu items available - Pass");
		}
		else {
			System.out.println("Menu available - fail");
		}
	
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	public static void Browser1_CreateCheck_Browser2_TransfertablefromOnetableToAnotherTable_Browser1_Create_Check_MergeBoththeCheck_Loop() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
				
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
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
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		for(int i = 0; i<30 ; i++) {
			driver.switchTo().window(tabs.get(1));
			try {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();	
			} catch (Exception e) {
			}

		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Floor 1-T1\"]")).click();

		driver.findElement(By.xpath(".//div/p[contains(.,'"+activeCheck.get(i)+"')]")).click();
		 
		driver.findElement(By.xpath(".//ion-col[@class=\"tabletransfer-itemrow-transferto ion-no-padding md hydrated\"]//ul//div//div/div//span[text()=\" Floor 1-T2\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		Thread.sleep(2000);

		driver.switchTo().window(tabs.get(0));

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
		}
		driver.switchTo().window(tabs.get(1));

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
			System.out.println("Menu items available - Pass");
		}
		else {
			System.out.println("Menu available - fail");
		}
	
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	public static void Create_Two_Check_merge_both_the_ChecksAndCloseIt() throws InterruptedException {
		for(int i = 1; i<10; i++) {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(500);
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
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu12);
		menu12.click();
		placedMenu.add(menu12.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		 try
		 {
			 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			 
		 }	 catch (Exception e) {
		 }
		 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
		}
	
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();	
		for(int k=0; k<activeCheck.size(); k++) {
			if ( k % 2 == 0 ) {
				driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				Thread.sleep(500);
	 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 	Thread.sleep(2000);
	 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 	closedCheck.add(closedcheckno);	 
	 	String active = activeCheck.get(k);
	 	item.add(active);
	 		}
	 	}
 		System.out.println(item);
 		System.out.println(closedCheck);

	 	if(item.equals(closedCheck))
	 	{
	 		System.out.println("Checks available");
	 	}
	
	}

	public static void CreateCheck_TransferitemfromOnetableToAnotherTable_Create_Check_MergeBoththeCheck_Loop() throws InterruptedException {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(500);
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
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		
		for(int i = 0; i<100 ; i++) {
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			WebElement menu12 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu12);
			menu12.click();
			placedMenu.add(menu12.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js1.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js2.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			Thread.sleep(1000);
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//span[contains(text(),\"T1\")]")).click();
			int checkSize = driver.findElements(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).size();
			for(int j=1 ;j<=checkSize ; j++)	{
			driver.findElement(By.xpath("(.//ion-col[@class=\"menu-name ion-text-left md hydrated\"])" + "[" + j + "]")).click();
			}
			driver.findElement(By.xpath("(.//span[contains(text(),\"T2\")])[2]")).click();
			driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			Thread.sleep(500);	
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
		}
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
			System.out.println("Menu items available - Pass");
		}
		else {
			System.out.println("Menu available - fail");
		}
	
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	public static void CreateCheck_TransfertablefromOnetableToAnotherTable_Create_Check_MergeBoththeCheck_Loop() throws InterruptedException {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
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
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		for(int i = 0; i<100 ; i++) {
		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		  driver.findElement(By.xpath(".//span[text()=\"Floor 1-T1\"]")).click();

		  driver.findElement(By.xpath(".//div/p[contains(.,'"+activeCheck.get(i)+"')]")).click();
		 
		  driver.findElement(By.xpath(".//ion-col[@class=\"tabletransfer-itemrow-transferto ion-no-padding md hydrated\"]//ul//div//div/div//span[text()=\" Floor 1-T2\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
	
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
		js.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
		js1.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		
		menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
		js2.executeScript("arguments[0].scrollIntoView();", menu1);
		menu1.click();
		placedMenu.add(menu1.getText());
		Thread.sleep(1000);
		checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(checkNo1);
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
		}
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		Thread.sleep(500);
		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
		}
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
			System.out.println("Menu items available - Pass");
		}
		else {
			System.out.println("Menu available - fail");
		}
	
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
	}

	public static void Browser1_Place_menu_Do_payment_Browser2_OpenSameCheck_PlaceMenu_DeletePayment_Do_Payment() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		driver.get(Utility.getProperty("Local_build_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("chotu@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("chotu1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
		for(int i = 0; i<100 ; i++) {
			if(i%2==0) {
				driver.switchTo().window(tabs.get(0));
			}else {
				driver.switchTo().window(tabs.get(1));
				try {
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
				}catch(Exception e) {
				}
			}

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			try {
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			}catch(Exception e) {
			}try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			Thread.sleep(500);
			if(i%2==0) {
				WebElement paymentName = driver.findElement(By.xpath(".//div[text()=\"Others\"]"));
				paymentName.click();
			}else {
				WebElement paymentName1 = driver.findElement(By.xpath(".//div[text()=\"Side CC\"]"));
				paymentName1.click();
			}
			driver.findElement(By.xpath(".//div/ion-row/ion-col")).click();
			driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Finish\"]")).click();
		}
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
			System.out.println("Menu items available - Pass");
		}
		else {
			System.out.println("Menu available - fail");
		}
	
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	public static void Place_menu_Do_payment_OpenSameCheck_PlaceMenu_DeletePayment_Do_Payment() throws InterruptedException {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
		for(int i = 0; i<100 ; i++) {
			
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			try {
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			}catch(Exception e) {
			}try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			Thread.sleep(500);
			if(i%2==0) {
				WebElement paymentName = driver.findElement(By.xpath(".//div[text()=\"Others\"]"));
				paymentName.click();
			}else {
				WebElement paymentName1 = driver.findElement(By.xpath(".//div[text()=\"Side CC\"]"));
				paymentName1.click();
			}
			driver.findElement(By.xpath(".//div/ion-row/ion-col")).click();
			driver.findElement(By.xpath(".//button[text()=\"Delete\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Finish\"]")).click();
		}
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
			System.out.println("Menu items available - Pass");
		}
		else {
			System.out.println("Menu available - fail");
		}
	
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	public static void Place_menu_Do_payment_OpenSameCheck_PlaceMenu_Do_Payment() throws InterruptedException {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
		for(int i = 0; i<100 ; i++) {
			
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			try {
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
			}catch(Exception e) {
			}try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			Thread.sleep(500);
			if(i%2==0) {
				WebElement paymentName = driver.findElement(By.xpath(".//div[text()=\"Others\"]"));
				paymentName.click();
				item.add(paymentName.getText());
			}else {
				WebElement paymentName1 = driver.findElement(By.xpath(".//div[text()=\"Side CC\"]"));
				paymentName1.click();
				item.add(paymentName1.getText());
			}
			driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Finish\"]")).click();
		}
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
			System.out.println("Menu items available - Pass");
		}
		else {
			System.out.println("Menu available - fail");
		}
		driver.findElement(By.xpath(".//div[text()=\"Payment\"]")).click();
		int Payment_count = driver.findElements(By.xpath(".//div/ion-row")).size();
		for(int i=1 ;i<=(Payment_count*3) ; i++)	{
			JavascriptExecutor js4 = (JavascriptExecutor) driver;
			WebElement menuitemname = driver.findElement(By.xpath("(.//div/ion-row//ion-col)" + "[" + i + "]"));
			js4.executeScript("arguments[0].scrollIntoView();", menuitemname);
			i=i+2;
			String[] sana = menuitemname.getText().split("\\(#1");
			menuItem.add(sana[0]);
		}
		System.out.println(item);
		System.out.println(menuItem);

		if(menuItem.equals(item)) {
			System.out.println("Payments items available - Pass");
		}
		else {
			System.out.println("Payments not available - fail");
		}
		driver.findElement(By.xpath(".//button[text()=\"Exit\"]")).click();
	
		placedMenu.clear();
		menuName.clear();
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	public static void Browser1_Create_TwoCheck_MergeIt_Browser2_Create_Check_MergeItWithAlreadyCreatedCheck() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(500);
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
		driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		for (int i=0;i<30;i++) {
			if(i%2==0) {
				driver.switchTo().window(tabs.get(1));
			}else {
				driver.switchTo().window(tabs.get(0));

			}
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();

			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			WebElement menu11 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js11.executeScript("arguments[0].scrollIntoView();", menu11);
			menu11.click();
			placedMenu.add(menu11.getText());
			
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
			js12.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			JavascriptExecutor js21 = (JavascriptExecutor) driver;
			menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
			js21.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			placedMenu.add(menu1.getText());
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(500);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		}
		
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
		driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
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

	public static void Browser1_CreateActiveChecks_Browser2_Transfercheck_FromOneTable_To_AnotherTable_Browser1_Merge_All_Checks() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		for(int i=1; i<= 40; i++ ) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

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
			 String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 activeCheck.add(itemcheckno1);
			 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		 }
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")]")).size();
	 
	 
	  for(int j=1; j<=size; j++) {
		 
		  try{
		  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		  }
		  catch(Exception e) {
			  
		  }

			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 WebElement check = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 1-T15\")])"));
			 js2.executeScript("arguments[0].scrollIntoView();", check);
			 driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")])"+"["+j+"]")).click();
			 j=j-1;
			 driver.findElement(By.xpath(".//div/p[contains(.,'"+activeCheck.get(j)+"')]")).click();
			 j=j+1;
			 driver.findElement(By.xpath(".//span[text()=\" Floor 1-T1\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
	  }	
		 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click(); 	
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(1000);

		int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
		for(int j=1 ;j<=item_count ; j++)	{
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
			js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
			selectCheck.click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
		}
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			driver.switchTo().window(tabs.get(1));
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click(); 	
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			Thread.sleep(1000);


		driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
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

	public static void Browser1_Create_50Checks_Browser2_Merge_All_the_Checks_Browser1_Transfer_merged_CheckFromOneTableToAnotherTable() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		for(int k=0; k<100 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
		driver.switchTo().window(tabs.get(1));

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();

			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(1000);

			int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
				js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
				selectCheck.click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				}
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//p[text()=\"Transfer to Table\"]")).click();
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			WebElement check = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 1-T15\")])"));
			js2.executeScript("arguments[0].scrollIntoView();", check);
			driver.findElement(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[text()= \"Floor 2-T1\"]")).click();
			driver.findElement(By.xpath(".//div[@class=\"transfer-checks-row\"]/div")).click();
			driver.findElement(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div//span[text()=\" Floor 1-T1\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Done \"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
			String UserNameFromCheck = driver.findElement(By.xpath("(.//tr/td)[1]")).getText();
			String UserName = "T1 ";
		
			System.out.println(UserNameFromCheck);
			System.out.println(UserName);

			if(UserNameFromCheck.equals(UserName)) {
				System.out.println("Check available with user:" +UserNameFromCheck);
			}
			else {
				System.out.println("Check Not Available");
			}
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
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

			if(placedMenu.equals(menuName)) {
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

	public static void Browser1_Create_50Checks_Browser2_Merge_All_the_Checks_Bowser1_Transfer_merged_CheckFromOneServerToAnotherServer() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		for(int k=0; k<100 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
		driver.switchTo().window(tabs.get(1));


			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();

			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(1000);

			int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
				js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
				selectCheck.click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				}
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			driver.switchTo().window(tabs.get(0));


			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			
			driver.findElement(By.xpath(".//div[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//p[text()=\"Transfer to Server\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Shivam 1\"]")).click();
			driver.findElement(By.xpath(".//div[@class=\"transfer-checks-row\"]/div")).click();
			driver.findElement(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div//span[text()=\"Multi user 1\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Done \"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			driver.switchTo().window(tabs.get(1));


			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
			String UserNameFromCheck = driver.findElement(By.xpath("(.//tr/td)[6]")).getText();
			String UserName = "Multi user 1";
			System.out.println(UserNameFromCheck);
			System.out.println(UserName);

			if(UserNameFromCheck.equals(UserName)) {
				System.out.println("Check available with user:" +UserNameFromCheck);
			}
			else {
				System.out.println("Check Not Available");
			}
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
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

			if(placedMenu.equals(menuName)) {
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

	public static void Browser1_Create_50Check_Browser2_Transfer_CheckFromOneTableToAnotherTable_and_closeIt_Loop_Browser1_ClosedChecksAreAvailableOrNot() throws Exception {
		
		
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		for(int i=1; i<= 40; i++ ) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

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
			 String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 activeCheck.add(itemcheckno1);
			 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		 }
		driver.switchTo().window(tabs.get(1));

		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")]")).size();
	 
	 
	  for(int j=1; j<=size; j++) {
		 
		  try{
		  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		  }
		  catch(Exception e) {
		  }
		  JavascriptExecutor js2 = (JavascriptExecutor) driver;
		  WebElement check = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 1-T15\")])"));
		  js2.executeScript("arguments[0].scrollIntoView();", check);
		  driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")])"+"["+j+"]")).click();
		  j=j-1;
		  driver.findElement(By.xpath(".//div/p[contains(.,'"+activeCheck.get(j)+"')]")).click();
		  j=j+1;
		  driver.findElement(By.xpath(".//span[text()=\" Floor 1-T1\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		  driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		  driver.findElement(By.xpath(".//p[text()=\"T1 \"]")).click();
		  driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();

	  }	
	  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		driver.switchTo().window(tabs.get(0));

	  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	 	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	 	Thread.sleep(500);
	 	
	 	for(int k=0; k<=activeCheck.size(); k++) {
	 		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	 		Thread.sleep(500);
	 		driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 		Thread.sleep(2000);
	 		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 		closedCheck.add(closedcheckno);	 
	 		String active = activeCheck.get(k);
	 		item.add(active);
	 		}
	 		System.out.println(item);
	 		System.out.println(closedCheck);
	 		if(item.equals(closedCheck))
	 		{
	 		System.out.println("Checks available");
	 		}

		
	}

	public static void Browser1_Create_50Check_Browser2_Transfer_allTheMenuFromOneCheckToAnotherCheck_and_closeIt_LoopBrowser1_ClosedChecksAreAvailableOrNot() throws Exception {
		
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));

		for(int k=0; k<100 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(itemcheckno1);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
		driver.switchTo().window(tabs.get(1));

		int checkSizeTotal = (activeCheck.size()-1);
		for(int j=0; j<checkSizeTotal; j++) {
			
			//driver.switchTo().window(tabs.get(1));
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
		Thread.sleep(1000);

		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		 try {
		 driver.findElement(By.xpath("(.//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div)[1]")).click();
		 Thread.sleep(1000);
		 }catch(Exception e) {
		 			 }
		 try
		 {
			 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			 
		 }	 catch (Exception e) {
		 }
		 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		 Thread.sleep(500);
	  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
	}
		driver.switchTo().window(tabs.get(0));

		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	 	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	 	Thread.sleep(500);
	 	
		//int value = activeCheck.size()/2;
	 	for(int k=0; k<activeCheck.size(); k++) {
	 		//if ( k % 2 == 0 ) {
	 			driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	 			Thread.sleep(500);
	 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 	Thread.sleep(2000);
	 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 	closedCheck.add(closedcheckno);	 
	 	String active = activeCheck.get(k);
	 	item.add(active);
	 	//	}
	 	}
 		System.out.println(item);
 		System.out.println(closedCheck);

	 	if(item.equals(closedCheck))
	 	{
	 		System.out.println("Checks available");
	 	}

	}

	private static void Create_TwoCheck_MergeIt_Again_Create_Check_MergeItWithAlreadyCreatedCheck() throws InterruptedException {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(500);
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
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			for (int i=0;i<10;i++) {
				driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
				driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
				driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();

				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				JavascriptExecutor js11 = (JavascriptExecutor) driver;
				WebElement menu11 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
				js11.executeScript("arguments[0].scrollIntoView();", menu11);
				menu11.click();
				placedMenu.add(menu11.getText());
				
				JavascriptExecutor js12 = (JavascriptExecutor) driver;
				menu1 = driver.findElement(By.xpath(".//*[text()= \"Raggi Mall\"]"));
				js12.executeScript("arguments[0].scrollIntoView();", menu1);
				menu1.click();
				placedMenu.add(menu1.getText());
				JavascriptExecutor js21 = (JavascriptExecutor) driver;
				menu1 = driver.findElement(By.xpath(".//*[text()= \"Tacco Bell\"]"));
				js21.executeScript("arguments[0].scrollIntoView();", menu1);
				menu1.click();
				placedMenu.add(menu1.getText());
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
				driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

				driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				}
				driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				}
				driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

				Thread.sleep(500);
				driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
				Thread.sleep(3000);

				driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			}
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();

			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
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

			if(placedMenu.equals(menuName)) {
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

	public static void Browser1_Create_multipleActiveChecks_Browser2_Merge_two_Checks_and_closeIt_Loop_Browser1_ClosedChecksAreAvailableOrNot() throws Exception {
		
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(Utility.getProperty("Staging_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));
		for(int k=0; k<20 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(itemcheckno1);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
		driver.switchTo().window(tabs.get(1));

		int value = activeCheck.size()/2;
		 for(int i=1; i<=value; i++) {
				
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();

			 driver.findElement(By.xpath(".//div[text()=\"Merge\"]")).click();
			 driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 Thread.sleep(1000);

			 for(int j=1 ;j<=2 ; j++)	{
				 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				 WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
				 js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
				 selectCheck.click();
				 try
				 {
					 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
					 
				 }	 catch (Exception e) {
				 }
			 }
			 driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
			 driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
			 Thread.sleep(4000);
			 driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 try {
			 driver.findElement(By.xpath("(.//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div)[1]")).click();
			 Thread.sleep(1000);
			 }catch(Exception e) {
			 			 }
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 
			 }	 catch (Exception e) {
			 }
			 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}	
		 
			driver.switchTo().window(tabs.get(0));

		 	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		 	Thread.sleep(500);
		 	

		 	for(int k=0; k<activeCheck.size(); k++) {
		 		if ( k % 2 == 0 ) {
		 			driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				 	Thread.sleep(500);
		 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
		 	Thread.sleep(2000);
		 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
		 	closedCheck.add(closedcheckno);	 
		 	String active = activeCheck.get(k);
		 	item.add(active);
		 		}
		 	}
	 		System.out.println(item);
	 		System.out.println(closedCheck);

		 	if(item.equals(closedCheck))
		 	{
		 		//System.out.println("Checks available");
		 		 test.log(LogStatus.PASS, "Place_Menu_SeparateItem - Checks available");

				 System.out.println("Checks available");
			 }
			 else {
				  test.log(LogStatus.FAIL, "Place_Menu_SeparateItem - Checks not available");
			 }

		 	
		
	}

	private static void CreateActiveChecks_Transfercheck_FromOneTable_To_AnotherTable_AndMerge_All_Checks() throws InterruptedException {
		for(int i=1; i<= 40; i++ ) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

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
			 String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 activeCheck.add(itemcheckno1);
			 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		 }
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")]")).size();
	 
	 
	  for(int j=1; j<=size; j++) {
		 
		  try{
		  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		  }
		  catch(Exception e) {
			  
		  }

			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 WebElement check = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 1-T15\")])"));
			 js2.executeScript("arguments[0].scrollIntoView();", check);
			 driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")])"+"["+j+"]")).click();
			 j=j-1;
			 driver.findElement(By.xpath(".//div/p[contains(.,'"+activeCheck.get(j)+"')]")).click();
			 j=j+1;
			 driver.findElement(By.xpath(".//span[text()=\" Floor 1-T1\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
	  }	
	  	
		driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

		driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		Thread.sleep(1000);

		int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
		for(int j=1 ;j<=item_count ; j++)	{
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
			js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
			selectCheck.click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
			}
		}
		driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
		driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
		try
		{
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

		} catch (Exception e) {
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

		if(placedMenu.equals(menuName)) {
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

	private static void Create_50Checks_Merge_All_the_Checks_Transfer_merged_CheckFromOneTableToAnotherTable() throws InterruptedException {
		for(int k=0; k<10 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();

			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(1000);

			int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
				js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
				selectCheck.click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				}
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			
			driver.findElement(By.xpath(".//div[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//p[text()=\"Transfer to Table\"]")).click();
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			WebElement check = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 1-T15\")])"));
			js2.executeScript("arguments[0].scrollIntoView();", check);
			driver.findElement(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[text()= \"Floor 2-T1\"]")).click();
			driver.findElement(By.xpath(".//div[@class=\"transfer-checks-row\"]/div")).click();
			driver.findElement(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div//span[text()=\" Floor 1-T1\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Done \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
			String UserNameFromCheck = driver.findElement(By.xpath("(.//tr/td)[1]")).getText();
			String UserName = "T1 ";
		
			System.out.println(UserNameFromCheck);
			System.out.println(UserName);

			if(UserNameFromCheck.equals(UserName)) {
				System.out.println("Check available with user:" +UserNameFromCheck);
			}
			else {
				System.out.println("Check Not Available");
			}
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
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

			if(placedMenu.equals(menuName)) {
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

	private static void Create_50Checks_Merge_All_the_Checks_Transfer_merged_CheckFromOneServerToAnotherServer() throws InterruptedException {
		for(int k=0; k<100 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();

			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(1000);

			int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
				js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
				selectCheck.click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				}
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			
			driver.findElement(By.xpath(".//div[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//p[text()=\"Transfer to Server\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Shivam 1\"]")).click();
			driver.findElement(By.xpath(".//div[@class=\"transfer-checks-row\"]/div")).click();
			driver.findElement(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div//span[text()=\"Multi user 1\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Done \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();

			driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
			String UserNameFromCheck = driver.findElement(By.xpath("(.//tr/td)[6]")).getText();
			String UserName = "Multi user 1";
			
			if(UserNameFromCheck.equals(UserName)) {
				System.out.println("Check available with user:" +UserNameFromCheck);
			}
			else {
				System.out.println("Check Not Available");
			}
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
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

			if(placedMenu.equals(menuName)) {
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

	private static void Create_50Check_Transfer_CheckFromOneTableToAnotherTable_and_closeIt_Loop() throws InterruptedException {
				for(int i=1; i<= 40; i++ ) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

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
			 String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			 activeCheck.add(itemcheckno1);
			 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		 }
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")]")).size();
	 
	 
	  for(int j=1; j<=size; j++) {
		 
		  try{
		  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		  }
		  catch(Exception e) {
		  }
		  JavascriptExecutor js2 = (JavascriptExecutor) driver;
		  WebElement check = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 1-T15\")])"));
		  js2.executeScript("arguments[0].scrollIntoView();", check);
		  driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")])"+"["+j+"]")).click();
		  j=j-1;
		  driver.findElement(By.xpath(".//div/p[contains(.,'"+activeCheck.get(j)+"')]")).click();
		  j=j+1;
		  driver.findElement(By.xpath(".//span[text()=\" Floor 1-T1\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		  driver.findElement(By.xpath(".//div[text()=\"Floor 1\"]")).click();
		  driver.findElement(By.xpath(".//p[text()=\"T1 \"]")).click();
		  driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();

	  }	
	  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	 	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	 	Thread.sleep(500);
	 	
	 	for(int k=0; k<=activeCheck.size(); k++) {
	 		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	 		Thread.sleep(500);
	 		driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 		Thread.sleep(2000);
	 		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 		closedCheck.add(closedcheckno);	 
	 		String active = activeCheck.get(k);
	 		item.add(active);
	 		}
	 		System.out.println(item);
	 		System.out.println(closedCheck);
	 		if(item.equals(closedCheck))
	 		{
	 		System.out.println("Checks available");
	 		}
		}

	private static void Create_50Check_Transfer_allTheMenuFromOneCheckToAnotherCheck_and_closeIt_Loop() throws InterruptedException {
		for(int k=0; k<100 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(itemcheckno1);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
		int checkSizeTotal = (activeCheck.size()-1);
		for(int j=0; j<checkSizeTotal; j++) {
			
			//driver.switchTo().window(tabs.get(1));
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
		Thread.sleep(1000);

		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
		 try {
		 driver.findElement(By.xpath("(.//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div)[1]")).click();
		 Thread.sleep(1000);
		 }catch(Exception e) {
		 			 }
		 try
		 {
			 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			 
		 }	 catch (Exception e) {
		 }
		 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		 Thread.sleep(500);
	  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
	}
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	 	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
	 	Thread.sleep(500);
	 	
		int value = activeCheck.size()/2;
	 	for(int k=0; k<=value; k++) {
	 		if ( k % 2 == 0 ) {
	 			driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
	 			Thread.sleep(500);
	 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
	 	Thread.sleep(2000);
	 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
	 	closedCheck.add(closedcheckno);	 
	 	String active = activeCheck.get(k);
	 	item.add(active);
	 		}
	 	}
 		System.out.println(item);
 		System.out.println(closedCheck);

	 	if(item.equals(closedCheck))
	 	{
	 		System.out.println("Checks available");
	 	}
	}

	private static void Create_50Check_Merge_two_Checks_and_closeIt_Loop() throws Exception {
//		((JavascriptExecutor) driver).executeScript("window.open()");
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		driver.get(Utility.getProperty("Pre_Prod_Url"));
//		Thread.sleep(30000);
//		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
//		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
//		Thread.sleep(6000);
//		
//		for (int i = 0; i < 4; i++){
//			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
//			Thread.sleep(500);
//		}
//		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
//		Thread.sleep(2000);
//		
//		driver.switchTo().window(tabs.get(0));
		for(int k=0; k<50 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);
			String itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(itemcheckno1);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
		int value = activeCheck.size()/2;
		 for(int i=1; i<=value; i++) {
				
			// driver.switchTo().window(tabs.get(1));
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"Floor 2\"]")).click();

			 driver.findElement(By.xpath(".//div[text()=\"Merge\"]")).click();
			 driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 Thread.sleep(1000);

			 for(int j=1 ;j<=2 ; j++)	{
				 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				 WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
				 js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
				 selectCheck.click();
				 try
				 {
					 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
					 
				 }	 catch (Exception e) {
				 }
			 }
			 driver.findElement(By.xpath(".//ion-col[contains(@class,\"mergecheckmain-floatbtnmain\")]")).click();
			 driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
			 Thread.sleep(4000);
			 driver.findElement(By.xpath(".//button[contains(text(),\"Done\")]")).click();
			 driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			 try {
			 driver.findElement(By.xpath("(.//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div)[1]")).click();
			 Thread.sleep(1000);
			 }catch(Exception e) {
			 			 }
			 try
			 {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 
			 }	 catch (Exception e) {
			 }
			 driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}	
		 	driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 	driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		 	Thread.sleep(500);
		 	

		 	for(int k=0; k<=value; k++) {
		 		if ( k % 2 == 0 ) {
		 			driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				 	Thread.sleep(500);
		 	driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
		 	Thread.sleep(2000);
		 	String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(k)+"')]")).getText();
		 	closedCheck.add(closedcheckno);	 
		 	String active = activeCheck.get(k);
		 	item.add(active);
		 		}
		 	}
	 		System.out.println(item);
	 		System.out.println(closedCheck);

		 	if(item.equals(closedCheck))
		 	{
		 		System.out.println("Checks available");
		 	}
		}

	private static void Browser1_CreateActiveChecksInSingleTable_Browser2_TransferAllThecheck_ToDifferentTableInFloor2() throws InterruptedException {
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

			for (int j = 0; j < 40; j++){
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
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			  for(int j=0; j<activeCheck.size(); j++) {

			driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
			driver.findElement(By.xpath(".//ion-col[@class=\"tabletransfer-itemrow-transferfrom ion-no-padding md hydrated\"]//div//span[text()=\"Floor 1-T1\"]")).click();
			driver.findElement(By.xpath(".//div[@class=\"transfer-checks-row\"]/div//p[contains(text(),'"+activeCheck.get(j)+"')]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement tableNo = driver.findElement(By.xpath(".//ion-col[@class=\"tabletransfer-itemrow-transferto ion-no-padding md hydrated\"]//div//span[text()=\" Floor 1-T15\"]"));
			js.executeScript("arguments[0].scrollIntoView();", tableNo);
			j++;
			driver.findElement(By.xpath("(.//*[@class=\"tabletransfer-itemrow-transferto ion-no-padding md hydrated\"]//span[contains(.,\"Floor 2\")])"+"["+j+"]")).click();
			j--;
			driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		  }	
		  driver.switchTo().window(tabs.get(0));

		  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		

			for(int k=0 ;k<activeCheck.size() ; k++)	{
				  driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
				  Thread.sleep(500);
		  driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(k));
		  Thread.sleep(1000);
		 String tableName1 = driver.findElement(By.xpath("(.//tr/td)[1]")).getText();
		 item.add(tableName1);
		 k++;
		 String tableName= "T";
		 String fullTableName =  tableName.concat(String.valueOf(k));
		 closedCheck.add(fullTableName);
		 k--;
			}
			 System.out.println(item);
			 System.out.println(closedCheck);

		  if(item.equals(closedCheck)) {
				 System.out.println("All Check available");
		  }


	}

	private static void Create_and_Close_QSR_Check_In_loop() throws InterruptedException {
		 	for (int j = 0; j <200 ; j++){
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
			  
		  
		
	}

	private static void Browser1_CreateActiveChecks_Browser2_Transfercheck_FromOneTable_To_AnotherTable() throws InterruptedException {
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
		for(int i=1; i<= 40; i++ ) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

			 String tableName= "T";
			 String fullTableName =  tableName.concat(String.valueOf(i));
			// item.add(fullTableName);
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
			 activeCheck.add(itemcheckno1);
			 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		 }
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();

		driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")]")).size();
	 
	 
	  for(int j=1; j<=size; j++) {
		 
		  driver.switchTo().window(tabs.get(1));
		  try{
		  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		  }
		  catch(Exception e) {
			  
		  }

			 JavascriptExecutor js2 = (JavascriptExecutor) driver;
			 WebElement check = driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 1-T15\")])"));
			 js2.executeScript("arguments[0].scrollIntoView();", check);
			 driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span[contains(text(), \"Floor 2\")])"+"["+j+"]")).click();
			 j=j-1;
			 driver.findElement(By.xpath(".//div/p[contains(.,'"+activeCheck.get(j)+"')]")).click();
			 j=j+1;
			 driver.findElement(By.xpath(".//span[text()=\" Floor 1-T1\"]")).click();
			 driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
	  }	
	  driver.switchTo().window(tabs.get(0));

	  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	  driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
	  driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
	  driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
	  Thread.sleep(500);

	  int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
		for(int j=1 ;j<=item_count ; j++)	{
			j=j*5;
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			WebElement selectCheck = driver.findElement(By.xpath("(.//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div/p)" + "[" + j + "]"));
			js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
			TransferFrom.add(selectCheck.getText());
			j=j/5;

		}
		 System.out.println(activeCheck);
		 System.out.println(TransferFrom);

	  if(activeCheck.equals(TransferFrom)) {
			 System.out.println("All Check available");
	  }

}
	private static void Browser1_Create40plusChecks_Browser2_Merge_byTwo_Two_Checks() throws Exception {
		 ((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.get(Utility.getProperty("Pre_Prod_Url"));
			//driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
			Thread.sleep(30000);
			
			driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
			driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
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
		 for(int i=1; i<= 40; i++ ) {
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
			
			 driver.switchTo().window(tabs.get(1));
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
			driver.switchTo().window(tabs.get(0));

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
		
	}

	private static void Browser1_Create_50Checks_Browser2_Transfer_menu_from_oneTable_to_another() throws Exception {
		 ((JavascriptExecutor) driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));

			driver.get(Utility.getProperty("Staging_Url"));
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

			for (int j = 0; j < 50; j++){
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
				
					driver.switchTo().window(tabs.get(1));
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
				Thread.sleep(1000);

				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				Thread.sleep(1500);
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
				System.out.println(placedMenu);
				System.out.println(menuName);

				if (placedMenu.equals(menuName)) {
					System.out.println("Transfer item one by one - Menu items available - Pass");
				  }
				  	else {
				  		System.out.println("Transfer item one by one - fail");
				  	}
				  	driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
				  	driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
	}

	private static void Browser1_Create_50Checks_Browser2_Merge_All_the_Checks() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(Utility.getProperty("Pre_Prod_Url"));
		Thread.sleep(30000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(6000);
		
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0));
		for(int k=0; k<50 ; k++) {

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			Thread.sleep(1000);

			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			}
		driver.switchTo().window(tabs.get(1));

			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();

			driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			Thread.sleep(1000);

			int item_count = driver.findElements(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				WebElement selectCheck = driver.findElement(By.xpath(".//ion-content[contains(@class,\"table-multiple-checks-content\")]/ion-grid/ion-row/div" + "[" + j + "]"));
				js1.executeScript("arguments[0].scrollIntoView();", selectCheck);
				selectCheck.click();
				try
				{
					driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

				} catch (Exception e) {
				}
			}
			driver.findElement(By.xpath(".//button[contains(@class,\"mergecheckmain-floatbtnmain-btn\")]")).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath(".//button[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			Thread.sleep(10000);

			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();
			driver.findElement(By.xpath(".//button/p[text()=\"T1 \"]")).click();
			try
			{
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();

			} catch (Exception e) {
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

			if(placedMenu.equals(menuName)) {
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

	private static void Browser1_Create_50holdCheck_Browser2_Send_all_the_Hold_ChecktoKitchen_Browser1_closeAllTheCheck_Browser2_reopenAllTheCheck_VoidAllTheCheck() throws InterruptedException {
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
				for(int m=0;m<activeCheck.size();m++) {
				 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
				 driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(m));
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(m)+"')]")).click();
				 driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
				 Thread.sleep(5000);
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
				driver.switchTo().window(tabs.get(0));
				
				driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
				for(int i=0; i<activeCheck.size(); i++){
					driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
					Thread.sleep(1000);
					String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
					voidCheck.add(voidcheckno);
				}
				System.out.println(activeCheck);
				System.out.println(voidCheck);
				if(activeCheck.equals(voidCheck)) {
					System.out.println("All the checks available");
				}
					}

	private static void Browser1_CreateChecks_Transfercheck_FromOneserver_To_Anotherserver_Browser2_Transfercheck_FromOneserver_To_Anotherserver() throws InterruptedException {
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
		 
		 driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
		 checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
		 driver.switchTo().window(tabs.get(1));
		 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 driver.findElement(By.xpath("*//button[text()=\"All\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
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
			 if(k%2==0)
			 {
					driver.switchTo().window(tabs.get(1));
			 }else {
					driver.switchTo().window(tabs.get(0));
			 }
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
		
	}

	public static void Browser1_CreateChecks_Transfercheck_FromOneTable_To_AnotherTable_Browser2_Transfercheck_FromOneTable_To_AnotherTable() throws InterruptedException {
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
		 driver.switchTo().window(tabs.get(1));
		 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		 driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
		 
		 driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
		 driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
		 int size = driver.findElements(By.xpath(".//*[contains(@class,\"tabletransfer-itemrow-transferfrom \")]/ul/div/div/div/span")).size();
		 	
		 	
		 for(int j=1; j<size; j++) {
			 if(j%2==0)
			 {
				 driver.switchTo().window(tabs.get(1));
				 
			}else {
				driver.switchTo().window(tabs.get(0));

				 }
			  try{
				 driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
			  }
			  catch(Exception e) {
				  
			  }
			  Thread.sleep(1000);

		  driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferfrom\")]/ul/div/div/div/span)"+"["+j+"]")).click();
		  Thread.sleep(2000);

		  driver.findElement(By.xpath(".//div/p[contains(.,'"+checkNo1+"')]")).click();
		  driver.findElement(By.xpath("(.//*[contains(@class,\"tabletransfer-itemrow-transferto\")]/ul/div/div/div/span)"+"["+j+"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
		  Thread.sleep(2000);
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
	
	}

	private static void Browser1_holdCheck_Browser2_activeCheck_Browser1_closeCheck_Browser2_reopenCheck_VoidCheck() throws InterruptedException {
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
		for(int i=0;i<50;i++) {
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		
		driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
		Thread.sleep(500);
		
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
		
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
		
		driver.findElement(By.xpath(".//button[text()=\"Hold\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(itemcheckno1);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//tr/td[contains(.,'"+itemcheckno1+"')]")).click();
		driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
		driver.findElement(By.xpath(".//div[text()=\"Order\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		Thread.sleep(1000);
		
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();
		
		driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(itemcheckno1);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//tr/td[contains(.,'"+itemcheckno1+"')]")).click();
		driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
		driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
		driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		Thread.sleep(1000);

		driver.switchTo().window(tabs.get(1));
		 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 
		 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath(".//span[text()=\"Check Status\"]")).click();

		 driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(itemcheckno1);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath(".//tr/td[contains(.,'"+itemcheckno1+"')]")).click();
		 driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
		 Thread.sleep(5000);
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
			
			
		driver.switchTo().window(tabs.get(0));
		
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		
		
		for(int i=0; i<activeCheck.size(); i++){
			driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			Thread.sleep(1000);
			String voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).getText();
			voidCheck.add(voidcheckno);
		  		}
		System.out.println(activeCheck);
		System.out.println(voidCheck);

		  if(activeCheck.equals(voidCheck)) {
			  System.out.println("All the checks available");
		  }

		
	}

	private static void Browser1_syncCheck_activeCheck_Browser2_syncCheck_closeCheck() throws InterruptedException {
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
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			String checkNo11 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			menuName.add(checkNo11);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"sync\"]")).click();
	        Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			Thread.sleep(1000);
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"sync\"]")).click();
	        Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			Thread.sleep(1000);
			try {
				driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			}catch(Exception e) {
			}			
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
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"sync\"]")).click();
	        Thread.sleep(1000);
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
			}
	private static void Browser1_PlaceMenu_Finish_Browser2_syncCheck_PlaceMenu_Finish() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(10000);
		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		for(int i = 0; i<10; i++) {
			if(i % 2 == 0)
				driver.switchTo().window(tabs.get(0));
			else
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
				 driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//linga-icon[@symbol=\"sync\"]")).click();
			        Thread.sleep(1000);
				 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				 try {
					 driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
					 driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
				 }catch(Exception e) {
				
				 }
				 try {
					 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 }catch(Exception e) {
				
				 }
				 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
				 placedMenu.add(menu1.getText());
				 js.executeScript("arguments[0].scrollIntoView();", menu1);
				 menu1.click();

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
			placedMenu.add(menu1.getText());
	        js1.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();

	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
	        placedMenu.add(menu1.getText());
	        js2.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();
	        Thread.sleep(500);

	        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
	        driver.findElement(By.xpath(".//linga-icon[@symbol=\"sync\"]")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		  	}
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(500);
		
		  	driver.findElement(By.xpath(".//button/p[text()=\"T5 \"]")).click();
		  	try {
		  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		  	}catch(Exception e) {
				
			}
		  	Thread.sleep(1000);
		  	int item_count = driver.findElements(By.xpath(".//div[@class=\"orderlist-container  \"]")).size();
		  	System.out.println(item_count);
		  	if(item_count==placedMenu.size()) {
		  		System.out.println("Pass");

		  	}
		  	for(int i=1 ;i<=item_count ; i++)	{
		  		String menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]")).getText();
		  		menuName.add(menuitemname);
		  	

		  		  }
		  	System.out.println(menuName);
		  	System.out.println(placedMenu);
		  	if(menuName==(placedMenu)) {
			  System.out.println("Pass");

		  }
		  placedMenu.clear();
		  menuName.clear();
		
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

	}

	private static void Browser1_PlaceMenu_Finish_Browser2_PlaceMenu_Finish() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(10000);

		for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
				  Thread.sleep(500);
				  }
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(2000);
		
		for(int i = 0; i<100; i++) {
			if(i % 2 == 0)
				driver.switchTo().window(tabs.get(0));
			else
				driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			Thread.sleep(500);
				 driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
				 Thread.sleep(500);
				 driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
				 try {
					 driver.findElement(By.xpath(".//span[text()=\"1\"]")).click();
					 driver.findElement(By.xpath(".//span[text()=\"Continue\"]")).click();
				 }catch(Exception e) {
				
				 }
				 try {
					 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
				 }catch(Exception e) {
				
				 }
				 driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Chai\"]"));
				 placedMenu.add(menu1.getText());
				 js.executeScript("arguments[0].scrollIntoView();", menu1);
				 menu1.click();

	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Raggi Mall\"]"));
			placedMenu.add(menu1.getText());
	        js1.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();

	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        menu1 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container   menuItem-col\")]/button/div[text()=\"Tacco Bell\"]"));
	        placedMenu.add(menu1.getText());
	        js2.executeScript("arguments[0].scrollIntoView();", menu1);
	        menu1.click();
	        Thread.sleep(500);
	        

	        driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();

		  	}
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		
		driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
		Thread.sleep(500);
			 driver.findElement(By.xpath(".//span[text()=\"Table layout\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			 Thread.sleep(500);
		  
		  	driver.findElement(By.xpath(".//button/p[text()=\"T5 \"]")).click();
		  	try {
		  		driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
		  	}catch(Exception e) {
				
			}
		  	Thread.sleep(1000);
		  	int item_count = driver.findElements(By.xpath(".//div[@class=\"orderlist-container  \"]")).size();
		  	System.out.println(item_count);
		  	if(item_count==placedMenu.size()) {
		  		System.out.println("Check available");
		  	}
		  	for(int i=1 ;i<=item_count ; i++)	{
		       JavascriptExecutor js2 = (JavascriptExecutor) driver;

		  		WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + i + "]"));
		  		js2.executeScript("arguments[0].scrollIntoView();", menuitemname);
		  		menuName.add(menuitemname.getText());
		  	}
		  	System.out.println(menuName);
		  	System.out.println(placedMenu);

		  	if(placedMenu.equals(menuName)) {
			  System.out.println("Menu Available");

		  }
		  	else {
				  System.out.println("Menu not Available");

		  	}
		  placedMenu.clear();
		  menuName.clear();
		
		  driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
		  driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
		
	}

	private static void Browser1_placeMenu_PartialPay_Browser2_CheckInOpen_Complete_payment_Browser1_ClickDone() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(10000);

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
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
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
			menuItem.add(checkNo1);
			driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Rs.50.00\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Cash\")]")).click();
			
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Payment\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Cash\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Submit\")]")).click();
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();

			 driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
			 driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
			 driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.switchTo().window(tabs.get(1));
			 Thread.sleep(15000);

				driver.findElement(By.xpath(".//button[@class=\"alert-button ion-focusable ion-activatable sc-ion-alert-ios\"]")).click();
				 Thread.sleep(3000);
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

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

	}

	private static void Browser1_placeMenu_Finish_Browser2_CheckInOpen_Browser1_voidCheck_Browser2_ClickDone() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(15000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(10000);

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
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			

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
			menuItem.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			
			
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();

			 driver.findElement(By.xpath(".//div[text()=\"Void\"]")).click();
			 driver.findElement(By.xpath(".//textarea[contains(@class,\"mat-input-element mat-form\")]")).sendKeys("saran");
			 driver.findElement(By.xpath(".//button[text()=\"Add\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.switchTo().window(tabs.get(1));
			 Thread.sleep(15000);

				driver.findElement(By.xpath(".//button[@class=\"alert-button ion-focusable ion-activatable sc-ion-alert-ios\"]")).click();
				 Thread.sleep(3000);
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			for(int i=0; i<menuItem.size(); i++){
		  		driver.findElement(By.xpath(".//button[contains(text(),\"Void\")]")).click();
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(menuItem.get(i));
		  		Thread.sleep(8000);
		  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+menuItem.get(i)+"')]")).getText();
		  		voidCheck.add(closedcheckno);
		  	}
		  if(menuItem.equals(voidCheck)) {
			  System.out.println("All the checks available");
		  }	
		  placedMenu.clear();
			menuName.clear();
			
	}

	private static void Browser1_placeMenu_Finish_Browser2_CheckInOpen_Browser1_CheckClose_Browser2_ClickDone() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get("https://pre-webpos.lingapos.com/#/auth/pin");
		Thread.sleep(10000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(10000);

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
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			

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
			menuItem.add(checkNo1);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			
			driver.switchTo().window(tabs.get(1));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			
			
			driver.switchTo().window(tabs.get(0));
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();

			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
			 Thread.sleep(1000);
			 
			 driver.switchTo().window(tabs.get(1));
			 Thread.sleep(15000);

				driver.findElement(By.xpath(".//button[@class=\"alert-button ion-focusable ion-activatable sc-ion-alert-ios\"]")).click();
				 Thread.sleep(1500);
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			}
			driver.switchTo().window(tabs.get(0));
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			for(int i=0; i<menuItem.size(); i++){
		  		driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		  		driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(menuItem.get(i));
		  		Thread.sleep(8000);
		  		String closedcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+menuItem.get(i)+"')]")).getText();
		  		closedCheck.add(closedcheckno);
		  	}
		  if(menuItem.equals(closedCheck)) {
			  System.out.println("All the checks available");
		  }			
		  placedMenu.clear();
			menuName.clear();
			driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();


	}

	private static void Browser1_placeMenu_TaxExempt_activecheck_Browser2_Placemenu_ServiceExempt_closeCheck() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get(Utility.getProperty("Staging_Url"));
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
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement menu1 = driver.findElement(By.xpath(".//*[text()= \"Chai\"]"));
			js.executeScript("arguments[0].scrollIntoView();", menu1);
			menu1.click();
			driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
			driver.findElement(By.xpath(".//label[text()=\"Tax Exempt\"]")).click();

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
			try {
				 driver.findElement(By.xpath(".//button[text()=\"Yes\"]")).click();
			 }catch(Exception e) {
			
			 }			
			driver.findElement(By.xpath(".//*[text()=\"PIZZA\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Favorite menu\"]")).click();
			
			JavascriptExecutor js6 = (JavascriptExecutor) driver;
			WebElement menu7 = driver.findElement(By.xpath(".//*[text()= \"Cheese\"]"));
			js6.executeScript("arguments[0].scrollIntoView();", menu7);
			menu7.click();
			driver.findElement(By.xpath(".//div[text()=\"Option\"]")).click();
			driver.findElement(By.xpath(".//label[text()=\"Service Exempt\"]")).click();
			
			driver.findElement(By.xpath(".//button[text()=\"Done\"]")).click();

			String checkNo12 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			placedMenu.add(checkNo12);
			driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			 Thread.sleep(500);

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


	}

	private static void Browser1_placeMenu_Browser2_opensameCheck_PlaceMenu_afterloop_Finish() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.get(Utility.getProperty("Staging_Url"));
		Thread.sleep(10000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
			Thread.sleep(6000);

			for (int i = 0; i < 4; i++){
				driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
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
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			driver.findElement(By.xpath(".//*[text()=\"Chotu\"]")).click();
			JavascriptExecutor js11 = (JavascriptExecutor) driver;
			WebElement menu11 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Chai\"]"));
			js11.executeScript("arguments[0].scrollIntoView();", menu11);
			menu11.click();
			placedMenu.add(menu11.getText());
			JavascriptExecutor js12 = (JavascriptExecutor) driver;
			menu11 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Raggi Mall\"]"));
			js12.executeScript("arguments[0].scrollIntoView();", menu11);
			menu11.click();
			placedMenu.add(menu11.getText());
			JavascriptExecutor js21 = (JavascriptExecutor) driver;
			menu11 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Tacco Bell\"]"));
			js21.executeScript("arguments[0].scrollIntoView();", menu11);
			menu11.click();
			placedMenu.add(menu11.getText());
			checkNo1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			
			driver.findElement(By.xpath("*//button/span[text()=\"Table layout\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[text()=\"Floor 1\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
						
			for(int i=0 ; i<=30 ; i++) {
				driver.switchTo().window(tabs.get(0));

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
			
			driver.switchTo().window(tabs.get(1));
			try {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();

			}
			catch(Exception e) {
				
			}
			driver.findElement(By.xpath(".//*[text()=\"Laddu\"]")).click();
			
			JavascriptExecutor js22 = (JavascriptExecutor) driver;
			WebElement menu2 = driver.findElement(By.xpath(".//div[contains(@class,\"ion-col fill-container\")]/button/div[text()=\"Retail\"]"));
			js22.executeScript("arguments[0].scrollIntoView();", menu2);
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
			
			}
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(500);
			driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\" QSR \"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();
			driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(checkNo1);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkNo1+"')]")).click();
			driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js14 = (JavascriptExecutor) driver;
				WebElement menuitemname = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				js14.executeScript("arguments[0].scrollIntoView();", menuitemname);
				menuName.add(menuitemname.getText());
			}
			System.out.println(placedMenu);
			System.out.println(menuName);

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


	}

	private static void Place_Menu_SeparateItem() throws InterruptedException {
		int count = 5;
		for(int i=0; i<count; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(2000);
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
			String CheckNo = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(CheckNo);
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//p[contains(text(),\"Raggi Mall\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 2\")]")).click();
			driver.findElement(By.xpath(".//p[contains(text(),\"Tacco Bell\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 3\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(CheckNo);
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+CheckNo+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//p[contains(text(),\"Chai \")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Separate item\")]")).click();
			driver.findElement(By.xpath(".//input[contains(@class,\"mat-input-element mat-form\")]")).sendKeys(""+count);
			driver.findElement(By.xpath(".//span[contains(text(),\"Continue\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//p[contains(text(),\"Raggi Mall\")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Separate item\")]")).click();
			driver.findElement(By.xpath(".//input[contains(@class,\"mat-input-element mat-form\")]")).sendKeys(""+count);
			driver.findElement(By.xpath(".//span[contains(text(),\"Continue\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//p[contains(text(),\"Tacco Bell\")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Separate item\")]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath(".//input[contains(@class,\"mat-input-element mat-form\")]")).sendKeys(""+count);
			driver.findElement(By.xpath(".//span[contains(text(),\"Continue\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		}
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

			driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
			 for(int i=0; i<activeCheck.size(); i++){
				item.addAll(placedMenu);
				placedMenu.clear();
			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			
			 int item_count1 = driver.findElements(By.xpath(".//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button")).size();
			 for(int k=1 ;k<=item_count1 ; k++)	{
				 driver.findElement(By.xpath("(.//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button)"+"["+k+"]")).click();

			 int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			 for(int j=1 ;j<=item_count ; j++)	{
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				 js.executeScript("arguments[0].scrollIntoView();", menu3);
				 menuName.add(menu3.getText());
			  }	
			 }
			  driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			 }
			 System.out.println(item);
			 System.out.println(menuName);
			 for(int i=0;i<item.size();i++) {
		        	for(int j=0; j<menuName.size();j++) {
		        		if(item.get(i).equals(menuName.get(j))){
		        			menuItem.add(menuName.get(j));
		        			break;
		        		}
		        			
		        	}

		        }
//			 item.forEach(ite ->{
//				 itemName.forEach(itNam -> {
//					 if (ite == itNam) {
//		        			menuItem.add(ite);
//		        			return ;
//
//					 }
//				 });
//			 });
			 System.out.println(menuItem);

			if (item.equals(menuItem)) {
				 test.log(LogStatus.PASS, "Place_Menu_SeparateItem - Checks available");

				 System.out.println("All the menu available");
			 }
			 else {
				  test.log(LogStatus.FAIL, "Place_Menu_SeparateItem - Checks not available");
			 }

			 
//			 List<String> differences = itemName.stream()
//			            .filter(element -> !item.contains(element))
//			            .collect(Collectors.toList());
//			 System.out.println("NewOne"+differences);
//			 item.stream().filter((num) -> 
//				 itemName.stream().filter(val -> 
//					 num.stream().filter(num2 ->
//					 val.stream().filter(val1 -> {
//						if(num2 == val1) {
//					 }
//					 });
//				 )
//				 )
//				 
//			 );
//			 item.forEach(val -> {
//				 itemName.forEach(data -> {
//					 	System.out.println(data);
//					 	System.out.println(val);
//					 for(int i = 0 ; i< val.length() ; i++) {
//						 for (int j=0; j< data.length(); j++) {
//							 if(val.contains(data)) {
//								 menuItem.add(data);
//								 break;
//							 }
//						 }
//					 }
//					 
//				 });
//			 });
//			 	System.out.println(menuItem);

//			 for(int i=0;i<item.size();i++) {
//		        	for(int j=0; j<itemName.size();j++) {
//		   			// for(int k=0;k<item.get(i).length();k++) {
//				        	//for(int m=0; m<itemName.get(j).length();m++) {
//
//				               // System.out.println(item.get(i).length());
//		        		
//				   			 boolean val = item.get(i).contains(itemName.get(j));
//				               System.out.println(val);
////				               menuItem.add(val);
//				              //  int sana = item.get(i).indexOf(k);
//				              //  int saran = itemName.get(j).indexOf(m);
//				                //System.out.println(sana);
//				                //System.out.println(saran);
//
//				                
//		        		//if(sana.equals(saran){
//		        		//	menuItem.add(saran);
//		        			//break;
//		        		//}
//		        			
//		        	//}
//
//		        }}
			 

				 

	}

	private static void Place_Menu_SplitEvenly() throws InterruptedException {
		for(int i=0; i<=2; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			String CheckNo = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(CheckNo);
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Split Evenly\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Yes\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
		}
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

			driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
			 for(int i=0; i<activeCheck.size(); i++){
				 item.add(placedMenu.toString());
	
			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			
			 int item_count1 = driver.findElements(By.xpath(".//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button")).size();
			 for(int k=1 ;k<=item_count1 ; k++)	{
				 driver.findElement(By.xpath("(.//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button)"+"["+k+"]")).click();

			 int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			 for(int j=1 ;j<=item_count ; j++)	{
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				 js.executeScript("arguments[0].scrollIntoView();", menu3);
				 menuName.add(menu3.getText());
			  }	
			 }
			 menuItem.add(menuName.toString());
			 menuName.clear();
			  driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			 }
			 System.out.println(item);
			 System.out.println(menuItem);


			 if(item.equals(menuItem)) {
				  test.log(LogStatus.PASS, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks available");

				 System.out.println("All the menu available");
			 }
			 else {
				  test.log(LogStatus.FAIL, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks not available");
			 }



			}

	

	private static void Place_Menu_Split_item_Groupseat() throws InterruptedException {
		for(int i=0; i<=2; i++) {
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
			String CheckNo = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			activeCheck.add(CheckNo);
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
			driver.findElement(By.xpath(".//p[contains(text(),\"Raggi Mall\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 2\")]")).click();
			driver.findElement(By.xpath(".//p[contains(text(),\"Tacco Bell\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 3\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			
			 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

			}
			
			driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

			 for(int i=0; i<activeCheck.size(); i++){
				 driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 1\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 2\")]")).click();
			driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 3\")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Group Seats\")]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			
			driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();

			driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
			driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
			driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
			driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
			int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
			for(int j=1 ;j<=item_count ; j++)	{
				JavascriptExecutor js = (JavascriptExecutor) driver;
				WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
				js.executeScript("arguments[0].scrollIntoView();", menu3);
				menuName.add(menu3.getText());
			
			}
			driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
			 }

			 if(placedMenu.equals(menuName)) {
				//  test.log(LogStatus.PASS, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks available");

				 System.out.println("All the menu available");
			 }
			 else {
				//  test.log(LogStatus.FAIL, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks not available");
			 }

		
	}

	private static void Place_Menu_Split_item_SeatWise() throws InterruptedException {
		for(int i=0; i<=2; i++) {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
		driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//div[text()=\"Floor 2\"]")).click();
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
		String CheckNo = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		activeCheck.add(CheckNo);
		driver.findElement(By.xpath(".//linga-icon[@symbol=\"Split\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
		driver.findElement(By.xpath(".//button[@class=\"add-seat\"]")).click();
		driver.findElement(By.xpath(".//p[contains(text(),\"Raggi Mall\")]")).click();
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 2\")]")).click();
		driver.findElement(By.xpath(".//p[contains(text(),\"Tacco Bell\")]")).click();
		driver.findElement(By.xpath(".//ion-col[contains(text(),\"Seat 3\")]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\"Save & Close\")]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
		 driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();

		}
		
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		 driver.findElement(By.xpath(".//button[text()=\"All\"]")).click();

		driver.findElement(By.xpath(".//span[contains(text(),\"Check Status\")]")).click();
		 for(int i=0; i<activeCheck.size(); i++){

		driver.findElement(By.xpath(".//button[contains(text(),\"Active\")]")).click();
		driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(activeCheck.get(i));
		driver.findElement(By.xpath(".//tr/td[contains(.,'"+activeCheck.get(i)+"')]")).click();
		driver.findElement(By.xpath(".//button[contains(text(),\" Open check \")]")).click();
		
		 int item_count1 = driver.findElements(By.xpath(".//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button")).size();
		 for(int k=1 ;k<=item_count1 ; k++)	{
				driver.findElement(By.xpath("(.//ion-col[@class=\"qsrSeats_row-col md hydrated\"]/button)"+"["+k+"]")).click();

		 int item_count = driver.findElements(By.xpath(".//div[contains(@class,\"orderlist-container  \")]")).size();
		  for(int j=1 ;j<=item_count ; j++)	{
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  WebElement menu3 = driver.findElement(By.xpath("(.//div[contains(@class,\"orderlist-menuname\")])" + "[" + j + "]"));
			  js.executeScript("arguments[0].scrollIntoView();", menu3);
			  menuName.add(menu3.getText());
		  }
		 }
		  driver.findElement(By.xpath(".//div[contains(text(),\"Finish\")]")).click();
		 }

		 if(placedMenu.equals(menuName)) {
			  test.log(LogStatus.PASS, "Place_Menu_Split_item_SeatWise - Checks available");

			 System.out.println("All the menu available");
		 }
		 else {
			  test.log(LogStatus.FAIL, "Place_Menu_Split_item_SeatWise - Checks not available");
		 }


		
		
	}

	private static void Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale() throws Exception {
		 ((JavascriptExecutor) driver).executeScript("window.open()");
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));

		 driver.get(Utility.getProperty("Staging_Url"));
		 Thread.sleep(30000);
		 driver.findElement(By.id("mat-input-0")).sendKeys(Utility.getProperty("Store_id"));
		 driver.findElement(By.id("mat-input-1")).sendKeys(Utility.getProperty("Store_password"));
		 Thread.sleep(3000);
		 driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		 Thread.sleep(6000);
			
		 for (int i = 0; i < 4; i++){
			 driver.findElement(By.xpath(".//*[text()=\"2\"]")).click();
			 Thread.sleep(500);
		 }
		 driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		 Thread.sleep(2000);
			
		 for (int j = 0; j < 20; j++){
			 driver.switchTo().window(tabs.get(0));
			 driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
				
			 driver.findElement(By.xpath(".//*[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			 Thread.sleep(500);
			 driver.findElement(By.xpath(".//*[text()=\"DINE IN\"]")).click();
			 Thread.sleep(1000);
			 
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
			 Thread.sleep(4000);
			 driver.findElement(By.xpath(".//input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(j));
			 Thread.sleep(1000);
			 driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(j)+"')]")).click();
			 driver.findElement(By.xpath(".//button[contains(text(),\" Re-open Check \")]")).click();
			 Thread.sleep(4000);
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
			 driver.findElement(By.xpath(".//button[contains(text(),\"Void\")]")).click();
			 driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(closedCheck.get(i));
			  		Thread.sleep(5000);
			  		String Voidcheckno = driver.findElement(By.xpath(".//tr/td[contains(.,'"+closedCheck.get(i)+"')]")).getText();
			  		voidCheck.add(Voidcheckno);
			  	}
		 System.out.println(closedCheck);
		 System.out.println(voidCheck);

		 if(closedCheck.equals(voidCheck)) {
			//  test.log(LogStatus.PASS, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks available");

			 System.out.println("All the checks available");
		 }
		 else {
			//  test.log(LogStatus.FAIL, "Browser1_CreateactiveCheck_Browser2_Complete_the_sale_Browser1_Reopen_deletePayment_VoidSale - Checks not available");
		 }

	}

}
