package pagePOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class InventoryPage extends TestBase {

	public InventoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Products']") private WebElement products;
	
	@FindBy(xpath="//a[text()='Products']") private WebElement products1;
	
	@FindBy(xpath="//button[@title='Create record']") private WebElement create;
	
	public void clickProduct() {
		products.click();
	}
	public void clickProduct1() {
		products1.click();
	}
	public void clickCreate() {
		create.click();
	}
	
}
