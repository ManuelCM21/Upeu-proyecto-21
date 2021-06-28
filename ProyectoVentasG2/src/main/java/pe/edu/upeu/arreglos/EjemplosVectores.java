package pe.edu.upeu.arreglos;

public class EjemplosVectores {

    static void ejemploVectores() {
        //Definir vectores con valores
        int [] v1={1,2,3,4,5,6,7,8,9,10};   //los indices siempre inician en 0
        System.out.println("v1[3] = "+v1[3]);   //imprimiendo el valor 4 en el indice 3

        //Definiendo el tamaño del vector
        int [] v2=new int [2];
                v2[0]=1;  //Asignando valores en indice 0
                v2[1]=2;  //Asignando valores en indice 1 
        
        //Como saber de que tamaño es el vector
        System.out.println("Tamaño del vector v1 = "+v1.length);
        System.out.println("Tamaño del vector v2 = "+v2.length);
    }

    static void sumaNumPares(int [] v1) {
        int sumaV=0;
        for (int i=0; i<v1.length; i++){
            if (v1[i]%2==0) {
                sumaV+=v1[i];
            }
        }
        System.out.println("La suma de numeros pares es: "+sumaV);
    }

    static void almacenarValorEnVector(){
        int [] v3= new int[20];
        int inicio=10;
        for (int i = 0; i < v3.length; i++) {
            v3[i]=inicio;
            System.out.println("v3 ["+i+"] = "+inicio);
            inicio +=10;
        }
    }

    /*static void vectoresOtrosTiposValores() {
        double [] vA={12.5}, vB={12.5, 14.9}, vC={12.5, 14.9, 45};
        int [] vD={12}, vE={12, 14}, vF={12, 14, 32};
        String [] vG={"A"}, vH={"A", "1"}, vI={"A", "*", "!"};
        char [] vJ={'*'}, vK={'*'};
        Object [] vL={1, "a", 'A', 12.5};
    }*/

    static void tablaMultiplicacion() {
        int [] vA={1,2,3,4,5,6,7,8,9,10};
        int [] vB={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < vA.length; i++) {
            for (int j = 0; j < vB.length; j++) {
                System.out.println("Tabla "+vA[i]+": "+vA[i]+" x "+vB[j]+" = "+(vA[i]*vB[j]));
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ejemploVectores();

        int [] v1={1,2,3,4,5,6,7,8,9,10};
        sumaNumPares(v1);

        almacenarValorEnVector();

        tablaMultiplicacion();
    }
}