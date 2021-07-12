package pe.edu.upeu;

import java.io.Console;
import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentaDao;
//import pe.edu.upeu.gui.MainGUI;
import pe.edu.upeu.modelo.CategoriaTO;
//import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;


public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("--------------Registro de Categoria de Productos--------------");
        System.out.println("idCateg:"+categ.getIdCateg()+"\tNombre:"+categ.getNombre());
    } 
    
    public static void menuMain(){
        String mensaje="Seleccion el algoritmo que desea ejecutar"+
        "\n\t1  = Registrar Categoria"+
        "\n\t12 = Reportar Categoria"+
        "\n\t2  = Registrar Producto"+
        "\n\t21 = Reportar Producto"+
        "\n\t3  = Realizar Venta"+
        "\n\t31  = Reporte de Ventas en un rango"+
        "\n\t4  = Registrar Usuario"+
        "\n\t0  = Salir del programa : ";
        LeerTeclado lt = new LeerTeclado();
        CategoriaDao dao = new CategoriaDao();
        UtilsX ut = new UtilsX();
        UsuarioDao daoUso = new UsuarioDao();
        VentaDao venDO = new VentaDao();
        ProductoDao daoPro = new ProductoDao();
        int opcion=0;
        opcion=lt.leer(0, mensaje);
        do{
            switch(opcion){
                case 1: ut.clearConsole();dao.crearCategoria();break;
                case 12: ut.clearConsole();dao.reporteCategoria(); break;
                case 2: ut.clearConsole();daoPro.crearProducto(); break;
                case 21: ut.clearConsole();daoPro.reportarProducto(); break;
                case 3: ut.clearConsole();venDO.ventaGeneral();break;
                case 31: ut.clearConsole();venDO.reporteVentasRangoFecha();break;
                case 4: daoUso=new UsuarioDao();daoUso.crearNuevoUsuario();break;
                default: ut.clearConsole();
                System.out.println("La opcion que eligio no existe!"); break;
            }
            if(opcion!=0){
            System.out.println("\n¿Desea seguir probando?");
            opcion=lt.leer(0, mensaje);}
        }while(opcion!=0); 
        if (opcion==0) {
            ut.clearConsole();
        }    
    }

    public static void validarAcceso() {
        LeerTeclado lt = new LeerTeclado();
        Console cons = System.console();
        String usuario = (lt.leer("", "INGRESE SU USUARIO: ")).toUpperCase();
        System.out.print("INGRESE SU CLAVE: ");
        char[] clave = cons.readPassword();
        UsuarioDao usuDao = new UsuarioDao();
        if (usuDao.login(usuario, clave)) {
            menuMain();
        }else {
            System.out.println("Intente nuevamente...");
            validarAcceso();
        }

    }

    public static void main( String[] args ){
        validarAcceso();
        //menuMain();
    }
}