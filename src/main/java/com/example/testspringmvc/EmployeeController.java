package com.example.testspringmvc;

import com.example.testspringmvc.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Nguyễn", "Văn Huy", "nguyen.a@example.com"),
                new Employee(2, "Trần", "Thị Hoa", "tran.b@example.com"),
                new Employee(3, "lê", "Hồng Hải", "le.c@example.com")
        );

        model.addAttribute("employees", employees);
        return "list_employees";
    }

}