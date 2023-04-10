/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._2ex13_victor_joaovitorruzza;

import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class Musica {
    
    /**
     * 
     * Atributos 
     * 
     * título - string;
     * artista - string;
     * duração - int;
     * preço - double;
     * 
     */
    
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;
    
    // contrutor
    public void Musica(){
        this.titulo="";
        this.artista="";
        this.duracao=0;
        this.preco=0.0;
    }
    //Getters and Setters
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setDiretor(String artista){
        this.artista = artista;
    }
    public void setDuracao(double duracao){
        this.duracao = duracao;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public String getArtista(){
        return this.artista;
    }
    public double getDuracao(){
        return this.duracao;
    }
    public double getPreco(){
        return this.preco;
    }
    
    //Copia
    
    public void Copia(Musica outro){
        this.titulo = outro.getTitulo();
        this.artista = outro.getArtista();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }
    
    //Preencher
    
    public void Preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("De o Titulo:");
        this.titulo = ler.nextLine();
        System.out.println("De O artista:");
        this.artista = ler.nextLine();
        System.out.println("De a duracao:");
        this.duracao = ler.nextDouble();
        System.out.println("De o preco");
        this.preco = ler.nextDouble();
        
    }
    
    //Imprimir
    
    public void Imprimir(){
        
        System.out.println("----------------Musica----------------");
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Diretor:"+this.artista);
        System.out.println("Duracao:"+this.duracao);
        System.out.println("Preco:"+this.preco);
        System.out.println("--------------------------------------");
        
    }
}
