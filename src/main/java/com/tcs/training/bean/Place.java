package com.tcs.training.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Place {
    @Id
    private Integer pin;
    private String city;
    private String state;

    @ManyToOne //Many Place visited by One Employee, @ManyToOne -> used to connect two tables via a foreign key
    Employee employee;
}
