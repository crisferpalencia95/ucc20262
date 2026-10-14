public class Banco {
    private String nombre;
    private String direccion;
    private Cuenta cuenta;

    public Banco(String nombre, String direccion, Cuenta cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    public void abrirCuenta(Cliente cliente) {
        // Lógica para abrir una cuenta para el cliente
        System.out.println("Abriendo cuenta para el cliente: " + cliente);
    }

    public String toString() {
        return "Banco [nombre=" + nombre + ", direccion=" + direccion + ", cuenta=" + cuenta + "]";
    }
}
