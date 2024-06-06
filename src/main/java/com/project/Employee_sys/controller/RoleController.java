package com.project.Employee_sys.controller;

import com.project.Employee_sys.services.RoleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.Role;
import javax.management.relation.RoleResult;
import java.util.List;

@RestController
@RequestMapping("/role")

public class RoleController{
    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }
    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }
    @PutMapping("/{id}")
    public Role updateRole(@PathVariable Long id,@RequestBody Role role) {
        return roleService.updateRole(id,role);
    }
    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
    }
}
