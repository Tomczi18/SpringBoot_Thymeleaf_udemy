package com.majam.thymeleafDemoApp.DAO;

import com.majam.thymeleafDemoApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}