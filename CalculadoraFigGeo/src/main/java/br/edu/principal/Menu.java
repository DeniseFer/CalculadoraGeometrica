/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.principal;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {
    
    private char opcao;
    private String figura;
    
    
    Scanner sc = new Scanner(System.in);
    /**
   * Este método é utilizado para chamar o menu de opções da calculadora.
   */
    
    public Menu(){
    this.opcao = ' ';
    this.figura = " ";
}
    
    public char chamaMenu1(){
    
    System.out.println("Qual tipo de figura geo você deseja calcular?\n");
    System.out.println("E - Espacial");
    System.out.println("P - Plana\n");
    opcao = sc.next().toUpperCase().charAt(0);
    
    return opcao;
    }
    
    public String chamaMenu2(){
        
    if(opcao == 'E'){
        System.out.println("Qual tipo de figura espacial você deseja calcular?\n");
        System.out.println("Cilindro");
        System.out.println("Cubo");
        System.out.println("Cone");
        System.out.println("Paralelepípedo");
        System.out.println("Tetraedro");
        System.out.println("Prisma");
        System.out.println("Pirâmide");
        System.out.println("Esfera\n");
        figura = sc.next();
        
    }
    else {
        System.out.println("Qual tipo de figura plana você deseja calcular?\n");
        System.out.println("Triângulo");
        System.out.println("Quadrado");
        System.out.println("Retângulo");
        System.out.println("Paralelogramo");
        System.out.println("Trapézio");
        System.out.println("Losango");
        System.out.println("Círculo\n");
        figura = sc.next();
        
    }
    
    return figura;
    }
    
    
}
