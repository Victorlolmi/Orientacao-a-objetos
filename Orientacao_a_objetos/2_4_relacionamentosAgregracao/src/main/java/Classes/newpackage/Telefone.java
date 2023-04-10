/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.newpackage;

import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class Telefone {
    
    
    /**
     * 
     * Atributos
     * 
     * DDD String;
     * Numero String;
     * Descricao String;
     * Operadora String;
     * 
     */
    
    private String DDD;
    private String numero;
    private String descricao;
    private String operadora;
       
    
    public Telefone(){
        this.DDD="";
        this.numero="";
        this.descricao="";
        this.operadora="";
    }
    
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("------ Preencher Telefone ------");
        System.out.print("DDD:");
        this.setDDD(ler.next());
        System.out.print("Numero:");
        this.setNumero(ler.next());
        System.out.print("Descricao:");
        this.setDescricao(ler.next());
        System.out.print("Operadora");
        this.setOperadora(ler.next());
        
    }
    
    public void imprimir(){
        
        System.out.println("---------Telefone----------");
        System.out.println("DDD:"+this.getDDD());
        System.out.println("Numero"+this.getNumero());
        System.out.println("Descricao:"+this.getDescricao());
        System.out.println("Operadora:"+this.getOperadora());
    }
    
    
    
    /**
     * @return the DDD
     */
    public String getDDD() {
        return DDD;
    }

    /**
     * @param DDD the DDD to set
     */
    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
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
     * @return the operadora
     */
    public String getOperadora() {
        return operadora;
    }

    /**
     * @param operadora the operadora to set
     */
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
}
