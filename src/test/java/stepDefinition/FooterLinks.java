package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utility.BaseClass;

public class FooterLinks extends BaseClass{

	@And("click on Emi calculator in footer which will open in next tab")
	public void click_on_Emi_calculator_in_footer_which_will_open_in_next_tab() throws IOException, InterruptedException {
		exReport.createNewTestReport("EMI Calculator Page");
		footer.clickEmiCalculator();
	}
	@And("click on About Us in footer")
	public void click_on_About_Us_in_footer() throws IOException, InterruptedException {
		exReport.createNewTestReport("Click About Us");
		footer.clickAboutUs();
	}
	
	@Then("click on home loan which will open another tab")
	public void click_on_home_loan_which_will_open_another_tab() throws IOException, InterruptedException {
	    exReport.createNewTestReport("Click on Home Loan");
	    footer.clickHomeLoan();
	}
}
