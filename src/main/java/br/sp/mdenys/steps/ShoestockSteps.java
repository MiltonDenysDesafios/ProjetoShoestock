package br.sp.mdenys.steps;

import static br.sp.mdenys.core.DriverFactory.getDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoestockSteps {

	
	@Given("I acess the Home page")
	public static void acessHomePage()  {		
		getDriver().get("https://www.shoestock.com.br");

	}

	@Given("^I close the popup message$")
	public static void iCloseThePopupMessage(){
		
	}
	
	
	
}
