package com.majam.thymeleafDemoApp.DAO;

import com.majam.thymeleafDemoApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}