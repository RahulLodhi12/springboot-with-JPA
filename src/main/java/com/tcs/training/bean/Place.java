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

    //Table structure of "Place" Table: For "ManyToOne" relationship
    /*
    | Column Name       | Type                                       | Constraints                   | Description                              |
    | ----------------- | ------------------------------------------ | ----------------------------- | ---------------------------------------- |
    | `pin`             | INT                                        | PRIMARY KEY                   | Unique ID for the place (your own field) |
    | `city`            | VARCHAR                                    | (default length, unless set)  | City name                                |
    | `state`           | VARCHAR                                    | (default length, unless set)  | State name                               |
    | `employee_emp_id` | INT (or BIGINT depending on Employee's PK) | FOREIGN KEY to `employee(id)` | Links each place to one employee         |
    */
}
