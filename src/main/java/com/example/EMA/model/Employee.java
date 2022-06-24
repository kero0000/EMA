package com.example.EMA.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    private String imageUrl;
    private String address;
    private Long salary;
    private String status;
    private String race;
    private String religion;
    private String age;
    private String gender;
    private String nationality;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee(String age, String status, Long id,String name,String email,String jobTitle,String phoneNumber, String imageUrl,String address,Long salary, String race, String religion, String gender ){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.imageUrl = imageUrl;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.race = race;
        this.religion = religion;

    }


    @Override
    public String toString() {
        return "Employee{" +"id="+id+ ", name = " + name + '\'' + ", email='" + email + '\'' + ", jobtitle='" + jobTitle+ '\'' + ", phoneNumber=" + phoneNumber + '\'' + ", imageUrl='" + imageUrl+ '\'' + '}';
    }

    public Employee() {
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
