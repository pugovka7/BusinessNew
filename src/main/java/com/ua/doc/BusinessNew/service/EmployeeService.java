package com.ua.doc.BusinessNew.service;

import java.util.List;

import com.ua.doc.BusinessNew.model.User;

public interface EmployeeService {

	User findById(int id);
	
	void saveEmployee(User employee);
	

	
	

	List<User> findAllEmployees(); 
	
	


	
}
