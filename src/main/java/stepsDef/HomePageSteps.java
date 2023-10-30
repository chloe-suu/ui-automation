package stepsDef;

import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	HomePage home = new HomePage();

	@When("I navigate to Register Account page")
	public void i_navigate_to_Register_Account_page() {
	    home.clickMyAccount();
	    home.selectRegister();
	}
	
	@When("User navigates to login page")
	public void navigate_To_LoginPage() {
		home.clickMyAccount();
	    home.selectLogin();
	}

}
