package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobject.AboutUsPage;
import pageobject.EmiCalculatorPage;
import pageobject.Footer;
import pageobject.HomePage;
import pageobject.InteriorPage;
import pageobject.PropertiesListPage;
import pageobject.PropertyPage;
import pageobject.WalletPage;
import reusable.WebDriverHelper;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverHelper webDriver;
	public static ExcelData excel;
	public static ExtentReport exReport;
	public static Logs logs;
	public static HomePage home;
	public static PropertiesListPage propertyList;
	public static PropertyPage property;
	public static EmiCalculatorPage calculator;
	public static Footer footer;
	public static AboutUsPage aboutUs;
	public static WalletPage wallet;
	public static InteriorPage interior;

	public void required() throws IOException {
		webDriver = new WebDriverHelper();
		excel = new ExcelData();
		logs = new Logs();
	}

	public void driverSetUp(String browser) throws IOException {
		if (ConfigReader.getBrowser(browser).contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (ConfigReader.getBrowser(browser).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		webDriver.implicitWait(driver, 10);
		exReport = new ExtentReport(driver);
		logs.createLogger(BaseClass.class);
		home = new HomePage(driver, webDriver, exReport);
		propertyList = new PropertiesListPage(driver, webDriver, exReport);
		property = new PropertyPage(driver, webDriver, exReport);
		calculator = new EmiCalculatorPage(driver, webDriver, exReport);
		footer = new Footer(driver, webDriver, exReport);
		aboutUs = new AboutUsPage(driver, webDriver, exReport);
		wallet = new WalletPage(driver, webDriver, exReport);
		interior = new InteriorPage(driver, webDriver, exReport);
	}

	public void driverExit() throws IOException {
		exReport.flush();
		driver.quit();
	}
}
