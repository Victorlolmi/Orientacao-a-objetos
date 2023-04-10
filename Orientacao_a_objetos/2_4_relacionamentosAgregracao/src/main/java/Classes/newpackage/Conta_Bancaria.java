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
public class Conta_Bancaria {
    /**
     * 
     * Atributos
     * 
     * Data String
     * Hora String
     * Valor double
     * 
     */
    
    private String data;
    private String hora;
    private double valor;
    
    public Conta_Bancaria(){
        this.data="";
        this.hora="";
        this.valor=0.0;
    }
    
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("----------Depositar----------");
        System.out.print("Data:");
        this.setData(ler.next());
        System.out.print("Hora:");
        this.setHora(ler.next());
        System.out.print("Valor:");
        this.setValor(ler.nextDouble());
    }
    
    public void imprimir(){
        System.out.println("---------Deposito---------");
        System.out.println("Data:"+this.getData());
        System.out.println("Hora"+this.getHora());
        System.out.println("Valor:"+this.getValor());
    }
    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
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
