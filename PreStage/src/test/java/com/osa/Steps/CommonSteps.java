package com.osa.Steps;


	

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;


	import com.osa.base.Browser1;
	import com.osa.locator.FindingLocators;
	
	import com.osa.utilities.Utility;

	import cucumber.api.DataTable;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;


		public class CommonSteps {
			public static WebDriver dr;
			public static FindingLocators a=new FindingLocators(dr);

			@Given("^I want to navigate to My OSA home Page$")
			public void i_want_to_navigate_to_My_OSA_home_Page() throws Throwable {
				dr=Browser1.openBrowser("/Users/sahildip/Desktop/chromedriver");
			    dr.get("https://www.osaconsultingtech.com");
			}

			@When("^I want to click on Forum login button$")
			public void i_want_to_click_on_Forum_loginbutton(DataTable myData) throws Throwable {
			List<List<String>> data = myData.raw();	
			
			//String locator=FileManager.readFromExcel(data.get(0).get(0), data.get(0).get(2));
			//CommonSteps.getElement( data.get(0).get(0),data.get(0).get(1)).click();
			FindingLocators a=new FindingLocators(dr);
			 a.getValue(data.get(0).get(0),data.get(0).get(1)).click();
			  //a.getValue(data.get(0).get(1),locator).click();
			}

			@Then("^I verify the Forum Login Page Title$")
			public void i_verify_the_Forum_Login_Page_Title(DataTable myData) throws Throwable {
				List<List<String>> data = myData.raw();
				
			  Utility.verifyString(data.get(0).get(0));
			}

			@Then("^I enter the username for forum login$")
			public void i_enter_the_username_for_forum_login(DataTable myData) throws Throwable {
				List<List<String>> data = myData.raw();
				FindingLocators a=new FindingLocators(dr);
			 a.getValue(data.get(0).get(0),data.get(0).get(1)).sendKeys(data.get(0).get(2));
			}

			@Then("^I enter the password for forum login$")
			public void i_enter_the_password_for_forum_login(DataTable myData) throws Throwable {
				List<List<String>> data = myData.raw();
				
				FindingLocators a=new FindingLocators(dr);
				 a.getValue(data.get(0).get(0),data.get(0).get(1)).sendKeys(data.get(0).get(2));
			}
			
			@Then("^I click on login button$")
			public void i_click_on_login_button(DataTable myData){
				
				List<List<String>> data = myData.raw();
				FindingLocators a=new FindingLocators(dr);
					a.getValue(data.get(0).get(0),data.get(0).get(1)).click();
				
			}
				
			@Then("^I am closing the browser$")
			public void i_am_closing_the_browser() throws Throwable {
			   dr.close();
			}
			

		}
		
		
		
		


