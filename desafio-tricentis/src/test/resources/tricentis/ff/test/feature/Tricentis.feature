Feature: Desafio Tecnico QE
  As an user
  I want fill the form from tricentis page
  So that the Desafio Tecnico will be completed
 
 Scenario: Fill the tricentis form
  Given I access the tricentis page
  Then the "Vehicle Data" page must be shown
  When I fill the "Vehicle Data" form
  And I press Next button  
  Then the "Insurant Data" page must be shown
  When I fill the "Insurant Data" form
  And I press Next button
  Then the "Product Data" page must be shown
	When I fill the "Product Data" form
	And I press Next button
	Then the "Price Option" page must be shown
	When I fill the "Price Option" form
	And I press Next button
	Then the "Send Quote" page must be shown  
	When I fill the "Send Quote" form
	And I press Send button
	Then a success message must be displayed in the page  