package tricentis.ff.test.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tricentis.ff.test.pageObject.InsurantPageObjects;
import tricentis.ff.test.pageObject.PageObjects;
import tricentis.ff.test.pageObject.PricePageObjects;
import tricentis.ff.test.pageObject.ProductPageObjects;
import tricentis.ff.test.pageObject.VehiclePageObjects;
import tricentis.ff.test.utils.Constraints;
import tricentis.ff.test.utils.Environment;

public class Steps {

	private Environment environment;
	private Constraints pageConsts = new Constraints();
	private WebDriver drive;
	private String currentPage = "";

	private PageObjects pageObj;
	private VehiclePageObjects vehicle = new VehiclePageObjects();
	private InsurantPageObjects insurant = new InsurantPageObjects();
	private ProductPageObjects product = new ProductPageObjects();
	private PricePageObjects price = new PricePageObjects();

	private VehicleForm vehicleForm = new VehicleForm();
	private InsurantForm insurantForm = new InsurantForm();

	@Given("^I access the tricentis page$")
	public void accessTricentisPage() {
		environment = new Environment();
		this.drive = environment.browse();
		environment.navigateToTricentis(this.drive);
	}

	@When("^I fill the \"([^\"]*)\" form$")
	public void fillForm(String page) {
		
		if (page.equals(pageConsts.VEHICLE_PAGE)) {
			vehicleForm.fillVehicleForm(pageObj, vehicle);
		}
		else if (page.equals(pageConsts.INSURANT_PAGE)) {
			insurantForm.fillInsurantForm(pageObj, insurant);
		}
		else if (page.equals(pageConsts.PRICE_PAGE)) {
			
		}
		else if (page.equals(pageConsts.PRODUCT_PAGE)) {
			
		}

	}

	@When("^I press \"([^\"]*)\" button$")
	public void pressButton(String button) throws InterruptedException {

		if (button.equals(pageConsts.NEXT_BUTTON)) {			
			pageObj.clickPageElement(getCurrentPage());
			
		} else if (button.equals(pageConsts.SEND_BUTTON)) {
			pageObj.clickPageElement(button);
		}
		Thread.sleep(500);
	}

	@Then("^the \"([^\"]*)\" page must be shown$")
	public void pageMustBeShown(String page) {
		pageObj = new PageObjects(drive);
		currentPage = page;

		if (page.equals(pageConsts.VEHICLE_PAGE)) {
			pageObj.findPageElement(vehicle.getVehicleMake());

		} else if (page.equals(pageConsts.INSURANT_PAGE)) {
			pageObj.findPageElement(insurant.getInsurantFirstName());

		} else if (page.equals(pageConsts.PRODUCT_PAGE)) {
			pageObj.findPageElement(product.getProductStartDate());

		} else if (page.equals(pageConsts.PRICE_PAGE)) {
			// pageObj.findPageElement(vehicle.getVehicleMake());

		} else if (page.equals(pageConsts.SEND_QUOTE_PAGE)) {
			// pageObj.findPageElement(vehicle.getVehicleMake());

		}
	}

	@Then("^a success message must be displayed in the page$")
	public void successMessageDisplayed() {

	}

	@After
	public void closeBrowser() {
		environment.exitTricentis(drive);
	}
	
	public String getCurrentPage() {
		return currentPage.equals(pageConsts.VEHICLE_PAGE) ? vehicle.getVehicleNext()
				: currentPage.equals(pageConsts.INSURANT_PAGE) ? insurant.getInsurantNext()
						: currentPage.equals(pageConsts.PRODUCT_PAGE) ? product.getProductNext()
								: price.getPriceNext();
	}
}
