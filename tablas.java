
package com.mycompany.proyecto15_08_26;

import java.util.Scanner;

/**
programa en java para crear todas las tablas 
 */
public class Proyecto15_08_26 {

    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    int  i,j;
    i = 1;
   
    while(i <=10){
        j=1;
        System.out.println("la tabla del "+i);
        while(j<=10){
            System.out.println(i+"*"+j+"="+(i*j));
            j++;
        }
    i++;
    }  
        
    }
}
