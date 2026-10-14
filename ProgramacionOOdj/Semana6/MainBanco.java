public class MainBanco {
    public static void main(String[] args) {
        // Creacion del Objeto cuenta
        Cuenta cuenta = new Cuenta("5869874-2", "Juan", 0);

        // Creacion del Objeto cliente
        Cliente cliente = new Cliente(1012587965, "Miguel");

        // Creacion del Objeto banco
        Banco banco = new Banco("AV Villas", "Calle Falsa 123", cuenta);

        // Mostrar la informacion del banco
        System.out.println(banco);

        // Abrir una cuenta para el cliente
        banco.abrirCuenta(cliente);

    }

}
