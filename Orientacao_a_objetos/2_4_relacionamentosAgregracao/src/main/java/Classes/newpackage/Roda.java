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
public class Roda {
    //atributos

    private double raio;
    private String material;
    private double peso;
    private double suporteMax;

    //métodos		
    public Roda() {
        this.raio = 0.0;
        this.material = "";
        this.peso = 0.0;
        this.suporteMax = 0.0;
    }

    public void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.println(" --- Informe os dados da Roda --- ");
        System.out.print("Raio:");
        this.setRaio(ler.nextDouble());
        System.out.print("Material:");
        this.setMaterial(ler.next());
        System.out.print("Peso:");
        this.setPeso(ler.nextDouble());
        System.out.print("SuporteMax:");
        this.setSuporteMax(ler.nextDouble());        
    }
    
    public void imprimir(){
        System.out.println("--------------Roda-------------------");
        System.out.println("Raio:" + this.getRaio());
        System.out.println("Material:"+ this.getMaterial());
        System.out.println("Peso:"+ this.getPeso());
        System.out.println("SuporteMax:"+ this.getSuporteMax());  
        
    }
    
    public void copiar(Roda outra){
        this.raio = outra.getRaio();
        this.material = outra.getMaterial();
        this.peso = outra.getPeso();
        this.suporteMax = outra.getSuporteMax();    
    }

    /**
     * @return the raio
     */
    public double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(double raio) {
        this.raio = raio;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the suporteMax
     */
    public double getSuporteMax() {
        return suporteMax;
    }

    /**
     * @param suporteMax the suporteMax to set
     */
    public void setSuporteMax(double suporteMax) {
        this.suporteMax = suporteMax;
    }


}
