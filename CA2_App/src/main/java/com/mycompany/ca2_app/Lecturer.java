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
//Child class from Employee. Extends employee and add a subject field
public class Lecturer extends Employee {
    private String subject;
    
    public Lecturer(String firstName, String lastName,
            ManagerType managerType, DepartmentName department,
            String subject){
        super(firstName, lastName, managerType, department);
        this.subject = subject;
    }
    
    public String getSubject() { return subject; }
    
    @Override
    public String toString(){
        return super.toString() + " | Lecturer of " + subject;
        
    }
    
}
