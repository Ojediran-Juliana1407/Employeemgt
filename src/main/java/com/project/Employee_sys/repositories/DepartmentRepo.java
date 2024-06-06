package com.project.Employee_sys.repositories;
import com.project.Employee_sys.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DepartmentRepo extends JpaRepository< Department, Long> {
}
