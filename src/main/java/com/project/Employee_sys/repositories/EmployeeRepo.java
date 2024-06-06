package com.project.Employee_sys.repositories;

import com.project.Employee_sys.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepo extends JpaRepository<Employee,Long>  {
}
