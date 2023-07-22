package com.rajarajeswari.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 1234);
		modelAndView.addObject("name", "rajarajeswari");
		modelAndView.addObject("salary", 500000);
		return modelAndView;

	}

}
