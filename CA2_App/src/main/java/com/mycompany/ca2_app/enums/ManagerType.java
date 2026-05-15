/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ca2_app.enums;

/**
 *
 * @author katha
 */
public enum ManagerType {
    PRINCIPAL ("Principal"),
    VICE_PRINCIPAL ("Vice-Principal"),
    HEAD_OF_DEPARTMENT ("Head of Department"),
    LECTURER ("Lecturer");
    
    private final String displayName;
    
    ManagerType(String displayName){
        this.displayName = displayName;
    }
    
    public String getDisplayName(){
        return displayName;
    }
    
    @Override
    public String toString(){
        return displayName;
    }
    
// returns the MAnager type at giver 1 based index
    
    public static ManagerType fromIndex(int oneBasedIndex){
        ManagerType[] all = values();
        if (oneBasedIndex < 1 || oneBasedIndex > all.length){
            return null;
        }
        return all [oneBasedIndex -1];
    }
    
    //Returns the manager type matching the given text 
    //or null if not match
    
    public static ManagerType fromText(String text){
        if (text == null) return null;
        String cleaned = text.trim().toLowerCase();
        for (ManagerType type : values()){
            if (type.displayName.toLowerCase().equals(cleaned)){
                return type;
            }
        }
        return null;
        
            }
        }
    
    

