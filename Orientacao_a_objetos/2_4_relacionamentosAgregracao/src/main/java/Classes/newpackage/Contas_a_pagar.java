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
public class Contas_a_pagar {
    
    /**
     * 
     * Atributos
     * 
     * id int
     * Codigo de Barras String
     * valor double
     * 
     */
    
    private int id;
    private String codigo_de_barras;
    private double valor;
    
    public Contas_a_pagar(){
        this.id=0;
        this.codigo_de_barras="";
        this.valor=0.0;
    }
    
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("--------- Preencher Contas--------");
        System.out.print("Id:");
        this.setId(ler.nextInt());
        System.out.print("Codigo de Barras:");
        this.setCodigo_de_barras(ler.next());
        System.out.print("Valor:");
        this.setValor(ler.nextDouble());
        
    }
    
    public void imprimir(){
            System.out.println("----------Contas a Pagar-----------");
            System.out.println("Id:"+this.getId());
            System.out.println("Codigo de Barras:"+this.getCodigo_de_barras());
            System.out.println("Valor:"+this.getValor());
    }
    public void copiar(Contas_a_pagar outra){
        this.id = outra.getId();
        this.codigo_de_barras = outra.getCodigo_de_barras();
        this.valor = outra.getValor();    
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codigo_de_barras
     */
    public String getCodigo_de_barras() {
        return codigo_de_barras;
    }

    /**
     * @param codigo_de_barras the codigo_de_barras to set
     */
    public void setCodigo_de_barras(String codigo_de_barras) {
        this.codigo_de_barras = codigo_de_barras;
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
