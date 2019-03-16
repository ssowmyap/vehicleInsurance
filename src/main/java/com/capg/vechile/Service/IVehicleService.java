package com.capg.vechile.Service;

import com.capg.vechile.CustomerDetails;

public interface IVehicleService {
	CustomerDetails insuranceEntry(CustomerDetails customerDetails);
	CustomerDetails check(CustomerDetails c);
}
