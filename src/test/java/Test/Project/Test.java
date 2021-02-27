package Test.Project;


import org.testng.Assert;

public class Test extends BaseClass {

	@org.testng.annotations.Test
	public void scenario1() throws InterruptedException {
	System.out.println("Scenario 1 excection start");
		if (driver.getTitle().contains("Growth Engineering - Online Learning Engagement Experts")) {
			Assert.assertTrue(true);
			System.out.println("Growth Engineering title is displaying");
			POM pom = new POM(driver);
			POM.implicitWait(driver, 60);
			pom.verifyOurProduct(driver);
			pom.verifyOurApproch(driver);
			pom.verifyResources(driver);
			pom.verifyAboutUs(driver);
			pom.verifyGetInTouch(driver);

		} else {
			System.out.println("Growth Engineering page is not loading");
			Assert.assertTrue(false);
		}
	}

	@org.testng.annotations.Test
	public void scenario2() throws Exception {
		System.out.println("Scenario 2 excection start");
		if (driver.getTitle().contains("Growth Engineering - Online Learning Engagement Experts")) {
			Assert.assertTrue(true);
			System.out.println("Growth Engineering title is displaying");
			driver.get("https://www.growthengineering.co.uk/contact/");
			POM pom = new POM(driver);
			POM.implicitWait(driver, 60);
			pom.verifyValidationMessage(driver);

		} else {
			System.out.println("Growth Engineering page is not loading");
			Assert.assertTrue(false);
		}
	}
	
}
