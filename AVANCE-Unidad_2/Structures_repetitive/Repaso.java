package Structures_repetitive;
import java.util.Scanner;

public class Repaso {
    static Scanner teclado = new Scanner(System.in);
    static int a=10;
    static double b=5;
    char c='A';
    short d;
    long e;
    float f;
    String g="";

    public static void saludo() {
        System.out.println("Dime tu nombre:");
        String nombre=teclado.next();
        System.out.println("Hola "+nombre);
    }

    public static void espacio() {
        System.out.println("");}

    public static void operacionBasicas() {
        System.out.println("Suma: "+(a+b));
        System.out.println("Resta: "+(a-b));
        System.out.println("Division: "+(a/b));
        System.out.println("Multiplicacion: "+(a*b));
        System.out.println("Potencia: "+(Math.pow(a, b)));
    }

    public static void operacionBasicas2() {
        System.out.println("Suma: "+(a+b));
        System.out.println("Resta: "+(a-b));
        System.out.println("Division: "+(a/b));
        System.out.println("Multiplicacion: "+(a*b));
        System.out.println("Potencia: "+(Math.pow(a, b)));
    }

    public static void menuMain(){
        String mensaje="Seleccion el algoritmo que desea ejecutar:"+
        "\n1=operacionBasicas"+
        "\n2=operacionBasicas2"+
        "\n0=Salir del programa";
        System.out.println(mensaje);
        int opcion=0;
        do{
            opcion=teclado.nextInt();
            switch(opcion){
                case 1: operacionBasicas();break;
                case 2: operacionBasicas2();break;
            }
            if(opcion!=0){
            System.out.println("\n Desea seguir probando: "+mensaje);}
        }while(opcion!=0);
    }

    public static void main(String[] args) {
        //saludo();
        //espacio();
        //operacionBasicas();
        //operacionBasicas2();
        menuMain();
    }
    
}
