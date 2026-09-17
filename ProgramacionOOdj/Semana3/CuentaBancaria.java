public class CuentaBancaria {

    //Atributos de la CuentaBancaria
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    private String banco;
    private int clave;
    private String direccion;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo, String tipoCuenta, String banco, int clave, String direccion) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.banco = banco;
        this.direccion = direccion;
        this.clave = clave;
    }

    
    public void actualizarDatosPersonales(String titular, int clave, String direccion){
        this.titular = titular;
        this.direccion = direccion;
        this.clave = clave;
    }

    public double depositar(double monto){
        saldo += monto;
        return saldo;
    }

    public String toString(){
        return "CuentaBancaria [ titular: " + titular + " numeroCuenta: " + numeroCuenta + " saldo: " + saldo + 
                           " tipoCuenta: " + tipoCuenta + " banco: " + banco + " clave: " + clave + " direccion: " + direccion + " ]";
    }

    
}