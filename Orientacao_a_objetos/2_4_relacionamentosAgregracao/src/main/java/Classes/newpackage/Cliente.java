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
public class Cliente {
    
    /**
     * 
     * Atributos
     * 
     * Nome String
     * Banco String
     * Contas List<Conta_Bncaria>
     */
    
    private String nome;
    private String banco;
    private List<Conta_Bancaria> contas;
    
    public Cliente(){
        this.nome="";
        this.banco="";
        this.contas= new ArrayList<>();
    }
    
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------Preencher Cliente-----------");
        System.out.print("Nome:");
        this.setNome(ler.next());
        System.out.print("Banco:");
        this.setBanco(ler.next());
    }
        
    public void depositar(){
        
        Scanner ler = new Scanner(System.in);
        int aux;
        
        System.out.println("--------Depositar---------");
        do{
            
            System.out.println("--------------------------");
            System.out.println("1 - Fazer um deposito");
            System.out.println("__________________________");
            System.out.println("0 - Voltar ");
            aux = ler.nextInt();
            
            if(aux == 1){
                Conta_Bancaria c1 = new Conta_Bancaria();
                c1.preencher();
                this.getContas().add(c1);
            }
      
        }while(aux!=0);
        
    }
    
    public void imprimir(){
        System.out.println("--------Cliente---------");
        System.out.println("Nome:"+this.nome);
        System.out.println("Banco:"+this.banco);
        
        for(int i=0; i<this.getContas().size(); i++){
            Conta_Bancaria c1 = this.getContas().get(i);
            c1.imprimir();
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the contas
     */
    public List<Conta_Bancaria> getContas() {
        return contas;
    }

    /**
     * @param contas the contas to set
     */
    public void setContas(List<Conta_Bancaria> contas) {
        this.contas = contas;
    }
}
