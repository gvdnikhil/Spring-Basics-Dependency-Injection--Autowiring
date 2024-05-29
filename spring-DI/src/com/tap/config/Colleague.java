package com.tap.config;

public class Colleague {
	
	
	private String colleague1;
	private String colleague2;
	private String colleague3;
	private String colleague4;
	private String colleague5;
	
	public Colleague()
	{
		
	}
	
	public Colleague(String colleague1, String colleague2, String colleague3, String colleague4, String colleague5) {
		super();
		this.colleague1 = colleague1;
		this.colleague2 = colleague2;
		this.colleague3 = colleague3;
		this.colleague4 = colleague4;
		this.colleague5 = colleague5;
	}

	public String getColleague1() {
		return colleague1;
	}

	public void setColleague1(String colleague1) {
		this.colleague1 = colleague1;
	}

	public String getColleague2() {
		return colleague2;
	}

	public void setColleague2(String colleague2) {
		this.colleague2 = colleague2;
	}

	public String getColleague3() {
		return colleague3;
	}

	public void setColleague3(String colleague3) {
		this.colleague3 = colleague3;
	}

	public String getColleague4() {
		return colleague4;
	}

	public void setColleague4(String colleague4) {
		this.colleague4 = colleague4;
	}

	public String getColleague5() {
		return colleague5;
	}

	public void setColleague5(String colleague5) {
		this.colleague5 = colleague5;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return colleague1 + " "+ colleague2 + " "+colleague3 + " "+colleague4 + " "+colleague5 + " ";
	}
	
	
	
}
