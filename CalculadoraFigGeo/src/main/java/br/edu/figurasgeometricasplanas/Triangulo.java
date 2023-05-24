/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Triangulo extends FigurasPlanas{
    
    Scanner sc = new Scanner(System.in);
    //atributos
	private double base;  // encapsulei atributos
	private double altura;
	

	//construtor
	public Triangulo(){
	this.base  = 0.0;
	this.altura = 0.0;
	
	}

        public void setListaAtributos(){
               System.out.println("Digite o valor da base: ");
	       base = sc.nextDouble();
               System.out.println("Digite o valor da altura: ");
	       altura = sc.nextDouble();	
               System.out.println("\nBase do triângulo:" + base);
	       System.out.println("Altura do triângulo:" + altura);
	}
        
	//metodos
        
	public void getCalcArea(){
	area = (base*altura)/2;
       System.out.println("Área Triângulo: "+area);
	}
    
}
