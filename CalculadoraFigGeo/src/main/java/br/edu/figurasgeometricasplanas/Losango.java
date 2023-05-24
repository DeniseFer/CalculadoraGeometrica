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
public class Losango extends FigurasPlanas{
    
    Scanner sc = new Scanner (System.in);
	private double dmaior;
	private double dmenor;
	
	
	public Losango() {
		dmaior = 0.0;
		dmenor = 0.0;
		
	}
	
	 
	public void setListaAtributos() {
		System.out.println("Digite o valor da diagonal maior : " );
		dmaior = sc.nextDouble();
		System.out.println("Digite o valor da diagonal menor : " );
		dmenor = sc.nextDouble();
	  
	}
        
        public void getCalcArea() {
		area = (dmaior * dmenor) / 2;
		System.out.println("Área do Losango: " + area);
		
	}
	
    
}
