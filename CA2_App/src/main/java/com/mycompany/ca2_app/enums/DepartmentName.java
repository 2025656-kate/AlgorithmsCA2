/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ca2_app.enums;

/**
 *
 * @author katha
 */
public enum DepartmentName {
 
    MATHEMATICS("Mathematics"),
    SCIENCES ("Sciences"),
    LANGUAGES("Languages"),
    ARTS("Arts"),
    IT("IT");
    
    private final String displayName;
    
    DepartmentName(String displayName){
        this.displayName = displayName;
    }
    public String getDisplayName(){
        return displayName;
    }
    
    @Override
    public String toString(){
        return displayName;
    }
    
    //Returns the department at the giver 1 based index 
    //null if out of range
    public static DepartmentName fromIndex(int oneBasedIndex){
        DepartmentName[] all = values();
        if (oneBasedIndex < 1 || oneBasedIndex > all.length){
            return null;
        }
        return all [oneBasedIndex -1];
    }
    //REturns the department matching the given text
    //null if no match 
    public static DepartmentName fromText(String text){
        if (text == null) return null;
        String cleaned = text.trim().toLowerCase();
        for (DepartmentName dept : values()){
            if (dept.displayName.toLowerCase().equals(cleaned)){
                return dept;
            }
        }
        return null;
    }
}

            
        
    
    

