package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class VentaDao extends AppCrud {
    LeerArchivo lea;
    ProductoTO prodTO;
    VentaTO venTO;
    VentaDetalleTO vdTO;
    LeerTeclado lt = new LeerTeclado();
    UtilsX ut = new UtilsX();

    SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");

    public void ventaGeneral() {
        String venta = "SI";
        VentaTO vent = registroVenta();
        double preciototal=0;
        do {
            VentaDetalleTO vt = registroDetalleVenta(vent);
            preciototal = preciototal+vt.getPrecioTotal();
            System.out.println("");
            venta = lt.leer("", "Desea algo mas (SI = S / NO = N)? : ").toUpperCase();
        }while (venta.charAt(0)=='S');
        vent.setPrecioTotal(preciototal);
        vent.setNetoTotal((Math.round((vent.getPrecioTotal()/1.18)*100.0)/100.0));
        vent.setIgv((Math.round((vent.getNetoTotal()*0.18)*100.0)/100.0));
        lea = new LeerArchivo("Venta.txt");
        ut.pintarLine('H',33);
        System.out.println("| Precio Neto: S/."+vent.getNetoTotal()+" | IGV: S/."+vent.getIgv()+
        " | Total a pagar: S/."+vent.getPrecioTotal()+" |");
        ut.pintarLine('H',33);
        editarRegistro(lea, 0, vent.getIdVenta(), vent);
    }

    public VentaTO registroVenta() {
        lea = new LeerArchivo("Venta.txt");
        venTO = new VentaTO();
        venTO.setIdVenta(generarId(lea, 0, "V", 1));
        venTO.setDniCliente(lt.leer("", "Ingrese el DNI del cliente: "));
        venTO.setFechaVenta(formato.format(new Date()));
        venTO.setIgv(0.0);
        venTO.setNetoTotal(0.0);
        venTO.setPrecioTotal(0.0);
        lea = new LeerArchivo("Venta.txt");
        agregarContenido(lea, venTO);
        return venTO;
    }

    public VentaDetalleTO registroDetalleVenta(VentaTO vTO) {
        mostrarProductos();
        vdTO = new VentaDetalleTO();
        lea = new LeerArchivo("VentaDetalle.txt");
        vdTO.setIdVentaDetalle(generarId(lea, 0, "VD", 2));
        vdTO.setIdProducto(lt.leer("", "Ingrese ID producto: ").toUpperCase());
        vdTO.setIdVenta(vTO.getIdVenta());
        LeerArchivo lar = new LeerArchivo("Producto.txt");
        Object[][] dataProd = buscarContenido(lar, 0, vdTO.getIdProducto());
        double porcentUt = Double.parseDouble(String.valueOf(dataProd[0][5]));
        double precioUnit = Double.parseDouble(String.valueOf(dataProd[0][4]));
        vdTO.setPorceUtil(Double.parseDouble(String.valueOf(dataProd[0][5])));
        vdTO.setPorceUtil(porcentUt);
        vdTO.setCantidad(lt.leer(0.0, "Ingrese Cantidad: "));
        vdTO.setPrecioUnit((Math.round((precioUnit+precioUnit*porcentUt)*100.0)/100.0));
        vdTO.setPrecioTotal((Math.round((vdTO.getCantidad()*vdTO.getPrecioUnit())*100.0)/100.0));
        lea = new LeerArchivo("VentaDetalle.txt");
        agregarContenido(lea, vdTO);
        return vdTO;
    }

    public void mostrarProductos() {
        System.out.println("");
        lea = new LeerArchivo("Producto.txt");
        Object[][] data = listarContenido(lea);
        for (int i = 0; i < data.length; i++) {
            if (Double.parseDouble(String.valueOf(data[i][6]))>0) {
                System.out.println(data[i][0]+" = "+data[i][1]+" (Precio: "+data[i][4]+
                ",Stock: "+data[i][6]+");");
            }
        }
        System.out.println("");
    }

    public void reporteVentasRangoFecha(){
        AnsiConsole.systemUninstall();
        System.out.println("---------------- REPORTE DE VENTAS POR FECHA -----------------");
        String fechaIni = lt.leer("", "Ingrese la fecha de inicio (dd-MM-yyy): ");
        String fechaFin = lt.leer("", "Ingrese fecha final (dd-MM-yyy): ");
        lea = new LeerArchivo("Venta.txt");
        Object[][] dataV = listarContenido(lea);
        int contarVentasRF = 0;
        try {
            for (int i = 0; i < dataV.length; i++){
                String[] fechaVenta = String.valueOf(dataV[i][2]).split(" ");
                Date fechaVentaX = formatoFecha.parse(fechaVenta[0]);
                if ((fechaVentaX.after(formatoFecha.parse(fechaIni)) || fechaVenta[0].equals(fechaIni)) && 
                (fechaVentaX.before(formatoFecha.parse(fechaFin)) || fechaVenta[0].equals(fechaFin))) {
                    contarVentasRF = contarVentasRF+1;
                }
            }
            Object[][] dataVRF = new Object[contarVentasRF][dataV[0].length];
            int filaIndice = 0;
            double netoTotalX=0, igvX=0, precioTotalX=0;
            for (int i = 0; i < dataV.length; i++){
                String[] fechaVenta = String.valueOf(dataV[i][2]).split(" ");
                Date fechaVentaX = formatoFecha.parse(fechaVenta[0]);
                if ((fechaVentaX.after(formatoFecha.parse(fechaIni)) || fechaVenta[0].equals(fechaIni)) && 
                (fechaVentaX.before(formatoFecha.parse(fechaFin)) || fechaVenta[0].equals(fechaFin))) {
                    for (int j = 0; j < dataV[0].length; j++) {
                        dataVRF[filaIndice][j] = dataV[i][j];
                        if (j==3) {netoTotalX += Double.parseDouble(String.valueOf(dataV[i][j]));}
                        if (j==4) {igvX += Double.parseDouble(String.valueOf(dataV[i][j]));}
                        if (j==5) {precioTotalX += Double.parseDouble(String.valueOf(dataV[i][j]));}
                    }
                    filaIndice++;
                }
            }
        ut.clearConsole3();
        ut.pintarLine1('H',13);
        System.out.print(ansi().render(" -"+"@|green REPORTE DE VENTAS POR FECHA |@"+"-"));ut.pintarLine('H',13);
        ut.pintarLine1('H',13);
        System.out.print(ansi().fg(GREEN).a(" Entre "+fechaIni+" a "+fechaFin+" ").reset());ut.pintarLine('H',13);
        ut.pintarLine('H',42);
        ut.pintarTextHeadBody('H', 3, "ID,DNI Cliente,F.Venta,Imp.Neto,IGV,Pre.Total");
        System.out.println("");
        ut.pintarLine('H',42);
        for (Object[] objects : dataVRF) {
            String dataCadena = ""+objects[0]+","+objects[1]+","+objects[2]+","+objects[3]+","+objects[4]+","+objects[5];
            ut.pintarTextHeadBody('B', 3, dataCadena);
        }
        ut.pintarLine('H',42);
        System.out.println("| Total Neto de ventas: S/."+Math.round(netoTotalX)+" | IGV a pagar: S/."+
        Math.round(igvX)+" | Monto recaudado: S/"+Math.round(precioTotalX)+"  |");
        ut.pintarLine('H',42);
        } catch (Exception e) {
        }
    }
}
