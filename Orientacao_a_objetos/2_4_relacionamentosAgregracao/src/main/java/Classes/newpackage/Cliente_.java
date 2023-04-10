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
public class Cliente_ {
    /**
     * 
     * ATributos
     * 
     * Nome String;
     * Cpf String;
     * lstProdutos list<Produtos>
     */
    
    private String nome;
    private String cpf;
    private List<Produto> lstProdutos;
    
    public Cliente_(){
        this.nome="";
        this.cpf="";
        this.lstProdutos = new ArrayList<>();
    }
    public void menu_produto(){
        System.out.println("--------------Produto-----------");
        System.out.println("1 - Inserir ");
        System.out.println("2 - Remover ");
        System.out.println("________________________________");
        System.out.println("0 - Volta ");
    }
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        int aux, aux2;
        System.out.println("-----------Preencher Cliente----------");
        System.out.print("Nome:");
        this.setNome(ler.next());
        System.out.print("Cpf:");
        this.setCpf(ler.next());
        
        do{
            menu_produto();
            aux = ler.nextInt();
            
            if(aux == 1){
                Produto p1 = new Produto();
                p1.preencher();
                this.lstProdutos.add(p1);
            }else if(aux == 2){
                System.out.print("De o id do Produto:");
                aux2 = ler.nextInt();
               
                for(int i=0; i<this.lstProdutos.size(); i++){
                    Produto p1 = this.lstProdutos.get(i);
                    if(p1.getId_produtos() == aux){
                        this.lstProdutos.remove(i);
                    }else{
                        System.out.println("Nao foi possivel achar o produto");
                    }
                }
            }
        }while(aux != 0);
    }
    
    public void imprimir(){
        
        System.out.println("--------------Cliente--------------");
        System.out.println("Nome:"+this.getNome());
        System.out.println("Cpf:"+this.getCpf());
        
        for(int i=0; i<this.lstProdutos.size(); i++){
            Produto p1 = this.lstProdutos.get(i);
            p1.imprimir();
     
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
     * @return the lstProdutos
     */
    public List<Produto> getLstProdutos() {
        return lstProdutos;
    }

    /**
     * @param lstProdutos the lstProdutos to set
     */
    public void setLstProdutos(List<Produto> lstProdutos) {
        this.lstProdutos = lstProdutos;
    }
}
