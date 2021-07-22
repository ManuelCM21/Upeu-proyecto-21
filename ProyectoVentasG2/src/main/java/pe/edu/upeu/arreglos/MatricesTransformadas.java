package pe.edu.upeu.arreglos;

public class MatricesTransformadas {

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

    public void transformada06(int dimension, int valorinicial) {   
        System.out.println("");
        System.out.println("TRANSFORMADA 6");
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = ""+valorinicial;
                valorinicial++;
            }
        }
        imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada08(int dimension, int valorinicial) {
        System.out.println("");
        System.out.println("TRANSFORMADA 8");
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < (dimension-i); j++) {
                matriz[i][(j+i)] = ""+valorinicial;
                valorinicial++;
            }
        }
        imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada10(int dimension, int valorinicial) {
        System.out.println("TRANSFORMADA 10");
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= i; j++) {
                matriz[i][i-j] = ""+valorinicial;
                valorinicial++;
            }
        }
        Transformadas tm = new Transformadas();
        tm.imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada14(int dimension, int valorinicial) {
        System.out.println("");
        System.out.println("TRANSFORMADA 14");
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= i; j++) {
                matriz[j][i] = ""+valorinicial;
                valorinicial++;
            }
        }
        imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada15(int dimension, int valorinicial) {
        System.out.println("TRANSFORMADA 15");
        String[][] matriz = new String[dimension][dimension];
        for (int j = 0; j < matriz.length; j++){
            for (int i = 0; i <= (dimension-1)-j; i++) {
                matriz[(dimension-1)-i][j] = ""+valorinicial;
                valorinicial++;
            }
        }
        imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada18(int dimension, int valorinicial) {
        System.out.println("");
        System.out.println("TRANSFORMADA 18");
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= i; j++) {
                matriz[j][(dimension-1)-i] = ""+valorinicial;
                valorinicial++;
            }
        }
        imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada20(int dimension, int valorinicial) {
        System.out.println("");
        System.out.println("TRANSFORMADA 20");
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= i; j++) {
                matriz[(dimension-1)-j][(dimension-1)-i] = ""+valorinicial;
                valorinicial++;
            }
        }
        Transformadas tm = new Transformadas();
        tm.imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada22(int dimension, int valorinicial) {
        System.out.println("");
        System.out.println("TRANSFORMADA 22");
        String[][] matriz = new String[dimension][dimension];
        for (int j = 0; j < matriz[0].length; j++){
            if (j%2==0) {
                for (int i = matriz.length-1; i >=0; i--) {
                    matriz[i][j] = ""+valorinicial;
                    valorinicial ++;
                }
            } else {
                for (int i = 0; i <matriz.length; i++) {
                    matriz[i][j] = ""+valorinicial;
                    valorinicial ++;
                }
            }
        }
        imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada27(int dimension, int valorinicial) {
        System.out.println("");
        System.out.println("TRANSFORMADA 27");
        String[][] matriz = new String[dimension][dimension];
        for (int i = matriz.length-1; i >= 0; i--){
            if (i%2==0) {
                for (int j = matriz.length-1; j >=0; j--) {
                    matriz[i][j] = ""+valorinicial;
                    valorinicial ++;
                }
            } else {
                for (int j = 0; j <matriz.length; j++) {
                    matriz[i][j] = ""+valorinicial;
                    valorinicial ++;
                }
            }
        }
        imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public void transformada29(int dimension, int valorinicial) {
        System.out.println("");
        System.out.println("TRANSFORMADA 29");
        String[][] matriz=new String [dimension][dimension]; 
        int a=0, b=dimension-1;
        for (int j = 0; j < matriz.length; j++) { 
            for (int i = a; i <= b; i++) {
                matriz[a][i] = ""+valorinicial;
                valorinicial ++;
            }
            for (int i = a+1; i <= b; i++) {
                matriz[i][b] = ""+valorinicial;
                valorinicial ++;
            }
            for (int i = b-1; i >= a; i--) {
                matriz[b][i] = ""+valorinicial;
                valorinicial ++;
            }
            for (int i = b-1; i >= a+1; i--) {
                matriz[i][a] = ""+valorinicial;
                valorinicial ++;
            }
            a++;b--;
            
        }
        imprimirContenidomatrizCadena(matriz);
        System.out.println("");
    }

    public static void main(String[] args) {
        MatricesTransformadas tm = new MatricesTransformadas();

        tm.transformada06(5, 0);
        tm.transformada08(5, 0);
        tm.transformada10(5, 0);
        tm.transformada14(5, 0);
        tm.transformada15(5, 0);
        tm.transformada18(5, 0);
        tm.transformada20(5, 0);
        tm.transformada22(5, 0);
        tm.transformada27(5, 0);
        tm.transformada29(5, 0);
    }
}
