/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.newpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class Proprietario {
    
    /**
     * 
     * Atributos 
     * 
     * nome String;
     * cpf String;
     * email String;
     * carros Carro;
     * 
     */
    
    private String nome;
    private String cpf;
    private String email;
    private List<Carro> lstcarros;
    
    public Proprietario(){
        this.nome="";
        this.cpf="";
        this.email="";
        this.lstcarros = new ArrayList<>();
        
    }
    
    //Getters and Setters
    
    public void setNome(String nome){
        this.nome = nome;
    } 
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setLstcarros(List<Carro> lstcarros){
        this.lstcarros = lstcarros;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public String getEmail(){
        return this.email;
    }
    public List<Carro> getLstcarros(){
        return this.lstcarros;
    }
    
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-------Preencher Proprietario------");
        System.out.print("Nome:");
        this.setNome(ler.next());
        System.out.print("Cpf:");
        this.setCpf(ler.next());
        System.out.print("Email:");
        this.setEmail(ler.next());
        System.out.println("Carro");
        for(int i=0; i<2;i++){
            Carro c1 = new Carro();
            c1.preencher();
            this.getLstcarros().add(c1); 
            
        } 
        
    }
    
    public void imprimir(){
        
        System.out.println("-----------Proprietario------------");
        System.out.println("Nome:"+this.getNome());
        System.out.println("Cpf:"+this.getCpf());
        System.out.println("Email:"+this.getEmail());
        System.out.println("Carros:");
        
        
        //Nao recebe a lista de carros
        for(int i =0; i<this.getLstcarros().size(); i++){
            Carro m1 = this.getLstcarros().get(i);
            m1.imprimir();
        }
        
    }
    
    public void ModeloIguais(Proprietario outro){
        
         for(int i=0; i<outro.getLstcarros().size(); i++){
             Carro c_outro = outro.getLstcarros().get(i);
             for(int j=0; j<this.getLstcarros().size(); j++){
                
                Carro c_esse = this.getLstcarros().get(j);
                
                if(c_esse.getModelo().equals(c_outro.getModelo())){
                    
                    System.out.println("O "+this.getNome()+" possui um "+c_esse.getModelo()+" igual a "+outro.getNome());
                
                }
            }

        }
    }
}
