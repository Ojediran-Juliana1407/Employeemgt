package com.project.Employee_sys.services;

import com.project.Employee_sys.entities.Role;
import com.project.Employee_sys.repositories.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;

    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }

    public Role getRoleById(Long id) {
        return roleRepo.findById(id).orElseThrow();
    }

    public Role createRole(Role role) {
        return roleRepo.save(role);
    }

    public Role updateRole(Long id, Role role) {
        Role existingRole = getRoleById(id);
        existingRole.setName(role.getName());
        return roleRepo.save(existingRole);
    }
    public void deleteRole(Long id) {
        roleRepo.deleteById(id);
    }

}
