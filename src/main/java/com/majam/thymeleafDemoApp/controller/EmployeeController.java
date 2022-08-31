package com.majam.thymeleafDemoApp.controller;

import com.majam.thymeleafDemoApp.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    private void loadData(){

        Employee temp1 = new Employee(1, "Leslie", "Andrews", "leslie@majam.com");
        Employee temp2 = new Employee(2, "Emma", "Baum", "emma@majam.com");
        Employee temp3 = new Employee(3, "Avani", "Gupta", "avani@majam.com");

        employeeList = new ArrayList<>();
        employeeList.add(temp1);
        employeeList.add(temp2);
        employeeList.add(temp3);

    }

    @GetMapping("/list")
    public String listEmployees(Model theModel){

        theModel.addAttribute("employees", employeeList);

        return "list-employees";
    }

}
