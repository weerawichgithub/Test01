package test;

import driver.Driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.ListernersTestNG;
import utilities.PropertiesReader;
import utilities.commonMethods;

@Listeners(ListernersTestNG.class)
public class CRW001_LoginTesting extends commonMethods{

	@BeforeClass
	public void beforeTest() {
		//Go to phpTravel
		Driver.getDriver();

	}
	@Test
	public void test() {
		System.out.println("phpTravel testCase");
		//Login with valid username and password
		custPage.usernameLoginInput.sendKeys(PropertiesReader.getProperty("customerEmail"));
		custPage.passwordLoginInput.sendKeys(PropertiesReader.getProperty("customerPassword"));
		custPage.loginButton.click();


	}
}
