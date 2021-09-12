package tricentis.ff.test.pageObject;

public class QuotePageObjects {

	private String quoteEmail = "email";
	private String quotePhone = "phone";
	private String quoteUsername = "username";
	private String quotePassword = "password";
	private String quoteConfirmPwd = "confirmpassword";
	private String quoteComments = "Comments";
	private String quoteSend = "sendemail";
	private String successMessage = "body > div.sweet-alert.showSweetAlert.visible > h2";

	public String getQuoteEmail() {
		return quoteEmail;
	}

	public String getQuotePhone() {
		return quotePhone;
	}

	public String getQuoteUsername() {
		return quoteUsername;
	}

	public String getQuotePassword() {
		return quotePassword;
	}

	public String getQuoteConfirmPwd() {
		return quoteConfirmPwd;
	}

	public String getQuoteComments() {
		return quoteComments;
	}

	public String getQuoteSend() {
		return quoteSend;
	}
	
	public String getSuccessMessage() {
		return successMessage;
	}	
}
