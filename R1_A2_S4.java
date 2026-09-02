
package com.mycompany.actividad_r1_a2_s4;

import java.util.Scanner;

/*
Julian Esteban Forero
01/09/2026

 */
// 1 punto
/*public class Actividad_R1_A2_S4 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num1, b;
        System.out.println("Digite un numero: ");
       num1 = cin.nextInt();
       if (num1 % 5 == 0){
           b = 1; 
       }
       else 
           b = 0;
        System.out.println(num1);
        System.out.println(b);
    }
}
// 2 punto
*/
/*public class Actividad_R1_A2_S4 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
       int num1, b;
        System.out.println("Digite un numero: ");
        num1 = cin.nextInt();
        int dec = num1 /10;
        int uni = num1 %10;
        b = dec + uni;
        System.out.println("la suma de:"+dec +" mas "+ uni+" es igual a:"+b);
    }
}*/
// 3 punto
/*
public class Actividad_R1_A2_S4 {

public static void main(String[] args) {
int a = 8, b = 5, c = 3;
int x;

x = (a * 100) + (b * 10) + c;

System.out.println("x = " + x); 
  }
} 
*/
public class Actividad_R1_A2_S4 {

public static void main(String[] args) {
int a = 31742; // valor de ejemplo
int c;

c = (a / 100) % 10;

System.out.println("c = " + c); // 7
  }
} 
