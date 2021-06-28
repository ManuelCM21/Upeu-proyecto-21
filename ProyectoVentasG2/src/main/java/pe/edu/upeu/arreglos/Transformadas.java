package pe.edu.upeu.arreglos;

public class Transformadas {
    
    public void transformada01(int dimension, int valorinicial) {
        int item=0;
        String matriz [][] = new String [dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz.length; colum++) {
                if (colum<dimension-fila) {
                    item=valorinicial+(fila+colum)*(fila+colum+1)/2 + fila ;
                    matriz[fila][colum]=""+item;
                }else{
                    matriz[fila][colum]="";
                }
            }
        }
        imprimirContenidomatriz(matriz);
        System.out.println("");
    }

    public void imprimirContenidomatriz(Object [][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public void transformada02(int dimension, int valorinicial) {
        int item=0;
        String matriz [][] = new String [dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz.length; colum++) {
                if (colum<dimension-fila) {
                    item=valorinicial+(fila+colum)*(fila+colum+1)/2 + colum ;
                    matriz[fila][colum]=""+item;
                }else{
                    matriz[fila][colum]="";
                }
            }
        }
        imprimirContenidomatriz(matriz);
        System.out.println("");
    }

    public void transformada03(int dimension, int valorinicial) {
        int item=0;
        String matriz [][] = new String [dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz.length; colum++) {
                if (colum<dimension-fila) {
                    if ((fila+colum)%2==0) {
                        item=valorinicial+(fila+colum)*(fila+colum+1)/2 + colum;
                        matriz[fila][colum]=""+item;
                    }else{
                        item=valorinicial+(fila+colum)*(fila+colum+1)/2 + fila;
                        matriz[fila][colum]=""+item;
                    }
                } else {
                    matriz[fila][colum]="";
                }
            }
        }
        imprimirContenidomatriz(matriz);
        System.out.println("");
    }

    public void transformada04(int dimension, int valorinicial) {
        int item=0;
        String matriz [][] = new String [dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz.length; colum++) {
                if (colum<dimension-fila) {
                    if ((fila+colum)%2==0) {
                        item=valorinicial+(fila+colum)*(fila+colum+1)/2 + fila;
                        matriz[fila][colum]=""+item;
                    }else{
                        item=valorinicial+(fila+colum)*(fila+colum+1)/2 + colum;
                        matriz[fila][colum]=""+item;
                    }
                } else {
                    matriz[fila][colum]="";
                }
            }
        }
        imprimirContenidomatriz(matriz);
        System.out.println("");
    }

    public static void main(String[] args) {
        Transformadas tm = new Transformadas();

        tm.transformada01(5, 0);
        tm.transformada02(5, 0);
        tm.transformada03(5, 0);
        tm.transformada04(5, 0);
    }
}
