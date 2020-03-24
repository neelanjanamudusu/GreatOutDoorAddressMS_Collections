package com.cg.go.dao;

import java.util.HashMap;

import com.cg.go.dto.AddressManagementDTO;
import com.cg.go.dto.UserDTO;

public class AddressMSDAO implements AddressMSDAOInterface {


	private HashMap<Integer, AddressManagementDTO> address=new HashMap<Integer, AddressManagementDTO>();
	private HashMap<Integer, UserDTO> user=new HashMap<Integer,UserDTO>();
	

	public AddressMSDAO() {
		super();

		UserDTO user1=new UserDTO("qwerty", 1);
		UserDTO user2=new UserDTO("qwerty123", 2);
		user.put(1, user1);
		user.put(2, user2);
	}

	@Override
	public int addAddress(int userid, String housenumber, String streetnumber, String city, String district,String state,Long pincode) {
		
		try {
			validateuser(userid);
		AddressManagementDTO add1=new AddressManagementDTO(userid, housenumber, streetnumber, city, district, state, pincode);
		address.put(userid, add1);
		System.out.println(add1);
		return userid;
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	private void validateuser(int userid) throws Exception {
		if(!user.containsKey(userid))
			throw new InvalidUser("Product doesn't exist in products");
	}

	@Override
	public int deleteAddress(int uid) {
		if(address.remove(uid)!=null)
				return 1;
		else 
			return 0;
	}

	@Override
	public int updateAddress(int uid, String hno, String sno, String cityn, String dist, String staten, Long pinc) {
		AddressManagementDTO add1=new AddressManagementDTO(uid, hno, sno, cityn, dist, staten, pinc);
		
		if(address.replace(uid, add1)!=null)
			return 1;
		else return 0;
	}
}
