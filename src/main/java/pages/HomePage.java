package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//a[@title = \"My Account\"]")
	WebElement myAccountBtn;
	
	@FindBy(xpath = "//a[contains(text(),\"Register\")]")
	WebElement registerOption;
	
	@FindBy(xpath = "//a[contains(text(),\"Login\")]")
	WebElement loginOption;
	
	//Actions
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	public void clickMyAccount() {
		wait.until(ExpectedConditions.visibilityOf(myAccountBtn));
		myAccountBtn.click();}

	public void selectRegister() {
		wait.until(ExpectedConditions.visibilityOf(registerOption));
		registerOption.click();
	}
	
	public void selectLogin() {
		wait.until(ExpectedConditions.visibilityOf(loginOption));
		loginOption.click();
	}
}
