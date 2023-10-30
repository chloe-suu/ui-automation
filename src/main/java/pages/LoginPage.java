package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "input-email")
	WebElement email;

	@FindBy(id = "input-password")
	WebElement pwd;
	
	@FindBy(xpath = "//input[@value=\"Login\"]")
	WebElement loginBtn;

	@FindBy(xpath = "//div[@class=\"form-group\"]//a[contains(text(),\"Forgotten Password\" )]")
	WebElement forgotPwdLink;
	
	@FindBy(xpath = "//div[contains(@class,\"alert\" )]")
	WebElement alert;
	

	// Actions
	
	public void enterEmail(String key) {
			wait.until(ExpectedConditions.visibilityOf(email));
			email.sendKeys(key);
		}

	public void enterPwd(String key) {
		wait.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys(key);
	}

	public void clickLogin() {
		wait.until(ExpectedConditions.visibilityOf(loginBtn));
		loginBtn.click();
	}
	public String getAlert() {
		wait.until(ExpectedConditions.visibilityOf(alert));
		return alert.getText();
	}
}
