/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.figurasgeometricasespaciais;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Paralelepipedo {
    
    Scanner sc = new Scanner (System.in);
	
	private double aresta1;
	private double aresta2;
	private double areabase;
	private double altura;
	private double areatotal;
	private double arealateral;
	private double volume;

	
	public Paralelepipedo() {
		aresta1 = 0.0;
		aresta2 = 0.0;
		areabase = 0.0;
		altura = 0.0;
		areatotal = 0.0;
		arealateral = 0.0;
		volume = 0.0;
	}
	
	public void calcAreaBase() {
		areabase = (aresta1 * aresta2);
	}
	public void calcAreaLateral() {
		arealateral = (2 * (aresta1 * altura)) + (2 * (aresta2 * altura));
	}

	
	public void calcAreaTotal() {
		areatotal = arealateral * 2 *areabase;
		System.out.println("O valor da área é: " + areatotal);
		System.out.println(" ");
	}
	
	public void calcVolume() {
		volume = areabase * altura;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}

	 

	
	public void ListaAtributos() {
		System.out.println("O valor da primeira aresta da base: ");
		aresta1 = sc.nextDouble();
		System.out.println("O valor da segunda aresta da base: ");
		aresta2 = sc.nextDouble();
		System.out.println("O valor da altura do prisma: ");
		altura = sc.nextDouble();
	  
	}
	
	public double getArea() {
		return areatotal;
	}
	
	public double getVolume() {
		return volume;
	}	
    
}
