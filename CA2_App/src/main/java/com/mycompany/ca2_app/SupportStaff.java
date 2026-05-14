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
//Support employee (cleaning, maintnance) Extends employee and add a shift type
public class SupportStaff extends Employee {
    private String shift;
    
    public SupportStaff(String firstName, String lastName,
            ManagerType managerType, DepartmentName department,
            String shift){
        super(firstName, lastName, managerType, department);
        this.shift = shift;
    }
    
    public String getShift(){ return shift;}
    
    @Override
    public String toString(){
        return super.toString() + "| Support Staff (" + shift + " shift}";

    }
}


