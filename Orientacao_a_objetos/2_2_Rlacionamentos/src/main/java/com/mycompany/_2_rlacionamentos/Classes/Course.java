/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._2_rlacionamentos.Classes;

import com.mycompany._2_rlacionamentos.Classes.Student;
import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class Course {
    
    /**
     * Atributos 
     * 
     * String name 
     * String semesters
     * Student[] Students
     * int number_of_Students
     */
    
    private String name;
    private int semesters;
    private Student[] students;
    private int n_students;
    
    private int getNumber(){
        Scanner read = new Scanner(System.in);
        System.out.println("De o numero de Studentes:");
        return read.nextInt();
    }
    public void Course(){
        this.name="";
        this.semesters=0;
        
        this.n_students = 7; 
       
        this.students= new Student[n_students];
        
        for(int i=0; i<n_students;i++){
            students[i] = new Student();
        }
        
    }
    
    // Setters and Getters
    
    public void setName(String name){
        this.name = name;
    }
    public void setSemesters(int semesters){
        this.semesters = semesters;
    }
    public void setStudents(Student[] students){
        this.students = students;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getSemester(){
        return this.semesters;
    }
    public Student[] gettudents(){
        return this.students;
    }
    
    public void fill(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("--------Fill  Course--------");
        System.out.println("Name:");
        this.name = read.nextLine();
        System.out.println("Semester:");
        this.semesters = read.nextInt();
        System.out.println("Studentes");
        for(int i=0; i<this.n_students;i++){
            this.students[i].fill();
        }
        System.out.println("----------------------------");
    }
    
    public void print(){
        
        System.out.println("--------Fill  Course--------");
        System.out.println("Name"+this.name);
        System.out.println("Semesters:"+this.semesters);
        for(int i=0;i<this.n_students;i++){
            students[i].print();
        }
        System.out.println("----------------------------");
    }
}
