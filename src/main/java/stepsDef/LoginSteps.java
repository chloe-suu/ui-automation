package stepsDef;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginSteps {
	
	LoginPage login = new LoginPage();
	MyAccountPage accountPage = new MyAccountPage();
	
	@When("User enters email {string}")
	public void user_enters_email(String string) {
	    login.enterEmail(string);
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
	    login.enterPwd(string);
	}
	
	@When("User clicks login")
	public void user_clicks_login() {
	    login.clickLogin();
	}
	
	@When("User enters invalid email or password")
	public void user_enters_invalid_credentials(DataTable credentials) {
		List<List<String>> data = credentials.cells();
		System.out.print(data);
		 for (List<String> row : data) {
			 login.enterEmail(row.get(0));
			 login.enterPwd(row.get(1));
		    }
	}

	@Then("User should see error message")
	public void user_should_see_error_message() {
		String alert = "Warning: No match for E-Mail Address and/or Password.";
	    Assert.assertEquals(alert, login.getAlert());
	}

}
