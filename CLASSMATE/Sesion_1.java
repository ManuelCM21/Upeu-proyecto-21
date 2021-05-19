package CLASSMATE;

import java.util.Scanner;

public class Sesion_1 {
static Scanner teclado=new Scanner(System.in);

    public static void sumanumerosconsecutivos() {
        System.out.println("--> EJERCICIO 1 <--");
        //Definir variables
        int n, resultado=0;
        //Datos de entrada
        System.out.print("Ingresa la cantidad de numeros: ");
        n=teclado.nextInt();
        //Proceso
        resultado= n*(n+1)/2;
        //Datos de salida
        System.out.println("El resultado es: "+resultado+"\n");
    }

    public static void areadeuncirculo() {
        System.out.println("--> EJERCICIO 2 <--");
        //Definir variables
        double pi=3.14, radio, area;
        //Datos de entrada
        System.out.print("Ingrese el valor del radio: ");
        radio=teclado.nextDouble();
        //Proceso
        area=pi*(Math.pow(radio, 2));
        //Datos de salida
        System.out.println("El area del circulo es: "+area+"\n");
    }

    public static void preciodelarticulo() {
        System.out.println("--> EJERCICIO 3 <--");
        //Definir variables
        int precio;
        double dcto=0.2, IVA=0.15, costo1, preciofinal;
        //Datos de entrada
        System.out.print("Ingrese el precio del articulo: ");
        precio=teclado.nextInt();
        //Proceso
        costo1=precio-(precio*dcto);
        preciofinal=costo1+(precio*IVA);
        //Datos de salida
        System.out.println("El precio con descuento es: "+costo1);
        System.out.println("El precio final a pagar es: "+preciofinal+"\n");
    }

    public static void main(String[] args) {
        sumanumerosconsecutivos();
        areadeuncirculo();
        preciodelarticulo();
    }
}