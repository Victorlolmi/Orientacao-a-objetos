/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolproject;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Student {
    
    /**
     * 
     * Atributes
     * 
     * String name;
     * String sex;
     * int age;
     * int registration;
     * int year_of_entry;
     * 
     */
    
    private String name;
    private String sex;
    private int age;
    private String registration;
    private int year;
    
    public Student(){
        this.name="";
        this.sex="";
        this.age=0;
        this.registration="";
        this.year=0;
    }
    
    //Setters and Getters
    
    public void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRegistration(String reg){
        this.registration = reg;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    public String getName(){
        return this.name;
    }
    public String getSex(){
        return this.sex;
    }
    public int getAge(){
        return this.age;
    }
    public String getRegistration(){
        return this.registration;
    }
    public int getYear(){
        return this.year;
    }
    
    // Fill
    
    public void fill(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("----------Student Form----------");
        System.out.println("Complete Name:");
        this.name = read.nextLine();
        System.out.println("Sex:");
        this.sex = read.nextLine();
        System.out.println("Age:");
        this.age = read.nextInt();
        System.out.println("Registration:");
        this.registration = read.nextLine();
        System.out.println("Year of entry:");
        this.year = read.nextInt();
        System.out.println("--------------------------------");
    }
    
    public void print(){
        
        System.out.println("----------Professor Form----------");
        System.out.println("Name:"+this.name);
        System.out.println("Sex:"+this.sex);
        System.out.println("Age:"+this.age);
        System.out.println("Registration:"+this.registration);
        System.out.println("Year of entry:"+this.year);
        System.out.println("-----------------------------------");
    }
    
    public void copy(Student a){
        this.name = a.getName();
        this.age = a.getAge();
        this.sex = a.getSex();
        this.registration = a.getRegistration();
        this.year = a.getYear();
    }
}
