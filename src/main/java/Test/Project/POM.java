package Test.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class POM extends BaseClass {
	WebDriver driver;

	public POM(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Our Products")
	@CacheLookup
	private WebElement ourProducts;

	@FindBy(partialLinkText = "Our Approach")
	@CacheLookup
	private WebElement ourApproach;

	@FindBy(partialLinkText = "Resources")
	@CacheLookup
	private WebElement resources;

	@FindBy(partialLinkText = "About Us")
	@CacheLookup
	private WebElement aboutUs;

	@FindBy(partialLinkText = "GET IN TOUCH")
	@CacheLookup
	private WebElement getInTouch;

	@FindBy(xpath = "(//h2[@class='elementor-heading-title elementor-size-default'])[1]")
	@CacheLookup
	private WebElement contactTitle;

	@FindBy(xpath = "//span[contains(text(),'First name')]/../..//label[@class='hs-error-msg']")
	@CacheLookup
	private WebElement firstNameValidation;

	@FindBy(xpath = "//span[contains(text(),'Last name')]/../..//label[@class='hs-error-msg']")
	@CacheLookup
	private WebElement lastNameValidation;

	@FindBy(xpath = "//span[contains(text(),'Work Email')]/../..//input[contains(@class,'hs-input')]")
	@CacheLookup
	private WebElement workEmailTextBox;

	@FindBy(xpath = "//span[contains(text(),'Work Email')]/../..//label[@class='hs-error-msg']")
	private WebElement workEmailValidation;

	@FindBy(xpath = "//span[contains(text(),'Telephone')]/../..//input[contains(@class,'hs-input')]")
	@CacheLookup
	private WebElement telephoneTextBox;

	@FindBy(xpath = "//span[contains(text(),'Telephone')]/../..//label[@class='hs-error-msg']")
	private WebElement telephoneValidation;

	@FindBy(xpath = "//span[contains(text(),'Company name')]/../..//label[@class='hs-error-msg']")
	@CacheLookup
	private WebElement companyNameValidation;

	@FindBy(xpath = "//span[contains(text(),'Country')]/../..//label[@class='hs-error-msg']")
	@CacheLookup
	private WebElement countryValidation;

	@FindBy(xpath = "//label[@id='label-role_description-63c6168e-e30a-4c79-ab68-77cedae08dfe']/../..//label[@class='hs-error-msg']")
	@CacheLookup
	private WebElement yourRoleValidation;

	@FindBy(xpath = "//span[contains(text(),'What is the purpose of your enquiry?')]/../..//label[@class='hs-error-msg']")
	@CacheLookup
	private WebElement enquiryValidation;

	@FindBy(xpath = "//li[@data-reactid='.hbspt-forms-0.1:$6.1:$i_have_read_and_understand_growth_engineering_s_privacy_poolicy.3.$0']")
	@CacheLookup
	private WebElement privacyValidation;

	@FindBy(xpath = "//input[@class='hs-button primary large']")
	@CacheLookup
	private WebElement submitButton;

	// Methods---

	public static void javaScriptScrollDown(WebDriver driver) throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,300)", "");

	}

	public static void javaScriptScrollUp(WebDriver driver) throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-300)", "");

	}

	public static void implicitWait(WebDriver driver, int time)

	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void explicitWaitForVisibility(WebDriver driver, int time, WebElement element)

	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void verifyOurProduct(WebDriver driver) {
		explicitWaitForVisibility(driver, 30, ourProducts);
		if (ourProducts.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Our Products menu is displaying and verified");
			ourProducts.click();
			ourProducts.click();
			System.out.println("Click on Our product menu");
			implicitWait(driver, 60);
			if (driver.getTitle().contains("The #1 Learning Management System for Employee Engagement")) {
				Assert.assertTrue(true);
				System.out.println("Our Products menu is working and verified");
			}

			else {
				System.out.println("Our Products menu is not working");
				Assert.assertTrue(false);
			}

		} else {
			System.out.println("Our Products menu is not displaying");
			Assert.assertTrue(false);
		}
	}

	public void verifyOurApproch(WebDriver driver) {
		explicitWaitForVisibility(driver, 30, ourApproach);
		if (ourApproach.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Our Approach menu is displaying and verified");
			ourApproach.click();
			ourApproach.click();
			System.out.println("Click on Our Approach menu");
			implicitWait(driver, 60);
			if (driver.getTitle().contains("Brain Science - Growth Engineering")) {
				Assert.assertTrue(true);
				System.out.println("Our Approach menu is working and verified");
			}

			else {
				System.out.println("Our Approach menu is not working");
				Assert.assertTrue(false);
			}

		} else {
			System.out.println("Our Approach menu is not displaying");
			Assert.assertTrue(false);
		}
	}

	public void verifyResources(WebDriver driver) {
		explicitWaitForVisibility(driver, 30, resources);
		if (resources.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Resources menu is displaying and verified");
			resources.click();
			resources.click();
			System.out.println("Click on Resources menu");
			implicitWait(driver, 60);
			if (driver.getTitle()
					.contains("Resources | White Papers, Tip Sheets & Infographics - Growth Engineering")) {
				Assert.assertTrue(true);
				System.out.println("Resources menu is working and verified");
			}

			else {
				System.out.println("Resources menu is not working");
				Assert.assertTrue(false);
			}

		} else {
			System.out.println("Resources menu is not displaying");
			Assert.assertTrue(false);
		}
	}

	public void verifyAboutUs(WebDriver driver) {
		explicitWaitForVisibility(driver, 30, aboutUs);
		if (aboutUs.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("About Us menu is displaying and verified");
			aboutUs.click();
			aboutUs.click();
			System.out.println("Click on About Us menu");
			implicitWait(driver, 60);
			if (driver.getTitle().contains("About Us | Online Learning Superheroes - Growth Engineering")) {
				Assert.assertTrue(true);
				System.out.println("About Us menu is working and verified");
			}

			else {
				System.out.println("About Us menu is not working");
				Assert.assertTrue(false);
			}

		} else {
			System.out.println("About Us menu is not displaying");
			Assert.assertTrue(false);
		}
	}

	public void verifyGetInTouch(WebDriver driver) {
		explicitWaitForVisibility(driver, 60, getInTouch);
		if (getInTouch.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Get In Touch menu is displaying and verified");
			getInTouch.click();
			System.out.println("Click on Get in touch menu");
			implicitWait(driver, 30);
			if (driver.getTitle().contains("Get in Touch | Growth Engineering - The Learning Engagement Experts")) {
				Assert.assertTrue(true);
				System.out.println("Get in touch menu is working and verified");
			}

			else {
				System.out.println("Get in touch menu is not working");
				Assert.assertTrue(false);
			}

		} else {
			System.out.println("Get In Touch menu is not displaying");
			Assert.assertTrue(false);
		}
	}

	public void verifyValidationMessage(WebDriver driver) throws Exception {
		explicitWaitForVisibility(driver, 30, contactTitle);
		javaScriptScrollDown(driver);
		Thread.sleep(10000);
		if (contactTitle.isDisplayed()) {
			Assert.assertTrue(true);
			System.out.println("Contact title is displaying and verified");
			javaScriptScrollDown(driver);
			explicitWaitForVisibility(driver, 30, submitButton);
			submitButton.click();
			Thread.sleep(1000);
			System.out.println("Click on submit button without entering any input");
			javaScriptScrollUp(driver);
			if (firstNameValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("First name validation message: " + firstNameValidation.getText());
			} else {
				System.out.println("First name validation message is not displaying");
				Assert.assertTrue(false);
			}

			if (lastNameValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Last name validation message: " + lastNameValidation.getText());
			} else {
				System.out.println("Last name validation is not displaying");
				Assert.assertTrue(false);
			}

			if (workEmailValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Work email validation message: " + workEmailValidation.getText());
				workEmailTextBox.sendKeys("abcd");
				submitButton.click();
				System.out.println("Enter abcd as email id");
				if (workEmailValidation.isDisplayed()) {
					Assert.assertTrue(true);
					System.out.println(
							"Work email validation message after invalid email: " + workEmailValidation.getText());
				}

			} else {
				System.out.println("Work email validation message is not displaying");
				Assert.assertTrue(false);
			}

			if (telephoneValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Telepohone validation message: " + telephoneValidation.getText());
				telephoneTextBox.sendKeys("yfchjn");
				System.out.println("Enter yfchjn as telephone number");
				submitButton.click();
				if (telephoneValidation.isDisplayed()) {
					Assert.assertTrue(true);
					System.out.println("Telephone validation message after invalid telephone number: "
							+ telephoneValidation.getText());
				}

			} else {
				System.out.println("Telephone validation message is not displaying");
				Assert.assertTrue(false);
			}

			if (companyNameValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Company name validation message: " + companyNameValidation.getText());
			} else {
				System.out.println("Company name validation message is not displaying");
				Assert.assertTrue(false);
			}

			if (countryValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Country validation message: " + countryValidation.getText());
			} else {
				System.out.println("Country validation message is not displaying");
				Assert.assertTrue(false);
			}

			if (yourRoleValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Your role validation message: " + yourRoleValidation.getText());
			} else {
				System.out.println("Your role validation message is not displaying");
				Assert.assertTrue(false);
			}

			if (enquiryValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Enquiry purpose validation message: " + enquiryValidation.getText());
			} else {
				System.out.println("Enquiry purpose validation message is not displaying");
				Assert.assertTrue(false);
			}

			if (privacyValidation.isDisplayed()) {
				Assert.assertTrue(true);
				System.out.println("Privacy policy validation message: " + privacyValidation.getText());
			} else {
				System.out.println("Privacy policy validation message is not displaying");
				Assert.assertTrue(false);
			}

		} else {
			System.out.println("Contact title is not displaying");
			Assert.assertTrue(false);
		}
	}

}
