package Taller;

public class Tranferencia extends Pago {
    private String cuentaOrigen;
    private String cuentaDestino;

    public Tranferencia(String cuentaOrigen, String cuentaDestino, double monto) {
        super(monto, "Pago realizado");
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public String toString() {
        return "Tranferencia :{cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino + ", monto=" + getMonto() + ", nota=" + getNota() + "}";
    }
}
