package tricentis.ff.test.steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import tricentis.ff.test.pageObject.PageObjects;
import tricentis.ff.test.pageObject.ProductPageObjects;

public class ProductForm {

	private LocalDate productDate;
	
	public void fillProductFormForm(PageObjects pageObj, ProductPageObjects product) {
		productDate = LocalDate.now();
		productDate = productDate.plusMonths(2);
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			
		pageObj.insertText(product.getProductStartDate(), parser.format(productDate));
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
