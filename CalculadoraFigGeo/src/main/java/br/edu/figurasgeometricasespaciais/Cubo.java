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
public class Cubo {
    
    Scanner sc = new Scanner (System.in);
	
	private double aresta;
	private double area;
	private double volume;

	
	public Cubo() {
		area = 0;
		aresta = 0;
		volume = 0.0;
	}
	
	
	public void calcAreaTotal() {
		area = (aresta * aresta) * 6;
		System.out.println("O valor da área é: " + area);
		System.out.println(" ");
	}
	
	public void calcVolume() {
		volume = (aresta * aresta  * aresta);
		System.out.println("O valor da área é, em um método sem retorno e sem parâmetro é: " + volume);
		System.out.println(" ");
	}

	public void listaAtributos() {
		System.out.println("Digite o valor da aresta: ");
		aresta = sc.nextDouble();

	}
	
	public double getArea() {
		return area;
	}

	public double getVolume() {
		return volume;
	}
	
    
}
