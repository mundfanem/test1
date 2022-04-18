package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestBase {
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters ("browser")
	public void selectBrowser(String br) {
		//="chrome";
		if(br.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://aspireapp.odoo.com/");
		
	}
}
