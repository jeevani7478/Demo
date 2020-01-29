package com.example.demo.bean;

public class Table1Bean {
	
	Integer Id;
	String name;
	String password;
	Integer min;
    Integer max;
    Integer avg;
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMin_mark() {
		return min;
	}

	public void setMin_mark(Integer min) {
		this.min = min;
	}
	public  Integer getMax_mark() {
		return max;
	}

	public void setMax_mark(Integer max) {
		this.max = max;
	}
	public  Integer getAvg() {
		return avg;
	}

	public void setAvg(Integer avg) {
		this.avg = avg;
	}

}
