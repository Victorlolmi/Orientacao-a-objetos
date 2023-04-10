/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._2ex13_victor_joaovitorruzza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 13879875693
 */
public class App {
    
    
    public static int imprimeMenu(){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("------------------------------");
        System.out.println("1 - Inserir Musica");
        System.out.println("2 - Remover Musica");
        System.out.println("3 - Pesquisar Musica(titulo)");
        System.out.println("4 - Pesquisar Musica(autor)");
        System.out.println("5 - Sair");
        System.out.println("------------------------------");
        System.out.print("Escolha uma opcao:");
        
        return ler.nextInt();
    }
    public static void main(String[] args) {
        
        List<Musica> listaMusicas;
        listaMusicas = new ArrayList<Musica>();
        Scanner ouvinte = new Scanner(System.in);
        int opcao = 0;
        
        
        do
        {   
            opcao = imprimeMenu();
            if(opcao ==1 ){
                //inserir
                Musica m1 = new Musica();
                m1.Preencher();
                listaMusicas.add(m1);
                
            }else if(opcao == 2){
                //remocao
                System.out.println("De o nome da Musica:");
                String title = ouvinte.nextLine();
                
                for(int i=0; i <= listaMusicas.size()-1; i++){
                    Musica m1 = listaMusicas.get(i);
                    if(title.equals(m1.getTitulo())){
                        
                        listaMusicas.remove(m1);
                        System.out.println("Musica "+m1.getTitulo()+" encontrada e removida");
                    }else{
                        System.out.println("Musica n encontrada");
                    }
                }
            }else if(opcao == 3){
                //pesquisar titulo
                System.out.println("De o nome da musica:");
                String title = ouvinte.nextLine();
                 
                for (int i = 0; i <= listaMusicas.size() - 1; i++) {
                    Musica m1 = listaMusicas.get(i);
                    if (title.equals(m1.getTitulo())) {
                        System.out.println("------ Musica encontrada -------");
                        m1.Imprimir();
                        System.out.println("--------------------------------");
                    }
                    else{
                        System.out.println("Musica n encontrada");
                    }
                } 
            }else if(opcao == 4){
                //pesquisar autor
                System.out.println("Informe o artista");
                String title = ouvinte.nextLine();
                
                for(int i =0; i<=listaMusicas.size()-1; i++){
                    Musica m1 = listaMusicas.get(i);
                    if(title.equals(m1.getArtista())){
                        System.out.println("Artista encontrado");
                        m1.Imprimir();
                    }else{
                        System.out.println("Artista n ncontrado");
                    }
                }
                
            }else{
                System.out.println("Obrigado!");
            }
        }while(opcao != 5);
    }
}
