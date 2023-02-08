package com.srinivas.service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinivas.beans.Room;
import com.srinivas.dao.RoomDAO;

@Service
public class RoomServiceImpl implements RoomService{

	@Autowired
	public RoomDAO dao;
	@Override
	public void saveRoomData(Room room) {
		// TODO Auto-generated method stub
		long millis=room.getPurchasedDate().getTime();
		java.sql.Date date1=new java.sql.Date(millis);
		room.setPurchasedDate(date1);
		dao.saveRoomData(room);
		
	}
	@Override
	public List<Room> getRoomMatesInfo() {
		// TODO Auto-generated method stub
		List<Room> roomList=dao.getRoomMatesInfo();
		Iterator itr=roomList.iterator();
		List<Room> list=new ArrayList();
		while(itr.hasNext())
		{
			Room room=(Room)itr.next();
		    String str=room.getPurchasedDate().toString();
		    try
		    {
		    	 Date date=(Date) new SimpleDateFormat("yyyy-MM-dd").parse(str);
		    	 room.setPurchasedDate(date);
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
		    list.add(room);
		}
		return roomList;
	}

}
