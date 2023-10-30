package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.TestBase;

public class MyAccountPage extends TestBase{
	public MyAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@id=\"content\"]//h2")
	List<WebElement> headers;
	
	public List<String> getHeader(){
		wait.until(ExpectedConditions.visibilityOfAllElements(headers));
		List<String> headerString = new ArrayList<String>();
		for (WebElement e:headers) {
			headerString.add(e.getText());			
		}
		return headerString;
	}

}
