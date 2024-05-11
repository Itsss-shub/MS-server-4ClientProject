package com.save.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.save.model.Student;
import com.save.serviceI.StudentServicesI;

@RestController
public class HomeController {
	
	@Autowired
	StudentServicesI ssi;
	
	@DeleteMapping("/save")
	public String deleteData(@RequestBody Student s) {
		
		ssi.save(s);
		return "Data Deleted...!!!";
	}
	

}
