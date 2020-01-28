package step_defination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {

	@Given("User is on Home page")
	public void user_is_on_Home_page() {
		System.out.println("User is on Home page"); 
	    
	}

	@When("User Navigate to Login PAge")
	public void user_Navigate_to_Login_PAge() {
		System.out.println("User Navigate to Login PAge"); 
	   
	}

	@When("User enters Useranme and Password")
	public void user_enters_Useranme_and_Password() {
		System.out.println("User enters Useranme and Password"); 
	   
	}

	@Then("message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		System.out.println("message displayed Login Successfully"); 
	  
	}

	@When("User Logout from thye Application")
	public void user_Logout_from_thye_Application() {
		System.out.println("User Logout from thye Application"); 
	   
	}

	@Then("message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() {
		System.out.println("message displayed Logout Successfully"); 
	 
	}
}
