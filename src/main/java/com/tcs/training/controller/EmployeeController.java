package com.tcs.training.controller;

import com.tcs.training.bean.Employee;
import com.tcs.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1.0")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{empId}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer empId){
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping("/employees")
    public void addNewEmployee(@RequestBody Employee employee){
        employeeService.addNewEmployee(employee);
    }

    @PutMapping("/employees/{empId}")
    public void updateEmployeeById(@PathVariable Integer empId, @RequestBody Employee employee){
        employeeService.updateEmployeeById(empId,employee);
    }

    @DeleteMapping("/employees/{empId}")
    public void deleteEmployeeId(@PathVariable Integer empId){
        employeeService.deleteEmployeeId(empId);
    }

    //Custom Finder Method
    @GetMapping("/employees/name/{name}")
    public Iterable<Employee> getEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }
}
