package com.cg.go.service;

import com.cg.go.dao.AddressMSDAO;
import com.cg.go.dao.AddressMSDAOInterface;

public class AddressMSService implements AddressMSServiceInterface {

	AddressMSDAOInterface dao=new AddressMSDAO();


	@Override
	public int addAddress(int userid, String housenumber, String streetnumber, String city, String district,
			String state, Long pincode) {
		return dao.addAddress( userid,housenumber, streetnumber,city, district, state, pincode);
	}


	@Override
	public int deleteAddress(int uid) {
		 return dao.deleteAddress(uid);
	}


	@Override
	public int updateAddress(int uid, String hno, String sno, String cityn, String dist, String staten, Long pinc) {
		return dao.updateAddress(uid,hno,sno,cityn,dist,staten,pinc);
	}
	
	
	
}
