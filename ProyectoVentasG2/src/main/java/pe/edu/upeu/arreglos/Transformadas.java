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

    public void imprimirContenidomatrizCadena(String [][] matriz) {
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }  
            }
            System.out.println("");
        }
    }

    public String [][] transformada05(int dimension, int valorinicial) {
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimension-1)-j] = ""+valorinicial;
                valorinicial++;
            }
        }
        return matriz;
    }

    public void transformada12(int dimension, int valorinicial) {
        System.out.println("");
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= (dimension-1)-i; j++) {
                matriz[i][(dimension-1)-j] = ""+valorinicial;
                valorinicial++;
            }
        }
        Transformadas tm = new Transformadas();
        tm.imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada21(int dimension, int valorinicial) {
        String[][] matriz = new String[dimension][dimension];
        for (int j = 0; j < matriz[0].length; j++){
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j] = ""+valorinicial;
                    valorinicial ++;
                }
            } else {
                for (int i = matriz.length-1; i >= 0; i--) {
                    matriz[i][j] = ""+valorinicial;
                    valorinicial ++;
                }
            }
        }
        Transformadas tm = new Transformadas();
        tm.imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public static void main(String[] args) {
        Transformadas tm = new Transformadas();

        tm.transformada01(5, 0);
        tm.transformada02(5, 0);
        tm.transformada03(5, 0);
        tm.transformada04(5, 0);
        tm.imprimirContenidomatrizCadena(tm.transformada05(5, 0));
        tm.transformada12(5, 0);
        tm.transformada21(5, 0);
    }
}
