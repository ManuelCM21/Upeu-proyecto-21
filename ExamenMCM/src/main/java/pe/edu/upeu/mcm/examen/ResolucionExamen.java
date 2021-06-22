package pe.edu.upeu.mcm.examen;

import pe.edu.upeu.mcm.utils.LeerTeclado;

public class ResolucionExamen {
    LeerTeclado tc = new LeerTeclado();

    public void ejercicio02() {
        System.out.println("\n----> EJERCICIO 2 <-----");
        double suma1=0, suma2=0, suma3=0, impuesto=0;
        try {
        int cont=0;
        while (cont<3) {
            ++cont;
            System.out.println("CATEGORIA "+cont+"");
            int cantidad = tc.leer(0,"Ingrese la cantidad: ");
            double costo = tc.leer(0.0,"Ingrese el costo de los vehiculos: S/.");
            switch (cont) {
                case 1: impuesto=costo*0.12;
                    suma1=impuesto*cantidad; break;
                case 2: impuesto=costo*0.08; 
                    suma2=impuesto*cantidad; break;
                case 3: impuesto=costo*0.05;
                    suma3=impuesto*cantidad; break;
                default: break;
            }
            System.out.println("El impuesto a pagar por vehiculo es: S/."+impuesto+"\n");
        }
        System.out.println("El total a pagar por la categoria 1 es: S/."+suma1);
        System.out.println("El total a pagar por la categoria 2 es: S/."+suma2);
        System.out.println("El total a pagar por la categoria 3 es: S/."+suma3+"\n");
        System.out.println("El total por todos los autos es: S/."+(suma1+suma2+suma3));
        } catch (Exception e) {
            System.out.println("Error en la ejecucion...intente nuevamente!");
            ejercicio02();
        }
    }

    public void ejercicio03() {
        System.out.println("\n-----> EJERCICIO 3 <-----");
        System.out.println("TABLA DE MULTIPLICAR DEL 1 AL 20");
        int i = 0;
        while (i<20) {
            i++;
        for (int j = 1; j <=10; j++) {
            System.out.println("\t"+i+" x "+j+" = "+i*j);
        }System.out.println("");}
    }

    public void ejercicio04() {
        System.out.println("\n-----> EJERCICIO 4 <-----");
        int np=1;
        String numerosp="";
        int n=1;
        int suma=0;
        while(np<5){  //La catidad de numeros perfectos es np
            n++;      //n es el valor inicial
            for(int x=1; x<n; x++){
                if(n % x == 0){
                   suma = suma + x;    //Sumara los divisores
                }
            }
            if(suma == n){
                np = np + 1;
                numerosp = numerosp +suma+",";  //Son los numeros perfectos
                suma=0;
            }else{
                suma=0;
            }
        }
        System.out.println("Numeros perfectos: "+numerosp);
    }

    public void ejercicio05() {
        System.out.println("\n-----> EJERCICIO 5 <-----");
        int a = tc.leer(0,"Introduce la base: ");
        int b = tc.leer(0,"Introduce el exponente: ");
        System.out.print(a+" elevado a la "+b+" es = "+potencia(a, b)+"\n");
    }

    public double potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        } else {
            return base * potencia(base, exponente-1);
        }
    }
}