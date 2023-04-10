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
public class BolsaDeValores {
    
    /**
     * 
     * Atributos
     * 
     * nome da empresa - string;
     * preço da ação - double;
     * volume de negociações - double;
     * variação diária - double.
     * 
     */
    
    private String nome;
    private double preco;
    private double volume;
    private double variacao;
    
    //construtor
    
    public void BolsaDeValores(){
        this.nome="";
        this.preco=0.0;
        this.volume=0.0;
        this.variacao=0.0;
    }
    
    //Getters and Setters
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }
    public void setVariacao(double variacao){
        this.variacao = variacao;
    }
    
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public double getVolume(){
        return this.volume;
    }
    public double getVariacao(){
        return this.variacao;
    }
    
    //Copiar
    
    public void Copiar(BolsaDeValores outro){
        this.nome = outro.getNome();
        this.preco = outro.getPreco();
        this.volume = outro.getVolume();
        this.variacao = outro.getVariacao();
    }
    
    //Preencher
    
    public void Preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("De o nome da empresa:");
        this.nome = ler.nextLine();
        System.out.println("De o Preco da acao:");
        this.preco = ler.nextDouble();
        System.out.println("De o volune de negocicaçoes:");
        this.volume = ler.nextDouble();
        System.out.println("De a variacao diaria:");
        this.variacao = ler.nextDouble();
        
    }
    
    //Imprimir
    
    public void Imprimir(){
        System.out.println("-----------------Bolsa de Valores------------------");
        System.out.println("Nome da empresa:"+this.nome);
        System.out.println("preco da acao:"+this.preco);
        System.out.println("Volume de negociacaoes:"+this.volume);
        System.out.println("Variacao diaria:"+this.variacao);
        System.out.println("--------------------------------------------------");
    }
}
