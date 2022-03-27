package pageobject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reusable.WebDriverHelper;
import uistore.HomePageUi;
import utility.BaseClass;
import utility.ExtentReport;
import utility.Logs;

public class HomePage extends BaseClass {
	public WebDriver driver;
	public WebDriverHelper webDriver;
	public ExtentReport exReport;
	public Logs logs = new Logs();

	public HomePage(WebDriver driverr, WebDriverHelper webDriverr, ExtentReport exReportt) {
		driver = driverr;
		webDriver = webDriverr;
		exReport = exReportt;
		logs.createLogger(HomePage.class);
	}
	
	public void selectSearchType(String type) throws IOException {
		exReport.enterInfoLog("Clicking on "+type+" option");
		logs.enterInfoLog("Clicking on "+type+" option");
		if(type.equals("buy")) {
			webDriver.clickElement(driver, HomePageUi.rent);
			webDriver.clickElement(driver, HomePageUi.buy);
		}else if(type.equals("rent")) {
			webDriver.clickElement(driver, HomePageUi.buy);
			webDriver.clickElement(driver, HomePageUi.rent);
		}else if(type.equals("commercial")) {
			webDriver.clickElement(driver, HomePageUi.buy);
			webDriver.clickElement(driver, HomePageUi.commercial);
		}
		if(webDriver.getCurrentUrl(driver).contains(type)) {
			exReport.enterPassLog(type+" is selected");
			logs.enterInfoLog(type+" is selected");
		}else {
			exReport.enterFailLogWithSnap(type+" is not selected");
			logs.enterErrorLog(type+" is not selected");
		}
	}
	
	public void selectCity(String city) throws IOException {
		exReport.enterInfoLog("Clicking on city dropdown and selecting "+city);
		logs.enterInfoLog("Clicking on city dropdown and selecting "+city);
		webDriver.clickElement(driver, HomePageUi.selectCity);
		HomePageUi.option = city;
		webDriver.clickElement(driver, HomePageUi.dropDownMenuOption());
		if(webDriver.getText(driver, HomePageUi.selectCity).contains(city)) {
			exReport.enterPassLog(city+" selected");
			logs.enterInfoLog(city+" selected");
		}else {
			exReport.enterFailLogWithSnap(city+" not selected");
			logs.enterErrorLog(city+" not selected");
		}
	}
	
	public void selectRentType(String type) throws IOException {
		exReport.enterInfoLog("Clicking on "+type+" option");
		logs.enterInfoLog("Clicking on "+type+" option");
		By radio = type.equals("full house")? HomePageUi.fullHouse:(type.equals("pg")? HomePageUi.pg:HomePageUi.flatmates);
		webDriver.clickElement(driver, radio);
		if(webDriver.isSelected(driver, radio)) {
			exReport.enterPassLog(type+" is selected");
			logs.enterInfoLog(type+" is selected");
		}else {
			exReport.enterFailLogWithSnap(type+" not selected");
			logs.enterErrorLog(type+" not selected");
		}
	}
	
	public void selectCommercialType(String type) throws IOException {
		exReport.enterInfoLog("Clicking on "+type+" option");
		logs.enterInfoLog("Clicking on "+type+" option");
		By radio = type.equals("rent")? HomePageUi.commercialRent:HomePageUi.commercialBuy;
		webDriver.clickElement(driver, radio);
		if(webDriver.isSelected(driver, radio)) {
			exReport.enterPassLog(type+" is selected");
			logs.enterInfoLog(type+" is selected");
		}else {
			exReport.enterFailLogWithSnap(type+" not selected");
			logs.enterErrorLog(type+" not selected");
		}
	}
	
	public void dropDown(int dropdown ,String option) throws InterruptedException, IOException {
		exReport.enterInfoLog("Clicking on dropdown and selecting "+option);
		logs.enterInfoLog("Clicking on dropdown and selecting "+option);
		By dropDown = dropdown==2? HomePageUi.dropDown2:HomePageUi.dropDown3;
		webDriver.clickElement(driver, dropDown);
		HomePageUi.option = option;
		webDriver.clickElement(driver, HomePageUi.dropDownMenuOption());
		if(webDriver.getText(driver, dropDown).contains("option "+option) || webDriver.getText(driver, dropDown).contains(option)) {
			exReport.enterPassLog(option+" is selected");
			logs.enterInfoLog(option+" is selected");
		}else {
			exReport.enterFailLogWithSnap(option+" not selected");
			logs.enterErrorLog(option+" not selected");
		}
	}
	
	public void typeAndSearch(String locality) throws InterruptedException, IOException {
		exReport.enterInfoLog("Typing "+locality+" in search bar and clicking on search button");
		logs.enterInfoLog("Typing "+locality+" in search bar and clicking on search button");
		webDriver.clickElement(driver, HomePageUi.searchBar);
		webDriver.sendText(driver, HomePageUi.searchBar, locality);
		webDriver.clickElement(driver, HomePageUi.searchDropdown);
		String homeUrl = webDriver.getCurrentUrl(driver);
		webDriver.waitUntilVisible(driver,HomePageUi.selectedLocality);
		webDriver.clickElement(driver, HomePageUi.searchButton);
		if(!webDriver.getCurrentUrl(driver).equals(homeUrl)) {
			exReport.enterPassLogWithSnap("Property list page is  opened");
			logs.enterInfoLog("Property list page is  opened");
		}else {
			exReport.enterFailLogWithSnap("Property list page is not opened");
			logs.enterErrorLog("Property list page is not opened");
		}
	}
	
	public void clickBurgerMenu() throws IOException {
		exReport.enterInfoLog("Clicking on Hamburger menu");
		logs.enterInfoLog("Clicking on Hamburger menu");
		webDriver.clickElement(driver, HomePageUi.burgerMenu);
		if(webDriver.isDisplayed(driver, HomePageUi.burgerHome)) {
			exReport.enterPassLog("Menu is open");
			logs.enterInfoLog("Menu is open");
		}else {
			exReport.enterFailLogWithSnap("Menu did not open");
			logs.enterErrorLog("Menu did not open");
		}
	}
	
	public void clickWallet() throws IOException {
		exReport.enterInfoLog("Clicking on NBcash and wallet summary");
		logs.enterInfoLog("Clicking on NBcash and wallet summary");
		webDriver.clickElement(driver, HomePageUi.nbCashWallet);
		webDriver.clickElement(driver, HomePageUi.walletSummary);
		if(webDriver.getPageTitle(driver).contains("Wallet")) {
			exReport.enterPassLog("Wallet Summary page has opened");
			logs.enterInfoLog("Wallet Summary page has opened");
		}else {
			exReport.enterFailLogWithSnap("Wallet Summary page did not open");
			logs.enterErrorLog("Wallet Summary page did not open");
		}
	}
	
	public void clickInterior() throws IOException {
		exReport.enterInfoLog("Clicking on Home Services and Interiors");
		logs.enterInfoLog("Clicking on Home Services and Interiors");
		webDriver.clickElement(driver, HomePageUi.homeServices);
		webDriver.clickElement(driver, HomePageUi.interiors);
		if(webDriver.getPageTitle(driver).contains("Interior")) {
			exReport.enterPassLog("Interiors page has opened");
			logs.enterInfoLog("Interiors page has opened");
		}else {
			exReport.enterFailLogWithSnap("Interiors page did not open");
			logs.enterErrorLog("Interiors page did not open");
		}
	}
	
	public void clickLogin() throws IOException {
		exReport.enterInfoLog("Clicking on Login button");
		logs.enterInfoLog("Clicking on Login Button");
		webDriver.clickElement(driver, HomePageUi.login);
		webDriver.waitUntilVisible(driver, HomePageUi.loginSignUpForm);
		if(webDriver.isDisplayed(driver, HomePageUi.loginSignUpForm)) {
			exReport.enterPassLog("Login form is displayed");
			logs.enterInfoLog("Login form is displayed");
		}else {
			exReport.enterFailLogWithSnap("Login form is not displayed");
			logs.enterErrorLog("Login form is not displayed");
		}
	}
	public void enterNumberAndSelectPassword(String number) throws IOException {
		exReport.enterInfoLog("Enter Phone Number");
		logs.enterInfoLog("Enter phone number");
		webDriver.sendText(driver, HomePageUi.phoneNumber, number);
		webDriver.waitUntilClikable(driver, HomePageUi.selectPassword);
		webDriver.clickElement(driver, HomePageUi.selectPassword);
		if(webDriver.isDisplayed(driver, HomePageUi.enterPassword)) {
			exReport.enterPassLog("field are displayed after clicking password");
			logs.enterInfoLog("field are displayed after clicking password");
		}else {
			exReport.enterFailLogWithSnap("Fields are not displayed");
			logs.enterErrorLog("Fields are not displayed");
		}	
	}
	
	public void enterValidPassword(String password) throws IOException, InterruptedException {
		exReport.enterInfoLog("Entering valid password and clicking continue");
		logs.enterInfoLog("Entering valid password and clicking continue");
		webDriver.sendText(driver, HomePageUi.enterPassword, password);
		webDriver.waitUntilValuePresent(driver, HomePageUi.enterPassword, password);
		webDriver.clickElement(driver, HomePageUi.showPassword);
		Thread.sleep(1000);
		webDriver.clickElement(driver, HomePageUi.Continue);
		webDriver.waitUntilVisible(driver, HomePageUi.progileName);
		if(webDriver.isDisplayed(driver, HomePageUi.progileName)) {
			exReport.enterPassLogWithSnap("Login is successfull");
			logs.enterInfoLog("Login is successfull");
		}else {
			exReport.enterFailLogWithSnap("Login was Unsuccessfull");
			logs.enterErrorLog("Login was Unsuccessfull");
		}
	}
	
	public void enterInvalidPassword(String password) throws IOException {
		exReport.enterInfoLog("Entering Invalid password and clicking continue");
		logs.enterInfoLog("Entering Invalid password and clicking continue");
		webDriver.sendText(driver, HomePageUi.enterPassword, password);
		webDriver.waitUntilValuePresent(driver, HomePageUi.enterPassword, password);
		webDriver.clickElement(driver, HomePageUi.showPassword);
		webDriver.clickElement(driver, HomePageUi.Continue);
		webDriver.waitUntilVisible(driver, HomePageUi.invalidMsg);
		if(webDriver.isDisplayed(driver, HomePageUi.invalidMsg)) {
			exReport.enterPassLogWithSnap("Invalid Password is displayed");
			logs.enterInfoLog("Invalid Password is displayed");
		}else {
			exReport.enterFailLogWithSnap("Invalid Password was not displayed");
			logs.enterErrorLog("Invalid Password was not displayed");
		}
	}
	

}
