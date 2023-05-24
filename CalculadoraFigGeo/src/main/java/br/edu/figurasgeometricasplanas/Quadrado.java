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
public class Quadrado extends FigurasPlanas{
    
    Scanner sc = new Scanner(System.in);
    private double lado;
    
    // MÉTODOS
    
    public Quadrado(){  
	this.lado = 0.0;
	}
    
    
    public void setlistaAtributos(){
        lado = sc.nextDouble();
        System.out.println("\nLado do quadrado: " + lado);
    }
    
    
    public  void getCalcArea() {
	double area = Math.pow(lado, 2);
	}
    
}
