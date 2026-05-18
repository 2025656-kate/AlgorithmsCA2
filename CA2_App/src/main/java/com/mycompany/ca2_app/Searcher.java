/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca2_app;
import java.util.List;

/**
 *
 * @author katha
 */
//Binary search for emplyee using their full name and display back their manage type and department
// to use this searcher the list must be sorted before
public class Searcher {
    
    public static Employee binarySearch(List<Employee> list, String targetName) {
        
        return binarySearchHelper(list, targetName, 0, list.size() -1);
    }
    
    private static Employee binarySearchHelper(List<Employee> list,
            String targetName,
            int low, int high){
        
        //Empty range means that the name is not in the list
        if (low > high){
            return null;
        }
        
        //Calculate the middle index
        int mid = (low + high) / 2;
        Employee midEmployee = list.get(mid);
        
        //Compare the middle with the target name 
        int comparison = midEmployee.getFullName().compareToIgnoreCase(targetName);
        
        if (comparison == 0){
            
            //Names match, employee found
            return midEmployee;
        } else if (comparison < 0){
            //If mid name comes before target, the target is in the right half
            return binarySearchHelper(list, targetName, mid + 1, high);
        } else {
            //If mid name comes after target, the target is in the left half
            return binarySearchHelper (list,targetName, low, mid -1);
        }
    }
    
    
}
