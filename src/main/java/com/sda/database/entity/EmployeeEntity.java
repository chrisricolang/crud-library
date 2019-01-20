package com.sda.database.entity;
import lombok.Data;

@Data
public class EmployeeEntity {

    private long id;
    private String name;
    private int age;
    private String city;
    private String phone;
}
