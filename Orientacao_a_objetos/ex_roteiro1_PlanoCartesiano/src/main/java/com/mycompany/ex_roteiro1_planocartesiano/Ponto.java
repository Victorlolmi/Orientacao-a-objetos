/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_roteiro1_planocartesiano;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author W10
 */
public class Ponto {
    
    /*
    
    Atributos de um ponto
    
    String nome_do_ponto
    double coordenada_X 
    double coordenada_Y
    
    valores em metro
    
    */
    
    private String nome;
    private double x;
    private double y;
    
    // construtor
    public void Ponto(){
        this.nome="";
        this.x = 0.0;
        this.y = 0.0;
    }
    
    //Getters and Setters
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y =y;
    }
    public String getNome(){
        return this.nome;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    
    // copia
    
    public void copiar(Ponto outra){
        this.nome = outra.getNome();
        this.x = outra.getX();
        this.y = outra.getY();
    }
    
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("De o Nome do seu ponto:");
        this.nome = ler.nextLine();
        System.out.println("De o valor da coordenada X:");
        this.x = ler.nextDouble();
        System.out.println("De o valor da coordenada Y:");
        this.y = ler.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("o Ponto "+this.nome+" esta localizado na coordenada ("+this.x+"x,"+this.y+"y).");
    }
    
    public double distancia_entre_pontos(Ponto a, Ponto b){
        
        double ax,ay, bx, by, distancia;
        
        ax = a.getX();
        ay = a.getY();
        bx = b.getX();
        by = b.getY();
        
        distancia = Math.sqrt(Math.pow((bx-ax), 2)+ Math.pow((by-ay), 2));
               
        return distancia;
    }
    
    public double colineares(Ponto a, Ponto b, Ponto c){
        
        double ax,ay, bx, by, cx, cy, z=1, colinear;
        
        ax = a.getX();
        ay = a.getY();
        bx = b.getX();
        by = b.getY();
        cx = c.getX();
        cy = c.getY();
        
        /**
         *  
         * Colinear Matriz determinante
         * 
         *         Ax  Ay  Az 
         * det(A)= Bx  By  Bz
         *         Cx  Cy  Cz
         * 
         * se det(A)= 0 sao colineares 
         * 
         */
        if((ax == 0 & ay == 0) || (bx == 0 & by == 0) || (cx == 0 & cy == 0) ){
            return colinear=0;
        }else{
            colinear = (ax*by*z)+(ay*z*cx)+(z*bx*cy)-(z*by*cx)-(ax*z*cy)-(z*bx*ay);
            if(colinear == 0){
                return colinear;
            }else{
                return colinear=1;
            }
        }
        
        
    }
    
}
