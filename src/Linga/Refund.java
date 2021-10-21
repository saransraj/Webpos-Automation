package Linga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Refund extends Login{
	static WebDriver driver;
	@Test
	public static void main(String[] args) throws InterruptedException {
		driver.findElement(By.xpath(".//*[text()=\"Cancel\"]")).click();
		  Thread.sleep(2000);

		  //Calculation
		  driver.findElement(By.xpath(".//*[text()=\"Chai\"]")).click();
		  Thread.sleep(500);
	}

}
