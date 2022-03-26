package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import utility.BaseClass;

public class InteriorOptions extends BaseClass{

	@And("see the room design photos in interior page")
	public void see_the_room_design_photos_in_interior_page() throws IOException, InterruptedException {
		exReport.createNewTestReport("See room photos");
		interior.clickOnRooms();
	}
}
