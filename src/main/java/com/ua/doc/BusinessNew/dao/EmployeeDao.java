package com.ua.doc.BusinessNew.dao;

import java.util.List;

import com.ua.doc.BusinessNew.model.User;

public interface EmployeeDao {

	User findById(int userId);

	void saveEmployee(User employee);
		
	
	List<User> findAllEmployees();

	

}
