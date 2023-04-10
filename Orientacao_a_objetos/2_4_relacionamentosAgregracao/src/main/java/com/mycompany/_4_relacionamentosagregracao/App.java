/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._4_relacionamentosagregracao;

import Classes.newpackage.Aluno;
import Classes.newpackage.Carro;
import Classes.newpackage.Cliente;
import Classes.newpackage.Cliente_;
import Classes.newpackage.Contas_a_pagar;
import Classes.newpackage.Departamento;
import Classes.newpackage.Funcionario;
import Classes.newpackage.Motorista;
import Classes.newpackage.Pedido;
import Classes.newpackage.Pessoaf;
import Classes.newpackage.Produto;
import Classes.newpackage.Proprietario;
import Classes.newpackage.Roda;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class App {
    
    public static void menu_1(){
        
        System.out.println("------------Menu de Carros------------");
        System.out.println("1 - Preencher");
        System.out.println("2 - Imprimir");
        System.out.println("______________________________________");
        System.out.println("0 - Voltar ao menu principal");
    }
    
    public static void menu_2(){
        System.out.println("------------Menu de Proprietario------------");
        System.out.println("1 - Preencher");
        System.out.println("2 - Imprimir");
        System.out.println("3 - Proprietarios possuem a mesma marca?");
        System.out.println("______________________________________");
        System.out.println("0 - Voltar ao menu principal");
    }
    
    public static void menu_3(){
        System.out.println("--------------Menu de Alunos---------------");
        System.out.println("1 - Preencher");
        System.out.println("2 - Imprimir");
        System.out.println("3 - Verificar quais possuem o mesmo DDD");
        System.out.println("4 - Verificar quais pertencem a mesma operadora");
        System.out.println("___________________________________________");
        System.out.println("0 - Voltar ao menu principal");
    }
    
    public static void menu_4(){
        System.out.println("------------Menu de Contas------------");
        System.out.println("1 - Preencher");
        System.out.println("2 - Imprimir");
        System.out.println("3 - Qual tem maior saldo devedor?");
        System.out.println("4 - Qual total devido por todas as pessoas?");
        System.out.println("______________________________________");
        System.out.println("0 - Voltar ao menu principal");
    }
    
    public static void menu_5(){
        System.out.println("------------Menu Motorista------------");
        System.out.println("1 - Preencher");
        System.out.println("2 - Imprimir");
        System.out.println("3 - Dirigir Carro");
        System.out.println("______________________________________");
        System.out.println("0 - Voltar ao menu principal");
    }
    
    public static void menu_6(){
        System.out.println("------------Menu Cliente------------");
        System.out.println("1 - Preencher cliente");
        System.out.println("2 - Inserir deposito na conta bancária");
        System.out.println("3 - Imprimir");
        System.out.println("____________________________________");
        System.out.println("0 - Voltar ao menu principal");
    }
    
    public static void menu_7(){
        System.out.println("------------Menu Pedido------------");
        System.out.println("1 - Preencher Pedido");
        System.out.println("2 - Imprimir");
        System.out.println("3 - Total de Pedidos");
        //System.out.println("4 - Faturamento total de Pedidos");
        //System.out.println("5 - Produto com mais saida");
        //System.out.println("6 - Produto com menos saida");
        //System.out.println("7 - Cliente com mais pedidos");
        //System.out.println("8 - Cliente que mais gastou dinheiro");
        System.out.println("____________________________________");
        System.out.println("0 - Voltar ao menu principal");
    }
    
    public static void menu_8(){
        
    }
    
    public static void menu_9(){
        System.out.println("------------Menu Departamento------------");
        System.out.println("1 - Adicionar funiconario");
        System.out.println("2 - Remover funcionario");
        System.out.println("3 - Promover funcionario a gerente");
        System.out.println("4 - Imprimir");
        System.out.println("_________________________________________");
        System.out.println("0 - Voltar ao menu Principal");
    }
    public static void menu_10(){
        
    }
    public static void imprime_menu(){
        System.out.println("----------Menu Principal----------");
        System.out.println("1 - Carro e Rodas");
        System.out.println("2 - Proprietario e Carros");
        System.out.println("3 - Aluno e Telefones");
        System.out.println("4 - (Pessoas e Contas)");
        System.out.println("5 - (Motorista)");
        System.out.println("6 - Cliente com conta bancaria ");
        System.out.println("7 - Pedidos e Produtos ");
        System.out.println("9 - Departamento e Funcionarios");
        System.out.println("________________________________");
        System.out.println("0 - Sair");
        System.out.println("--------------------------------");
    } 
            
    public static void Ex_carro(int i,Carro c1){
        
        
        if(i == 1){
            c1.preencher();  
        }else{
            c1.imprimir();
        }
        
    }
    public static void Ex_Proprietario(int i,Proprietario p1,List<Proprietario> lstProprietario){
        
        Scanner ler = new Scanner(System.in);
        int aux;
        switch (i) {
            case 1 -> {
                do{
                    System.out.println("--------Inserir proprietario-------");
                    System.out.println("1 - Inserir");
                    System.out.println("___________________________________");
                    System.out.println("0 - Voltar");
                    
                    aux = ler.nextInt();
                    
                    if(aux==1){
                        p1.preencher();
                        lstProprietario.add(p1);
                    }    
                }while(aux!=0);
                
            }  
            case 2 -> p1.imprimir();
            case 3 -> {
                for(int e=0; e<lstProprietario.size(); e++){
                    
                   p1 = lstProprietario.get(e); 
                   
                   for(int j=0; j<lstProprietario.size(); j++){
                       Proprietario p2 = lstProprietario.get(j); 
                        p1.ModeloIguais(p2);
                   }
                    
                } 
            }
        }
        
    }
    
    public static void Ex_Aluno(int i, Aluno a1, List<Aluno> lstAlunos){
        
        switch (i) {
            case 1 -> {
                for(int e=0; e<6; e++){
                    
                    a1.preencher();
                    lstAlunos.add(a1);
                }
            }
            case 2 -> {
                for(int e=0; e<lstAlunos.size(); e++){
                    a1 = lstAlunos.get(e);
                    a1.imprimir();
                }
            }
            case 3 ->{
                
            }
            case 4 -> {
            }
            default -> {
            }
        }
    }
    
    public static void Ex_Pessoaf(int i, Pessoaf pe1, List<Pessoaf> lstPessoas){
        
        switch (i) {
            case 1 -> {
                for(int e=0; e<6; e++){
                    pe1.preencher();
                    lstPessoas.add(pe1);
                }
            }
            case 2 -> {
                for(int e=0; e<lstPessoas.size(); e++){
                    Pessoaf pe = lstPessoas.get(e);
                    pe.imprimir();
                }
            }
            case 3 -> {
                double maiorDivida = 0;
                Pessoaf pessoaMaiorDivida = new Pessoaf();
                for(int e = 0; e < lstPessoas.size(); e++) {
                    
                    Pessoaf pf_i = lstPessoas.get(e);
                    
                    //Vamos ver conta por conta quanto ele deve
                    for(int j=0; j <= pf_i.getLstContas().size()-1; j++){
                        Contas_a_pagar conta_j = pf_i.getLstContas().get(j);
                        
                        if(conta_j.getValor() > maiorDivida){
                            maiorDivida = conta_j.getValor();
                            pessoaMaiorDivida.copiar(pf_i);
                        }
                    }
                }   System.out.println("A maior divída é:" + maiorDivida);
                System.out.println("Ela é referente a Pessoa Física:");
                pessoaMaiorDivida.imprimir();
            }
            case 4 -> {
                double totalDividas = 0;
                for (int e = 0; e <= lstPessoas.size() - 1; e++) {
                    Pessoaf pf_i = lstPessoas.get(e);
                    
                    //Vamos passar conta por conta somando a divida
                    for(int j=0; j <= pf_i.getLstContas().size()-1; j++){
                        Contas_a_pagar conta_j = pf_i.getLstContas().get(j);
                        
                        totalDividas = totalDividas + conta_j.getValor();
                    }
                }   System.out.println("O total devido é:" + totalDividas);
            }
            default -> {
            }
        }
    }
    
    public static void Ex_Motorista(int i, Motorista m1){
        
        switch (i) {
            case 1 -> m1.preencher();
            case 2 -> m1.imprimir();
            case 3 -> m1.dirigir();
            default -> {
            }
        }
    }
    
    public static void Ex_Cliente(int i, Cliente cl){
        switch (i) {
            case 1 -> cl.preencher();
            case 2 -> cl.depositar();
            case 3 -> cl.imprimir();
            default -> {
            }
        }
        
        
    }
    public static void menu_pedidos(){
        
        System.out.println("-----------Pedido-----------");
        System.out.println("1 - Inserir pedido");
        System.out.println("2 - Remover pedido");
        System.out.println("_____________________________");
        System.out.println("0 - Voltar");
    }
    public static void Ex_Pedido(int i, Pedido ped1, List<Pedido> lstPedidos){
        
        Scanner ler = new Scanner(System.in);
        int aux, aux2, total_pedidos=0;
        double faturamento=0;
        
        switch (i) {
            case 1 ->{
                do{
                    menu_pedidos();
                    aux = ler.nextInt();
                    
                    if(aux == 1){
                        total_pedidos = ped1.preencher(total_pedidos);
                        
                    }
                    else if(aux == 2){
                        
                        System.out.print("Digite o id do Pedido a ser removido:");
                        aux2 = ler.nextInt();
                      
                        for (int e = 0; e <= lstPedidos.size() - 1; e++) {
                            Pedido ped = lstPedidos.get(i);

                            if (aux2 == ped.getId_pedido()) {
                                lstPedidos.remove(aux2);
                                System.out.println("Pedido "+ped.getId_pedido()+" removido");
                            }else{
                                System.out.println("Nao foi possivel achar o pedido");
                            }
                        }
                    }
                     
                }while (aux != 0);
            }   
            case 2 -> {
                
                for(int e=0; e<lstPedidos.size(); e++){
                    ped1 = lstPedidos.get(e);
                    ped1.imprimir();
                }
            }
            case 3 -> System.out.println("TOTAL DE PEDIDOS:"+total_pedidos);
            case 4 ->{
                
                for(int e=0; e<lstPedidos.size(); e++){
                    ped1 = lstPedidos.get(e);
                    for(int j =0; j<ped1.getLstClientes().size(); j++){
                        Cliente_ c1 = ped1.getLstClientes().get(j);
                        for(int k=0; k< c1.getLstProdutos().size(); k++){
                            Produto p1  = c1.getLstProdutos().get(k);
                            faturamento = faturamento + p1.getValor();
                        }
                        
                    }
                }
                
                System.out.println("FATURAMENTO TOTAL DOS PEDIDOS:"+faturamento);
                
            }
            /*case 7 -> {
                //Cliente com mais pedidos
                int cli_maispedidos;
                
                for(int e=0; e<lstPedidos.size(); e++){
                    ped1 = lstPedidos.get(e);
                    for(int j=0; j<ped1.getLstClientes().size();j++){
                        Cliente c1 = ped1.getLstClientes().get(j):
                        
                    }
                    
                }
            }*/
            default -> {
            }
        }
    }
    
    public static void Ex_Departamento(int i, Departamento d1){
        
        
        switch (i) {
            case 1 -> d1.preencherFuncionario();
            case 2 -> d1.remover();
            case 3 -> d1.promover();
            case 4 -> d1.imprimir();
            default -> {
            }
        }
    }
    public static void main(String[] args) {
       
       //Impressao de telas 
        Scanner ler = new Scanner(System.in);
        int auxpricipal, aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux9;
        
        //Criacao dos objetos
        Carro c1 = new Carro();
        
        List<Proprietario> lstProprietario;
        lstProprietario = new ArrayList<>();
        Proprietario p1 = new Proprietario();
        
        List<Aluno> lstAlunos;
        lstAlunos = new ArrayList<>();
        Aluno a1 = new Aluno();
        
        List<Pessoaf> lstPessoas;
        lstPessoas = new ArrayList<>();
        Pessoaf pe1 = new Pessoaf();
        
        Motorista m1 = new Motorista();
        
        Cliente cl = new Cliente();
        
        List<Pedido> lstPedidos;
        lstPedidos = new ArrayList<>();
        Pedido ped1 = new Pedido();
        
        Departamento d1 = new Departamento();
        do{
            
            imprime_menu();
            auxpricipal = ler.nextInt();


            switch(auxpricipal){
                case 1 -> {
                    do{
                        menu_1();
                        aux1 = ler.nextInt();
                        switch(aux1){
                            case 1 -> Ex_carro(1,c1);
                            case 2 -> Ex_carro(2,c1);
                            default -> {
                            }
                        }
                    }while(aux1 != 0);
                }
                case 2 -> {
                    do{
                        menu_2();
                        aux2 = ler.nextInt();
                      
                        switch(aux2){
                            case 1 -> Ex_Proprietario(1,p1,lstProprietario);
                            case 2 -> Ex_Proprietario(2,p1,lstProprietario);
                            case 3 -> Ex_Proprietario(3,p1,lstProprietario);
                            default -> {
                            }
                        }
                    }while(aux2 != 0);
                }
                case 3 -> {
                    do{
                        menu_3();
                        aux3 = ler.nextInt();
                        switch(aux3){
                            case 1 -> Ex_Aluno(1,a1,lstAlunos);
                            case 2 -> Ex_Aluno(2,a1,lstAlunos);
                            case 3 -> Ex_Aluno(3,a1,lstAlunos);
                            case 4 -> Ex_Aluno(4,a1,lstAlunos);
                            default -> {
                            }
                        }
                    }while(aux3 != 0);
                }
                case 4 -> {
                    do{
                        menu_4();
                        aux4 = ler.nextInt();
                        switch(aux4){
                            case 1 -> Ex_Pessoaf(1,pe1,lstPessoas);
                            case 2 -> Ex_Pessoaf(2,pe1,lstPessoas);
                            case 3 -> Ex_Pessoaf(3,pe1,lstPessoas);
                            case 4 -> Ex_Pessoaf(4,pe1,lstPessoas);
                            default -> {
                            }
                        }
                    }while(aux4 != 0);
                }
                case 5 -> {
                    do{
                        menu_5();
                        aux5 = ler.nextInt();
                        switch(aux5){
                            case 1 -> Ex_Motorista(1,m1);
                            case 2 -> Ex_Motorista(2,m1);
                            case 3 -> Ex_Motorista(3,m1);
                            default -> {
                            }
                        }
                    }while(aux5 != 0);
                }
                case 6 -> {
                    do{
                        menu_6();
                        aux6 = ler.nextInt();
                        switch(aux6){
                            case 1 -> Ex_Cliente(1,cl);
                            case 2 -> Ex_Cliente(2,cl);
                            case 3 -> Ex_Cliente(3,cl);
                            default -> {
                            }
                        }
                    }while(aux6 != 0);
                }
                case 7 -> {
                    do{
                        menu_7();
                        aux7 = ler.nextInt();
                        switch(aux7){
                            case 1 -> Ex_Pedido(1,ped1,lstPedidos);
                            case 2 -> Ex_Pedido(2,ped1,lstPedidos);
                            case 3 -> Ex_Pedido(3,ped1,lstPedidos);
                            case 4 -> Ex_Pedido(4,ped1,lstPedidos);
                            case 5 -> Ex_Pedido(5,ped1,lstPedidos);
                            case 6 -> Ex_Pedido(6,ped1,lstPedidos);
                            case 7 -> Ex_Pedido(74,ped1,lstPedidos);
                            default -> {
                            }
                        }
                    }while(aux7 != 0);
                }
                case 8 -> {
                }
                case 9 -> {
                    do{
                        menu_9();
                        aux9 = ler.nextInt();
                        switch(aux9){
                            case 1 -> Ex_Departamento(1,d1);
                            case 2 -> Ex_Departamento(2,d1);
                            case 3 -> Ex_Departamento(3,d1);
                            case 4 -> Ex_Departamento(4,d1);
                            default -> {
                            }
                        }
                    }while(aux9 != 0);
                }
                case 10 -> {
                }
                default -> {
                }
            }
                
            
        }while( auxpricipal != 0);
    }
}
