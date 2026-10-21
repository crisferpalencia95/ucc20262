package Taller;

public class Tarjeta extends Pago {
    private String numeroTarjeta;
    private int cvc;

    public Tarjeta(String numeroTarjeta, int cvc, double monto) {
        super(monto, "Pago realizado");
        this.numeroTarjeta = numeroTarjeta;
        this.cvc = cvc;
    }

    public int getCvc() {
        if(this.cvc <= 0) {
            setNota("CVC inválido");
        }else{
            setNota("CVC válido");
        }
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }


    @Override
    public String toString() {
        return "Tarjeta :{numeroTarjeta=" + numeroTarjeta + ", cvc=" + cvc + ", monto=" + getMonto() + ", nota=" + getNota() + "}";
    }

}
