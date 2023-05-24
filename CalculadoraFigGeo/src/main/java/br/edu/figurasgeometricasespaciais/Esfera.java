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
public class Esfera {
    
    Scanner sc = new Scanner (System.in);
	
	private double raio;
	private double area;
	private double volume;

	
	public Esfera() {
		area = 0.0;
		raio = 0.0;
		volume = 0.0;
	}
	
	public void calcAreaTotal() {
		area = 4 * Math.PI * raio * raio;
		System.out.println("O valor da área é: " + area);
		System.out.println(" ");
	}
	
	public void calcVolume() {
		volume = 4/3 * Math.PI * raio * raio * raio;
		System.out.println("O valor do volume é: " + volume);
		System.out.println(" ");
	}
	
	public void listaAtributos() {
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
	}
	public double getArea() {
		return area;
	}
	
	public double getVolume() {
		return volume;
	}	
    
}
