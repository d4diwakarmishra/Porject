package Test.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public WebElement element;

	@BeforeMethod
	public void preCondition() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		System.out.println("Chrome launched");

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.growthengineering.co.uk/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void postCondition() {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.close();
		System.out.println("Browser closed");
	}

}
