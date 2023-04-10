/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.newpackage;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Produto {
    
    /**
     * 
     * Atributos
     * 
     * Id_produto int;
     * Descricao String;
     * 
     */
    
    private int id_produtos;
    private String descricao;
    private double valor;
    
    public Produto(){
        this.descricao="";
        this.id_produtos=0;
        this.valor=0.0;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("---------Preencher Produto--------");
        System.out.print("Id:");
        this.setId_produtos(ler.nextInt());
        System.out.print("Descricao do Produto:");
        this.setDescricao(ler.next());
        System.out.print("Valor:");
        this.setValor(ler.nextDouble());
    }
    
    public void imprimir(){
        
        System.out.println("------------Produto--------------");
        System.out.println("Id:"+this.getId_produtos());
        System.out.println("Descricao:"+this.getDescricao());
        System.out.println("Valor:"+this.getValor());
    }

    /**
     * @return the id_produtos
     */
    public int getId_produtos() {
        return id_produtos;
    }

    /**
     * @param id_produtos the id_produtos to set
     */
    public void setId_produtos(int id_produtos) {
        this.id_produtos = id_produtos;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
