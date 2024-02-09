package com.crudExp.crudproject.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int empId;
    private String name;
    private String companyName;
    private int sal;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", sal=" + sal +
                '}';
    }

    public EmployeeDetails(int empId, String name, String companyName, int sal) {
        this.empId = empId;
        this.name = name;
        this.companyName = companyName;
        this.sal = sal;
    }

    public EmployeeDetails() {
    }
}
