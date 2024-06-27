package TestCases;	
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Webpages.Add_to_cart1;

public class Add_to_Cart1_Test extends Driver {
	@Test(dataProvider = "getData")
	public void Search_products(String ItemName) {
		Add_to_cart1 Adc = new Add_to_cart1(driver);
		//Adc.Search_product(ItemName);

//			Adc.Select_item();
			
//			Adc.Click_OnText();
//			Adc.Click_AddtoCart();
//			Adc.Validate_Text();
		Adc.Sendkeys(ItemName);
		}
	
	@DataProvider
	public Object[][] getData(){
			String sheetname="Data";
			int rows=excel.getRowCount(sheetname);
			int cols=excel.getColumnCount(sheetname);
			Object[][]data= new Object[rows-1][cols];//object[1][1]
			for(int rowNum=2;rowNum<=rows;rowNum++) {
				for(int colNum=0;colNum<cols;colNum++) {
					//data[0][0]
					data[rowNum-2][colNum]=excel.getCellData(sheetname, colNum, rowNum);
				}
			}
			return data;
	}
}

