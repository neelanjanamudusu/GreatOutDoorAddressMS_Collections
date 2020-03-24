package com.cg.go.dto;

public class AddressManagementDTO {
	private Integer userid;
	private String housenumber;
	private String streetnumber;
	private String city;
	private String district;
	private String state;
	private Long pincode;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getStreetnumber() {
		return streetnumber;
	}
	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public AddressManagementDTO(Integer userid, String housenumber, String streetnumber, String city, String district, String state, Long pincode) {
		super();
		this.userid = userid;
		this.housenumber = housenumber;
		this.streetnumber = streetnumber;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	
	public AddressManagementDTO()
	{
	
	}
	
	@Override
	public String toString() {
		return "AddressManagementDTO [userid=" + userid + ", housenumber=" + housenumber + ", streetnumber="
				+ streetnumber + ", city=" + city + ", district=" + district + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	

}