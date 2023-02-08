package com.srinivas.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room_Info")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roomMateId;
	@Column
	private String roomMateName;
	@Column
	private Date purchasedDate;
	@Column
	private String expansivThings;
	@Column
	private int expansiveAmount;
	@Column
	private int totalAmount;
	public int getRoomMateId() {
		return roomMateId;
	}
	public void setRoomMateId(int roomMateId) {
		this.roomMateId = roomMateId;
	}
	public String getRoomMateName() {
		return roomMateName;
	}
	public void setRoomMateName(String roomMateName) {
		this.roomMateName = roomMateName;
	}
	public Date getPurchasedDate() {
		return purchasedDate;
	}
	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public String getExpansivThings() {
		return expansivThings;
	}
	public void setExpansivThings(String expansivThings) {
		this.expansivThings = expansivThings;
	}
	public int getExpansiveAmount() {
		return expansiveAmount;
	}
	public void setExpansiveAmount(int expansiveAmount) {
		this.expansiveAmount = expansiveAmount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Room(int roomMateId, String roomMateName, Date purchasedDate, String expansivThings, int expansiveAmount,
			int totalAmount) {
		super();
		this.roomMateId = roomMateId;
		this.roomMateName = roomMateName;
		this.purchasedDate = purchasedDate;
		this.expansivThings = expansivThings;
		this.expansiveAmount = expansiveAmount;
		this.totalAmount = totalAmount;
	}
	
	public Room()
	{
		
	}
	public Room(int roomMateId)
	{
		this.roomMateId=roomMateId;
	}

}
