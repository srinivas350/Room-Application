package com.srinivas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.srinivas.beans.Room;
import com.srinivas.service.RoomService;

@Controller
public class RoomController {
	
	@Autowired
	public RoomService service;
	@RequestMapping("/")
	public ModelAndView getRoomForm()
	{
		return new ModelAndView("roomForm","Welcome","Welcome To The CrazyBoys Room");
	}
	
	@RequestMapping("/roomPurchases")
	public @ResponseBody List<Room> saveRoomData(@ModelAttribute("room") Room room)
	{
		service.saveRoomData(room);
		List<Room> roomInfo=service.getRoomMatesInfo();
		return roomInfo;
	}
	@RequestMapping("/getRoomMatesInfo")
	public @ResponseBody List<Room> getRoomMates()
	{
		List<Room> room=service.getRoomMatesInfo();
		return room;
	}
	@RequestMapping("/roomMateUpdate/{id}")
	public @ResponseBody List<Room> getRoomMateUpdateById()
	{
		List<Room> room=service.getRoomMatesInfo();
		return room;
	}
	
	

}
