import java.util.Scanner;

public class Repaso {
    static Scanner objTecla1 = new Scanner(System.in); 
    static int a=10;
    static double b=5;
    char c='A';
    short d;
    long e;
    float f;
    String g="";

    public static void saludo() {
        System.out.println("Dime tu nombre:");
        String nombre=objTecla1.next();
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

    public void operacionBasicas2() {
        System.out.println("Suma: "+(a+b));
        System.out.println("Resta: "+(a-b));
        System.out.println("Division: "+(a/b));
        System.out.println("Multiplicacion: "+(a*b));
        System.out.println("Potencia: "+(Math.pow(a, b)));
    }

    public static void main(String[] args) {
        //saludo();
        espacio();
        //operacionBasicas();
        
        Repaso objtR=new Repaso();
        objtR.operacionBasicas2();
    }

}
