package com.entlogics.schoolsystem.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entlogics.schoolsystem.dao.IIndexDAO;
import com.entlogics.schoolsystem.dao.IndexDAO;

// controller class having method calling dao method to test mvc flow
@Controller
@RequestMapping("/api")
public class IndexController {

	// create logger object
//	private static final Logger logger = Logger.getLogger(IndexController.class);
	
	// controller method calls dao method to get a string
	@RequestMapping("/testmvc")
	public String testController() {
			
		// creating dao object
		IIndexDAO index = new IndexDAO();
	
		// calling the method in dao and storing the result
		String result = index.testMVCFlow();
		
		// printing to know controller method is called
		System.out.println("Inside controller");
		
		// returning the string name of the jsp page
		return result;
	}
}
