package com.tcs.training.dao;

import com.tcs.training.bean.Place;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepo extends CrudRepository<Place,Integer> {

    Iterable<Place> findByEmployeeEmpId(Integer empId); //Employee -> matches with "employee" table-name and EmpId -> matches with "empId" column-name
}
