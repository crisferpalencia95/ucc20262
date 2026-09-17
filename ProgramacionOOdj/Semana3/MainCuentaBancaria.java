public class MainCuentaBancaria {
    public static void main(String[] args) {
        
        //Una constante es un valor que no cambia durante la ejecución y debe ir 
        //en Mayúscula Sostenida
        final int ANIO_ACTUAL = 2026;

        CuentaBancaria objCuenta1 = new CuentaBancaria("Juan Perez", "123456789", 1000.0, "Ahorros", "Banco XYZ", 1234, "Calle 123");
        CuentaBancaria objCuenta2 = new CuentaBancaria("Maria Lopez", "987654321", 500.0, "Corriente", "Banco ABC", 5678, "Avenida 456");

        System.out.println(objCuenta1.toString());
        System.out.println(objCuenta2.toString());

        System.out.println("Saldo actualizado de la cuenta 1: " + objCuenta1.depositar(200.0));
        System.out.println("Saldo actualizado de la cuenta 2: " + objCuenta2.depositar(300.0));

        objCuenta1.actualizarDatosPersonales("Juan Perez", 4321, "Calle 456");
        objCuenta2.actualizarDatosPersonales("Maria Lopez", 8765, "Avenida 789");

        System.out.println("Datos personales actualizados de la cuenta 1: " + objCuenta1.toString());
        System.out.println("Datos personales actualizados de la cuenta 2: " + objCuenta2.toString());
       
    }
  
}