package tricentis.ff.test.pageObject;

public class ProductPageObjects {
	private String ProductStartDate = "startdate";
	private String ProductSum = "insurancesum";
	private String ProductSumOption = "#insurancesum > option:nth-child(2)";
	private String ProductRating = "meritrating";
	private String ProductRatingOption = "#meritrating > option:nth-child(3)";
	private String ProductDamage = "damageinsurance";
	private String ProductDamageOption = "#damageinsurance > option:nth-child(2)";
	private String ProductOptionalLegal = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span";
	private String ProductCar = "courtesycar";
	private String ProductCarOption = "#courtesycar > option:nth-child(2)";
	private String ProductNext = "nextselectpriceoption";

	public String getProductStartDate() {
		return ProductStartDate;
	}

	public String getProductSum() {
		return ProductSum;
	}

	public String getProductSumOption() {
		return ProductSumOption;
	}

	public String getProductRating() {
		return ProductRating;
	}

	public String getProductRatingOption() {
		return ProductRatingOption;
	}

	public String getProductDamage() {
		return ProductDamage;
	}

	public String getProductDamageOption() {
		return ProductDamageOption;
	}

	public String getProductOptionalLegal() {
		return ProductOptionalLegal;
	}

	public String getProductCar() {
		return ProductCar;
	}

	public String getProductCarOption() {
		return ProductCarOption;
	}

	public String getProductNext() {
		return ProductNext;
	}
}
