package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.BaseClass;

public class Common extends BaseClass{

	@Given("initialize the {string} browser")
	public void initialize_the_browser(String browser) throws IOException {
	    required();
	    driverSetUp(browser);
	}
	
	@Then("navigate to {string} website")
	public void navigate_to_website(String Url) throws IOException {
		exReport.createNewTestReport("Open NoBroker");
		logs.enterInfoLog("Open NoBroker");
		exReport.enterInfoLog("Opening NoBroker.in");
		webDriver.openPage(driver, Url);
		if (webDriver.getCurrentUrl(driver).equals(Url)) {
			exReport.enterPassLogWithSnap("NoBroker as opened");
			logs.enterInfoLog("NoBroker as opened");
		} else {
			exReport.enterFailLogWithSnap("NoBroker as opened");
		}
	}
	
	@And("set the {string} and {string} of the browser")
	public void set_the_and_of_the_browser(String width, String height) {
	  webDriver.setSize(driver, Integer.parseInt(width), Integer.parseInt(height));
	}
	
	@And("exit the browser")
	public void exit_the_browser() throws IOException {
	    driverExit();
	}
}
