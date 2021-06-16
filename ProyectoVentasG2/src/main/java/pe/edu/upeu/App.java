package pe.edu.upeu;

import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.modelo.CategoriaTO;
//import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;

/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("--------------Registro de Categoria de Productos--------------");
        System.out.println("idCateg:"+categ.getIdCateg()+"\tNombre:"+categ.getNombre());
    }   

    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        LeerTeclado lt = new LeerTeclado();
        CategoriaTO ca = new CategoriaTO();
        
        ca.setIdCateg(lt.leer("", "Ingrese el id Categoria"));
        ca.setNombre(lt.leer("", "Ingrese el nombre Categoria"));
        registrarCategoria(ca);

        //ProductoTO pto = new ProductoTO();
        //pto.setIdProducto(lt.leer("", "Ingrese el nombre producto"));

        new MainGUI();
    }
}
