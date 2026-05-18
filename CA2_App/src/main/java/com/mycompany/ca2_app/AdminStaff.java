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
//Child of Employee. Extends it and add an office number
public class AdminStaff extends Employee {
    private String officeNumber;
    
    public AdminStaff(String firstName, String lastName,
            ManagerType managerType, DepartmentName department,
            String officeNumber){
        super(firstName, lastName, managerType, department);
        this.officeNumber = officeNumber;
    }
    
    //what will display 
    public String getOfficeNumber(){ return officeNumber;}
    
    @Override
    public String toString(){
        return super.toString() + " | Admin Staff (Office " + officeNumber + ")";

    }
}
