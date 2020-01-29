package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.example.demo.bean.integer;

@Entity
 @Table(name = "table1")
public class Table1 {

	@Id
	@Column(name = "Id")
	Integer Id;

	@Column(name = "Name")
	String name;

	@Column(name = "Password")
	String password;
	
	@Column(name = "Min_mark")
	Integer min;
	
	@Column(name = "Max_mark")
	Integer max;
	
	@Column(name = "Avg")
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
	public  Integer getMin_mark() {
		return min;
	}

	public void setMin_mark(  Integer min) {
		this.min = min;
	}
	public   Integer getMax_mark() {
		return max;
	}

	public void setMax_mark(  Integer max) {
		this.max = max;
	}
	public   Integer getAvg() {
		return avg;
	}

	public void setAvg(Integer avg) {
		this.avg = avg;
	}

}
