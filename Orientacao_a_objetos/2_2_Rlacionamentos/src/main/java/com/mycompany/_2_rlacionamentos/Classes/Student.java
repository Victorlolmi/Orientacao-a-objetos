/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._2_rlacionamentos.Classes;

import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class Student {
    
    /**
     * 
     * Atributes
     * 
     * String name;
     * String registration;
     * 
     */
    
    
    private String name;
    private int registration;
    
    public void Student(){
        this.name="";
        this.registration=000000;
    }
    
    //Getters and Setters
    
    public void setName(String name){
        this.name = name;
    }
    public void setRegistration(int reg){
        this.registration = reg;
    }
    
    public String getName(){
        return this.name;
    }
    public int getRegistration(){
        return this.registration;
    }
    
    public void fill(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("------Student Form------");
        System.out.println("Name:");
        this.name = read.nextLine();
        System.out.println("Registration:");
        this.registration = read.nextInt();
        System.out.println("------------------------");
        
    }
    
    public void print(){
        
        System.out.println("------Student Form------");
        System.out.println("Name:"+this.name);
        System.out.println("Registration:"+this.registration);
        System.out.println("------------------------");
        
    }
}
