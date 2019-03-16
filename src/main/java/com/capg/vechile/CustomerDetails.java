package com.capg.vechile;

import java.util.Date;

public class CustomerDetails {
private int VehicleNo;
private String VehicleType;
private String AadhaarCard;
private String MobileNo;
private String InsurancePeriod;
private int RenewalDays;
public CustomerDetails(String VehicleType, String AadhaarCard, String MobileNo,String InsurancePeriod) {
this.VehicleType=VehicleType;
this.AadhaarCard=AadhaarCard;
this.MobileNo=MobileNo;
this.InsurancePeriod=InsurancePeriod;
}
public int getVehicleNo() {
	return VehicleNo;
}
public void setVehicleNo(int vehicleNo) {
	VehicleNo = vehicleNo;
}
public String getVehicleType() {
	return VehicleType;
}
public void setVehicleType(String vehicleType) {
	VehicleType = vehicleType;
}
public String getAadhaarCard() {
	return AadhaarCard;
}
public void setAadhaarCard(String aadhaarCard) {
	AadhaarCard = aadhaarCard;
}
public String getInsurancePeriod() {
	return InsurancePeriod;
}
public String getMobileNo() {
	return MobileNo;
}
public void setMobileNo(String mobileNo) {
	MobileNo = mobileNo;
}
public void setInsurancePeriod(String insurancePeriod) {
	InsurancePeriod = insurancePeriod;
}
public int getRenewalDays() {
	return RenewalDays;
}
public void setRenewalDays(int renewalDays) {
	RenewalDays = renewalDays;
}

}
