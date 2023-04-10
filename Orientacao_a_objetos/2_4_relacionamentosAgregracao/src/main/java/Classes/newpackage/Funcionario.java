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
public class Funcionario {
    
    private String nome;
    private double salario;
    private boolean promocao;

    public Funcionario() {
        this.nome = "";
        this.salario = 0.0;
        this.promocao = false;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("-----------Preencher Funcionario------------");
        System.out.print("Nome:");
        this.setNome(ler.next());
        System.out.print("Salario:");
        this.setSalario(ler.nextDouble());
    }
    
    public void imprimir(){
        System.out.println("----------Funcionario-----------");
        
        System.out.println("Nome:"+this.getNome());
        System.out.println("Salario:"+this.getSalario());
        System.out.println("Promocao:"+this.isPromocao());
    }
    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
        
    }
}
