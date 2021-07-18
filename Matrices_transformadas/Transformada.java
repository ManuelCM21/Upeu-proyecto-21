package Matrices_transformadas;

public class Transformada {
    
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

    public void transformada09(int dimension, int valorinicial) {
        System.out.println("");
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimension-j)-1] = ""+valorinicial;
                valorinicial++;
            }
        }
        Transformada tm = new Transformada();
        tm.imprimirContenidomatrizCadena(matriz);
    }
    
    public static void main(String[] args) {
        Transformada tm = new Transformada();

        tm.transformada09(5, 0);
    }
}
