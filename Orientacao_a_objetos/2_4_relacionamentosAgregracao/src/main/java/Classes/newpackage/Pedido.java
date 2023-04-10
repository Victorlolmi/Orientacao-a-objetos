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
public class Pedido {
    
    /**
     * 
     * Atributos
     * 
     * Id_pedido Int;
     * lstClientes List<>
     * 
     */
    
    private int id_pedido;
    private List<Cliente_> lstClientes;
    
    public Pedido(){
        this.id_pedido=0;
        this.lstClientes = new ArrayList<>();
    }
    
    public void menu_clientes(){
        
        System.out.println("-----------Cliente-----------");
        System.out.println("1 - Inserir cliente");
        System.out.println("2 - Remover cliente");
        System.out.println("_____________________________");
        System.out.println("0 - Voltar");
    
    }
    
    public int preencher(int total_pedidos){
        
        Scanner ler = new Scanner(System.in);
        int aux;
        String aux2;
        
        System.out.println("--------------Preencher Pedido------------");
        System.out.print("Id:");
        this.setId_pedido(ler.nextInt());
        total_pedidos++;
        
        System.out.println("---------Preencher Cliente ----------");
        do{
            
            menu_clientes();
            aux = ler.nextInt();
            
            if(aux == 1){
                Cliente_ c1 = new Cliente_();
                c1.preencher();
                this.lstClientes.add(c1);
            }
            else if(aux == 2){
                
                System.out.print("Insira o nome do Cliente:");
                aux2 = ler.next();
                
                for(int i=0; i<lstClientes.size();i++){
                    
                    Cliente_ c1 = this.lstClientes.get(i);
                    
                    if(c1.getNome() == aux2){
                        lstClientes.remove(i);
                        System.out.println("o cliente "+c1.getNome()+" foi removido");
                    }else{
                        System.out.println("Nao foi possivel achar o cliente");
                    }
                }
            }
        }while(aux != 0);
        
        return total_pedidos;
    }
    
    public void imprimir(){
        
        System.out.println("---------------Pedido--------------");
        System.out.println("Id:"+this.getId_pedido());
        
        for(int i =0; i<this.lstClientes.size(); i++){
            
            Cliente_ c1 = this.lstClientes.get(i);
            c1.imprimir();
        }
    }

    /**
     * @return the id_pedido
     */
    public int getId_pedido() {
        return id_pedido;
    }

    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return the lstClientes
     */
    public List<Cliente_> getLstClientes() {
        return lstClientes;
    }

    /**
     * @param lstClientes the lstClientes to set
     */
    public void setLstClientes(List<Cliente_> lstClientes) {
        this.lstClientes = lstClientes;
    }
    
    
}
