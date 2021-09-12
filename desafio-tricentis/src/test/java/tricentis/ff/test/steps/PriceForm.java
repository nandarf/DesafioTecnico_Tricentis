package tricentis.ff.test.steps;

import tricentis.ff.test.pageObject.PageObjects;
import tricentis.ff.test.pageObject.PricePageObjects;

public class PriceForm {

	public void fillPriceForm (PageObjects pageObj, PricePageObjects price) {
		pageObj.clickPageElementCss(price.getPriceSilver());	
	}
}
