package com.ua.doc.BusinessNew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ua.doc.BusinessNew.dao.EmployeeDao;
import com.ua.doc.BusinessNew.model.User;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public User findById(int userId) {
		return dao.findById(userId);
	}

	public void saveEmployee(User employee) {
		dao.saveEmployee(employee);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
	
	
	public List<User> findAllEmployees() {
		return dao.findAllEmployees();
	}


	
	
}
