package com.ictsaeil.sample.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.ictsaeil.sample.service.StudentService;

@Controller
public class MainController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public String main() {
		return "Main";
	}

	
	@GetMapping ("/student")
	public ModelAndView student(@RequestParam(value="studentName") String param) {
		ModelAndView mv = new ModelAndView("student");
		
		List<HashMap<String,Object>> list = studentService.selectStudentInfo(param);
		
		mv.addObject("list", list);
		
		return mv;
	}
}
