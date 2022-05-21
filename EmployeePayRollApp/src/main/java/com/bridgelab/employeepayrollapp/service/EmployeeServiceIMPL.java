package com.bridgelab.employeepayrollapp.service;

import com.bridgelab.employeepayrollapp.dao.EmployeeRepository;
import com.bridgelab.employeepayrollapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceIMPL implements IEmployee {
    List<Employee> employees = new ArrayList<Employee>();

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "User Added Successfully";
    }

    @Override
    public List<Employee> showEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public String updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "User Updated Successfully";
    }

    @Override
    public String deleteEmployee(int id) {
        Employee employee = employeeRepository.getOne(id);
        employeeRepository.delete(employee);
        return "User Deleted Successfully";
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }
}
