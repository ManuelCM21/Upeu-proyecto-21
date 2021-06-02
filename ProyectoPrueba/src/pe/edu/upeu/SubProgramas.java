package pe.edu.upeu;

import java.util.Scanner;

public class SubProgramas {
    Scanner teclado=new Scanner(System.in);

    public int factorial(int n) {
        int resultF=1;
        if (n>1) {
            for (int i=1; i<=n; i++) {
                resultF*=i;
            }
        }
        return resultF;
    }

    public double potencia(int x, int i) {
        return Math.pow(x, i);
    }

    public void funcionExponencial() {
        int x, lfx;
        double fx=0;
        System.out.print("Ingrese un numero para calcular la funcion exponencial: ");
        x=teclado.nextInt();
        System.out.print("Ingrese el limite de la funcion exponencial: ");
        lfx=teclado.nextInt();
        if (x!=0) {
            for (int i=0; i<lfx; i++) {
                System.out.print(fx);
                fx=fx+(potencia(x,i)/factorial(i)); 
            }
        }
        System.out.println("La funcion exponencial de e^x es: "+fx);
    }
}