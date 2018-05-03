package com.walmart.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {


//	@Autowired
//	EmployeeRepository employeeRepository;
	
//	@RequestMapping("/employee")
//    public List<Employee> getMovies(){
//		System.out.println("Controller Invoked!");
//		
//	
//    	return employeeRepository.findAll();
//    	
//  
//    
	//}
	
	@RequestMapping("/test")
    public String getMovies(){
		System.out.println("Controller Invoked!");
		
	
    	return "Testing worked!";
    	
  
    }
}
