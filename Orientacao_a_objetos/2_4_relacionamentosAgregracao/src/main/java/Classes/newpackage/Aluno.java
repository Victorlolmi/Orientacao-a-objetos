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
public class Aluno {
    
    
    /**
     * 
     * Atributos
     * 
     * nome String
     * matricula String
     * email String
     * curso String
     * lista de telefones List<Telefone>
     * 
     */
    
    private String nome;
    private String matricula;
    private String curso;
    private List<Telefone> lsttelefones;
    
    public Aluno(){
        this.nome="";
        this.matricula="";
        this.curso="";
        this.lsttelefones = new ArrayList<>();
    }
    
    public void preencher(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("----------Preencher Aluno--------");
        System.out.print("Nome:");
        this.setNome(ler.next());
        System.out.print("Matricula:");
        this.setMatricula(ler.next());
        System.out.print("Curso:");
        this.setCurso(ler.next());
        for(int i=0; i<2; i++){
            Telefone t1 = new Telefone();
            t1.preencher();
            this.lsttelefones.add(t1);
        }
        
    }
    
    public void imprimir(){
        System.out.println("-----------Aluno-----------");
        System.out.println("Nome:"+this.getNome());
        System.out.println("Matricula"+this.getMatricula());
        System.out.println("Curso:"+this.getCurso());
        for(int i=0; i<this.getLsttelefones().size();i++){
            Telefone t1 = this.getLsttelefones().get(i);
            t1.imprimir();
                    
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
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the lsttelefones
     */
    public List<Telefone> getLsttelefones() {
        return lsttelefones;
    }

    /**
     * @param lsttelefones the lsttelefones to set
     */
    public void setLsttelefones(List<Telefone> lsttelefones) {
        this.lsttelefones = lsttelefones;
    }
    
}
