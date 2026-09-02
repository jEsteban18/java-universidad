/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto15_08_26;

import java.util.Scanner;

/**
 pedir una variable donde van a preguntar 
 * si quieren calcular el area o el perimetro 
 solicitar el radeo del circulo
 * @author ESTUDIANTE
 */
public class Proyecto15_08_26 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    char tipo;
    double resultado, r;
        System.out.println("ingrese a o b");
        tipo = cin.next().charAt(0);
        System.out.println("ingrese el radio");
        r = cin.nextDouble();
        resultado = (tipo == 'a')? 3.1415*r*r: 2*3.1415*r;
        System.out.println(resultado);
        
        
    }
}
