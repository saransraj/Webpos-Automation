package Linga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://web.lingapos.com/#/auth/login");
		Thread.sleep(5000);
		//driver.findElement(By.xpath(".//*[@class=\"mat-button mat-button-base\"]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("Chotu@mail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("chotu1");
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
		  Thread.sleep(2000);

		  //Calculation
		  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
		  Thread.sleep(500);
		  driver.findElement(By.xpath(".//*[text()=\"chai wale\"]")).click();
		  Thread.sleep(500);
		  driver.findElement(By.xpath(".//*[text()=\"???\"]")).click();
		  Thread.sleep(500);
		  
		  
		  driver.findElement(By.xpath(".//*[text()=\"Discount\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[text()=\"Amt aft 3 \"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(.//*[text()=\"Close\"])[2]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[text()=\"Payment\"]")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[text()=\"Others\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[text()=\"Exit\"]")).click();
		  Thread.sleep(1000);
		  
		  
		  

		  String menuvalue1 = driver.findElement(By.xpath("(.//*[@class=\"p-col-3 text-pos-end \"])[1]")).getText();
		  System.out.println("Menu price" + menuvalue1);
		  String menuvalue2 = driver.findElement(By.xpath("(.//*[@class=\"p-col-3 text-pos-end \"])[2]")).getText();
		  System.out.println("Menu price" + menuvalue2);
		  String menuvalue3 = driver.findElement(By.xpath("(.//*[@class=\"p-col-3 text-pos-end \"])[3]")).getText();
		  System.out.println("Menu price" + menuvalue3);
		  float menu1 = Float.parseFloat(menuvalue1);
		  float menu2 = Float.parseFloat(menuvalue2);
		  float menu3 = Float.parseFloat(menuvalue3);
		  //float subtotal = 0;

		  float subtotal = menu1 + menu2 + menu3;
		  System.out.println("Subtotal" + subtotal);

		  
		  
		  String taxvalue = driver.findElement(By.xpath("(.//*[@class=\"order-footer-grid-label ion-float-right sc-ion-label-md-h sc-ion-label-md-s md hydrated\"])[2]")).getText().substring(1);
		  System.out.println("Tax" + taxvalue);
		  String discountvalue = driver.findElement(By.xpath("(.//*[@class=\"order-footer-grid-label ion-float-right sc-ion-label-md-h sc-ion-label-md-s md hydrated\"])[3]")).getText().substring(1);
		  System.out.println("discount" + discountvalue);
		  
		  
		  
		  float tax = 0;
		  float discount = 0;

		  tax = Float.parseFloat(taxvalue);
		  discount = Float.parseFloat(discountvalue);

		  //if(subtotal!=0){
		      float total = (subtotal + tax)-discount;
		      System.out.println("Total" +total);
		     
		 // } else {
			 // System.out.println("No menu item");
		  //}
		  
		  String subtotalvalue1 = driver.findElement(By.xpath("(.//*[@class=\"order-footer-grid-label ion-float-right sc-ion-label-md-h sc-ion-label-md-s md hydrated\"])[1]")).getText().substring(1);
		  float subtotalvalue = Float.parseFloat(subtotalvalue1);

		  String totalvalue1 = driver.findElement(By.xpath("(.//*[@class=\"order-footer-total-label ion-float-right sc-ion-label-md-h sc-ion-label-md-s md hydrated\"])[1]")).getText().substring(1);
		  float totalvalue = Float.parseFloat(totalvalue1);

		  String paidvalue1 = driver.findElement(By.xpath("(.//*[@class=\"order-footer-total-label ion-float-right sc-ion-label-md-h sc-ion-label-md-s md hydrated\"])[2]")).getText().substring(1);
		  float paidvalue = Float.parseFloat(paidvalue1);

		  if(subtotalvalue == subtotal && total == totalvalue && total == paidvalue) {
		      System.out.println("Done a Good job");

	}else {
	      System.out.println("Sorry try again");
	}

}
}

