

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowser {

	static WebDriver dr = null;
	static String basePath = System.getProperty("user.dir");

	public static void main(String[] args) {
		openingBrowser("chrome");	
	}

	public static WebDriver openingBrowser(String browser) {

		if (System.getProperty("os.name").contains("Windows")) {

			browserForWindows(browser);
		} else if (System.getProperty("os.name").contains("Mac OS")){
			browserForMac(browser);
		}
		return dr;
	}

	public static void browserForWindows(String browser) {
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", basePath + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
			dr = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					basePath + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
			dr = new ChromeDriver();
		} else {
			System.out.println("You have entered " + browser + " that does not exist. Please either chrome or firefox");
		}
	}

	public static void browserForMac(String browser) {
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", basePath + "src/test/resources/Drivers/geckodriver.exe");
			dr = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", basePath + "src/test/resources/Drivers/chromedriver.exe");
			dr = new ChromeDriver();
		} else {
			System.out.println("You have entered " + browser + " that does not exist. Please either chrome or firefox");
		}
	}

}
