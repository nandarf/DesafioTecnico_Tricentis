package tricentis.ff.test.steps;

import tricentis.ff.test.pageObject.InsurantPageObjects;
import tricentis.ff.test.pageObject.PageObjects;

public class InsurantForm {

	public void fillInsurantForm (PageObjects pageObj, InsurantPageObjects insurant) {		
		pageObj.insertText(insurant.getInsurantFirstName(),"Desafio");
		pageObj.insertText(insurant.getInsurantLastName(),"Tecnico");
		pageObj.insertText(insurant.getInsurantBirth(), "09/11/2000");
		pageObj.clickPageElementCss(insurant.getInsurantGenderF());		
		pageObj.insertText(insurant.getInsurantStreet(), "Avenida sem nome");
		pageObj.clickPageElement(insurant.getInsurantCountry());
		pageObj.clickPageElementCss(insurant.getInsurantCountryOption());	
		pageObj.insertText(insurant.getInsurantZip(), "83940593");
		pageObj.insertText(insurant.getInsurantCity(), "Cityland");
		pageObj.clickPageElement(insurant.getInsurantOccupation());
		pageObj.clickPageElementCss(insurant.getInsurantOccupationOption());
		pageObj.insertText(insurant.getInsurantWebsite(), "http://www.google.com");
		pageObj.clickPageElementXpath(insurant.getInsurantHobbiesSkydiving());
	}
}
