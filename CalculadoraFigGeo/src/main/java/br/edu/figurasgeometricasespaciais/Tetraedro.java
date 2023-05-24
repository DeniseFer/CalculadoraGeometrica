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
public class Tetraedro {
    
    Scanner sc = new Scanner (System.in);
	
	private double areatotal;
	private double aresta;
	private double altura;
	private double volume;
	

	public Tetraedro() {
		areatotal = 0.0;
		altura = 0.0;
		volume = 0.0;
	}
	
	public void calcAreaToral() {
		areatotal = 4 * ((aresta * altura) / 2);
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + areatotal);
		System.out.println(" ");
	}
	
	public void calcVolume() {
		volume = 1/3 * (areatotal / 4);
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + volume);
		System.out.println(" ");
	}

	public void listaAtributos() {
		System.out.println("Digite o valor da altura: ");
		altura  = sc.nextDouble();
		System.out.println("Digite o valor da aresta: ");
		aresta  = sc.nextDouble();

	}
	public double getArea() {
		return areatotal;
	}
	
	public double getVolume() {
		return volume;
	}		
    
}
