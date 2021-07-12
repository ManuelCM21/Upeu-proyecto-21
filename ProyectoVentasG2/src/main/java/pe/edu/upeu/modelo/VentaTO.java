package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaTO {
    public String idVenta, dniCliente, fechaVenta;
    public double netoTotal, igv, precioTotal;
}
