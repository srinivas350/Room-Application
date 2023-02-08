package com.srinivas.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srinivas.beans.Room;

@Repository
@Transactional(readOnly=false)
public class RoomDAOImpl implements RoomDAO{

	@Autowired
	public HibernateTemplate template;
	public RoomDAOImpl(HibernateTemplate template) {
		super();
		this.template = template;
	}
	@Override
	public void saveRoomData(Room room) {
		// TODO Auto-generated method stub
		template.save(room);
	}
	@Override
	public List<Room> getRoomMatesInfo() {
		// TODO Auto-generated method stub
	   List<Room> list=template.loadAll(Room.class);
		return list;
	}
	
	

}
