/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.newpackage;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class Departamento {
    
    
    private List<Funcionario> funcionarios;
    private Gerente gerente;

    public Departamento() {
        this.funcionarios = new ArrayList<>();
        this.gerente = new Gerente();
    }
    
    public void preencherFuncionario(){
        Scanner ler = new Scanner(System.in);
        int op;
        
        do{
            System.out.println("-----------Inserir Funcionairo--------- ");
            System.out.println("1 - Inserir um funcinario");
            System.out.println("________________________________________");
            System.out.println("0 - Voltar");
            
            op = ler.nextInt();
            
            if (op == 1){
                Funcionario f1 = new Funcionario();
                f1.preencher();
                this.funcionarios.add(f1);
            }
        }while(op!=0);
    }
    
    public void promover(){
        
        Scanner ler = new Scanner(System.in);
        
        String NomeProcurado;
        System.out.println("Nome do Funcionario a ser Promovido:");
        NomeProcurado = ler.next();
        
        for (int e = 0; e <= this.getFuncionarios().size() - 1; e++) {
                    Funcionario f1 = this.getFuncionarios().get(e);

                    if (NomeProcurado.equals(f1.getNome())) {
                        
                        System.out.println("De o valor da Promocao:");
                        gerente.setBonus(ler.nextDouble());
                        f1.setPromocao(true);
                    }
                }
        
        
        
    }
    
    public void remover(){
        
        Scanner ler = new Scanner(System.in);
        
        String NomeProcurado;
        System.out.println("Nome do Funcionario a ser removido:");
        NomeProcurado = ler.next();
        
        for(int e = 0; e <= this.getFuncionarios().size() - 1; e++) {
            Funcionario f1 = this.getFuncionarios().get(e);

            if (NomeProcurado.equals(f1.getNome())) {

                this.getFuncionarios().remove(e);
            }
        } 
                
    }
    
    public void imprimir(){
        
        for(int i=0; i< funcionarios.size();i++){
            Funcionario f1 = funcionarios.get(i);
                f1.imprimir();
                double salariototal;
                if(f1.isPromocao()==true){
                    System.out.println("Bonus:"+gerente.getBonus());
                    salariototal=gerente.getBonus()+f1.getSalario();
                    System.out.println("Salario total:"+salariototal);
                }
        }
    }
    

    // getters e setters
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
