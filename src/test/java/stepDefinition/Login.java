package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utility.BaseClass;

public class Login extends BaseClass{

		@And("click on Login")
		public void click_on_login() throws IOException {
			exReport.createNewTestReport("Click on Login");
			home.clickLogin();
		}

		@Then("enter phone number {string} select password method")
		public void enter_phone_number_select_password_method(String number) throws IOException {
			exReport.createNewTestReport("Enter Number");
			home.enterNumberAndSelectPassword(number);
		}
		@And("enter valid password {string} and click on continue")
		public void enter_valid_password_and_click_on_continue(String password) throws IOException, InterruptedException {
			exReport.createNewTestReport("Enter Valid Password");
			home.enterValidPassword(password);
		}
		
		@And("enter invalid password {string} and click on continue")
		public void enter_invalid_password_and_click_on_continue(String password) throws IOException {
			exReport.createNewTestReport("Enter Invalid Password");
			home.enterInvalidPassword(password);
		}



}
