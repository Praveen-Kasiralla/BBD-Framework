package stepDefinition;

import java.io.IOException;

import io.cucumber.java.en.Then;
import utility.BaseClass;

public class AboutUsSections extends BaseClass{

	@Then("click on contatc us and twitter in about us page")
	public void click_on_contatc_us_and_twitter_in_about_us_page() throws IOException, InterruptedException {
		exReport.createNewTestReport("Open Twitter");
		aboutUs.clickContatcUs();
		aboutUs.openTwitter();
	}
	@Then("click on our blog which will open another tab")
	public void click_on_our_blog_which_will_open_another_tab() throws IOException, InterruptedException {
		exReport.createNewTestReport("Our Blog");
		aboutUs.clickBlog();
	}
}
