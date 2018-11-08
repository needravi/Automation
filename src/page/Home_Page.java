package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class Home_Page extends BaseTest {
	
	@FindBy(id="welcome")
	private WebElement welcome;
	
	@FindBy(xpath="//a[.=\"Logout\"]")
	private WebElement logout;
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void welcome() {
		welcome.click();
	}
	
	public void logoutbtn() {
		logout.click();
	}
	
}
