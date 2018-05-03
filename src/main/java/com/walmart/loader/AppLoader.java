package com.walmart.loader;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.walmart.repo.EmployeeRepository;



@SpringBootApplication
//@EnableJpaRepositories
//@EnableAutoConfiguration
//@ImportResource("classpath:beans.xml")
//@Configuration
public class AppLoader implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppLoader.class);
	}

	@Autowired
	DataSource dataSource;

	public void test1(){

	}


	@Autowired
	EmployeeRepository employeeRepository1;

	@Override
	public void run(String... arg0) throws Exception {

		System.out.println("Data Source :"+dataSource);
		System.out.println("Working!!");
		employeeRepository.findAll();
		System.out.println("Working!!");

	}


}
