package stepsDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.RegisterPage;

public class RegisterSteps {
	RegisterPage register = new RegisterPage();
	Faker faker = new Faker();
	
	@When ("I fill all field in the register form")
	public void i_fill_all_fields() {
		register.enterTo("firstname", faker.name().firstName());
		register.enterTo("lastname", faker.name().lastName());
		register.enterTo("email",faker.internet().emailAddress());
		register.enterTo("telephone",faker.phoneNumber().cellPhone());
		String pwd = faker.internet().password(5,10);
		register.enterTo("password", pwd);
		register.enterTo("repassword", pwd);

	}
	
	@When("I enter firstname {string}")
	public void i_enter_firstname(String string) {
	    register.enterTo("firstname", string);
	}

	@When("I enter lastname {string}")
	public void i_enter_lastname(String string) {
	    register.enterTo("lastname", string);

	}

	@When("I enter email address {string}")
	public void i_enter_email_address(String string) {
	    register.enterTo("email", string);

	}

	@When("I enter telephone {string}")
	public void i_enter_telephone(String string) {
	    register.enterTo("telephone", string);

	}

	@When("I enter password {string}")
	public void i_enter_password(String string) {
		register.enterTo("password", string);
	}

	@When("I enter re-password {string}")
	public void i_enter_re_password(String string) {
		register.enterTo("repassword", string);
	}

	@When("I select privacy policy field")
	public void i_select_privacy_policy_field() {
	    register.checkPolicy();
	}

	@When("I click Continue button")
	public void i_click_continue_button() {
	    register.clickContinue();
	}

	@Then("An account is created")
	public void an_account_is_created() {
		String message = "Your Account Has Been Created!";
	    Assert.assertEquals("Success",register.getStatusTabName());
	    Assert.assertEquals(message, register.getSuccessMessgage());
	}
	@Then("The proper error message is shown")
	public void show_error_message() {
		if (register.getFirstName().equals(null)) {
			Assert.assertEquals(register.getErrorMessgage(), "First Name must be between 1 and 32 characters!");
		}
		if (register.getLastName().equals(null)) {
			Assert.assertEquals(register.getErrorMessgage(), "Last Name must be between 1 and 32 characters!");
		}
		if (register.getEmail().equals(null)) {
			Assert.assertEquals(register.getErrorMessgage(), "E-Mail Address does not appear to be valid!");
		}
		if (register.getTel().equals(null)) {
			Assert.assertEquals(register.getErrorMessgage(), "Telephone must be between 3 and 32 characters!");
		}
		if (register.getPwd().equals(null)) {
			Assert.assertEquals(register.getErrorMessgage(), "Password must be between 4 and 20 characters!");
		}
		if (register.getRePwd().equals(null)) {
			Assert.assertEquals(register.getErrorMessgage(), "Password confirmation does not match password!");
		}
	}
}
