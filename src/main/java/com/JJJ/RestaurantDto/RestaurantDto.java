package com.JJJ.RestaurantDto;

import javax.validation.constraints.NotNull;

public class RestaurantDto {
	@NotNull(message= "Name cannot be empty")
	String name;

	String address;
	String phonenumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "RestaurantDto [name=" + name + ", address=" + address + ", phonenumber=" + phonenumber + "]";
	}

}
