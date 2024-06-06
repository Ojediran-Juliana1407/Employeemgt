package com.project.Employee_sys.services;

import com.project.Employee_sys.entities.Employee;
import com.project.Employee_sys.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElseThrow();
    }
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
    public Employee updateEmployee(Long id,Employee employee) {
        Employee existingEmployee = getEmployeeById(id);
        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        return employeeRepo.save(existingEmployee);
    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

}
