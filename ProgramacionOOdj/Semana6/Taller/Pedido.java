package Taller;
import java.util.Date;

public class Pedido {
    
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
}
