package com.osa.locator;


	


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;

	public class FindingLocators {
		public static WebDriver dr;
		// make constructor
		
		public FindingLocators(WebDriver driver) {
			this.dr=driver;
			PageFactory.initElements(driver, this);
			
		}

		public static WebElement getElements(By locator) {
			WebElement wel=dr.findElement(locator);
			return wel;
		}
		
		public static WebElement getValue(String locatorType,String locatorValue) {
			By by=null;
			if(locatorType.equals("xpath")) {
				by=By.xpath(locatorValue);
			}
			else if(locatorType.equals("id")) {
				by=By.id(locatorValue);
			}
			else if(locatorType.equals("name")) {
				by=By.name(locatorValue);
			}
			else if(locatorType.equals("tagName")) {
				by=By.name(locatorValue);
				
			}
			else if(locatorType.equals("cssSelector")) {
				by=By.name(locatorValue);
			}
			else if(locatorType.equals("linkText")) {
				by=By.name(locatorValue);
			}
			else if(locatorType.equals("className")) {
				by=By.name(locatorValue);	
				
			}	
			else if(locatorType.equals("partialLinkText")) {
				by=By.name(locatorValue);
				
			}	
				return dr.findElement(by);
			
		}
		
		
		
	}




