import java.util.Scanner;

public class Ejercicios7_10 {
    static Scanner teclado=new Scanner(System.in);

    public static void Ejercicio7() {
        System.out.println("--> EJERCICIO 4.8 <-- ");
        //Definir variables
        int n;
        double precio=0, descuento=0, total;
        //Datos de entrada
        System.out.print("Ingrese la cantidad de articulos: ");
        n=teclado.nextInt();
        total=0;
        //Proceso
        while(n>0){
            precio=0;
            descuento=0;
            System.out.println("Ingresa el precio del articulo "+n+": ");
            precio=teclado.nextInt();
            if (precio>=200) {
                descuento=precio*0.15;}
            if (precio>100 || precio<200) {
                descuento=precio*0.12;
            } else if (precio<100){
                descuento=precio*0.10;}
            System.out.println("El precio del articulo con descuento es: $"+(precio-descuento));
            System.out.println("El descuento aplicado es: $"+descuento);
            total=total+(precio-descuento);
            n=n-1;
            }
        //Datos de salida
        System.out.println("El total a pagar es: $"+total);
        System.out.println("\n");
    }

    public static void Ejercicio8() {
        System.out.println("--> EJERCICIO 4.9 <--");
        //Definir variables
        int años, x;
        double ahorro, total, interes;
        //Datos de entrada
        System.out.print("Ingrese los años que depositara el ahorro: ");
        años=teclado.nextInt();
        total=0;
        interes=0;
        //Proceso
        while(años>0){
            for(x=1; x<=12; x++){
                System.out.print("Ingresa el ahorro del mes "+x+": $.");
                ahorro=teclado.nextInt();
                total=total+ahorro;
            }
            interes=interes+(total*0.10);
            años=años-1;
            System.out.println("El interes anual es: $."+interes);
            System.out.println("La inversion final es: $."+(total-interes));
        }
        System.out.println("\n");
    }

    public static void Ejercicio9() {
        System.out.println("--> EJERCICIO 4.10 <--");
        //Definir variables
        int num, contador;
        double valx, total, fac, c;
        //Datos de entrada
        System.out.print("Ingrese las repeticiones de la serie: ");
        num=teclado.nextInt();
        System.out.print("Ingrese el valor de x: ");
        valx=teclado.nextDouble();
        total=0;
        //Proceso
        for (contador=1; contador<=num; contador++){
            c=1;
            fac=1;
            while (c<=contador){
                fac=fac*c;
                c=c+1;
            }
            total=total+(valx*contador)/fac;
        }
        System.out.println("El resultado final de la serie es: "+total);
    }

    public static void Ejercicio10() {
        System.out.println("--> EJERCICIO 4.14");
        //Definir variables
        int n=0, aprobado=0, desaprobado=0;
        double nota;
        //Datos de entrada
        System.out.print("Ingrese el numero de alumnos: ");
        n=teclado.nextInt();
        //Proceso
        while(n>0){
            System.out.print("Ingrese la nota del alumno "+n+ ": ");
            nota=teclado.nextDouble();
        if (nota>=13) {
            aprobado=aprobado+1;}
        if (nota<13) {
            desaprobado=desaprobado+1;}
            n=n-1;
        }
        //Datos de salida
        System.out.println("Los alumnos aprobados son: "+aprobado);
        System.out.println("Los alumnos desaprobados son: "+desaprobado);
    }

    public static void main(String[] args) {
        //Ejercicio7();
        //Ejercicio8();
        Ejercicio9();
        //Ejercicio10();
    }
}
