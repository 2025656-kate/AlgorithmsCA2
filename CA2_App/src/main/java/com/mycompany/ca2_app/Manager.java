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
//The menager in the School. Holds their names, type and department they work 
public class Manager {
    private String name;
    private ManagerType type;
    private DepartmentName department;
    
    public Manager(String name, ManagerType type, DepartmentName department){
        this.name = name;
        this.type = type;
        this.department = department;
    }
        
        //getters methods
    public String getName(){ return name; }
    public ManagerType getType() { return type; }
    public DepartmentName getDepartment() {return department; }
    
    //Setters methods
    public void setName(String name) {this.name = name; }
    public void setType(ManagerType type) {this.type = type; }
    public void setDepartment(DepartmentName department){
    this.department = department;
    }
    
    //Overridinh a methog from the superclass
    @Override
    public String toString(){
        return name + " (" + type + " of " + department + ")";
        }
    
}

    
    
    