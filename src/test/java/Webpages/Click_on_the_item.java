package Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click_on_the_item extends BaseClass {
	WebDriver driver;

	public Click_on_the_item(WebDriver driver) {
		this.driver = driver;
	}
	By Apperal_shoes = By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[4]/a");
	By Filter = By.id("products-orderby");
	By no_of_Item = By.id("products-pagesize");
	By item_display = By.id("products-viewmode");
	public void Apperal_shoes() {
		WebElement ele = driver.findElement(Apperal_shoes);
		ClickMethod(ele);	
	}
	public void Filter() {
		WebElement ele = driver.findElement(Filter);
		ClickMethod(ele);	
	}
	public void Display_quantity() {
		WebElement ele = driver.findElement(no_of_Item);
		ClickMethod(ele);	
	}
	public void item_display() {
		WebElement ele = driver.findElement(item_display);
		ClickMethod(ele);	
	}
}
