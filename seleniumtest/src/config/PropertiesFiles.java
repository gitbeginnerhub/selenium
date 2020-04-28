package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeleniumTest;

public class PropertiesFiles {

	static Properties prop = new Properties();

	public static void main(String[] args) {
		readPropertiesFiles();
		writePropertiesFiles();
		readPropertiesFiles();
		

	}

	public static void readPropertiesFiles() {

		try {
			InputStream input = new FileInputStream("C:\\Users\\dhwan\\eclipse-workspace\\seleniumtest\\src\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			FirstSeleniumTest.browser=prop.getProperty("browser");
			System.out.println(FirstSeleniumTest.browser);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public static void writePropertiesFiles() {

		try {
			OutputStream output = new FileOutputStream("C:\\Users\\dhwan\\eclipse-workspace\\seleniumtest\\src\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, "abcd");



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
