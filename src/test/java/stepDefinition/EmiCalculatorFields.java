package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utility.BaseClass;

public class EmiCalculatorFields extends BaseClass{

	@Then("enter {string} loan amount")
	public void enter_loan_amount(String loanAmount) throws IOException, InterruptedException {
		exReport.createNewTestReport("Enter Loan Amount");
		calculator.enterLoanAmount(loanAmount);
	}

	@And("enter {string} rate of interest")
	public void enter_rate_of_interest(String rateOfInterest) throws IOException, InterruptedException {
		exReport.createNewTestReport("Enter Rate Of Interest");
		calculator.enterRateOfInterest(rateOfInterest);
	}

	@Then("enter {string} loan tenure")
	public void enter_loan_tenure(String loanTenure) throws IOException, InterruptedException {
		exReport.createNewTestReport("Enter Loan Tenure");
		calculator.enterLoanTenure(loanTenure);
	}

	@And("see the emi output")
	public void see_the_emi_output() throws IOException {
		exReport.createNewTestReport("Emi Output");
		calculator.emiCalculated();
	}

}
