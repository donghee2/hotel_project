package com.hotel.dto;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("room")
public class RoomDTO {
	private String roomNo;
	private String hotelNo;
	private String hotelName;
	private String roomtype;
	private String roomsimplemanual;
	private String roomdetailmanual;
	private String roomImage;
	private int price;
	private List<RoomDTO> optionlist;
	private List<RoomDTO> hotellist;
	private String optionName;
	private String optionPath;

	public RoomDTO() {
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



	public List<RoomDTO> getOptionlist() {
		return optionlist;
	}



	public void setOptionlist(List<RoomDTO> optionlist) {
		this.optionlist = optionlist;
	}



	public List<RoomDTO> getHotellist() {
		return hotellist;
	}



	public void setHotellist(List<RoomDTO> hotellist) {
		this.hotellist = hotellist;
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



	public String gethotelName() {
		return hotelName;
	}



	public void sethotelName(String hotelName) {
		this.hotelName = hotelName;
	}



	public String getRoomImage() {
		return roomImage;
	}


	public void setRoomImage(String roomImage) {
		this.roomImage = roomImage;
	}



	public String getroomNo() {
		return roomNo;
	}

	public void setroomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String gethotelNo() {
		return hotelNo;
	}

	public void sethotelNo(String hotelNo) {
		this.hotelNo = hotelNo;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	

	public String getRoomsimplemanual() {
		return roomsimplemanual;
	}


	public void setRoomsimplemanual(String roomsimplemanual) {
		this.roomsimplemanual = roomsimplemanual;
	}


	public String getRoomdetailmanual() {
		return roomdetailmanual;
	}


	public void setRoomdetailmanual(String roomdetailmanual) {
		this.roomdetailmanual = roomdetailmanual;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "RoomDTO [roomNo=" + roomNo + ", hotelNo=" + hotelNo + ", roomtype=" + roomtype + ", roomsimplemanual="
				+ roomsimplemanual + ", roomdetailmanual=" + roomdetailmanual + ", roomImage=" + roomImage
				+ ", price=" + price + ", hotelName=" + hotelName + "]";
	}


	

	



}
