package tricentis.ff.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tricentis.ff.test.pageObject.InsurantPageObjects;
import tricentis.ff.test.pageObject.PageObjects;
import tricentis.ff.test.pageObject.PricePageObjects;
import tricentis.ff.test.pageObject.ProductPageObjects;
import tricentis.ff.test.pageObject.QuotePageObjects;
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
	private QuotePageObjects quote = new QuotePageObjects();

	private VehicleForm vehicleForm = new VehicleForm();
	private InsurantForm insurantForm = new InsurantForm();
	private ProductForm productForm = new ProductForm();
	private PriceForm priceForm = new PriceForm();
	private QuoteForm quoteForm = new QuoteForm();

	@Given("^I access the tricentis page$")
	public void accessTricentisPage() {
		environment = new Environment();
		this.drive = environment.browse();
		environment.navigateToTricentis(this.drive);
	}

	@When("^I fill the \"([^\"]*)\" form$")
	public void fillForm(String page) throws InterruptedException {

		if (page.equals(pageConsts.VEHICLE_PAGE)) {
			vehicleForm.fillVehicleForm(pageObj, vehicle);
		} else if (page.equals(pageConsts.INSURANT_PAGE)) {
			insurantForm.fillInsurantForm(pageObj, insurant);
		} else if (page.equals(pageConsts.PRODUCT_PAGE)) {
			productForm.fillProductFormForm(pageObj, product);
		} else if (page.equals(pageConsts.PRICE_PAGE)) {
			priceForm.fillPriceForm(pageObj, price);
			Thread.sleep(500);
		} else if (page.equals(pageConsts.SEND_QUOTE_PAGE)) {
			quoteForm.fillQuoteForm(pageObj, quote);
		}
	}

	@When("^I press \"([^\"]*)\" button$")
	public void pressButton(String button) throws InterruptedException {

		if (button.equals(pageConsts.NEXT_BUTTON)) {
			pageObj.clickPageElement(getCurrentPage());

		} else if (button.equals(pageConsts.SEND_BUTTON)) {
			pageObj.clickPageElement(quote.getQuoteSend());
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
			pageObj.findPageElementCss(price.getPriceSilver());

		} else if (page.equals(pageConsts.SEND_QUOTE_PAGE)) {
			pageObj.findPageElement(quote.getQuoteEmail());
		}
	}

	@Then("^a success message must be displayed in the page$")
	public void successMessageDisplayed() {
		WebDriverWait wait = new WebDriverWait(this.drive, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(quote.getSuccessMessage())));
		pageObj.findPageElementCss(quote.getSuccessMessage());
	}

	@After
	public void closeBrowser() {
		environment.exitTricentis(drive);
	}

	public String getCurrentPage() {
		return currentPage.equals(pageConsts.VEHICLE_PAGE) ? vehicle.getVehicleNext()
				: currentPage.equals(pageConsts.INSURANT_PAGE) ? insurant.getInsurantNext()
						: currentPage.equals(pageConsts.PRODUCT_PAGE) ? product.getProductNext() : price.getPriceNext();
	}
}
