package com.journaldev.mvcpattern.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age = 0;

    //standard getters and setters
}