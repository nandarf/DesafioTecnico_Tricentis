package tricentis.ff.test.pageObject;

public class InsurantPageObjects {

	private String InsurantFirstName = "firstname";
	private String InsurantLastName = "lastname";
	private String InsurantBirth = "birthdate";
	private String InsurantGenderF = "#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span";
	private String InsurantStreet = "streetaddress";
	private String InsurantCountry = "country";
	private String InsurantCountryOption = "#country > option:nth-child(32)";
	private String InsurantZip = "zipcode";
	private String InsurantCity = "city";
	private String InsurantOccupation = "occupation";
	private String InsurantOccupationOption = "#occupation > option:nth-child(2)";
	//private String InsurantHobbiesSkydiving = "skydiving";
//	private String InsurantHobbiesSkydiving = "#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox.invalid > p > label:nth-child(4) > span";
	private String InsurantHobbiesSkydiving = "//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]/span";
	private String InsurantWebsite = "website";
	private String InsurantPicture = "picture";
	private String InsurantNext = "nextenterproductdata";

	public String getInsurantFirstName() {
		return InsurantFirstName;
	}

	public String getInsurantLastName() {
		return InsurantLastName;
	}

	public String getInsurantBirth() {
		return InsurantBirth;
	}

	public String getInsurantGenderF() {
		return InsurantGenderF;
	}

	public String getInsurantStreet() {
		return InsurantStreet;
	}

	public String getInsurantCountry() {
		return InsurantCountry;
	}

	public String getInsurantCountryOption() {
		return InsurantCountryOption;
	}

	public String getInsurantZip() {
		return InsurantZip;
	}

	public String getInsurantCity() {
		return InsurantCity;
	}

	public String getInsurantOccupation() {
		return InsurantOccupation;
	}

	public String getInsurantOccupationOption() {
		return InsurantOccupationOption;
	}

	public String getInsurantHobbiesSkydiving() {
		return InsurantHobbiesSkydiving;
	}

	public String getInsurantWebsite() {
		return InsurantWebsite;
	}

	public String getInsurantPicture() {
		return InsurantPicture;
	}

	public String getInsurantNext() {
		return InsurantNext;
	}
}
