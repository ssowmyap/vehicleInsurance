package com.capg.vechile.UI;

import java.util.Scanner;

import com.capg.vechile.CustomerDetails;
import com.capg.vechile.Service.IVehicleService;
import com.capg.vechile.Service.VehicleService;

public class Menu {
	
	
	public static void main(String[] args) {
		CustomerDetails c = new CustomerDetails(null, null, null, null);
		IVehicleService vehicleService =new VehicleService();
		Scanner sc=new Scanner(System.in);
	System.out.println("1) Vehicle Insurance Registration\r\n" + 
			"2)	Insurance Validity Check\r\n" + "3) Exit");
	System.out.println("Enter option");
	int ch=sc.nextInt();
	do {
		switch (ch) {
		case 1:
			
			CustomerDetails cd=vehicleService.insuranceEntry(c);
			int vehicleNo=sc.nextInt();
			System.out.println("Enter vehicleNo"+vehicleNo);
			if(vehicleNo==cd.getVehicleNo()) {
			System.out.println("CustomerDetails are:");
			System.out.println("VechileNo"+cd.getVehicleNo());
			System.out.println("VehicleType"+cd.getVehicleType());
			System.out.println("Aadharcard"+cd.getAadhaarCard());
			System.out.println("MobileNo"+cd.getMobileNo());
			System.out.println("insurancePeriod"+cd.getInsurancePeriod());
			}
			break;
		case 2:
			CustomerDetails cd1=vehicleService.check(c);
			
        	int vehicleno=0;
			if(cd1!=null) 
			
			if(vehicleno==cd1.getVehicleNo())
			System.out.println("renewaldays"+cd1.getRenewalDays());
			
		default:
			System.exit(0);
			break;
		}
		
		
		
		
		
		
	}while(true);
	
	
	
	
	
	}

}
