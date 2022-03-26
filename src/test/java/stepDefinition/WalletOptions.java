package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.And;
import utility.BaseClass;

public class WalletOptions extends BaseClass{

	@And("click on join club button")
	public void click_on_join_club_button() throws IOException {
		exReport.createNewTestReport("Join Club");
		wallet.clickClub();
	}
}
