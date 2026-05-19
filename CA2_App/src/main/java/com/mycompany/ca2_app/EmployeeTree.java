/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ca2_app;

import java.util.ArrayList;

/**
 *
 * @author katha
 */
//Class that creates the binary tree of employees using level-oder insertion

public class EmployeeTree {
    
    //top of the tree (root)
    private EmployeeNode root;
    
    //All nodes in the order they were added
    private ArrayList<EmployeeNode> allNodes;
    
    public EmployeeTree(){
        this.root = null;
        this.allNodes = new ArrayList<>();
    }
    
    //add new employee to the tree 
    public void insert(Employee employee){
        EmployeeNode newNode = new EmployeeNode(employee);
        
        //case 1: the tree is empty - new node becomes a root 
        if (allNodes.isEmpty()){
            root = newNode;
            allNodes.add(newNode);
            return;
        }
        
       // case 2: find the parent of this new node 
        int newIndex = allNodes.size();
        int parentIndex = (newIndex -1) / 2;
        EmployeeNode parent = allNodes.get(parentIndex);
        
        if (parent.left == null){
        parent.left = newNode;
    } else {
    parent.right = newNode;
    }
    
    allNodes.add(newNode);
    }
    
    //Prints everry employee in level order 
    public void printLevelOrder(){
        if (allNodes.isEmpty()){
            System.out.println("(Empty tree)");
            return;
        }
        
        for (int i = 0; i < allNodes.size(); i++){
            EmployeeNode node = allNodes.get(i);
            System.out.println(" " + (i +1) + ". " + node.employee);
        }
    }
    
    
    // returns the total number of nodes 
    public int getNodeCount(){
    return allNodes.size();
}
    
    //returns the height of the tree 
    
    public int getHeight(){
        return calculateHeight(root);
    }
    private int calculateHeight(EmployeeNode node){
        if(node == null){
            return -1;
        }
        
        //Recursive case
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight (node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    
}


                   
        
        
    
    

