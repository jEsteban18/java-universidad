/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;


public class Mavenproject3 {

    public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
String a;
a = sc.nextLine();
String z = "numero" ;
String x ="palabra";
String c ="longitud";
 System.out.printf("%30s%15s%10s",z,x,c);
String arreglo[] = a.split(" ");
        System.out.println("");
for(int l=0;l<arreglo.length;l++){
    System.out.printf("%30d%15s%3d%n",l,arreglo[l], arreglo[l].length());
            
}

    
           }
}
