/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ca2_app.enums;

/**
 *
 * @author katha
 */
public enum MenuOption {
    SORT(1, "Sort applicants list"),
    SEARCH(2, "Search employee by name"),
    ADD_RECORDS(3, "Add new employee"),
    CREATE_TREE(4, "Create binary tree hierarchy"),
    EXIT(5, "Exit");
    
    private final int code;
    private final String description;
    
    MenuOption(int code, String description){
        this.code = code;
        this.description = description;
    }
    
    public int getCode(){
        return code;
    }
    
    public String getDescription(){
        return description;
    }
    
    /*Returns the menu option that match the code number
    or null if no option match
    */
    
    public static MenuOption fromCode(int code) {
        for (MenuOption option : values()){
            if (option.getCode() == code){
                return option;
            }
            }
        return null;
        }
    }
