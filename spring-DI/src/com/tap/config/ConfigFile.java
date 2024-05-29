package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.tap.pojo.Address;
import com.tap.pojo.Employee;

@Configuration
public class ConfigFile {

	@Bean("addr1")
	public Address addr1() {
		Address a = new Address(23, "hyd", "Ap");

		return a;
	}

	@Bean("addr2")
	public Address addr2() {
		Address a = new Address(213, "shsfhh2sfshyd", "fdgfdhkApdkkd");

		return a;
	}
	
	
	
	@Bean("colgs")
	public Colleague createclg()
	{
		Colleague colgs = new Colleague("nikhil", "sampath","hero", "zero", "villian");
		
		return colgs;
	}
	

	@Bean
	public Employee emp() {
		Employee e = new Employee();

		e.setId(2040);
		e.setName("Nikhilgvd");
		e.setSalary(025000);

		return e;
	}

}
