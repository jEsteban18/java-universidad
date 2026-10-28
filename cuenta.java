
package com.mycompany.cuenta_bancaria;


public class Cuenta {
private int numCuenta;
private String nomCuenta;
private double saldo;
public Cuenta(int num,String nom,double s){
    numCuenta = num;
    nomCuenta = nom;
    saldo = s;
}
int mostrarNumCuenta(){
    return numCuenta;
    
}
String mostrarNomCuenta(){
    return nomCuenta;
}
double mostarSaldo(){
return saldo;
}
void consignar(double valor){
saldo += valor;

}
void retiro(double valor){
    if(saldo >= valor){
    saldo -= valor;
    }
 
     
}      
 void transaccion(Cuenta nuevaC,double valor){
     if(saldo>= valor){
     saldo -= valor;
     nuevaC.consignar(valor);
     }
}        
}
