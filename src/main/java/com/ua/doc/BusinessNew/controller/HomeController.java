package com.ua.doc.BusinessNew.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ua.doc.BusinessNew.config.SpringMongoConfig;
import com.ua.doc.BusinessNew.dao.TaxBillDao;
import com.ua.doc.BusinessNew.model.DownTable;
import com.ua.doc.BusinessNew.model.TaxBill;
import com.ua.doc.BusinessNew.model.TaxBillAll;
import com.ua.doc.BusinessNew.model.User;
import com.ua.doc.BusinessNew.service.EmployeeService;

@Controller
@RequestMapping(value="/")
public class HomeController {

	@Autowired
	EmployeeService service;
	
	@Autowired
	TaxBillDao tbDao;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		List<User> employees = service.findAllEmployees();		
		model.addAttribute("employees", employees);
		model.addAttribute("customerList", tbDao.listCustomer()); 
		return "allemployees";
	}
	
	
	
	@RequestMapping(value = { "/listMongo" }, method = RequestMethod.GET)
	public String listMongo(ModelMap model) {

		//List<User> employees = service.findAllEmployees();
		//model.addAttribute("employees", employees);
		//List<DownTable> dt = tbDao.listDown();
		model.addAttribute("customerList", tbDao.listCustomer()); 
		//model.addAttribute("dt", tbDao.listDown());		
		return "taxbill";
	}

	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newEmployee(ModelMap model) {
		User employee = new User();
		model.addAttribute("employee", employee);
		model.addAttribute("edit", false);
		return "registration";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid User employee, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}
		//Mongo works
		List<DownTable> bb = new ArrayList<DownTable>();
		bb.add(new DownTable("1321","dsf","sdfg","sdgfds","sdgs","sdfgs","sdfg","sdfg","sdfg","sfg","sfdg","sdgsd","sadf"));
		bb.add(new DownTable("2356","dsf","sdfg","sdgfds","sdgs","sdfgs","sdfg","sdfg","sdfg","sfg","sfdg","sdgsd","sadf"));
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		TaxBillAll taxBi=new TaxBillAll(
				"1","29.02.2016","175","Петя","123456789123","ул. Фрунзе", "0577076474", "ПРОСТОЕ", "наличные",	bb);
		mongoOperation.save(taxBi, "taxbillAll");
		
		TaxBill userA = new TaxBill("1000", "apple", 54, new Date());
		mongoOperation.save(userA, "taxbills");
	
		service.saveEmployee(employee);

		model.addAttribute("success", "Employee " + employee.getUserEmail() + " registered successfully");
		return "success";
	}	
	/*@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}*/
}
