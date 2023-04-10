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
 * @author W10
 */
public class Pessoaf {
    
    /**
     * 
     * Atributos
     * 
     * nome String
     * Cpf Strimg
     * Email String 
     * Lista_de_contas
     * 
     */
    
    private String nome;
    private String cpf;
    private String email;
    private List<Contas_a_pagar> lstContas;
    
    public Pessoaf(){
        this.nome="";
        this.cpf="";
        this.email="";
        this.lstContas = new ArrayList<>();
    }
    
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("--------Preencher Pessoa--------");
        System.out.print("Nome:");
        this.setNome(ler.next());
        System.out.print("Cpf:");
        this.setCpf(ler.next());
        System.out.print("Email:");
        this.setEmail(ler.next());
        
        for(int i=0; i<3;i++){
            Contas_a_pagar c1 = new Contas_a_pagar();
            c1.preencher();
            this.getLstContas().add(c1);
        }
    }
    
    public void imprimir(){
        System.out.println("-------------Pessoa-------------");
        System.out.println("Nome:"+this.getNome());
        System.out.println("Cpf:"+this.getCpf());
        System.out.println("Email:"+this.getEmail());
        
        for(int i=0; i<this.getLstContas().size(); i++){
            Contas_a_pagar c1 = this.getLstContas().get(i);
            c1.imprimir();
        }
    }
    
    public void copiar(Pessoaf outro){
        this.nome=outro.email;
        this.cpf=outro.cpf;
        this.email=outro.nome;
        this.lstContas = new ArrayList<>();
        
        for(int i=0; i<= outro.getLstContas().size()-1; i++){
            Contas_a_pagar outra_conta_i = outro.getLstContas().get(i);
                                
            Contas_a_pagar nova = new Contas_a_pagar();
            nova.copiar(outra_conta_i);
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the lstContas
     */
    public List<Contas_a_pagar> getLstContas() {
        return lstContas;
    }

    /**
     * @param lstContas the lstContas to set
     */
    public void setLstContas(List<Contas_a_pagar> lstContas) {
        this.lstContas = lstContas;
    }
}
