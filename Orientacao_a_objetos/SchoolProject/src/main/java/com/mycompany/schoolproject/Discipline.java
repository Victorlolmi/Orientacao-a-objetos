/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schoolproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Discipline {
    
    /**
     * 
     * Atributes
     * 
     * String name;
     * int semester;
     * String time;
     * 
     * Professor minister;
     * Aluno[] listOfStudents;
     * 
     */
    
    private String name;
    private int semester;
    private String time;
    
    private Professor minister = null;
    private List<Student> lstStudents;
    
    
    public Discipline(){
        this.name="";
        this.semester=0;
        this.time="0h";
        this.minister = new Professor();
        this.lstStudents = new ArrayList<Student>();
    }
    
    
    // Getters and Setters
    
    public void setName(String name){
        this.name = name;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public void setTime(String time){
        this.time = time;
    }
    public void setMinister(Professor minister){
        this.minister = minister;
    }
    public void setLstStudents(List<Student> lstStudents){
        this.lstStudents = lstStudents;
    }
    
    public String getName(){
        return this.name;
    }
    public int getSemester(){
        return this.semester;
    }
    public String getTime(){
        return this.time;
    }
    public Professor getMinister(){
        return this.minister;
    }
    public List<Student> getLstStudents(){
        return this.lstStudents;
    }
    
    public void fill(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("-------Fill Discipline-------");
        System.out.println("Name:");
        this.name = read.next();
        System.out.println("Semester:");
        this.semester = read.nextInt();
        System.out.println("Time:");
        this.time = read.next();
        System.out.println("Minister Professor:");
        this.minister.fill();
        System.out.println("Students");
        fillStudents();  
        System.out.println("-----------------------------");
    }
    
    public void print(){
        System.out.println("-------"+this.name+"-------");
        System.out.println("Semester:"+this.semester);
        System.out.println("Time:"+this.time);
        this.minister.print();
        for(int i=0; i>this.lstStudents.size();i++){
            this.lstStudents.get(i).print();
        }
        System.out.println("---------------------------");
    }
    
    
    private void fillStudents(){
        
        Scanner read = new Scanner(System.in);
        int choose = 1;
        do
        {
            System.out.println("---------------");
            System.out.println("1 - insert an student");
            System.out.println("2 - out");
            choose = read.nextInt();
            
            if(choose == 1){
                Student S1 = new Student();
                S1.fill();
                this.lstStudents.add(S1); 
            }
        }while(choose == 1);
        
    } 
    
}
