package tricentis.ff.test.steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import tricentis.ff.test.pageObject.PageObjects;
import tricentis.ff.test.pageObject.VehiclePageObjects;

public class VehicleForm {
	
	private LocalDate manufactureDate;
	
	public void fillVehicleForm (PageObjects pageObj, VehiclePageObjects vehicle) {	

		manufactureDate = LocalDate.now();		
		DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				
		pageObj.clickPageElement(vehicle.getVehicleMake());
		pageObj.clickPageElementCss(vehicle.getVehicleMakeOption());
		pageObj.clickPageElement(vehicle.getVehicleModel());
		pageObj.clickPageElementCss(vehicle.getVehicleModelOption());
		pageObj.insertText(vehicle.getVehicleCapacity(), "22");
		pageObj.insertText(vehicle.getVehiclePerformance(), "150");
		pageObj.insertText(vehicle.getVehicleManufacture(), parser.format(manufactureDate));
		pageObj.clickPageElement(vehicle.getVehicleSeats());
		pageObj.clickPageElementCss(vehicle.getVehicleSeatsOption());
		pageObj.clickPageElementCss(vehicle.getVehicleHandNo());
		pageObj.clickPageElement(vehicle.getVehicleSeatsMoto());
		pageObj.clickPageElementCss(vehicle.getVehicleSeatsMotoOption());
		pageObj.clickPageElement(vehicle.getVehicleFuel());
		pageObj.clickPageElementCss(vehicle.getVehicleFuelOption());		
		pageObj.insertText(vehicle.getVehiclePayload(),"233");
		pageObj.insertText(vehicle.getVehicleWeight(),"234");		
		pageObj.insertText(vehicle.getVehiclePrice(),"807");
		pageObj.insertText(vehicle.getVehiclePlateNumber(),"ABC1234");
		pageObj.insertText(vehicle.getVehicleMileage(),"2000");		
	}
}
