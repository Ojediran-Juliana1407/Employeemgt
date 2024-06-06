package com.project.Employee_sys.services;

import com.project.Employee_sys.entities.Department;
import com.project.Employee_sys.repositories.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public List<Department> getAllDepartment() {
        return departmentRepo.findAll();
    }

    public Department getDepartmentById(Long id) {
        return departmentRepo.findById(id).orElseThrow();
    }

    public Department createDepartment(Department department) {
        return departmentRepo.save(department);
    }
    public Department updateDepartment(Long id,Department department) {
        Department existingDepartment = getDepartmentById(id);
        existingDepartment.setName(department.getName());
        return departmentRepo.save(existingDepartment);
    }
    public void deleteDepartment(Long id) {
        departmentRepo.deleteById(id);
    }
}
