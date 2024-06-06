package com.project.Employee_sys.repositories;

import com.project.Employee_sys.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
