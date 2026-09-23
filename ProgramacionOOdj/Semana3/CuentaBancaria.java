public class CuentaBancaria {

    //Atributos de la CuentaBancaria
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    private String banco;
    private int clave;
    private String direccion;

    //Costructor de la clase --> siempre debe tener el mismo nombre de la clase
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
        if(monto > 0){
            return saldo;
        }else { 
            return 0;
        }
    }

    public double debitar(double monto){
        //saldo -= monto;
        if(monto > 0){
            double total = saldo - monto;
            if(total > 0){
                saldo -= monto;
                return saldo;
            }else{
                return 0;
            }
        }else { 
            return -1;
        }
    }

    public void consutarSaldo(){
        System.out.println("Saldo Actual "+saldo);
    }

    @Override 
    public String toString(){
        return "CuentaBancaria [ titular: " + titular + " numeroCuenta: " + numeroCuenta + " saldo: " + saldo + 
                           " tipoCuenta: " + tipoCuenta + " banco: " + banco + " clave: " + clave + " direccion: " + direccion + " ]";
    }

    
}