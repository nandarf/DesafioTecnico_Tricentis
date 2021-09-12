package tricentis.ff.test.pageObject;

public class PricePageObjects {

	private String priceSilver = "#priceTable > tfoot > tr > th.group > label:nth-child(1) > span";
	private String priceNext = "nextsendquote";

	public String getPriceSilver() {
		return priceSilver;
	}

	public String getPriceNext() {
		return priceNext;
	}

}
