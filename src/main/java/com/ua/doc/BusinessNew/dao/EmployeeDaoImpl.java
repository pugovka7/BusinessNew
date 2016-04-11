package com.ua.doc.BusinessNew.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ua.doc.BusinessNew.model.User;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, User> implements EmployeeDao {

	public User findById(int userId) {
		return getByKey(userId);
	}

	public void saveEmployee(User employee) {
		persist(employee);
	}


	@SuppressWarnings("unchecked")
	public List<User> findAllEmployees() {
		Criteria criteria = createEntityCriteria();
		return (List<User>) criteria.list();
	}

	
}
