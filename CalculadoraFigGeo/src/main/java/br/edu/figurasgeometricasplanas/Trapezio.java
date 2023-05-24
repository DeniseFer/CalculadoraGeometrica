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
public class Trapezio extends FigurasPlanas{
    
    Scanner sc = new Scanner (System.in);
	private double bmaior;
	private double bmenor;
	private double altura;
	
	 
	
	public void setListaAtributos() {
		System.out.println("Digite o valor da base maior: ");
		bmaior = sc.nextDouble();
		System.out.println("Digite o valor da base menor: ");
		bmenor = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextDouble();  
	}
	
	public void getCalcArea() {
		area = ((bmaior + bmenor)*altura) / 2;
		System.out.println("Área do trapézio: " + area);
		
	}
    
}
