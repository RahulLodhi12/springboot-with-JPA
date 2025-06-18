package com.tcs.training.controller;

import com.tcs.training.bean.Place;
import com.tcs.training.dao.PlaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1.0")
public class PlaceController {

    @Autowired
    PlaceRepo placeRepo;

    @GetMapping("/place")
    public Iterable<Place> getAllPlaces(){
        return placeRepo.findAll();
    }

    //Custom Finder -> To work with the Foreign Key
    @GetMapping("/place/employee/{empId}")
    public Iterable<Place> getPlaceByEmployeeId(@PathVariable Integer empId){
        return placeRepo.findByEmployeeEmpId(empId);
    }

}
