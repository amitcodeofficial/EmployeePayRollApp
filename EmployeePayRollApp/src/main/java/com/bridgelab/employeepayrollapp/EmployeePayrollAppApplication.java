package com.bridgelab.employeepayrollapp;

import com.bridgelab.employeepayrollapp.dao.EmployeeRepository;
import com.bridgelab.employeepayrollapp.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
    }

}
