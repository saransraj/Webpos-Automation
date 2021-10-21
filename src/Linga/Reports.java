package Linga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reports {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://web.lingapos.com");
		Thread.sleep(10000);
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(5000);

		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text() = \"1\"]")).click();
			  Thread.sleep(1000);
			  }
		  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		  Thread.sleep(2000);
//Active check
		  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  driver.findElement(By.xpath("//*[contains(@class,\"mat-focus-indicator mat-menu-trigger order\")]")).click();
		  driver.findElement(By.xpath("//*[contains(@class,\"mat-focus-indicator order\")][2]")).click();
		  driver.findElement(By.xpath("//*[text()=\"T2 \"]")).click();

		  String activecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  //System.out.println(checkno);

		  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
		  driver.findElement(By.xpath("//*[text()=\"Finish\"]")).click();
		  driver.findElement(By.xpath("//*[text()=\"Check Status\"]")).click();
		  //String activechecks = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activecheckno+"')]")).getText();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  WebElement active = driver.findElement(By.xpath(".//tr/td[contains(.,'"+activecheckno+"')]"));
	        js.executeScript("arguments[0].scrollIntoView();", active);
	        active.getText();
	        String activechecks = String.valueOf(active);
	        System.out.println(activechecks);

//CLosed checks
		  driver.findElement(By.xpath("//*[text()=\" QSR \"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  String closecheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Payment\"]")).click();
		  driver.findElement(By.xpath("(.//*[text()=\"Cash\"])[2]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(".//*[text()=\"Submit\"]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Check Status\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Closed\"]")).click();
		  String closedchecks = driver.findElement(By.xpath(".//tr/td[contains(.,'"+closecheckno+"')]")).getText();
		  //System.out.println(closedchecks);
		 // System.out.println(checkno);
//Void check
		  driver.findElement(By.xpath("//*[text()=\" QSR \"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  String voidcheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
		  driver.findElement(By.xpath("//*[text()=\"Order\"]")).click();
		  driver.findElement(By.xpath("//*[text()=\"Void\"]")).click();
		  driver.findElement(By.tagName("textarea")).sendKeys("Saran Here");
		  driver.findElement(By.xpath("(//*[@class=\"voidfooter-grd-voidfooterbutton\"])[2]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Check Status\"]")).click();
		  driver.findElement(By.xpath("//*[text()=\"Void\"]")).click();
		  String voidchecks = driver.findElement(By.xpath(".//tr/td[contains(.,'"+voidcheckno+"')]")).getText();
//Hold check
		  driver.findElement(By.xpath("//*[text()=\" QSR \"]")).click();
		  Thread.sleep(1000);
		  //driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  //driver.switchTo().activeElement();
		   // By Forhere = By.xpath("(.//div//button[@class=\\\"mat-focus-indicator ordertype-content-row-btn mat-button mat-button-base\\\"])[1]");

		   // WebDriverWait wait = new WebDriverWait(driver, 30);
		   // wait.until(ExpectedConditions.presenceOfElementLocated(Forhere));


		  //driver.findElement(By.xpath("(.//div//button[@class=\"mat-focus-indicator ordertype-content-row-btn mat-button mat-button-base\"])[1]")).click();
		  driver.findElement(By.xpath("//*[text()=\"Done\"]")).click();
		  String holdcheckno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
		  driver.findElement(By.xpath(".//*[@class=\"p-col-5 orderlist-menuname\" and text()=\"Chai\" ] ")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Hold\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Check Status\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Hold\"]")).click();
		  String holdchecks = driver.findElement(By.xpath(".//tr/td[contains(.,'"+holdcheckno+"')]")).getText();

		  if(activecheckno.equals(activechecks) && closecheckno.equals(closedchecks) && voidcheckno.equals(voidchecks) && holdcheckno.equals(holdchecks) ) {
			 System.out.println("Checks are posting correctly"); 
		  }else {
				 System.out.println("Checks are not posting in check status screen"); 

	}

}
}
