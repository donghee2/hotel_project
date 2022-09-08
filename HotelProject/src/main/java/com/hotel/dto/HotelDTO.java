package com.hotel.dto;

import org.apache.ibatis.type.Alias;

@Alias("hotel")
public class HotelDTO {
	private String hotelNo;
	private String hotelName;
	private String hotelTel;
	private String hotelAddress;
	private String hotelImage;
	private String hotelSimpleMenual;
	private String hotelDetailMenual;

	public HotelDTO() {
	}

	public String getHotelNo() {
		return hotelNo;
	}

	public void setHotelNo(String hotelNo) {
		this.hotelNo = hotelNo;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelTel() {
		return hotelTel;
	}

	public void setHotelTel(String hotelTel) {
		this.hotelTel = hotelTel;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getHotelImage() {
		return hotelImage;
	}

	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}

	public String getHotelSimpleMenual() {
		return hotelSimpleMenual;
	}

	public void setHotelSimpleMenual(String hotelSimpleMenual) {
		this.hotelSimpleMenual = hotelSimpleMenual;
	}

	public String getHotelDetailMenual() {
		return hotelDetailMenual;
	}

	public void setHotelDetailMenual(String hotelDetailMenual) {
		this.hotelDetailMenual = hotelDetailMenual;
	}

	@Override
	public String toString() {
		return "HotelDTO [hotelNo=" + hotelNo + ", hotelName=" + hotelName + ", hotelTel=" + hotelTel
				+ ", hotelAddress=" + hotelAddress + ", hotelImage=" + hotelImage + ", hotelSimpleMenual="
				+ hotelSimpleMenual + ", hotelDetailMenual=" + hotelDetailMenual + "]";
	}
	
	
	
}
