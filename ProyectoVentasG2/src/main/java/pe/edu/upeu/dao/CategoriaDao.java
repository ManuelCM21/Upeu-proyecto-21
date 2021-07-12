package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

/**
 * CategoriaDao
 */
public class CategoriaDao extends AppCrud{
    LeerArchivo lar;
    CategoriaTO catTO;
    LeerTeclado lt = new LeerTeclado();
    UtilsX ut = new UtilsX();

    public Object [][] crearCategoria() {
        catTO = new CategoriaTO();
        System.out.println("------------------Registro de Categoria------------------");
        lar = new LeerArchivo("Categoria.txt");
        catTO.setIdCateg(generarId(lar, 0, "C", 1));
        catTO.setNombre(lt.leer("", "Ingrese nombre de la categoria: "));
        return agregarContenido(lar,catTO);
    }

    public void reporteCategoria(Object[][] data) {
        System.out.println("------------------Reporte de Categoria------------------");
        //lar = new LeerArchivo("Categoria.txt");
        //listarContenido(aq);
        imprimirLista(data);
        
    }

    public void reporteCategoria() {
        ut.pintarLine('H',14);
        System.out.println("---- REPORTE DE CATEGORIA ---");
        lar = new LeerArchivo("Categoria.txt");
        Object[][] data = listarContenido(lar);
        String dataX="";
        ut.pintarLine('H', 14);
        ut.pintarTextHeadBody('H', 3, "ID,NOMBRE");
        System.out.println("");
        ut.pintarLine('H', 14);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (j==0) {
                    dataX +=""+data[i][j];
                }else {
                    dataX +=","+data[i][j];
                }
            }
            ut.pintarTextHeadBody('B', 3, dataX);
            dataX = "";
        }
        
    }
    
}