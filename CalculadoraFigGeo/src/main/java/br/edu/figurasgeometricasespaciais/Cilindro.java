/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.figurasgeometricasespaciais;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cilindro {
    

	Scanner sc = new Scanner(System.in);
	
	private double raio;
	private double altura;
	
	static double areaBase;
	static double areaLateral;
	static double areaTotal;
	static double volume;
	

	
	
	public Cilindro(){
		this.raio = 0.0;
		this.altura = 0.0;
	}

	
	public void setlistaAtributos() {
		System.out.println("Digite o valor da altura:\n");
		altura = sc.nextDouble();
		
		System.out.println("Digite o valor do raio:\n");
		raio = sc.nextDouble();
		
		System.out.println("\nValor da altura: "+altura);
		
		System.out.println("Valor do raio: "+raio);
		
		
	}
	
	
	public void getcalcAreaBase() {
		areaBase = Math.PI * Math.pow(raio, 2);
		System.out.println("Área da base: "+new DecimalFormat(".##").format(areaBase));
		
	}
	
	
	public void getcalcAreaLateral() {
		areaLateral = 2* Math.PI * raio * altura;
		System.out.println("Área lateral: "+new DecimalFormat(".##").format(areaLateral));
		
	}
	
	public void getcalcAreaTotal() {
		areaTotal = areaLateral + areaBase;
		System.out.println("Área total: "+new DecimalFormat(".##").format(areaTotal));
		
	}
	
	
	public void getcalcVolume() {
		volume = areaBase * altura;
		System.out.println("Volume: "+new DecimalFormat(".##").format(volume));
		
	}
	
}
    

