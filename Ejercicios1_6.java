import java.util.Scanner;

public class Ejercicios1_6 {
    static Scanner teclado=new Scanner(System.in);
    
    public static void Ejercicio1() {
        //Variables y proceso
        System.out.println("--> EJERCICIO 4.1 <--");
        int a=(1500*12);
        double b=0.10;
        int c=6;
        double d=(1500*12)*b;
        //Datos de salida
        System.out.println("Su salario al cabo de 6años es:"+(a*c+d*c));
        System.out.println("Su salario por cada año es:"+(a+d));
        System.out.println("\n");
    }

    public static void Ejercicio2() {
        //Definir variables y otros
        System.out.println("--> EJERCICIO 4.2 <--");
        char tipo;
        double cant=0;
        double total=0;
        //Datos de entrada
        System.out.print("Ingrese el tipo de amburguesa\n\tS = Simple\n\tD = Doble\n\tT = Triple : ");
        tipo=teclado.next().charAt(0);
        System.out.print("Ingrese la cantidad de amburguesas: ");
        cant=teclado.nextDouble();
        //Proceso
        switch(tipo){
            case 'S':{ total=(21*cant);
            } break;
            case 'D':{ total=(26.25*cant);
            } break;
            case 'T':{ total=(29.4*cant);
            } break;
        }
        //Datos de salida
        System.out.println("El monto a pagar es: "+total);
        System.out.println("\n");
    }

    public static void Ejercicio3() {
        System.out.println("--z EJERCICIO 4.3 <--");
        //Definir variables
        int n=0, igual=0, mayor=0, menor=0, total;
        //Datos de Entrada y Proceso
        System.out.print("Cuantos numeros desea ingresar: ");
        total=teclado.nextInt();
        for(int x=1; x<=total; x++){
            System.out.print("\tDame un numero: ");
            n=teclado.nextInt();
            teclado.nextLine();
            if (n==0) {
                igual=igual+ 1;}
            if (n>0) {
                mayor=mayor+ 1;}
            if (n<0) {
                menor=menor+ 1;}
        }
        //Datos de salida
        System.out.println("La cantidad de numeros que son 0 es: "+igual);
        System.out.println("La cantidad de numeros que son mayores a 0 es: "+mayor);
        System.out.println("La cantidad de numeros que son menores a 0 es: "+menor);
        System.out.println("\n");
    }

    public static void Ejercicio4() {
        System.out.println("--> EJERCICIO 4.4 <--");
        int n, color, blanco, rojo, verde, i;
        verde = 0;
        blanco = 0;
        rojo = 0;
        System.out.print("Ingrese la cantidad de focos: ");
        n = teclado.nextInt();
        teclado.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("Selecciona el valor del color\n\t1 = verde\n\t2 = blanco\n\t3 = rojo : ");
            do {
                color = teclado.nextInt();
                teclado.nextLine();
                if (color<1||color>3)
                    System.out.print("Valor incorrecto. Ingrese nuevamente: ");
            } while (color<1||color>3);
            if(color==1){
                verde=verde+1;}
            if(color==2){
                blanco=blanco+1;}
            if(color==3){
                rojo=rojo+1;}
            System.out.println();
        }
        System.out.println("Valor de focos verdes: " +verde);
        System.out.println("Valor de focos blancos: " +blanco);
        System.out.println("Valor de focos rojos: " +rojo);
        System.out.println("\n");
    }

    public static void Ejercicio5() {
        System.out.println("--z EJERCICIO 4.5 <--");
        //Definir variables
        int x; 
        double ahorro;
        ahorro=0;
        //Datos de entrada y Proceso
        for (x=1; x<=365; x++) {
            ahorro = ahorro +Math.pow(3,x);
            System.out.println("El ahorro en el dia "+x+" es: $."+Math.pow(3,x));
        }
        //Datos de salida
        System.out.println("El ahorro en un año es: $."+ahorro);
        System.out.println("\n");
    }

    public static void Ejercicio6() {
        System.out.println("--z EJERCICIO 4.6 <--");
        //Definir variables
        int a=(1500*12);
        double b=0.10;
        int c=6;
        double d=(1500*12)*b;
        int n, x, in, fin;
        //Datos de entrada
        System.out.println("CICLO REPITE");
        System.out.print("Ingrese la cantidad de veces: ");
        n=teclado.nextInt();
        //Datos de salida
        for (x=1; x<=n ; x++) {
            System.out.println("Su salario al cabo de 6años es:"+(a*c+d*c));
            System.out.println("Su salario por cada año es:"+(a+d));
            System.out.println("\n");
        }

        System.out.println("CICLO DESDE");
        System.out.print("Ingrese el valor incial: ");
        in=teclado.nextInt();
        System.out.print("Ingrese el valor final: ");
        fin=teclado.nextInt();
        for (x=in; x<=fin ; x++) {
            System.out.println(" "+x);
            System.out.println("Su salario al cabo de 6años es:"+(a*c+d*c));
            System.out.println("Su salario por cada año es:"+(a+d));
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
        Ejercicio5();
        Ejercicio6();
    }
}