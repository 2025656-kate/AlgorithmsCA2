/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca2_app;
import com.mycompany.ca2_app.enums.ManagerType;
import com.mycompany.ca2_app.enums.DepartmentName;
/**
 *
 * @author katha
 */
// This is the parent class that represents the employees at the school. 
// Is the parent class for teacher, adm staff and support staff. Used for the 
// employees on the applicants form.
public class Employee {
    private String firstName;
    private String lastName;
    private ManagerType managerType;
    private DepartmentName department;
    
    public Employee(String firstName, String lastName, 
            ManagerType managerType, DepartmentName department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.managerType = managerType;
        this.department = department;
    }
    
    //Now this is the code to retrieve information (get)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getFullName() { return firstName + " " + lastName;}
    public ManagerType getManagerType() { return managerType;}
    public DepartmentName getDepartment() { return department;}
    
    //The setters
    
    public void setManagerType(ManagerType managerType){
        this.managerType = managerType;
    }
    public void setDepartment(DepartmentName department){
        this.department = department;
    }
    
    @Override
    public String toString(){
        return getFullName() + " | " + managerType + " | " + department;
    }
}
    
    

