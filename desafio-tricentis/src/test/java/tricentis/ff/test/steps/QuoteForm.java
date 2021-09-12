package tricentis.ff.test.steps;

import tricentis.ff.test.pageObject.PageObjects;
import tricentis.ff.test.pageObject.QuotePageObjects;

public class QuoteForm {

	public void fillQuoteForm(PageObjects pageObj, QuotePageObjects quote) {
		pageObj.insertText(quote.getQuoteEmail(), "desafiotecnico@qe.com");
		pageObj.insertText(quote.getQuotePhone(), "000000000");
		pageObj.insertText(quote.getQuoteUsername(), "DesafioTecnico");
		pageObj.insertText(quote.getQuotePassword(), "Desaf10");
		pageObj.insertText(quote.getQuoteConfirmPwd(), "Desaf10");
		pageObj.insertText(quote.getQuoteComments(), "No comments added here");
	}
}
