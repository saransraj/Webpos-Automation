package Linga;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TenantCube {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver",Utility.getProperty("Chrome_Driver_Path"));
		driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
  }

  @Test(priority = 0)
  public void Validate_whether_all_the_mandatoryfieldsAreFilledAndNavigateToNextPage() throws Exception {
    driver.get("https://staging.tenantcube.com/");
    driver.findElement(By.xpath(".//input[@type=\"email\"]")).sendKeys("saransraj13@gmail.com");
    driver.findElement(By.xpath(".//input[@type=\"password\"]")).sendKeys("saran81488");
    driver.findElement(By.xpath(".//button[text()=\"Sign in\"]")).click();
    driver.findElement(By.xpath(".//a[@id=\"ember32\"]")).click();
    driver.findElement(By.xpath(".//i[@class=\"i-more fs-26\"]")).click();
    driver.findElement(By.xpath(".//a[text()=\"Edit Profile\"]")).click();



    driver.findElement(By.xpath("//a[contains(text(),'Basic Information')]")).click();
    System.out.println("Open");
    WebElement addFile = driver.findElement(By.id("avatarUpload"));
    addFile.sendKeys("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\saran.jpg");
    System.out.println("Check image");
    driver.findElement(By.xpath(".//input[@placeholder=\"First name\"]")).clear();
    driver.findElement(By.xpath(".//input[@placeholder=\"First name\"]")).sendKeys("Saranraj");
    driver.findElement(By.xpath(".//input[@placeholder=\"Last name\"]")).clear();
    driver.findElement(By.xpath(".//input[@placeholder=\"Last name\"]")).sendKeys("Sekar");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    driver.findElement(By.xpath(".//input[@class=\"datepicker-input form-control\"]")).click();
    driver.findElement(By.xpath("//div[contains(@class,\"ember-view ember\")]/nav/div/span[2]/select")).click();

    new Select(driver.findElement(By.xpath("//div[contains(@class,\"ember-view ember\")]/nav/div/span[2]/select"))).selectByVisibleText("1996");
    driver.findElement(By.xpath("(//div[contains(@class,\"ember-view ember\")]/nav/div/span/select)[1]")).click();
    new Select(driver.findElement(By.xpath("(//div[contains(@class,\"ember-view ember\")]/nav/div/span/select)[1]"))).selectByVisibleText("May");
    driver.findElement(By.xpath(".//button[contains(@data-date,\"13\")]")).click();
    try {
        driver.findElement(By.xpath("(.//i[@class=\"glyphicon i-delete\"])[1]")).click();

	} catch (Exception e) {
	}
    Thread.sleep(5000);
    WebElement addFile1 = driver.findElement(By.xpath(".//input[@id=\"directUploadAdd proof of identity\"]"));
    addFile1.sendKeys("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\saran.jpg");
    try {
        driver.findElement(By.xpath("(.//i[@class=\"glyphicon i-delete\"])[2]")).click();
	} catch (Exception e) {
	}

    WebElement addFile2 = driver.findElement(By.xpath(".//input[@id=\"directUpload \"]"));
    addFile2.sendKeys("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\saran.jpg");
    System.out.println("Check image2");

    driver.findElement(By.xpath(".//button[text()=\"Save and Continue\"]")).click();
    String t = "The field Current Address";
    if ( driver.getPageSource().contains("Current Address")){
       System.out.println("Text: " + t + " is present. ");
    } else {
       System.out.println("Text: " + t + " is not present. ");
    }
    
  }
  
  @Test(priority = 1)
  public void Validate_forErrorMessageInManditoryField() throws Exception {
	    driver.findElement(By.xpath("(.//input[@type=\"text\"])[2]")).clear();
	    driver.findElement(By.xpath(".//button[text()=\"Save and Continue\"]")).click();
	    String t = "Enter a valid city name";
	    if ( driver.getPageSource().contains("Enter a valid city name")){
	       System.out.println("Text: " + t + " is present. ");
	    } else {
	       System.out.println("Text: " + t + " is not present. ");
	    }
  }
  }