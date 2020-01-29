package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Implementation.ServiceImplementation;
import com.example.demo.bean.Table1Bean;
import com.example.demo.entity.Table1;

@RestController
public class Controller {
	
	
	@Autowired
	ServiceImplementation serviceImpl;

	@PostMapping("/controller/save_Details")
	public Table1 login(@Valid @RequestBody Table1Bean table1Bean) throws Exception {
		return serviceImpl.SaveDetails(table1Bean);
	}

	@GetMapping("/controller/Show_Details")
	public List<?> getDetails() throws Exception {
		return serviceImpl.getshowDetails();
	}
	/*@GetMapping("/controller/Show_Details")
	public int getAvg() throws Exception {
	return serviceImpl.getAvg();

	}*/
}
