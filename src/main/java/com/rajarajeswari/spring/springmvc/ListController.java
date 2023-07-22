package com.rajarajeswari.spring.springmvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rajarajeswari.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView putObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("praksh");
		employee.setSalary(20000);

		Employee employee1 = new Employee();
		employee1.setId(132);
		employee1.setName("Priya");
		employee1.setSalary(30000);

		Employee employee2 = new Employee();
		employee2.setId(321);
		employee2.setName("Raji");
		employee2.setSalary(40000);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		
		modelAndView.addObject("employees", employees);
		
		return modelAndView;

	}

}
