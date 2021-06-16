package CLASSMATE;
import java.util.Scanner;

public class Sesion_4 {
    static Scanner tc=new Scanner(System.in);

    static void ejercicio01(){
        System.out.println("--> EJERCICIO 1 <--");
        System.out.print("Introduzca el valor minimo: ");
        int min = tc.nextInt();
        System.out.print("Introduzca el valor maximo: ");
        int max = tc.nextInt();
        String pares="", impares="";
        int contador1=0, contador2=0;
        for(int i=min;i<=max;i++){
            if(i%2==0){
                pares +=(" "+i);
                contador1=contador1+1;
            }else {impares +=" "+i;
                contador2=contador2+1;}
        }
        System.out.print("Pares: "+pares+"\n\tCantidad: "+contador1);
        System.out.print("\nImpares: "+impares+"\n\tCantidad: "+contador2+"\n");
    }

    static void ejercicio02() {
        System.out.println("\n--> EJERCICIO 2 <--");
        int cont=0, cont2=0;
        System.out.print("Introduzca el valor incial: ");
        int min = tc.nextInt();
        System.out.print("Introduzca el valor final: ");
        int max = tc.nextInt();
        System.out.print("Introduzca el #: ");
        int n = tc.nextInt();
        for (int i = min; i<=max; i++) {
            if (i%n==0) {
                cont=cont+1;
            }else{cont2=cont2+1;}}
        System.out.println(+cont+" numeros son multiplos de "+n);
        System.out.println(+cont2+" numeros no son multiplos de "+n);
        }
        
    public static void main(String[] args) {
        ejercicio01();
        ejercicio02();
    }
}