/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_roteiro1_planocartesiano;

/**
 *
 * @author W10
 */
public class Ex_roteiro1_PlanoCartesiano {

    public static void main(String[] args) {
        
        
        Ponto p1 = new Ponto();
        p1.preencher();
        
        Ponto p2 = new Ponto(); 
        p2.copiar(p1);
        
        System.out.println("Distancia etre pontos "+p1.distancia_entre_pontos(p1,p2));
    }
}
