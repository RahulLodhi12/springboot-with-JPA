package com.tcs.training.service;

import com.tcs.training.bean.Employee;
import com.tcs.training.dao.EmployeeRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Iterable<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }


    public Optional<Employee> getEmployeeById(Integer empId){
        return employeeRepo.findById(empId);
    }


    public void addNewEmployee(Employee employee){
        employeeRepo.save(employee);
    }

    public void updateEmployeeById(Integer empId, Employee employee){
        Optional<Employee> exist = employeeRepo.findById(empId);
        if(exist.isPresent()){
            employeeRepo.save(employee);
        }
        else{
            throw new EntityNotFoundException("No Data for EmpId: "+empId);
        }
    }

    public void deleteEmployeeId(Integer empId){
        Optional<Employee> exist = employeeRepo.findById(empId);
        if(exist.isPresent()){
            employeeRepo.deleteById(empId);
        }
        else{
            throw new EntityNotFoundException("No Data for EmpId: "+empId);
        }
    }

    //Custom Finder Method By Name
    public Iterable<Employee> getEmployeeByName(String name){
        return employeeRepo.findByName(name); //this custom method -> findByName() need to declare in Repository interface
    }

}
