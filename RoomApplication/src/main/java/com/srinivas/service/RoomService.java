package com.srinivas.service;

import java.util.List;

import com.srinivas.beans.Room;

public interface RoomService
{
	
	public void saveRoomData(Room room);
	public List<Room> getRoomMatesInfo();

}
