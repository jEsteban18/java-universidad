
package com.mycompany.mavenproject1;

import java.util.Scanner;

/*crear arreglos 
es una secuencias de cadenas de caracteres
*/

public class Mavenproject1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite una edad: ");

//aregglos 
int a[] = {1,2,3};
String s[]={"Marcos","julian", "julian"};
String titulo= "ALUMNOS"; 
    System.out.printf("%15s%n",titulo);
    /*System.out.printf("%18s%n", "nombre  edad");
    int i = 0;
    while(i < n){
        System.out.printf("\t%-10s %d%n ",s[i], a[i] );
        i++;
    }  
*/
  int n=5; 
    for (int i = 0;i<n;i++){
    System.out.printf("\t %-10s %4d %n ",s[i], a[i]);
    }
    }
}
