package Linga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TaskTwo {
	static WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void TestCase1() throws Exception {
		driver.get("https://www.seleniumeasy.com/");
		driver.findElement(By.xpath("//div[@id=\"navbar-collapse\"]/nav/ul/li[2]/a")).click();
		String seleniumjava = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//div[@id=\"navbar-collapse\"]/nav/ul/li[2]/ul/li/a[text()=\"Selenium with Java\"]")).sendKeys(seleniumjava);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println("Page Title of second tab :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(0));
		System.out.println("Page Title of first tab :"+driver.getTitle());
		driver.quit();
	}



}
