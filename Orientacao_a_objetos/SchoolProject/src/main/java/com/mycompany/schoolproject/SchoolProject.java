/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schoolproject;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class SchoolProject {

    public static void main(String[] args) {
        System.out.println("Give the students of ths discipline");
        
        
        Discipline d1 = new Discipline();
        
        d1.fill();
        d1.print();
    }
}
