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
public class Circulo extends FigurasPlanas{
    
    Scanner sc = new Scanner (System.in);
	private double raio;
	
	
	public Circulo() {
		raio = 0.0;
		
	}
	
	 
	
	public void setListaAtributos() {
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
	}
	
	public void getCalcArea() {
		area = (Math.PI * (raio * raio));
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + area);
		System.out.println(" ");
	}
        
        
}
