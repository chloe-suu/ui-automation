package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.TestBase;

public class RegisterPage extends TestBase {
	public RegisterPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//input[@id=\"input-firstname\"]")
	WebElement fName;
	@FindBy(xpath = "//input[@id=\"input-lastname\"]")
	WebElement lName;
	@FindBy(xpath = "//input[@id=\"input-email\"]")
	WebElement email;
	@FindBy(xpath = "//input[@id=\"input-telephone\"]")
	WebElement telephone;

	@FindBy(xpath = "//input[@id=\"input-password\"]")
	WebElement pwd;
	@FindBy(xpath = "//input[@id=\"input-confirm\"]")
	WebElement rePwd;

	@FindBy(xpath = "//input[@name=\"agree\"]")
	WebElement checkbox;

	@FindBy(xpath = "//input[@value=\"Continue\"]")
	WebElement continueBtn;
	@FindBy(xpath = "//ul[@class=\"breadcrumb\"]//li[3]//a")
	WebElement statusTab;

	@FindBy(xpath = "//div[@id=\"content\"]//h1")
	WebElement successMgs;
	
	@FindBy(xpath = "//div[@class=\"text-danger\"]")
	WebElement errorMgs;

	// Actions
	public void enterTo(String field, String key) {
		switch (field) {
		case "firstname": {
			wait.until(ExpectedConditions.visibilityOf(fName));
			fName.sendKeys(key);
			break;
		}
		case "lastname": {
			wait.until(ExpectedConditions.visibilityOf(lName));
			lName.sendKeys(key);
			break;
		}
		case "email": {
			wait.until(ExpectedConditions.visibilityOf(email));
			email.sendKeys(key);
			break;
		}
		case "telephone": {
			wait.until(ExpectedConditions.visibilityOf(telephone));
			telephone.sendKeys(key);
			break;
		}
		case "password": {
			wait.until(ExpectedConditions.visibilityOf(pwd));
			pwd.sendKeys(key);
			break;
		}
		case "repassword": {
			wait.until(ExpectedConditions.visibilityOf(rePwd));
			rePwd.sendKeys(key);
			break;
		}
		}
	}

	public void checkPolicy() {
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		checkbox.click();
	}

	public void clickContinue() {
		wait.until(ExpectedConditions.visibilityOf(continueBtn));
		continueBtn.click();
	}

	public String getFirstName() {
		wait.until(ExpectedConditions.visibilityOf(fName));
		return fName.getText();
	}
	public String getLastName() {
		wait.until(ExpectedConditions.visibilityOf(lName));
		return lName.getText();
	}
	public String getEmail() {
		wait.until(ExpectedConditions.visibilityOf(email));
		return email.getText();
	}
	public String getTel() {
		wait.until(ExpectedConditions.visibilityOf(telephone));
		return telephone.getText();
	}
	public String getPwd() {
		wait.until(ExpectedConditions.visibilityOf(pwd));
		return pwd.getText();
	}
	public String getRePwd() {
		wait.until(ExpectedConditions.visibilityOf(rePwd));
		return rePwd.getText();
	}
	public String getStatusTabName() {
		wait.until(ExpectedConditions.visibilityOf(statusTab));
		return statusTab.getText();
	}

	public String getSuccessMessgage() {
		wait.until(ExpectedConditions.visibilityOf(successMgs));
		return successMgs.getText();
	}
	public String getErrorMessgage() {
		wait.until(ExpectedConditions.visibilityOf(errorMgs));
		return errorMgs.getText();
	}
}
