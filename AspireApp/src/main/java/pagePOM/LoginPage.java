package pagePOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase {

		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@placeholder='Email']") private WebElement email;
		
		@FindBy(xpath="//input[@placeholder='Password']") private WebElement password;
		
		@FindBy(xpath="//button[text()='Log in']") private WebElement loginButton;
		
		public void setEmail() throws InterruptedException {
			Thread.sleep(4000);
			email.sendKeys("user@aspireapp.com");
		}
		
		public void setPassword() {
			password.sendKeys("@sp1r3app");
		}
		
		public void clickLogin() {
			loginButton.click();
		}
}
