package com.hotel.dto;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("room")
public class RoomDTO {
	private String roomNo;
	private String hotelNo;
	private String hotelName;
	private String roomType;
	private String roomSimpleManual;
	private String roomDetailManual;
	private String roomImage;
	private List<RoomDTO> optionlist;
	private List<RoomDTO> hotellist;
	private String optionName;
	private String optionPath;
	private int price;
	
	public RoomDTO() {
	}
	
	
	public List<RoomDTO> getHotellist() {
		return hotellist;
	}

	public void setHotellist(List<RoomDTO> hotellist) {
		this.hotellist = hotellist;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public List<RoomDTO> getOptionlist() {
		return optionlist;
	}


	public void setOptionlist(List<RoomDTO> optionlist) {
		this.optionlist = optionlist;
	}



	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getOptionPath() {
		return optionPath;
	}

	public void setOptionPath(String optionPath) {
		this.optionPath = optionPath;
	}

	public String getRoomImage() {
		return roomImage;
	}

	public void setRoomImage(String roomImage) {
		this.roomImage = roomImage;
	}

	public String getRoomNo() {
		return roomNo;
	}
	
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	
	public String getHotelNo() {
		return hotelNo;
	}
	
	public void setHotelNo(String hotelNo) {
		this.hotelNo = hotelNo;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public String getRoomSimpleManual() {
		return roomSimpleManual;
	}
	
	public void setRoomSimpleManual(String roomSimpleManual) {
		this.roomSimpleManual = roomSimpleManual;
	}
	
	public String getRoomDetailManual() {
		return roomDetailManual;
	}
	
	public void setRoomDetailManual(String roomDetailManual) {
		this.roomDetailManual = roomDetailManual;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "RoomDTO [roomNo=" + roomNo + ", hotelNo=" + hotelNo + ", hotelName=" + hotelName + ", roomType="
				+ roomType + ", roomSimpleManual=" + roomSimpleManual + ", roomDetailManual=" + roomDetailManual
				+ ", roomImage=" + roomImage + ", optionlist=" + optionlist + ", optionName=" + optionName
				+ ", optionPath=" + optionPath + ", price=" + price + "]";
	}

	
	
	
}
