package com.save.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.save.model.Student;
import com.save.repository.StudentRepository;
import com.save.serviceI.StudentServicesI;

@Service
public class StudentServiceImpl  implements StudentServicesI{

	@Autowired
	StudentRepository sri;

	@Override
	public void save(Student s) {
		sri.save(s);
		
	}


}
