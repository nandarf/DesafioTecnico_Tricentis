package tricentis.ff.test.steps;

import tricentis.ff.test.pageObject.PageObjects;
import tricentis.ff.test.pageObject.ProductPageObjects;

public class ProductForm {

	public void fillProductFormForm(PageObjects pageObj, ProductPageObjects product) {

		pageObj.insertText(product.getProductStartDate(), "09/11/2022");
		pageObj.clickPageElement(product.getProductSum());
		pageObj.clickPageElementCss(product.getProductSumOption());
		pageObj.clickPageElement(product.getProductRating());
		pageObj.clickPageElementCss(product.getProductRatingOption());
		pageObj.clickPageElement(product.getProductDamage());
		pageObj.clickPageElementCss(product.getProductDamageOption());
		pageObj.clickPageElementXpath(product.getProductOptionalLegal());
		pageObj.clickPageElement(product.getProductCar());
		pageObj.clickPageElementCss(product.getProductCarOption());
	}
}
