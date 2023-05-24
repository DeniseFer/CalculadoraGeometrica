/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.principal;

import br.edu.figurasgeometricasespaciais.*;
import br.edu.figurasgeometricasplanas.*;
import java.util.Scanner;

/**
* <h1>Calculadora</h1>
* A Calculadora realiza cálculos de área e volume em giruas geométricas planas e espaciais
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Denise Ferreira
* @version 1.0
* @since   01/01/2022
*/
public class Principal {

    public static void main(String[] args) {
        
        Menu menu = new Menu();
        menu.chamaMenu1();
        String figura1 = menu.chamaMenu2();
        
        
        if(figura1 == "T"){ // PROBLEMAS NO IF
            Triangulo obj = new Triangulo();
            obj.setListaAtributos();
            obj.getCalcArea();
            
        }
        else{
            System.out.println(figura1);
        }
        
        /*if( figura == "Cilindro"){
            Cilindro obj = new Cilindro();
            obj.setlistaAtributos();
            obj.getcalcAreaBase();
            obj.getcalcAreaLateral();
            obj.getcalcAreaTotal();
            obj.getcalcVolume();
        } */
        
       
    }
}
