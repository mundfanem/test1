package testCase;

import org.testng.annotations.Test;

import pagePOM.LoginPage;
import testBase.TestBase;

public class AspireTest1 extends TestBase {
	LoginPage lp ;//= new LoginPage();
	
	@Test
	public void test1() throws InterruptedException {
		lp= new LoginPage();
		lp.setEmail();
		lp.setPassword();
		lp.clickLogin();
	}
}
