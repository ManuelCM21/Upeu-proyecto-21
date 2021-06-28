package pe.edu.upeu.arreglos;

public class EjemplosMatrices {
    
    public void conceptosMatrices() {
        //Declarar matriz con datos predifinidos
        int [][] matriz = {{5,6,6},{5,6,2},{5,6,2},{5,6,2}};
        //Declarar una matriz sin datos pero de 3x3
        int [][] matrizX = new int[3][3];
        //Colocamos valores en una matriz en los indices 1,0
            matrizX[1][0] = 12;
        //Obteniedo el valor de los indices
        System.out.println("matrizX[1][0] su valor es: "+matrizX[1][0]);
        //Obteniendo el tamaño de la matriz en filas
        System.out.println("Obtener tamaño en filas: "+matriz.length);
        //Obteniendo el tamaño de la matriz en columnas
        System.out.println("Obtener tamaño en columnas: "+matriz[0].length);
    }

    public void sumarContenidoMatriz() {
        int [][] matriz = {{5,6,6},{5,6,2},{5,6,2},{5,6,2}};
        int sumaValores=0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                sumaValores = sumaValores + matriz[i][j];
            }
        }
        System.out.println("La suma de los valores de la matriz es: "+sumaValores);
    }

    public void sumarContenidoMatrizConParametros(int [][] matriz) {
        int sumaValores=0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                sumaValores = sumaValores + matriz[i][j];
            }
        }
        System.out.println("La suma de los valores de la matriz es: "+sumaValores);
    }

    public void imprimirContenidomatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void imprimirContenidomatriz(double [][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void imprimirContenidomatriz(Object [][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public void imprimirContenidomatriz(String [][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public void registroProduto() {
        Object[][] producto = {
            {"P0001","Manzana",3.5,50},
            {"P0002","Pera",4.6,20},
            {"P0003","Naranja",2,2}};
        imprimirContenidomatriz(producto);
    }

    public void calcularPositivosNegaticosCeros(int[][] matriz){
        int cantPos=0, cantNeg=0, cantCeros=0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if (matriz [i][j]<0) {
                    cantNeg++;
                }else if (matriz [i][j]>0) {
                    cantPos++;
                }else{
                    cantCeros++;
                }
            }
        }
        System.out.println("Cantidad de positivos: "+cantPos);
        System.out.println("Cantidad de negaticos: "+cantNeg);
        System.out.println("Cantidad de ceros: "+cantCeros);
    }

    public static void main(String[] args) {
        EjemplosMatrices EM = new EjemplosMatrices();
        int [][] matriz = {{5,6,6},{5,6,2},{5,6,2},{5,6,2}};

        EM.sumarContenidoMatriz();
        EM.sumarContenidoMatrizConParametros(matriz);
        EM.imprimirContenidomatriz(matriz);
        EM.registroProduto();
        EM.calcularPositivosNegaticosCeros(matriz);
    }
}
