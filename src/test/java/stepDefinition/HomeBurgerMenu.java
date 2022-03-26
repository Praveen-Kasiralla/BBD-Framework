package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utility.BaseClass;

public class HomeBurgerMenu extends BaseClass{

	@And("click on hamburger menu in home page")
	public void click_on_hamburger_menu_in_home_page() throws IOException {
		exReport.createNewTestReport("Open Menu");
		home.clickBurgerMenu();
	}

	@Then("click on wallet insibe the menu")
	public void click_on_wallet_insibe_the_menu() throws IOException {
		exReport.createNewTestReport("Open Wallet");
		home.clickWallet();
	}
	@Then("click on interiors insibe the menu")
	public void click_on_interiors_insibe_the_menu() throws IOException {
		exReport.createNewTestReport("Open Interior");
		home.clickInterior();
	}
}
