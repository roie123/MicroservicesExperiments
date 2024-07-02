package com.example.demo.CONTROLLER;

import com.example.demo.ENTITY.Department;
import com.example.demo.SERVICE.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {


    private final DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }


    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long id) {
        log.info("Inside findDepartmentById of DepartmentController");
        return departmentService.findDepartmentById(id);
    }


}
