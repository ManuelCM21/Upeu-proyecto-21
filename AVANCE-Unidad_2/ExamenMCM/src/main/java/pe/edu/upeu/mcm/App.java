package pe.edu.upeu.mcm;

import pe.edu.upeu.mcm.examen.ResolucionExamen;
import pe.edu.upeu.mcm.utils.LeerTeclado;

public class App {

    public static void main( String[] args )
    {   
        LeerTeclado tc = new LeerTeclado();
        ResolucionExamen RS = new ResolucionExamen();

        String mensaje="Seleccione el algoritmo que desea ejecutar:"+
        "\n\t2 = --> Ejercicio 2 <--"+
        "\n\t3 = --> Ejercicio 3 <--"+
        "\n\t4 = --> Ejercicio 4 <--"+
        "\n\t5 = --> Ejercicio 5 <--"+
        "\n\t0 = Salir del programa : ";
        System.out.print(mensaje);
        int opcion=0;
        do{
            opcion=tc.leer(0," ");
            switch(opcion){
                case 2: RS.ejercicio02();break;
                case 3: RS.ejercicio03();break;
                case 4: RS.ejercicio04();break;
                case 5: RS.ejercicio05();break;
            }
            if(opcion!=0)
            System.out.print("\nDesea seguir probando..."+mensaje);
        }while(opcion!=0);
    }
}
