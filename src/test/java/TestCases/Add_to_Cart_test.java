package TestCases;

import org.testng.annotations.Test;

import Webpages.Add_to_Cart;

public class Add_to_Cart_test  extends Driver{
	@Test
public void Search_product() {
		Add_to_Cart Adc = new Add_to_Cart(driver);
		Adc.Search_product();
		Adc.Select_item();
		Adc.Click_OnText();
		Adc.Click_AddtoCart();
		Adc.Validate_Text();
	}
}
