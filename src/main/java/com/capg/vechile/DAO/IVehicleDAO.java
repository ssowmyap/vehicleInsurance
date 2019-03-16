package com.capg.vechile.DAO;

import com.capg.vechile.CustomerDetails;

public interface IVehicleDAO {
CustomerDetails insuranceEntry(CustomerDetails customerDetails);
CustomerDetails check(CustomerDetails renewaldays);
}
