package com.bridgelab.employeepayrollapp.service;

import com.bridgelab.employeepayrollapp.model.Employee;

import java.util.List;

public interface IEmployee {
    public String addEmployee(Employee employee);
    public List<Employee> showEmployee();
    public String updateEmployee(Employee employee);
    public String deleteEmployee(int id);
    public Employee getEmployeeById(int id);
}
