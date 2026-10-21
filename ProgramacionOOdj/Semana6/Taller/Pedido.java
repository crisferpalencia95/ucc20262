package Taller;
import java.util.Date;

public class Pedido {
    
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private String tipoPago;
    private Pago pago;


    public Pedido(Cliente cliente, Producto[] producto, Date fecha, String tipoPago, Pago pago) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
        this.pago = pago;
    }

    public String toString() {
        return "Pedido :{cliente=" + cliente + ", productos:{"+ java.util.Arrays.toString(producto) + "}, fecha=" + fecha + ", tipoPago=" + tipoPago + ", pago=" + pago + "}";
    } 

}
