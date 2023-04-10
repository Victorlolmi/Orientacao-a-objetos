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
public class Motorista {
    private String nome;
    private Carro carro;

    // construtor
    public Motorista() {
        this.nome = "";
        this.carro = new Carro();
    }

    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("------ Preenchendo o motorista -----");

        System.out.print("Informe o nome:");
        this.nome = leitor.next();

        this.carro.preencher();        
    }
    
    public void imprimir(){
        System.out.println("------------------------");
        System.out.println("Nome:"+ this.nome);
        this.carro.imprimir();
        
    }	
    
    private void menu_acao(){
        System.out.println("---------Motorista--------");
        System.out.println("1 - Abrir porta");
        System.out.println("2 - Businar");
        System.out.println("__________________________");
        System.out.println("0 - Sair do carro");
        
    }

    // método dirigir
    public void dirigir() {
        Scanner acao = new Scanner(System.in);
        int aux1;
        System.out.println("-----------------------------");
        System.out.println("Dirigindo o carro " + carro.getModelo());
        
        do{
            
            menu_acao();
            aux1 = acao.nextInt();
            switch(aux1){
                case 1:
                    carro.abrirPorta();
                    break;
                case 2:
                    carro.buzinar();
                    break;
                default:
            }   
                    
        }while(aux1 != 0);
        
        carro.buzinar();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCarro(Carro carro){
        this.carro = carro;
    }
    
    
    public String getNome(){
        return this.nome;
    }
    public Carro getCarro(){
        return this.carro;
    }
}

