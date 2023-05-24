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
public class Prisma {
    
    Scanner sc = new Scanner (System.in);
	
	private double arestabase;
	private double areabase;
	private double alturaprisma;
	private double alturabase;
	private double areatotal;
	private double arealateral;
	private double volume;

	
	public Prisma() {
		arestabase = 0.0;
		areabase = 0.0;
		alturaprisma = 0.0;
		areatotal = 0.0;
		arealateral = 0.0;
		volume = 0.0;
		alturabase = 0.0;
	}
	
	public void calcAreaBase() {
		alturabase = (arestabase * Math.sqrt(3)) / 2;
		areabase = (arestabase * alturabase) / 2;
		System.out.println("O valor da área da base é: " + areabase);
		System.out.println(" ");
	}
	
	public void calcAreaLateral() {
		arealateral = (3 * arestabase * alturaprisma);
		System.out.println("O valor da área lateral é: " + arealateral);
		System.out.println(" ");
	}

	
	public void calcAreaTotal() {
		areatotal = arealateral + areabase;
		System.out.println("O valor da área é: " + areatotal);
		System.out.println(" ");
	}
	
	public void calcVolume() {
		volume = areabase * alturaprisma;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}

	
	public void ListaAtributos() {
		System.out.println("O valor da aresta da base: ");
		arestabase = sc.nextDouble();
		System.out.println("O valor da altura do prisma: ");
		alturaprisma = sc.nextDouble();
	  
	}
	
	public double getArea() {
		return areatotal;
	}
	
	public double getVolume() {
		return volume;
	}	
    
}
