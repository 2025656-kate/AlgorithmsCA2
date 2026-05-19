/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca2_app;

/**
 *
 * @author katha
 */

// The node of the binary tree. Holds an employee and references of their children

public class EmployeeNode {
    Employee employee;
    EmployeeNode left;
    EmployeeNode right;
    
    public EmployeeNode(Employee employee){
        this.employee = employee;
        this.left = null;
        this.right = null;
    }
}

               
    
    

