package com.tap.pojo;

public class Address {

	
	private int lane;
	private 	String city;
	private String state;
	
	public Address(){
		
	}
	public Address(int lane, String city, String state) {
		super();
		//System.out.println("using constructor for data injection");
		this.lane = lane;
		this.city = city;
		this.state = state;
	}
	public int getLane() {
		return lane;
	}
	public void setLane(int lane) {
		this.lane = lane;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		
		this.state = state;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return lane + " "+city + " "+state + " ";
	}
	
	
	
}
