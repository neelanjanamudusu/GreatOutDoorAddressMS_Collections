package com.cg.go.dao;

public interface AddressMSDAOInterface {

	int addAddress(int userid, String housenumber, String streetnumber, String city, String district, String state,Long pincode);

	int deleteAddress(int uid);

	int updateAddress(int uid, String hno, String sno, String cityn, String dist, String staten, Long pinc);

}
