/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca2_app;
import com.mycompany.ca2_app.enums.DepartmentName;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author katha
 */
//The departments in the school
//Holds its name, the head manager and list of employees.
public class Department {
    private DepartmentName name;
    private Manager head;
    private final List<Employee> employees;
    
    public Department(DepartmentName name, Manager head){
        this.name = name;
        this.head = head;
        this.employees = new ArrayList<>();
    }
     //get for the name, head manager and employee
    public DepartmentName getName(){ return name;}
    public Manager getHead() { return head;}
    public List<Employee> getEmployees() {return employees;}
    
    //setters to define name and head 
    public void setName(DepartmentName name) {this.name = name;}
    public void setHead(Manager head) { this.head = head;}
    
    //helpers for utilities in this case count and add the employee 
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    public int getEmployeeCount(){
        return employees.size();
    }
    
    //display
    @Override
    public String toString(){
        return name + " department (head: " + head 
                + ", " + employees.size() + " employees)";
    }
    
}

   