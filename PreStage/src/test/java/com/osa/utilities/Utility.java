package com.osa.utilities;




	import java.util.Properties;

	import org.apache.log4j.Logger;
	import org.apache.log4j.PropertyConfigurator;
	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;



	public class Utility {
		
	     
		 static Properties pro;
		 public static Logger getLog(Class clazz) {
			Logger log=Logger.getLogger(clazz);
			PropertyConfigurator.configure("src/test/resources/Properties/Config.properties");
			return log;
		 }
		 private static Logger log = Utility.getLog(Utility.class);
		 
		 public static void verifyString(String actual) {
			 
			 String expected="Forum Login";
			 
			        log.info("We want to verify expected and actual value");
				if(expected.equals(actual)) {
				    log.info("Our expected value is matched");
				    System.out.println("The actual and expected are matched");
				}
				else{
					log.info("Our expected did not match");
					System.out.println("The actual and expected did not match");
					log.info("This is expected value");
					System.out.println("The expected vallue is : "+expected);
					log.info("This is actual value");
					System.out.println("But the actual vallue is : "+actual);
					log.info("We are varifying Assert are Equal or not");
				    Assert.assertEquals(expected, actual);
				}
		 }
	}

