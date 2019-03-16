package com.capg.vechile.DAO;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.capg.vechile.CustomerDetails;


public class VehicleDAO implements IVehicleDAO {
	 Map<Integer,CustomerDetails>insuranceEntry;
	public VehicleDAO() {
		Map<Integer,CustomerDetails>cust=new HashMap<Integer, CustomerDetails>();
		insuranceEntry=new HashMap<Integer, CustomerDetails>();
		insuranceEntry.put(1,new CustomerDetails("2 wheelers","1212","7702129002", "12/03/2019"));
		insuranceEntry.put(2,new CustomerDetails("4 wheelers","1345678","9402129002", "01/07/2019"));
		insuranceEntry.put(3,new CustomerDetails("2 wheelers","1212000","8702129002", "02/08/2019"));
		insuranceEntry.put(4,new CustomerDetails("4 wheelers","121299988","9702129002", "01/12/2019"));
		insuranceEntry.put(5,new CustomerDetails("2 wheelers","12129045","7602129002", "22/03/2019"));
		insuranceEntry.put(6,new CustomerDetails("4 wheelers","121200888","8802129002", "22/05/2019"));
			
		
	}
	public CustomerDetails insuranceEntry(CustomerDetails customerDetails) {
		CustomerDetails cd=null;
		for(Map.Entry<Integer,CustomerDetails> m : insuranceEntry.entrySet())
		{
			if(m.getKey().equals(customerDetails))
			{
				cd = m.getValue();
			}
		}
		return cd;
	}
	public CustomerDetails check( CustomerDetails renewaldays) {
	CustomerDetails user = null;
		
		for(Entry<Integer, CustomerDetails> m :insuranceEntry.entrySet())
		{
			if(m.getKey().equals(renewaldays))
			{
				user = m.getValue();
			
			}
		}
		if(user != null)
		{
		System.out.println("renewaldays:"+user.getInsurancePeriod());
		 
			insuranceEntry.put(renewaldays, user);
		}
		
		return user;
	}

	

	

}
