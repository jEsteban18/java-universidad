// programa principal 
public class Appliacacion {

    public static void main(String[] args) {
        Esfera esfera = new Esfera();
        esfera.radio = 1.0;
        Esfera e2 = new Esfera();
        e2.radio = 2.0;
    
   
        System.out.printf("El area de la esfera %6.3f es %8.3f",esfera.radio,esfera.areaE());
        System.out.printf("\nEl volumen de la esfera de la esfera%6.3f es", esfera.volumen());
        System.out.printf("\nEl area de la segunda esfera %6.3f es %8.3f",e2.radio,e2.areaE());
        System.out.printf("\nEl volumen de la esfera de la esfera%6.3f es", e2.volumen());
    }
}


// clase esfera
package com.mycompany.appliacacion;

/**
 *
 * @author ESTUDIANTE
 */
public class Esfera {
    double radio;
    double areaE(){
        return 4.0*Math.PI*Math.pow(radio,2.0);
    }
    double volumen(){
        return (4.0/3.0)*Math.PI*Math.pow(radio,3.0);
    }
    void mostrarAreaVolumen(){
      System.out.printf("El area de la esfera %6.3f es %8.3f",radio,areaE());
        System.out.printf("\nEl volumen de la esfera de la esfera%6.3f es", volumen());
    }
}
