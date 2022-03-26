package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utility.BaseClass;

public class SearchFields extends BaseClass{

	@And("click on {string}")
	public void click_on(String string) throws IOException {
		exReport.createNewTestReport("Search type");
		home.selectSearchType(string);
	}
	
	@And("select {string} from city dropdown")
	public void select_from_city_dropdown(String city) throws IOException {
		exReport.createNewTestReport("Select City");
		home.selectCity(city);
	}
	
	@Then("select {string} and {string} from dropdown two and dropdown three")
	public void select_and_from_dropdown_two_and_three_dropdown(String dropdown2, String dropdown3) throws InterruptedException, IOException {
		exReport.createNewTestReport("Select options From dropdown");
		home.dropDown(2, dropdown2);
		home.dropDown(3, dropdown3);
	}
	
	@And("enter {string} in search bar and click search")
	public void enter_in_search_bar_and_click_search(String locality) throws InterruptedException, IOException {
		exReport.createNewTestReport("Search For Property");
		home.typeAndSearch(locality);
	}
	
	@And("click on {string} radio button")
	public void click_on_radio_button(String type) throws IOException {
		exReport.createNewTestReport("Commercial Search Type");
		home.selectCommercialType(type);
	}

	@Then("select {string} from dropdown")
	public void select_from_dropdown(String option) throws InterruptedException, IOException {
		exReport.createNewTestReport("Select options From dropdown");
		home.dropDown(2, option);
	}
	
	@And("click on {string} property type to rent")
	public void click_on_property_type_to_rent(String type) throws IOException {
		exReport.createNewTestReport("Rent Property Type");
		home.selectRentType(type);
	}
}
