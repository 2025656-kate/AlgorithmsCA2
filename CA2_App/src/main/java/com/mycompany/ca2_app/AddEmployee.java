/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca2_app;
import com.mycompany.ca2_app.enums.ManagerType;
import com.mycompany.ca2_app.enums.DepartmentName;
import java.util.Scanner;

/**
 *
 * @author katha
 */
//Method to create a new employee to the system from the user input

public class AddEmployee {
    
    public static Employee createFromInput(Scanner scanner){
        //Ask to input the employee full name
        System.out.println("Please enter the employee Name (First and Last is a must):");
        String fullName = scanner.nextLine().trim();
        
        //Validate so the system will not accept empty 
        if (fullName.isEmpty()){
            System.out.println("Name cannot be Empty. Please, enter FIRST AND LAST NAME.");
            return null;
        }
        
        //Split name into first and last
        
        String[] nameParts = fullName.split("\\s+", 2);
        String firstName = nameParts[0];
        String lastName = nameParts.length > 1 ? nameParts[1] : "";
        
        //Ask for the manager type so the user will choose the options based on 
        // the type of manager and it will add the information to the employees file when added 
        ManagerType type = null;
        while (type == null){
            //Display menu
            System.out.println("Please, select the Manager Type:");
            System.out.println("1) Principal");
            System.out.println("2) Vice-Principal");
            System.out.println("3) Head of Department");
            System.out.println("4) Lecturer");
            System.out.println("Your choice: ");
            
            try{
                int choice = Integer.parseInt(scanner.nextLine().trim());
                
                switch (choice){
                    case 1 -> type = ManagerType.PRINCIPAL;
                    case 2 -> type = ManagerType.VICE_PRINCIPAL;
                    case 3 -> type = ManagerType.HEAD_OF_DEPARTMENT;
                    case 4 -> type = ManagerType.LECTURER;
                    default ->  System.out.println("Invalid choice, please pick the options (1, 2, 3 or 4.)");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please, enter a number.");
            }
        }
            
            //Ask for department
        DepartmentName dept = null;
        while (dept == null){
                //Menu
            System.out.println("Please, select the Department:");
            System.out.println("1) Mathematics");
            System.out.println("2) Sciences");
            System.out.println("3) Languages");
            System.out.println("4) Arts");
            System.out.println("5) IT");
            System.out.println("Your choice: ");
            
            try {
                
                int choice = Integer.parseInt(scanner.nextLine().trim());
                
                switch (choice){
                    case 1 -> dept = DepartmentName.MATHEMATICS;
                    case 2 -> dept = DepartmentName.SCIENCES;
                    case 3 -> dept = DepartmentName.LANGUAGES;
                    case 4 -> dept = DepartmentName.ARTS;
                    case 5 -> dept = DepartmentName.IT;
                    default -> System.out.println("Invalid choice, please pick the options (1, 2, 3, 4 or 5.");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please, enter a number.");
            }
        }
        
        //Create and display the employee and their information attached 
        return new Employee(firstName, lastName, type, dept);
    }
}
        
      

    
                
           
            
            

