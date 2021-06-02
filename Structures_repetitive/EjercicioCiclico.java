package Structures_repetitive;
import java.util.Scanner;

public class EjercicioCiclico {
    static Scanner teclado=new Scanner(System.in);

    public static void identificarColorFoco() {
        //definir Variables
        int nFocos, fVerde=0, fBlanco=0, fRojo=0;
        //Datos de entrada
        System.out.println("Ingrese N cantidad de Focos:");
        nFocos=teclado.nextInt();
        //Proceso
        for (int foco = 1; foco <= nFocos; foco++) {
            System.out.print("Ingrese el color (V=Verde, B=Blanco y R=Rojo)"+
            "del foco # "+foco+":");
            String color=teclado.next();
            if(color.toUpperCase().equals("V")){ fVerde++; }
            if(color.toUpperCase().equals("B")){ fBlanco=fBlanco+1; }
            if(color.toUpperCase().equals("R")){ fRojo+=1; }
            System.out.println("");
        }
        //Datos de salida
        System.out.println("Del total de focos:\n"+fVerde+" son Verde(s)\n"+
        fBlanco+" son Blanco(s)\n"+fRojo+" son Rojo(s)\nEn total son:"+nFocos);
    }

    public static void main(String[] args) {
        identificarColorFoco();
    }
}
