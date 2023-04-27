package dev.gade.githubcopilot.service;

import dev.gade.githubcopilot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "gade", "vamshi@gmail.com"));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(Employee employee) {
        employees.stream().filter(employee1 -> employee1.getId() == employee.getId()).findFirst().ifPresent(employee1 -> {
            employee1.setName(employee.getName());
            employee1.setEmail(employee.getEmail());
        });
    }

    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }


}
