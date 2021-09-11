package tricentis.ff.test.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tricentis.ff.test.pageObject.PageObjects;
import tricentis.ff.test.pageObject.VehiclePageObjects;
import tricentis.ff.test.utils.Constraints;
import tricentis.ff.test.utils.Environment;

public class Steps {

	private Environment environment;
	private Constraints pageConsts = new Constraints();
	private WebDriver drive;

	private PageObjects pageObj;
	private VehiclePageObjects vehicle = new VehiclePageObjects();
	
	@Given("^I access the tricentis page$")
	public void accessTricentisPage() {
		environment = new Environment();
		this.drive = environment.browse();
		environment.navigateToTricentis(this.drive);
	}

	@When("^I fill the \"([^\"]*)\" form$")
	public void fillForm(String page) {

	}

	@When("^I press Next button$")
	public void pressNextButton() {

	}

	@When("^I press Send button$")
	public void pressSendButton() {

	}

	@Then("^the \"([^\"]*)\" page must be shown$")
	public void pageMustBeShown(String page) {
		pageObj = new PageObjects(drive);

		if (page.equals(pageConsts.VEHICLE_PAGE)) {			
			pageObj.findPageElement(vehicle.getVehicleMake());
			System.out.println("oiiiiiiiiieeeeeee");
			
		} else if (page.equals(pageConsts.INSURANT_PAGE)) {

		} else if (page.equals(pageConsts.PRODUCT_PAGE)) {

		} else if (page.equals(pageConsts.PRICE_PAGE)) {

		} else if (page.equals(pageConsts.SEND_QUOTE_PAGE)) {

		}
	}

	@Then("^a success message must be displayed in the page$")
	public void successMessageDisplayed() {

	}

	@After
	public void closeBrowser() {
		environment.exitTricentis(drive);
	}
}
