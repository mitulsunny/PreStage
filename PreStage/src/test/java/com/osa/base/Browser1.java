package com.osa.base;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Browser1 {
		public static WebDriver dr;
		public static WebDriver openBrowser(String driverPath) {
			System.setProperty("webdriver.chrome.driver",driverPath);
			dr=new ChromeDriver();
			return dr;
			
		}
		
		

	}


