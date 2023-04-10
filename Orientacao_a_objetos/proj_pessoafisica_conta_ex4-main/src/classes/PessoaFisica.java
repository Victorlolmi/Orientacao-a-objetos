/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class PessoaFisica {
    private String nome;
    private int idade;
    private String cpf;
    private List<ContaAPagar> listaContas;

    public PessoaFisica() {
        this.nome = "";
        this.idade = 0;
        this.cpf = "";
        this.listaContas = new ArrayList<>();
    }

    public PessoaFisica(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        
        this.listaContas = new ArrayList<>();
    }
    
    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("------ Preenchendo os dados da Pessoa -----");

        System.out.print("Informe o nome:");
        this.nome = leitor.next();

        System.out.print("Informe a idade:");
        this.idade = leitor.nextInt();

        System.out.print("Informe o CPF:");
        this.cpf = leitor.next();
        
        
        String resposta = "n";
        do{
            ContaAPagar conta = new ContaAPagar();
            conta.preencher();
            this.getListaContas().add(conta);
            
            System.out.print("Deseja inserir mais conta(s/n) ?");
            resposta = leitor.next();            
        }while(resposta.equals("s"));
        
        
    }

    public void imprimir() {
        System.out.println("------------------------");
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("CPF:" + this.cpf);
        
        for(int i=0; i <= this.getListaContas().size()-1;i++){
            ContaAPagar conta_i = this.getListaContas().get(i);
            conta_i.imprimir();
            
        }
        System.out.println("------------------------");
    }
    
    public void copiar(PessoaFisica outra) {
        this.nome = outra.getNome();
        this.idade = outra.getIdade();
        this.cpf = outra.getCpf();
        
        //vamos passar conta por conta copiando da outra para esta
        this.listaContas = new ArrayList<>();
        for(int i=0; i<= outra.getListaContas().size()-1; i++){
            ContaAPagar outra_conta_i = outra.getListaContas().get(i);
                                
            ContaAPagar nova = new ContaAPagar();
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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
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
     * @return the listaContas
     */
    public List<ContaAPagar> getListaContas() {
        return listaContas;
    }
    
    
    
    
}
