/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca2_app;

import java.util.ArrayList;
import java.util.List;
   

/**
 *
 * @author katha
 */

///////MERGE SORT///////
///FOR this step it will be used MERGE SORT for the list of employees comparing them by their full name
///
public class Sorter {
    
    //New sorted copy of the list
    
    public static List<Employee> mergeSort(List<Employee> list) {
        // it only sort if the list is higher then 1 
        if (list.size() <= 1){
            return new ArrayList<>(list);
        }
        
        //dividing the list in half until the arrays be with only one element
        int mid = list.size() / 2;
        List<Employee> left = new ArrayList<>(list.subList(0, mid));
        List<Employee> right = new ArrayList<>(list.subList(mid,list.size()));
        
        //sort each half
        left = mergeSort(left);
        right = mergeSort(right);
        
        //Merge the two sorted halves
        return merge(left, right);
    }
    
    //Step two of the Merge sort - Merge the two sorted lists into one sorted list
    // i will track the left half and j the right half. i will be incremented if the element 
    //chosen is from the left and j if the element to the new array is collected from the right
    
    private static List<Employee> merge(List<Employee> left, List<Employee> right) {
        List<Employee> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        //Now the sorted in this loop lists will be organised in alphabetic order
        //the firsts letters in the alphabet goes to the left and the lasts to the right
        //A new list result will be made and the loop will continue until all the names be sorted and sent to the new list
            while (i <left.size()&& j < right.size()){
            String leftName = left.get(i).getFullName();
            String rightName = right.get(j).getFullName();
            
            if (leftName.compareToIgnoreCase(rightName)<= 0){
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }
        
            //aff any name left from the left list 
            while (i < left.size()) {
                result.add(left.get(i));
                i++;
            }
            
            //add any name left from the right list
            while (j < right.size()) {
                result.add(right.get(j));
                j++;
            }
            // List with the names sorted 
            return result;
    }
            
            }
        
    
    

