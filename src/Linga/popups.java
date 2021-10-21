package Linga;

import java.io.Console;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\Chrome\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://web.lingapos.com");
		Thread.sleep(8000);
        //driver.findElement(By.xpath(".//*[text()=\" Continue Without Plugin \"]")).click();
        driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
        driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
        Thread.sleep(6000);;
        for (int i = 0; i < 4; i++){
        	driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
        	  Thread.sleep(2000);
        	  }
        driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

       /* driver.findElement(By.xpath(".//*[@classname=\"interface-icon\"]")).click();
        WebElement intfce = driver.findElement(By.xpath(".//*[text()=\"Please open the plugin and try to connect\"]"));
        String plugin = intfce.getText();
        driver.findElement(By.xpath(".//*[text()=\" Continue Without Plugin \"]")).click();
        */
        driver.findElement(By.xpath("(.//*[@classname=\"sync-oper\"])[2]")).click();
        Thread.sleep(2000);
        WebElement sync = driver.findElement(By.xpath(".//*[text()=\"Synced successfully\"]"));
        String syncsuccess = sync.getText();
        
        driver.findElement(By.xpath("(.//*[@classname=\"sync-oper\"])[1]")).click();
        driver.findElement(By.xpath(".//*[text()=\"POS\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

        driver.findElement(By.xpath(".//*[text()=\"Void\"]")).click();
        WebElement vd = driver.findElement(By.xpath(".//*[text()=\"You have nothing to void\"]"));
        String allvoid = vd.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Print\"]")).click();
        WebElement pt =driver.findElement(By.xpath(".//*[text()=\"You need to Order\"]"));
        String print = pt.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Option\"]")).click();
        WebElement chck =driver.findElement(By.xpath(".//*[@class=\"check-option-header md header-md header-collapse-none hydrated\"]"));
        String option =chck.getText();
        driver.findElement(By.xpath(".//*[text()=\"Back\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Discount\"]")).click();
        WebElement dsc = driver.findElement(By.xpath(".//*[text()=\"Discount\"]"));
        String discount = dsc.getText();
        driver.findElement(By.xpath("(.//*[text()=\"Close\"])[2]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Order\"]")).click();
        WebElement ord =driver.findElement(By.xpath(".//*[text()=\"You have nothing to Order\"]"));
        String order = ord.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Cash\"]")).click();
        WebElement csh =driver.findElement(By.xpath(".//*[text()=\"You need to order before paying\"]"));
        String cash = csh.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Payment\"]")).click();
        WebElement paymt =driver.findElement(By.xpath(".//*[text()=\"You need to order before paying\"]"));
        String payment = paymt.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
      
        driver.findElement(By.xpath(".//*[text()=\"Log Off\"]")).click();
        Thread.sleep(5000);
        for (int i = 0; i < 4; i++){
        	driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
        	  Thread.sleep(2000);
        	  }
        driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();

        driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
        driver.findElement(By.xpath(".//*[@class=\"p-col-1 remove\"]")).click();
       /* if(driver.findElement(By.xpath(".//*[@class=\"p-col-5 orderlist-menuname\"]")).equals(null));{
        	System.out.println("Item voided");
        }*/
        
        try
        {
        	driver.findElement(By.xpath(".//*[@class=\"p-col-5 orderlist-menuname\"]"));        } 
        catch(Exception a)
        {
           System.out.println("Element does not exist!");
        } 
        
        if(syncsuccess.equals("Synced successfully") && allvoid.equals("You have nothing to void") && print.equals("You need to Order") && discount.equals("Discount") && order.equals("You have nothing to Order")&& cash.equals("You need to order before paying")&& payment.equals("You need to order before paying"))  {
        	System.out.println("Order screen popup validation successful");
        		}
        	else 
        	{
        		System.out.println("Order screen popup validation validation fails");}
        //Check status
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[text()=\" Pay Check \"]")).click();
        WebElement checkstatuspay =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Open\"]"));
        String checkstatuspaycheck = checkstatuspay.getText();
        //System.out.println("Hi"+checkstatuspaycheck);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();

        driver.findElement(By.xpath(".//*[text()=\" Open check \"]")).click();
        WebElement opnchk =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Open\"]"));
        String opencheck = opnchk.getText();
        //System.out.println("Doode"+opencheck);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();

        driver.findElement(By.xpath(".//*[text()=\" Re-Print Checks \"]")).click();
        WebElement reprntchk =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Reprint\"]"));
        String reprintcheck = reprntchk.getText();
        //System.out.println(reprintcheck);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();

        driver.findElement(By.xpath(".//*[text()=\"Closed\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\" Re-open Check \"]")).click();
        WebElement reopnchk =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Re-Open\"]"));
        String reopencheck = reopnchk.getText();
        //System.out.println(reopencheck);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\" Re-Print Checks \"]")).click();
        WebElement reprntchk1 =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Reprint\"]"));
        String reprintcheck1 = reprntchk1.getText();
        //System.out.println(reprintcheck1);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Void\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\" Re-Print Checks \"]")).click();
        WebElement reprntchk2 =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Reprint\"]"));
        String reprintcheck2 = reprntchk2.getText();
        //System.out.println(reprintcheck2);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Hold\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\" Pay Check \"]")).click();
        WebElement paychck1 =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Open\"]"));
        String paycheck1 = paychck1.getText();
        //System.out.println(paycheck1);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\" Open check \"]")).click();
        WebElement openchck1 =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Open\"]"));
        String opencheck1 = openchck1.getText();
        //System.out.println(opencheck1);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\" Re-Print Checks \"]")).click();
        WebElement reprntchck3 =driver.findElement(By.xpath(".//*[text()=\"Select the Check and Reprint\"]"));
        String reprintcheck3 = reprntchck3.getText();
        //System.out.println(reprintcheck3);
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
       
        if(checkstatuspaycheck.equals("Select the Check and Open") && opencheck.equals("Select the Check and Open") && reprintcheck.equals("Select the Check and Reprint") && reopencheck.equals("Select the Check and Re-Open") && reprintcheck1.equals("Select the Check and Reprint")&& reprintcheck2.equals("Select the Check and Reprint")&& paycheck1.equals("Select the Check and Open") && opencheck1.equals("Select the Check and Open") && reprintcheck3.equals("Select the Check and Reprint"))  {
        	System.out.println("Check status popup validation successful");
        		}
        	else 
        	{
        		System.out.println("Check status popup validation fails");}
       
        driver.findElement(By.xpath(".//*[text()=\"Phone Order\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Add\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Phone Order\"]")).click();


        driver.findElement(By.xpath(".//*[text()=\"Edit\"]")).click();
        WebElement editphoneorder =driver.findElement(By.xpath(".//*[text()=\"Select any order to edit\"]"));
        String edit = editphoneorder.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Departure\"]")).click();
        Thread.sleep(1000);
        WebElement departure =driver.findElement(By.xpath(".//*[text()=\"Select any driver\"]"));
        String departuredriver = departure.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Cancel Order\"]")).click();
        WebElement cancelorder =driver.findElement(By.xpath(".//*[text()=\"Select order\"]"));
        String cancelphoneorder = cancelorder.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Pay Check\"]")).click();
        WebElement payorder =driver.findElement(By.xpath(".//*[text()=\"Select order\"]"));
        String paycheckpo = payorder.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Print\"]")).click();
        WebElement printorder =driver.findElement(By.xpath(".//*[text()=\"Select order\"]"));
        String printpo = printorder.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();

        driver.findElement(By.xpath(".//*[text()=\"Out\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Add\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Phone Order\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Out\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Arrival\"]")).click();
        WebElement map =driver.findElement(By.xpath(".//*[text()=\"Select order\"]"));
        String mappo = map.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Pay Check\"]")).click();
        WebElement paychck =driver.findElement(By.xpath(".//*[text()=\"Select order\"]"));
        String paycheckpo1 = paychck.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        
        driver.findElement(By.xpath(".//*[text()=\"Complete\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Add\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Phone Order\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Complete\"]")).click();
        driver.findElement(By.xpath(".//*[text()=\"Operation\"]")).click();
        
        if(edit.equals("Select any order to edit") && departuredriver.equals("Select any driver") && cancelphoneorder.equals("Select order") && paycheckpo.equals("Select order") && printpo.equals("Select order")&& mappo.equals("Select order")&& paycheckpo1.equals("Select order"))  {
        	System.out.println("Phone order Check status popup validation successful");
        		}
        	else 
        	{
        		System.out.println("Phone order Check status popup validation fails");}
        
        
        //Till Management popup
        driver.findElement(By.xpath(".//*[text()=\"Till Management\"]")).click();
        driver.findElement(By.xpath(".//*[@class=\"webpos-togglecolor ng-untouched ng-pristine ng-valid md in-item interactive hydrated ion-untouched ion-pristine ion-valid\"]"));
        driver.findElement(By.xpath(".//*[text() =\"Continue\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Hold Till\"]")).click();
        WebElement hold =driver.findElement(By.xpath(".//*[text() =\"Select Till to proceed\"]"));
        String holdtill = hold.getText();
        
        driver.findElement(By.xpath(".//*[text() =\"Close Till\"]")).click();
        WebElement close =driver.findElement(By.xpath(".//*[text() =\"Select Till to proceed\"]"));
        String closetill = close.getText();
        
        driver.findElement(By.xpath(".//*[text() =\"Rs. 0.00\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Hold Till\"]")).click();
        WebElement hold1 =driver.findElement(By.xpath(".//*[text() =\"Do you want to hold this till?\"]"));
        String holdtill1 = hold1.getText();
        
        driver.findElement(By.xpath(".//*[text() =\"Yes\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Rs. 0.00\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Close Till\"]")).click();
        WebElement close1 =driver.findElement(By.xpath(".//*[text() =\"Do you want to close the till?\"]"));
        String closetill1 = close1.getText();
        driver.findElement(By.xpath(".//*[text() =\"Yes\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Continue\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Submit \"]")).click();

        driver.findElement(By.xpath(".//*[text() =\" Held Till \"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Close Till\"]")).click();
        WebElement close2 =driver.findElement(By.xpath(".//*[text() =\"Select Till to proceed\"]"));
        String closetill2 = close2.getText(); 
        
        driver.findElement(By.xpath(".//*[text() =\" Closed Till \"]")).click();
        driver.findElement(By.xpath(".//*[text() =\" Adjust Till \"]")).click();
        WebElement adjttill =driver.findElement(By.xpath(".//*[text() =\"Select Till to proceed\"]"));
        String adjusttill = adjttill.getText();    
        
        driver.findElement(By.xpath("(.//*[@class=\"ion-no-padding md hydrated\"])[3]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Continue\"]")).click();
        WebElement cashdrp =driver.findElement(By.xpath(".//*[text() =\"Please enter the amount\"]"));
        String cashdrop = cashdrp.getText();
        driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Continue\"]")).click();
        WebElement cashdropss =driver.findElement(By.xpath(".//*[text()=\"Cash Drop Successfully\"]"));
        String cashdropsuccessful = cashdropss.getText();

        driver.findElement(By.xpath("(.//*[@class=\"ion-no-padding md hydrated\"])[4]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Continue\"]")).click();
        WebElement payintill =driver.findElement(By.xpath(".//*[text() =\"Please enter the amount\"]"));
        String payin = payintill.getText();
        driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Continue\"]")).click();
        WebElement payintill1 =driver.findElement(By.xpath(".//*[text()=\"Enter the Paid From\"]"));
        String payin1 = payintill1.getText();
        driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
        driver.findElement(By.xpath(".//*[@id=\"mat-input-86\"]")).sendKeys("Chotu");
        driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
        driver.findElement(By.xpath(".//*[text() =\"Continue\"]")).click();
        driver.findElement(By.xpath(".//*[@class=\"payReason_content-grd-txt ng-pristine ng-valid ng-touched\"]")).sendKeys("saran");
        WebElement payintill2 =driver.findElement(By.xpath(".//*[text()=\"Enter the Paid From\"]"));
        String payin2 = payintill2.getText();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@symbol=\"power-button\"]")).click();




        	}
	
          
	}

