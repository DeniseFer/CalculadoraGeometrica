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
public class Cone {
    
    Scanner sc = new Scanner (System.in);
	
	private double g;
	private double raio;
	private double arealateral;
	private double areabase;
	private double areatotal;
	private double altura;
	private double volume;
	
	public Cone (){
		g = 0.0;
		raio = 0.0;
		arealateral = 0.0;
		areabase = 0.0;
		areatotal = 0.0;
		altura = 0.0;
		volume = 0.0;
	}
	
	public void calcAreaLateral() {
		g = Math.sqrt(altura*altura + raio *raio);
		arealateral = raio * Math.PI * g;
		System.out.println("O valor da área lateral é: " + arealateral);
		System.out.println(" ");
	}
	
	public void calcAreaBase() {
		areabase = Math.PI * raio *raio;
		System.out.println("O valor da área da base é: " + areabase);
		System.out.println(" ");
	}
	public void calcAreaTotal() {
		areatotal = areabase + arealateral;
		System.out.println("O valor da área total é: " + areatotal);
		System.out.println(" ");
	}

	
	public void calcVolume() {
		volume = 1/3 * raio * raio *altura * Math.PI;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}
	
	public void listaAtributos() {
		System.out.println("Digite o valor da altura: ");
		altura  = sc.nextDouble();
		System.out.println("Digite o valor do raio: ");
		raio  = sc.nextDouble();

	}
	public double getArea() {
		return areatotal;
	}
	
	public double getVolume() {
		return volume;
	}	
    
}
