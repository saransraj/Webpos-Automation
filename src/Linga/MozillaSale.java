package Linga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaSale {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver;
				System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Mozilla\\geckodriver.exe");
				driver = new FirefoxDriver();

				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("http://pre-webpos.lingapos.com");
				Thread.sleep(10000);
				driver.findElement(By.id("mat-input-0")).sendKeys("chotu@mail.com");
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

					for (int j = 0; j < 100; j++){
					driver.findElement(By.xpath(".//*[text()=\"Done\"]")).click();
					//driver.findElement(By.xpath(".//*[text()= \"Chai\"]")).click();
					driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();
					//driver.findElement(By.xpath(".//*[text()= \"chai wale\"]")).click();

					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[text()= \"Finish\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath(".//*[text()= \" QSR \"]")).click();
					Thread.sleep(1000);

			}
	}

}
