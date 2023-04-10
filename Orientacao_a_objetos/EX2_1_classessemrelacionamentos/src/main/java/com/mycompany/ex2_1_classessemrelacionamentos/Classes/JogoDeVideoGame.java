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
public class JogoDeVideoGame {
    
    /**
     * 
     * Atributos
     * 
     * título - string;
     * plataforma - string;
     * classificação etária - string;
     * preço - double;
     * 
     */
    
    private String titulo;
    private String plataforma;
    private String classificacao;
    private double preco;
    
    //construtor
    
    public void JogoDeVideoGame(){
        this.titulo="";
        this.plataforma="";
        this.classificacao="";
        this.preco=0.0;
    }
    
    //Getters and Setters
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setPlatafoma(String plataforma){
        this.plataforma = plataforma;
    }
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public String getPlataforma(){
        return this.plataforma;
    }
    public String getClassificacao(){
        return this.classificacao;
    }
    public double getPreco(){
        return this.preco;
    }
    
    //Copiar 
    
    public void Copiar(JogoDeVideoGame outro){
        this.titulo = outro.getTitulo();
        this.plataforma = outro.getPlataforma();
        this.classificacao = outro.getClassificacao();
        this.preco = outro.getPreco();
    }
    
    //Preencher
    
    public void Preencher(){
        System.out.println("----------------JOGO DE VIDEO GAME----------------");
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Plataforma:"+this.plataforma);
        System.out.println("Classificaçao:"+this.classificacao);
        System.out.println("Preco:"+this.preco);
        System.out.println("--------------------------------------------------");
    }
}
