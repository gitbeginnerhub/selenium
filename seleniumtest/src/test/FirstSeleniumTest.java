package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFiles;

public class FirstSeleniumTest {

	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		//setBrowser();
		PropertiesFiles.readPropertiesFiles();
		setBrowserConfig();
		runTest();
		PropertiesFiles.writePropertiesFiles();	
	}

	//setBrowser
	//setBrowserConfig
	//runTest


	public static void setBrowser() {
		browser="Firefox";

	}

	public static void setBrowserConfig() {

		
		//this block contains code for Firefox
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dhwan\\eclipse-workspace\\seleniumtest\\lib\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//this block contains code for Chrome
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.dr iver", "C:\\Users\\dhwan\\eclipse-workspace\\seleniumtest\\lib\\chromedriver\\chromedriver.exe");		
			driver = new ChromeDriver();
		}
	}

	public static void runTest() {
		driver.get("https://selenium.dev/");
		driver.quit();

	}







}
