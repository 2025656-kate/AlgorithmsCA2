/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ca2_app;

//import enum
import com.mycompany.ca2_app.enums.MenuOption;
import com.mycompany.ca2_app.enums.ManagerType;
import com.mycompany.ca2_app.enums.DepartmentName;
import java.io.File;
import java.io.FileNotFoundException;
//import the utilities classes

//for dinamic size list
import java.util.ArrayList;

//interface for list
import java.util.List;

//for reading user input from the keyboard
import java.util.Scanner;



//Main class for the School Application. It has the program menu 
public class CA2_App {

    //Static fields//
    
   //List with all employees loaded into the system. belongs to the class not to an instance
    private static List<Employee> employees = new ArrayList<>();
    
    //Scanner to read inputs from keyboard
    private static Scanner scanner = new Scanner(System.in);
    
    //Check if list is already sorted
    private static boolean isSorted = false;
    
    
    //////MAIN PROGRAM /////
    
    public static void main(String[] args) {
        System.out.println("==========SCHOOL ORGANISATION APPLICATION==========");
    
        //Ask the user for applicants file and load it 
        loadApplicantsFile();
        
        //Show the main menu until the user choose exit 
        runMenuLoop();
        
        //Message when the user decide to close the program
        System.out.println("Thank you. Exiting the application...");
    }
    
    /////LOAD THE APPLICANTS FORM/////
    //The user will be asked for the file name, it will open from the resources folder
    // add each row as employee to the list
    private static void loadApplicantsFile(){
                    
            //Ask the user the name of the file they want 
            System.out.println("Please enter the filename to read:");
            String filename = scanner.nextLine().trim();
            
            try {
                //Open the file with scanner
                Scanner fileScanner = new Scanner(new File("src/main/resources/" + filename));
                //Skip the first line because is only the line with the labels
                fileScanner.nextLine();
                
                //read the remaining lines
                while (fileScanner.hasNextLine()){
                    String line = fileScanner.nextLine();
                    //the lines will be split by commas
                    String[] parts = line.split(",");
                    
                    //Extract the desired columns
                    String firstName = parts[0].trim();
                    String lastName = parts[1].trim();
                    DepartmentName dept = DepartmentName.fromText(parts[5].trim());
                    ManagerType type = ManagerType.fromText(parts[6].trim());
                    
                    //Create the new employee and add it to the list 
                    Employee employee = new Employee(firstName, lastName, type, dept);
                    employees.add(employee);
                }
                
                fileScanner.close();
                System.out.println(employees.size() + " employees loaded successfully.");
                // if a new data (employee) is added the list still not sorted yet, unless the user do it
                isSorted = false; 
                
            } catch (FileNotFoundException e){
                System.out.println("File not found. Please try again");
            }
            
            private static void runMenuLoop(){
        
        while (true){
            displayMenu();
            int choice = readUserChoice();
            MenuOption option = MenuOption.fromCode(choice);
            
            if (option == null){
                System.out.println("Invalid option. Please, choose a valid number ");
                continue;
            }
            
            switch(option){
                case SORT -> sortApplicantsList();
                case SEARCH -> searchEmployeeByName();
                case ADD_RECORDS -> addNewEmployee();
                case CREATE_TREE -> buildBinaryTree();
                case EXIT -> {
                    return;
                }
            }
        }
    }
            //LOOP MENU DISPLAY
    // Prints the menu options to the console interacting with the enum values 
    private static void displayMenu(){
        System.out.println("Please choose an option:");
        for (MenuOption option : MenuOption.values()) {
            System.out.println(" " + option.getCode() + " " + option.getDescription() );
        }
        System.out.println("Your choice:  ");
    }
    
    //Reads a number from the input. It will return -1 if the input is not valid, using the try/catch to avoid crash the program
    
    private static int readUserChoice(){
        String input = scanner.nextLine().trim();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e){
            return -1;
        }
    }
     //MENU ACTIONS //
    
    //////SORT LIST///////
    //Sort the applicants list using merge sort
    private static void sortApplicantsList(){
        
        //Check if the form is empty
        if (employees.isEmpty()){
            System.out.println("Sorry, the document you provided is empty. Please load the file first.");
            return;
        }
        
        //Call the sorter method class
        
        employees = Sorter.mergeSort(employees);
        isSorted = true;
        
        //Display the first 20 names
        System.out.println("\nSorted list (first 20 names): ");
        int limit = Math.min(20, employees.size());
        for (int i = 0; i < limit; i++){
            System.out.println(" " + (i + 1) + ". " + employees.get(i).getFullName());
        }
    }        
    
    //Search employee by name using binary search and will display the manager type and department of the serached employee
       
    private static void searchEmployeeByName(){
            
            //Binary search asks for sorted list 
            if (!isSorted){
                System.out.println("To search for an Employee, the list must be sorted."
                + "Please, RUN SORT first. ");
                return;
            }
            //Check if is empty
            if (employees.isEmpty()) {
                System.out.println("No data found. Please load the file first.");
                return;
            }
            
            //ask the user to input the name to search
            System.out.println("Please enter the employee full name to search for:  ");
            String targetName = scanner.nextLine().trim();
            
            //check if the input is null
            if (targetName.isEmpty()){
                System.out.println("This field must be filled. Please, type a name.");
                return;
            }
            
            //Call the searcher class method
            Employee found = Searcher.binarySearch(employees, targetName);
            
            //Display the restult
            if (found == null) {
                System.out.println("Employee not found.");
            } else {
                System.out.println("\nEmployee found:");
                System.out.println(" NAME:     " + found.getFullName());
                System.out.println(" MANAGER TYPE:    " + found.getManagerType());
                System.out.println("DEPARTMENT:     " + found.getDepartment());
                System.out.println();
            }
    }
                    
                    
               
    