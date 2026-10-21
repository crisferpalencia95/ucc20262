package Taller;

public class PagoEfectivo extends Pago {
    private double recibido;

    public PagoEfectivo(double monto, double recibido, String nota) {
        super(monto, nota);
        this.recibido = recibido;
    }

    public double getRecibido() {
        return recibido;
    }

    public double getCambio() {
        setNota("Pago realizado");
        return recibido - getMonto();
    }

    @Override
    public String toString() {
        return "PagoEfectivo :{recibido=" + recibido + ", nota=" + getNota() + ", monto=" + getMonto() + ", Cambio=" + getCambio() + "}";
    }
}