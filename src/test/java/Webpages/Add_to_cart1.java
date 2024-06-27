package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class Add_to_cart1 extends BaseClass {
	WebDriver driver;

	public Add_to_cart1(WebDriver driver) {
		this.driver = driver;
	}

	By Search_product = By.id("small-searchterms");
	By Select_item = By.xpath("//input[@class='button-1 search-box-button']");
	By Click_OnText = By.xpath("//a[text()='Computing and Internet']");
	By Click_AddtoCart = By.xpath("(//input[@type='button'])[position()=2]");
	By Validate_Text = By.xpath("//div[@id='bar-notification']");

	public void Search_product(String ItemName) {
		WebElement ele = driver.findElement(Search_product);
		SendkeysMethod(ele, ItemName);
	}

	public void Select_item() {
		WebElement ele = driver.findElement(Select_item);
		ClickMethod(ele);
	}

	public void Click_OnText() {
		WebElement ele = driver.findElement(Click_OnText);
		ClickMethod(ele);
	}

	public void Click_AddtoCart() {
		WebElement ele2 = driver.findElement(Click_AddtoCart);
		ClickMethod(ele2);
	}

	public void Validate_Text() {
			WebElement ele = driver.findElement(Validate_Text);

			String s = getTextMethod(ele);
			System.out.println("Divya");
	}
			public void Sendkeys(String ItemName) {
			System.setProperty("org.uncommons.reportng.escape-output","false");
			driver.findElement(Search_product).sendKeys(ItemName);		
			Reporter.log("item name entered");
			//Reporter.log("<a href= \"C:\\Users\\CHISRI\\OneDrive - Capgemini\\Pictures\\ub_1.png">ub_1</a>");
			}
			

}
