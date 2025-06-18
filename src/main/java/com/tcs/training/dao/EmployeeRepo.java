package com.tcs.training.dao;

import com.tcs.training.bean.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

    //Custom Finder Method
    Iterable<Employee> findByName(String name); //In Hibernate, findByName read as findByXXX()
    //Name -> matches with "name" column-name
}
