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
    
    