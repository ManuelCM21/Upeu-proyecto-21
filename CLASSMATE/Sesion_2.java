package CLASSMATE;
import java.util.Scanner;

public class Sesion_2 {
    static Scanner teclado=new Scanner(System.in);

    static void aprobodesapro() {
        System.out.println("--> EJERCICIO 1 <--");
        double not1, not2, not3, promedio=0;
        System.out.print("Ingrese la primera nota: ");
        not1=teclado.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        not2=teclado.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        not3=teclado.nextDouble();
        promedio=(not1+not2+not3)/3;
        if (promedio<13) {
            System.out.println("El alumno esta DESAPROBADO\n");
        } else {
            System.out.println("El alumno esta APROBADO\n");}
    }

    static void numeromayor() {
        System.out.println("--> EJERCICIO 2 <--");
        System.out.print("Ingrese el 1er numero: ");
        int num1=teclado.nextInt();
        System.out.print("Ingrese el 2do numero: ");
        int num2=teclado.nextInt();
        System.out.print("Ingrese el 3er numero: ");
        int num3=teclado.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println("El numero mayor es: "+num1+"\n");}
        else if (num2>num1 && num2>num3){
            System.out.println("El numero mayor es: "+num2+"\n");}
        else {
            System.out.println("El numero mayor es: "+num3+"\n");}
    }

    static void beca() {
        System.out.println("--> EJERCICIO 3 <--");
        System.out.print("Ingrese la edad: ");
        int edad=teclado.nextInt();
        System.out.print("Ingrese el promedio: ");
        double promedio=teclado.nextDouble();
        if (edad>18) {
            if (promedio>=18) {
                System.out.println("Recibira: S/2000.00\n");}
            if (promedio<18 && promedio>=16) {
                System.out.println("Recibira: S/1000.00");} 
            else if (promedio<16 && promedio>=13){
                System.out.println("Recibira: S/500.00\n");} 
            else {
                System.out.println("Recibira una carta\n");}
        }
        if (edad<=18){
            if (promedio>=18) {
                System.out.println("Recibira: S/3000.00\n");} 
            if (promedio<18 && promedio>=16) {
                System.out.println("Recibira: S/2000.00\n");} 
            else if (promedio<16 && promedio>=13){
                System.out.println("Recibira: S/100.00\n");} 
            else {
                System.out.println("Recibira una carta\n");}}
    }

    static void tipotriangulo(){
        System.out.println("--> EJERCICIO 4 <--");
        System.out.print("Ingrese el lado a: ");
        int a=teclado.nextInt();
        System.out.print("Ingrese el lado b: ");
        int b=teclado.nextInt();
        System.out.print("Ingrese el lado c: ");
        int c=teclado.nextInt();
        if (a<b+c || b<a+c || c<a+b){
            if (a==b && b==c) {
                System.out.println("Es un Triangulo Equilatero\n");}
            else if (a!=b && b!=c && a!=c) {
                System.out.println("Es un Triangulo Escaleno\n");
            } else {
                System.out.println("Es un Trinagulo Isosceles\n");}
            } 
    }

    public static void main(String[] args) {
        aprobodesapro();
        numeromayor();
        beca();
        tipotriangulo();
    }
}
