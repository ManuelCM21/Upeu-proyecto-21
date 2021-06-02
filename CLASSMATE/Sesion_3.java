package CLASSMATE;

import java.util.Scanner;

public class Sesion_3 {
    static Scanner tc=new Scanner(System.in);
    
    static void Ejercicio1() {
        System.out.println("--> EJERCICIO 1 <--");
        String mes=" ";
        System.out.print("Ingrese el numero del mes (1 - 12): ");
        int num=tc.nextInt();
        switch(num) {
            case 1: mes="ENERO"; break;
            case 2: mes="FEBRERO"; break;
            case 3: mes="MARZO"; break;
            case 4: mes="ABRIL"; break;
            case 5: mes="MAYO"; break;
            case 6: mes="JUNIO"; break;
            case 7: mes="JULIO"; break;
            case 8: mes="AGOSTO"; break;
            case 9: mes="SEPTIEMBRE"; break;
            case 10: mes="OCTUBRE"; break;
            case 11: mes="NOVIEMBRE"; break;
            default: mes="DICIEMBRE"; break;
        }
        System.out.println("El mes indicado es: "+mes+"\n");
    }

    static void Ejercicio2() {
        System.out.println("--> EJERCICIO 2 <--");
        String romano="";
        System.out.print("Ingrese un numero (1-9): ");
        int n=tc.nextInt();
        switch(n) {
            case 1: romano="I";break;
            case 2: romano="II";break;
            case 3: romano="III";break;
            case 4: romano="IV";break;
            case 5: romano="V";break;
            case 6: romano="VI";break;
            case 7: romano="VII";break;
            case 8: romano="VIII";break;
            case 9: romano="IX";break;
        }
        System.out.println("El numero "+n+" en romano es: "+romano);
    }

    static void Ejercicio3() {
        System.out.println("--> EJERCICIO 3 <--");
        String resul="";
        System.out.print("Ingrese el numero de veces obtenidos (0-3): ");
        int veces=tc.nextInt();
        if (veces>0 && veces<4) {
            if (veces==3) {resul="ORO";}
            if (veces==2) {resul="PLATA";}
            if (veces==1) {resul="BRONCE";}
        }else {resul="PERDIÓ";}
        System.out.println("El puntaje obtenido es: "+resul+"\n");
    }

    static void Ejercicio4() {
        System.out.println("--> EJERCICIO 4 <--");
        System.out.print("Ingrese el sueldo: ");double sueldo=tc.nextDouble();
        System.out.print("Ingrese el tipo de trabajador\n\tO = Obrero\n\tE = Empleado : ");
        char tipo = tc.next().charAt(0);
        System.out.print("Ingrese el sexo\n\tH = Hombre\n\tM = Mujer : ");
        char sexo = tc.next().charAt(0);
        if (sueldo>2000) {
            if (tipo=='O' && sexo=='H') {
                System.out.println("El descuento es de: S/"+sueldo*0.15);}
            if (tipo=='O' && sexo=='M') {
                System.out.println("El descuento es de: S/"+sueldo*0.10);}
            if (tipo=='E' && sexo=='H') {
                System.out.println("El descuento es de: S/"+sueldo*0.20);}
            if (tipo=='E' && sexo=='M') {
                System.out.println("El descuento es de: S/"+sueldo*0.15);}
        }else{System.out.println("No se aplica la politica de descuento\n");}
    }

    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
    }
}