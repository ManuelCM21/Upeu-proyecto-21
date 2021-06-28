package CLASSMATE;

import java.util.Scanner;

/**
 * Sesion_5
 */
public class Sesion_5 {
    static Scanner tc=new Scanner(System.in);

    static double suma(int a, int b) {
        int resultado=a+b;
        return resultado;
    }
    static double resta(int a, int b) {
        int resultado=a-b;
        return resultado;
    }
    static double multiplicacion(int a, int b) {
        int resultado=a*b;
        return resultado;
    }
    static double division(int a, int b) {
        int resultado=a/b;
        return resultado;
    }
    static void operacionesBasicas() {
        System.out.println("Ingrese el primer numero: ");
        int a = tc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = tc.nextInt();
        System.out.println("La suma es: "+suma(a,b));
        System.out.println("La suma es: "+resta(a,b));
        System.out.println("La suma es: "+multiplicacion(a,b));
        System.out.println("La suma es: "+division(a,b));

    }

    public static void main(String[] args) {
        operacionesBasicas();
    }
}