package com.example.demo.SERVICE;

import com.example.demo.ENTITY.Department;
import com.example.demo.REPO.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DepartmentService {

    private final DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);

    }

    public Department findDepartmentById(Long id) {
        log.info("Inside  findDepartmentById of DepartmentService");
        return departmentRepository.findById(id).get();
    }
}
