package com.srinivas.dao;

import java.util.List;

import com.srinivas.beans.Room;

public interface RoomDAO {
	
	public void saveRoomData(Room room);
	public List<Room> getRoomMatesInfo();

}
