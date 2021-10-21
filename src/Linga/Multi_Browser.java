package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multi_Browser {

			  WebDriver driver;
		  String activecheckno, closecheckno, voidcheckno, holdcheckno, Mergecheckno, servercheckno, tablecheckno, itemcheckno1, itemcheckno2, dinecheckno, bartabcheckno, TOGOcheckno, outcheckno, paymentcheckno, checkreopen;
		  static ArrayList<String> menuName= new ArrayList<String>();
		  static ArrayList<String> placedMenu= new ArrayList<String>();
		  public void main() throws Exception {
		  	   LaunchBrowser();

			  }
			  @BeforeTest
			  private void LaunchBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
				  System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Chrome\\chromedriver.exe");
				  driver = new ChromeDriver();
				  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				  driver.manage().window().maximize();
				  driver.get("https://web.lingapos.com");
				  Thread.sleep(10000);
				  driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
				  driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
				  Thread.sleep(3000);
				  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				  Thread.sleep(8000);

				  for (int i = 0; i < 4; i++){
					  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
						  Thread.sleep(1000);
						  }
				  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
	}

			@Test(priority = 0)
			  public void chrome1cases() throws Exception {

			  //QSR_Order_DinIN_T1_Activecheck
			  this.activecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Order\"]")).click();
			  driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"T1 \"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  //Closed_check_reflection
			  driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  this.closecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		  
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Payment\"]")).click();
			  driver.findElement(By.xpath("(.//*[text()=\"Cash\"])[2]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Submit\"]")).click();
			  //Void_check_reflection
			  driver.findElement(By.xpath("//*[text()=\" QSR \"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  this.voidcheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath("//*[text()=\"Order\"]")).click();
			  driver.findElement(By.xpath("//*[text()=\"Void\"]")).click();
			  driver.findElement(By.tagName("textarea")).sendKeys("Saran Here");
			  driver.findElement(By.xpath("(//*[@class=\"voidfooter-grd-voidfooterbutton\"])[2]")).click();
			  //Hold_check_reflection
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//*[text()=\"Done\"]")).click();
			  this.holdcheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[@class=\"p-col-5 orderlist-menuname\" and text()=\"Chai\" ] ")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Hold\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
			  
			 //Merge_2_checks
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//*[text()=\" QSR \"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  this.Mergecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"T4 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"Merge\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T3 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T4 \"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[@class=\"tabletransfer-headrow-colrit-done\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			  
			  //Transfer_check_by_server
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"T5 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  this.servercheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			  driver.findElement(By.xpath(".//span[text()=\"Shivam 1\"]")).click();
			  driver.findElement(By.xpath(".//div/p[contains(.,'"+servercheckno+"')]")).click();
			  driver.findElement(By.xpath("(.//*[text()=\"Manager 2\"])[2]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Yes\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();


			  //Transfer_check_by_table
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"T6 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  this.tablecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Transfer to Table\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Floor 1-T6\"]")).click();
			  driver.findElement(By.xpath(".//div/p[contains(.,'"+tablecheckno+"')]")).click();
			  JavascriptExecutor transto =(JavascriptExecutor) driver;
			  WebElement check = driver.findElement(By.xpath(".//span[text()=\" Floor 2-T1\"]"));
		      transto.executeScript("arguments[0].scrollIntoView();", check);
		      check.click();
			  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();

			  //Transfer_check_by_item
			  Thread.sleep(2000);

			  driver.findElement(By.xpath(".//*[text()=\"T7 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  this.itemcheckno1 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T8 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  this.itemcheckno2 = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"Transfer\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Transfer item\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//div/span[contains(.,'"+itemcheckno1+"')]")).click();
			  driver.findElement(By.xpath(".//ion-col[@class=\"menu-name ion-text-left md hydrated\"]")).click();
			  driver.findElement(By.xpath("(.//div/span[contains(.,'"+itemcheckno2+"')])[2]")).click();
			  driver.findElement(By.xpath(".//*[text()=\" Done \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Yes\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
			  
			  //DineIN_Table_change
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"T9 \"]")).click();
			  driver.findElement(By.xpath(".//button[@class=\"mat-menu-trigger order-header-menu ng-star-inserted\"]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"T10 \"]")).click();
			  this.dinecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  
			  //Bartab_check
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"BarTab\"]")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath(".//*[text()=\"New Check\"]")).click();
			  this.bartabcheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  
			  //Phone_order_TOGO_check
			  Thread.sleep(2000);

			  driver.findElement(By.xpath("//*[text()=\" QSR \"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[text()=\"Done\"]")).click();
			  this.TOGOcheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(3000);

			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  
			  //Phone_order_Delivery_out_check
			  Thread.sleep(2000);

			  driver.findElement(By.xpath("//*[text()=\" QSR \"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("(.//*[text()=\"DELIVERY\"])[1]")).click();
			  driver.findElement(By.xpath("//*[text()=\"Done\"]")).click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath(".//*[contains(@class,'mat-input-element mat-form-field-autofill-control mat-a')]")).sendKeys("chinnu saran");
			  Thread.sleep(2000);

			  driver.findElement(By.xpath(".//*[contains(@class,\"mat-option-text\") and contains(text(),'Chinnu saran 9875555555' )]")).click();
			  Thread.sleep(10000);


			  driver.findElement(By.xpath(".//button[text()=\"Save\"]")).click();
			  Thread.sleep(3000);

			  this.outcheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  System.out.println(this.outcheckno);	

			  Thread.sleep(3000);

			  driver.findElement(By.xpath("//td[contains(.,'"+outcheckno+"')]/..")).click();
			  driver.findElement(By.xpath("(.//*[text() =\" Driver 4 \"])[2]")).click();
			  driver.findElement(By.xpath(".//*[text() =\"Yes\"]")).click();
			  driver.findElement(By.xpath("(.//*[text() =\" Driver 4 \"])[2]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Departure\"]")).click();
			  
			  //Check_Reopen
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
			  driver.findElement(By.xpath(".//button/p[text()=\"T11 \"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  driver.findElement(By.xpath(".//*[text()=\"Continue\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  this.checkreopen = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();

			  driver.findElement(By.xpath(".//div[text()=\"Others\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//button[text()=\"Submit\"]")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();

			  driver.findElement(By.xpath(".//*[text()= \"Closed\"]")).click();
			  driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkreopen+"')]")).click();		
			  driver.findElement(By.xpath(".//*[text()= \" Re-open Check \"]")).click();
			  Thread.sleep(2000);

			  driver.findElement(By.xpath(".//*[text()=\"Finish\"]")).click();
			  
			  //check_open_payment
			  Thread.sleep(2000);

			  driver.findElement(By.xpath("//*[text()=\" QSR \"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
			  Thread.sleep(500);
			  driver.findElement(By.xpath(".//button[contains(@class,\"mat-menu-trigger order\")]")).click();
			  driver.findElement(By.xpath(".//button[text()=\"DINE IN\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"T12 \"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  this.paymentcheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();		  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[text()= \"Payment\"]")).click();
			  Thread.sleep(1000);

			  driver.findElement(By.xpath(".//button[text()=\"Others\"]")).click();

			  
	  }
	  @AfterTest
	  public void k() throws Exception {
		  System.out.println("Bye");
		  //driver.close();

		    
	  }
	  @Test(priority = 1)
	  public void case1() throws InterruptedException {
		  System.out.println("Take care");
		  System.out.println(this.activecheckno);	
		  System.out.println(this.closecheckno);	
		  System.out.println(this.voidcheckno);	
		  System.out.println(this.holdcheckno);	
		  System.out.println(this.Mergecheckno);	
		  System.out.println(this.servercheckno);	
		  System.out.println(this.tablecheckno);	
		  System.out.println(this.itemcheckno1);	
		  System.out.println(this.itemcheckno2);	
		  System.out.println(this.dinecheckno);	
		  System.out.println(this.bartabcheckno);	
		  System.out.println(this.TOGOcheckno);	
		  System.out.println(this.outcheckno);
		  System.out.println(this.checkreopen);
		  System.out.println(this.paymentcheckno);	
	  }


				  

	  @Test(priority = 2)
	  public void Firefox() throws InterruptedException {	  
		 /* System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Mozilla\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.get("http://web.lingapos.com");
		  Thread.sleep(15000);
		  driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		  driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		  Thread.sleep(5000);
		  
		  for (int i = 0; i < 4; i++){
			  driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  Thread.sleep(500);
						  }
		  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		  Thread.sleep(2000);*/
		  LaunchBrowser();
					 
			//QSR_Order_DinIN_T1_Activecheck		  
		  //driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.activecheckno);
		  driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.activecheckno+"')]")).click();
		  driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
		  Thread.sleep(1000);
		  String activechecks = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  
		  if(activecheckno.equals(activechecks)) {
			  System.out.println("QSR_Order_DinIN_T1_Activecheck - Pass");
		  }else {
			  System.out.println("QSR_Order_DinIN_T1_Activecheck- Fail");
		  }
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
		  Thread.sleep(1000);
		  
		  //Closed_check_reflection
		  driver.findElement(By.xpath(".//button[text()=\"Closed\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.closecheckno);
		  String closecheck = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.closecheckno+"')]")).getText();
		  if(closecheckno.equals(closecheck)) {
			  System.out.println("Closed_check_reflection - Pass");
		  }else {
			  System.out.println("Closed_check_reflection- Fail");
		  }


		  //Void_check_reflection
		  driver.findElement(By.xpath(".//button[text()=\"Void\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.voidcheckno);
		  String voidcheck = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.voidcheckno+"')]")).getText();
		  if(voidcheckno.equals(voidcheck)) {
			  System.out.println("Void_check_reflection - Pass");
		  }else {
			  System.out.println("Void_check_reflection- Fail");
		  }
		  
		  //Hold_check_reflection

		  driver.findElement(By.xpath(".//button[text()=\"Hold\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.holdcheckno);
		  String holdcheck = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.holdcheckno+"')]")).getText();
		  if(holdcheckno.equals(holdcheck)) {
			  System.out.println("Hold_check_reflection - Pass");
		  }else {
			  System.out.println("Hold_check_reflection- Fail");
		  }

		  //Merge_2_checks
		  driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.Mergecheckno);
		  String mergecheck = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.Mergecheckno+"')]")).getText();
		  if(Mergecheckno.equals(mergecheck)) {
			  System.out.println("Merge_check_reflection - Pass");
		  }else {
			  System.out.println("Merge_check_reflection- Fail");
		  }

		  //Transfer_check_by_server
		  driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.servercheckno);
		  driver.findElement(By.xpath(".//tr/td[text()=\"Manager 2\"]")).click();
		  System.out.println("Transfer_check_by_server - Pass");
		  
		  //Transfer_check_by_table
		  driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.tablecheckno);
		  String tablecheck = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.tablecheckno+"')]")).getText();
		  if(tablecheckno.equals(tablecheck)) {
			  System.out.println("Transfer_check_by_table - Pass");
		  }else {
			  System.out.println("Transfer_check_by_table- Fail");
		  }
		  
		  //Transfer_check_by_item
		  driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.itemcheckno2);
		  String itemcheck = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.itemcheckno2+"')]")).getText();
		  if(itemcheckno2.equals(itemcheck)) {
			  System.out.println("Transfer_check_by_item - Pass");
		  }else {
			  System.out.println("Transfer_check_by_item- Fail");
		  }
		  
		  //DineIN_Table_change
		  driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
		  driver.findElement(By.xpath(".//button/p[text()=\"T10 \"]")).click();
		  Thread.sleep(1000);
		  
		  String dinechecks = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  
		  if(dinecheckno.equals(dinechecks)) {
			  System.out.println("DineIN_Table_change - Pass");
		  }else {
			  System.out.println("DineIN_Table_change- Fail");
		  }
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
		  Thread.sleep(1000);
		  
		  //Bartab_check
		  driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();

		  driver.findElement(By.xpath(".//button[text()=\"Active\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.bartabcheckno);
		  String bartabcheck = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.bartabcheckno+"')]")).getText();
		  if(bartabcheckno.equals(bartabcheck)) {
			  System.out.println("Bartab_check - Pass");
		  }else {
			  System.out.println("Bartab_check- Fail");
		  }
		  Thread.sleep(1000);
		  //Phone_order_TOGO_check
		  driver.findElement(By.xpath(".//button/span[text()=\"Phone Order\"]")).click();
		  driver.findElement(By.xpath(".//div/button[text()=\"New\"]")).click();
		  driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.TOGOcheckno+"')]")).click();
		  driver.findElement(By.xpath(".//div[text()=\"Edit\"]")).click();
		  Thread.sleep(1000);
		  String TOGOchecks = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  
		  if(TOGOcheckno.equals(TOGOchecks)) {
			  System.out.println("Phone_order_TOGO_check - Pass");
		  }else {
			  System.out.println("Phone_order_TOGO_check- Fail");
		  }
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
		  Thread.sleep(1000);
		  
		  //Phone_order_Delivery_out_check
		  driver.findElement(By.xpath(".//div/button[text()=\"Out\"]")).click();
		  Thread.sleep(1000);
		  String outcheck = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.outcheckno+"')]")).getText();
		  if(outcheckno.equals(outcheck)) {
			  System.out.println("Phone_order_Delivery_out_check - Pass");
		  }else {
			  System.out.println("Phone_order_Delivery_out_check- Fail");
		  }

		  //ClosedCheck_Reopen_Active_Check
		  driver.findElement(By.xpath(".//button/span[text()=\"Check Status\"]")).click();
		  driver.findElement(By.xpath(".//div/button[text()=\"Active\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//div/input[@data-placeholder=\"Check No\"]")).sendKeys(this.checkreopen);
		  driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.checkreopen+"')]")).click();
		  driver.findElement(By.xpath(".//button[text()=\" Open check \"]")).click();
		  Thread.sleep(1000);
		  String reopenchecks = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  
		  if(checkreopen.equals(reopenchecks)) {
			  System.out.println("ClosedCheck_Reopen_Active_Check - Pass");
		  }else {
			  System.out.println("ClosedCheck_Reopen_Active_Check- Fail");
		  }
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
		  Thread.sleep(1000);
		  
		  //check_open_payment
		  
		  driver.findElement(By.xpath(".//button/span[text()=\"Table layout\"]")).click();
		  driver.findElement(By.xpath(".//button/p[text()=\"T12 \"]")).click();
		  try{
			  
			  WebElement popup = driver.findElement(By.xpath(".//mat-dialog-container//app-alertcontent//mat-dialog-content//p[@class=\"alert-msg ng-star-inserted\"]"));
			  System.out.println("Check open Popups occurs");
	        }catch (Exception e){
	 		 
	   		 System.out.println("Sorry try again..!");
	 
	        }
		  
		  //String activechecks = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.activecheckno+"')]")).getText();
		  
		  
		  
		  
		  
		  /* JavascriptExecutor js = (JavascriptExecutor) driver;
					  	WebElement active = driver.findElement(By.xpath(".//tr/td[contains(.,'"+this.activecheckno+"')]"));
				        js.executeScript("arguments[0].scrollIntoView();", active);
				        active.getText();
				        String activechecks = String.valueOf(active);
				        System.out.println(activechecks);
					driver.findElement(By.xpath(".//*[text()=\"Table layout\"]")).click();
					  driver.findElement(By.xpath(".//*[text()=\"T2 \"]")).click();
					  try{
						  
						  WebElement element = driver.findElement(By.xpath(".//mat-dialog-container//app-alertcontent//mat-dialog-content//p[@class=\"alert-msg ng-star-inserted\"]"));
				 System.out.println("Test case 1 - Popups occurs");
				        }catch (Exception e){
				 		 
				   		 System.out.println("Sorry try again..!");
				 
				        }
					  Thread.sleep(2000);

					  //driver.close();*/
	 
	  }
	}








			


	


