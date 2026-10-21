package Taller;

public class Pago {
    private double monto;
    private String nota;

    public Pago(double monto, String nota) {
        this.monto = monto;
        this.nota = nota;
    }

    public double getMonto() {
        return this.monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNota() {
        return this.nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String toString() {
        return "Pago :{monto=" + monto + ", nota=" + nota + "}";
    }
}
