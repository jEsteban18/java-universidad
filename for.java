
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {
    public static void main(String[] args) {
   
        int aco=0;
        int cuadrado = 0;
        int cubo = 0; 
        System.out.println("num  cuadrado  cubo");
        for (int x = 0; x<=10;x++){
            aco = aco+x;
            cuadrado = cuadrado+x*x;
            cubo = cubo+ x*x*x;
            
            System.out.printf("%4d %4d %4d \n" ,x,x*x,x*x*x);
            
                
        }
        System.out.printf("%4d %4d %4d",aco, cuadrado,cubo);
    }
}
