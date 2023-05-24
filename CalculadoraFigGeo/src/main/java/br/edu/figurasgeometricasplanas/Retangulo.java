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
public class Retangulo extends FigurasPlanas{
    Scanner sc = new Scanner (System.in);
	private double base;
	private double altura;
	private double area;
	
	public Retangulo() {
		base = 0.0;
		altura = 0.0;
		
	}
	


	public void setListaAtributos() {
		System.out.println("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble(); 
	}
	
        public void getCalcArea(){
		area = (base * altura);
		System.out.println("Área do Retângulo: " + area);
		
	}
	 
        
        
}
