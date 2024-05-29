package com.tap.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.tap.config.Colleague;

public class Employee {

	private String name;
	private int id;
	private int salary;
	
	
	@Autowired
	@Qualifier("addr2")
	private Address address;

	@Autowired
	private Colleague colgs;
	
	
	public Employee() {
	}

	public Employee(String name, int id, int salary) {
		super();
		
		System.out.println("using constrcutor for data injection");
		this.name = name;
		this.id = id;
		this.salary = salary;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public Colleague getColleague()
	{
		return colgs;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+ " "+ name	+ " "+	salary+ " "+address+ " " + colgs;
	}

}
