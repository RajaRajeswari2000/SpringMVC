package com.rajarajeswari.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rajarajeswari.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView putObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
	    Employee employee = new Employee();
	    employee.setId(123);
	    employee.setName("praksh");
	    employee.setSalary(20000);
		modelAndView.addObject("employee", employee);
		return modelAndView;
		
	}
	
}
