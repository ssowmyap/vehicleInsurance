package com.capg.vechile.Service;

import com.capg.vechile.CustomerDetails;
import com.capg.vechile.DAO.IVehicleDAO;
import com.capg.vechile.DAO.VehicleDAO;

public class VehicleService implements IVehicleService{
	IVehicleDAO iv=new VehicleDAO();
	public CustomerDetails insuranceEntry(CustomerDetails customerDetails) {
		
		return iv.insuranceEntry(customerDetails);
	}

	public CustomerDetails check( CustomerDetails renewaldays) {
		
		return iv.check(renewaldays);
	}

}
