package com.hotel.dto;

import org.apache.ibatis.type.Alias;

@Alias("room")
public class RoomDTO {
	private String roomno;
	private String hotelno;
	private String roomtype;
	private String roomsimplemanual;
	private String roomdetailmanual;
	private String roomimagepath;
	private int price;
	private String hotelname;

	public RoomDTO() {
	}
	
	
	
	public String getHotelname() {
		return hotelname;
	}



	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}



	public String getRoomimagepath() {
		return roomimagepath;
	}


	public void setRoomimagepath(String roomimagepath) {
		this.roomimagepath = roomimagepath;
	}



	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public String getHotelno() {
		return hotelno;
	}

	public void setHotelno(String hotelno) {
		this.hotelno = hotelno;
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
		return "RoomDTO [roomno=" + roomno + ", hotelno=" + hotelno + ", roomtype=" + roomtype + ", roomsimplemanual="
				+ roomsimplemanual + ", roomdetailmanual=" + roomdetailmanual + ", roomimagepath=" + roomimagepath
				+ ", price=" + price + ", hotelname=" + hotelname + "]";
	}


	

	



}
