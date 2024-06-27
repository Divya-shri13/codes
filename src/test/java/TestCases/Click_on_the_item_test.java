package TestCases;

import org.testng.annotations.Test;

import Webpages.Click_on_the_item;



public class Click_on_the_item_test extends Driver{
	@Test
	public void Apperal_shoes() {
		Click_on_the_item CotI = new Click_on_the_item(driver);
		CotI.Apperal_shoes();
		CotI.Filter();
		CotI.Display_quantity();
		CotI.item_display();	
	
		
	}

	
}



