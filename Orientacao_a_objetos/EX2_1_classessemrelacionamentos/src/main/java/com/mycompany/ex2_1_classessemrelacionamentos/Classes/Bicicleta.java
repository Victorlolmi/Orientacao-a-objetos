/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2_1_classessemrelacionamentos.Classes;

import java.util.Scanner;
/**
 *
 * @author 13879875693
 */
public class Bicicleta {
    
    /**
     * 
     * Atributos
     * marca - string;
     * modelo - string;
     * tamanho do quadro - double;
     * preço - double;
     * 
     */
    
    //inicializacao 
    private String marca;
    private String modelo;
    private double tamanho_do_quadro;
    private double preco;
    
    //contrutor
    
    public void Bicicleta(){
        this.marca="";
        this.modelo="";
        this.tamanho_do_quadro=0.0;
        this.preco=0.0;
    }
    
    //Getters and Setters
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setTamanho_do_quadro(double TDQ){
        this.tamanho_do_quadro = TDQ;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getTamanho_do_quadro(){
        return this.tamanho_do_quadro;
    }
    public double getPreco(){
        return this.preco;
    }
    
    // Copiar 
    
    public void Copia(Bicicleta outro){
        this.marca = outro.getMarca();
        this.modelo = outro.getModelo();
        this.tamanho_do_quadro = outro.getTamanho_do_quadro();
        this.preco = outro.preco;
    }
    //Preenche os campos do objeto
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("De a marca:");
        this.marca = ler.nextLine();
        System.out.println("De o modelo:");
        this.modelo = ler.nextLine();
        System.out.println("De o tamanho do quadro:");
        this.tamanho_do_quadro = ler.nextDouble();
        System.out.println("De o preço:");
        this.preco = ler.nextDouble();
        
    }
    //Imprime o campo dos objetos
    public void imprimir(){
        
        System.out.println("----------------Dados da Bicicleta----------------");
        System.out.println("Marca:"+this.marca);
        System.out.println("Modelo:"+this.modelo);
        System.out.println("Tamanho do quadro:"+this.tamanho_do_quadro);
        System.out.println("Preco:"+this.preco);
        System.out.println("--------------------------------------------------");
        
    }
    
    
}
