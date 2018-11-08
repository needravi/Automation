package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page { // Declare Initialize Utilize
	@FindBy(id="txtUsername")
	private WebElement username;
	@FindBy(id = "txtPassword")
	private WebElement password;
	@FindBy(id ="btnLogin")
	private WebElement login;
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String s) {
		username.sendKeys(s);
	} 
	public void setpassword(String s1) {
		password.sendKeys(s1);
		
	}
	public void clicklogin() {
		login.click();
	}
	
	
}

