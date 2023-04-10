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
public class Professor {
    /**
     * 
     * Atributes
     * 
     * String name;
     * String sex;
     * int age;
     * String cpf;
     */
    
    private String name;
    private String sex;
    private int age;
    private String cpf;
    
    public Professor(){
        this.name="";
        this.sex="";
        this.age=0;
        this.cpf="000.000.000-00";
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
    public void setCpf(String cpf){
        this.cpf = cpf;
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
    public String getCpf(){
        return this.cpf;
    }
    
    // Fill
    
    public void fill(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("----------Professor Form----------");
        System.out.println("Complete Name:");
        this.name = read.nextLine();
        System.out.println("Sex:");
        this.sex = read.nextLine();
        System.out.println("Age:");
        this.age = read.nextInt();
        System.out.println("Cpf:");
        this.cpf = read.nextLine();
        System.out.println("-----------------------------------");
    }
    
    public void print(){
        
        System.out.println("----------Professor Form----------");
        System.out.println("Name:"+this.name);
        System.out.println("Sex:"+this.sex);
        System.out.println("Age:"+this.age);
        System.out.println("Cpf:"+this.cpf);
        System.out.println("-----------------------------------");
    }
    
    public void copy(Professor a){
        this.name = a.getName();
        this.age = a.getAge();
        this.sex = a.getSex();
        this.cpf = a.getCpf();
    }
}
