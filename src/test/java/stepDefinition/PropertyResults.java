package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utility.BaseClass;

public class PropertyResults extends BaseClass{

	@Then("click on a property from the result which will open in another tab")
	public void click_on_a_property_from_the_result_which_will_open_in_another_tab() throws IOException {
		exReport.createNewTestReport("Click Article");
		propertyList.clickArtical();
	}
	
	@And("click on the property photos")
	public void click_on_the_property_photos() throws IOException {
		exReport.createNewTestReport("See Photos");
		property.photos();
	}
	
	@Then("click on map option and make it fullscreen")
	public void click_on_map_option_and_make_it_fullscreen() throws IOException, InterruptedException {
		exReport.createNewTestReport("Swith Map And Zoom");
		propertyList.selectDisplayMethod("map");
		propertyList.fullscreen();
	}

}
