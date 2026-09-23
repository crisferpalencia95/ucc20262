public class MainCuentaBancaria {
    public static void main(String[] args) {
        
        CuentaBancaria objCuenta1 = new CuentaBancaria("Juan Perez", "123456789", 1000.0, "Ahorros", "Banco XYZ", 1234, "Calle 123");

        System.out.println(objCuenta1.toString());

        System.out.println("Saldo actualizado de la cuenta 1: " + objCuenta1.depositar(1500000));

        objCuenta1.actualizarDatosPersonales("Juan Perez", 4321, "Calle 456");

        System.out.println("Datos personales actualizados de la cuenta 1: " + objCuenta1.toString());

        System.out.println("Cliente 1 deposito: "+objCuenta1.depositar(125000));

        double total = objCuenta1.debitar(5000000);

        if(total ==  0){
            System.out.println("Saldo insufisiente");
        }else{
            if(total == -1){
                System.out.println("No pude ser valores negativos");
            }else{
                System.out.println("Su saldo actual "+total);
            }     
        }

        objCuenta1.consutarSaldo();

        //System.out.println("Cliente 1 Retiro: "+objCuenta1.debitar(50000));
       
    }
  
}