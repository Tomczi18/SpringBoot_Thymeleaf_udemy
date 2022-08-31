package com.majam.thymeleafDemoApp.entity;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="last_name")
    private String last_name;
    @Column(name="first_name")
    private String first_name;
    @Column(name="email")
    private String email;



    public Employee(){}

    public Employee(String last_name, String first_name, String email) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.email = email;
    }

    public Employee(int id, String last_name, String first_name, String email) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}