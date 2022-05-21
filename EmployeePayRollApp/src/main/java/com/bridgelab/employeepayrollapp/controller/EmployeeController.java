package com.bridgelab.employeepayrollapp.controller;

import com.bridgelab.employeepayrollapp.model.Employee;
import com.bridgelab.employeepayrollapp.service.EmployeeServiceIMPL;
import com.bridgelab.employeepayrollapp.service.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployee iEmployee;

    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
        String addMessage = iEmployee.addEmployee(employee);
        return new ResponseEntity<String>(addMessage, HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmployee(){
        List<Employee> employees = iEmployee.showEmployee();
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
        String updateMessage = iEmployee.updateEmployee(employee);
        return new ResponseEntity<String>(updateMessage, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        String message = iEmployee.deleteEmployee(id);
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
        Employee emp = iEmployee.getEmployeeById(id);
        return new ResponseEntity<Employee>(emp, HttpStatus.OK);
    }

}
