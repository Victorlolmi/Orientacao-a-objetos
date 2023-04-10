/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.newpackage;

import Classes.newpackage.Roda;
import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class Carro {
    //atributos
    private String fabricante;
    private String modelo;
    private double motor;
    private String cor;
    private Roda[] rodas = new Roda[4];

    public Carro() {
        this.fabricante = "";
        this.modelo = "";
        this.motor = 1.0;
        this.cor = "";
        for (int i = 0; i <= 3; i++) {
            this.rodas[i] = new Roda();
        }
    }

    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println("--- Informe os dados do carro ---");
        System.out.print("Fabricante:");
        this.setFabricante(ler.next());
        System.out.print("Modelo:");
        this.setModelo(ler.next());
        System.out.print("Motor:");
        this.setMotor(ler.nextDouble());
        System.out.print("Cor:");
        this.setCor(ler.next());
        this.getRodas()[0].preencher();
        for (int i = 2; i <= 3; i++) {
            this.getRodas()[i].copiar(this.getRodas()[0]);
        }
    }
    
    public void imprimir(){
        System.out.println("----------------Carro-----------------");
        System.out.println("Fabricante:" + this.getFabricante());
        System.out.println("Modelo:"+ this.getModelo());
        System.out.println("Motor:"+ this.getMotor());
        System.out.println("Cor:"+ this.getCor());   
        
        //imprimir cada uma das rodas
        for(int i=0; i <= 3; i++){
            Roda ri = this.getRodas()[i];
            ri.imprimir();
        }
        
    }
    
    public void copiar(Carro outro){
        this.fabricante = outro.getFabricante();
        this.modelo = outro.getModelo();
        this.motor = outro.getMotor();
        this.cor = outro.getCor();
        
        for(int i=0; i<= 3; i++){
            Roda ri = outro.getRodas()[i];
            
            this.rodas[i].copiar(ri);
        }
    }
    public void buzinar(){
        System.out.println("-----------------------------------");
        System.out.println("O carro " + this.modelo + " está buzinando!");
        System.out.println("PAMMMMM!!!");
    }
    
    public void abrirPorta(){
        System.out.println("-----------------------------------");
        System.out.println("Porta do carro "+ this.modelo + " está aberta!");
        System.out.println("Por favor entre!");
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the motor
     */
    public double getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(double motor) {
        this.motor = motor;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the rodas
     */
    public Roda[] getRodas() {
        return rodas;
    }

    /**
     * @param rodas the rodas to set
     */
    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

}
