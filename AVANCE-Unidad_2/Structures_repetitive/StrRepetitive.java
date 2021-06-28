package Structures_repetitive;
import java.util.Scanner;

/*
 * StrRepetitive
 */
public class StrRepetitive {

    static Scanner teclado=new Scanner(System.in);

    public static void saludo() {
        System.out.println("Hola como estas?");
    }
    public static void name5() {
        System.out.println("Probando");
    }
    
    public static void suma10numMientras() {
        //Definir variables
        int contador=0;
        double numeros, sumanumeros=0;
        //Datos de entrada y proceso 
        while(contador<10){     //++contador    contador++
            System.out.println("Ingrese el valor de la posicion "+(++contador)+":");
            numeros=teclado.nextDouble();
            sumanumeros=sumanumeros+numeros;

        }
        //Datos de salida
        System.out.println("La suma de los 10 numeros es:"+sumanumeros);
    }

    public static void suma10NumerosHacerMientras() {
        //definir Variables
          int contador=0;
          double numeros, sumaNumeros=0;
          //Datos de Entrada y proceso
         do{  //++contador    contador++
              System.out.println("Ingrese el valor de la posicion "+(++contador)+":");
              numeros=teclado.nextDouble();
              sumaNumeros=sumaNumeros+numeros;
              
          } while(contador<10);
          //Datos de salida
          System.out.println("La suma de los 10 numeros es:"+sumaNumeros);        
      }

    public static void suma10NumerosParaHasta() {
        //definir Variables
          double numeros, sumaNumeros=0;
          //Datos de Entrada y proceso
          for(int contador=1;contador<=10; contador++){
              System.out.println("Ingrese el valor de la posicion "+(contador)+":");
              numeros=teclado.nextDouble();
              sumaNumeros=sumaNumeros+numeros;              
          }
          //Datos de salida
          System.out.println("La suma de los 10 numeros es:"+sumaNumeros);        
      }

    public static void numerospareshasta100() {
        for(int contador=0;contador<100; contador++){
            if (contador%2==0) {
                System.out.println("El numero "+contador+" es un numero par");}
        }
    }

    public static void numeroFibonaci() {
        int numAnt=0, numNue=1, numTem=0, contador=1;
        System.out.println("Ejercicio Fibonaci");
        int numFinal=teclado.nextInt();
        while (contador<numFinal) {
            numTem=numNue;
        numNue=numAnt+numNue;
        numAnt=numTem;     
        contador++;
        //System.out.println("El numero Fibonci es:"+numNue);
      }
        System.out.println("Numero fibonaci de "+numFinal+" es: "+numNue);
        }

    public static void main(String[] args) {
       /* System.out.println("Hola");
        saludo();
        name5(); */
        //suma10NumerosMientras();
        suma10NumerosHacerMientras();
        suma10NumerosParaHasta();
        numerospareshasta100();
        numeroFibonaci();
    }
}