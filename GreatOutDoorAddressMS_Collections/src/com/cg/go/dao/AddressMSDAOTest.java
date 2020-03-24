package com.cg.go.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AddressMSDAOTest {
	AddressMSDAO dao=new AddressMSDAO();
	
	//invalid
	/*@Test
	public void addlist() throws Exception {
		int  result = dao.addAddress(10, "hno:1-1-121","zxc","qwertyu","qwertyui","qwerty",(long)500076);
		if (result==0) {
			assertTrue(true);
			}
		}
	*/
	//valid
	@Test
	public void addlist1() throws Exception {
		int  result = dao.addAddress(1, "hno:1-1-121","zxc","qwertyu","qwertyui","qwerty",(long)500076);
		if (result==0) {
			assertFalse(true);
			}
		}
	
	//invalid
	/*@Test
	public void deletelist() throws Exception {
		if (dao.deleteAddress(10)==0) {
			assertTrue(true);
			}
		}
	*/
	
	//valid
	@Test
	public void deletelist1() throws Exception {
		if (dao.deleteAddress(1)==0) {
			assertTrue(true);
			}
		}
}
