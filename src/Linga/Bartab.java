package Linga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bartab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://web.lingapos.com");
		Thread.sleep(10000);
		//driver.findElement(By.xpath(".//*[@class=\"mat-button mat-button-base\"]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("shivam@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("shivam1");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		Thread.sleep(5000);

		for (int i = 0; i < 4; i++){
			driver.findElement(By.xpath(".//*[text()=\"1\"]")).click();
			  Thread.sleep(1000);
			  }
		  driver.findElement(By.xpath(".//*[text()=\"Login\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  //driver.findElement(By.xpath(".//*[@class=\"mat-focus-indicator mat-menu-trigger order-header-menu ion-float-right mat-button mat-button-base\"]")).click();
		  //Thread.sleep(2000);
		  //driver.findElement(By.xpath(".//*[contains(@class,'mat-focus-indicator order-header-menuItem-item mat-menu-item ng-tns')][8]")).click();
		  String checkno = driver.findElement(By.xpath(".//*[@class=\"order-header-checkno\"]")).getText();
		  //System.out.println(checkno);

		  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Payment\"]")).click();
		  driver.findElement(By.xpath("(.//*[text()=\"Cash\"])[2]")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath(".//*[text()=\"Submit\"]")).click();
		  Thread.sleep(10000);
		  driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"All\"]")).click();

		  driver.findElement(By.xpath(".//*[text()=\"Check Status\"]")).click();
		  driver.findElement(By.xpath(".//*[text()=\"Closed\"]")).click();
		  String closedchecks = driver.findElement(By.xpath(".//tr/td[contains(.,'"+checkno+"')]")).getText();
		  System.out.println(closedchecks);
		  System.out.println(checkno);
		  //String servicetype = driver.findElement(By.xpath(".//tr[@class=\"none\"]//td[3]")).getText();
		  //if(checkno.equals(closedcheckno) && servicetype.equals("BarTab	")) {
			 // System.out.println("Bartab check closed successfully"); 
		//  }




		  
	}

}








