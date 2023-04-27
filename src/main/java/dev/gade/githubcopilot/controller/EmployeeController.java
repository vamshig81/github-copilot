package dev.gade.githubcopilot.controller;

import dev.gade.githubcopilot.model.Employee;
import dev.gade.githubcopilot.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    //@Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    @RequestMapping("/")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    //get employee by id
    @GetMapping("/{id}")
    //@RequestMapping("/getEmployeeById")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    //get employee by name
    @RequestMapping("/getEmployeeByName")
    public Employee getEmployeeByName(String name) {
        return employeeService.getAllEmployees().stream().filter(employee -> employee.getName().equals(name)).findFirst().orElse(null);
    }

}
