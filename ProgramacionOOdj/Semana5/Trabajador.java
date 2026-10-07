public class Trabajador {
    private int cedula;
    private String nombre;
    private double salario;

    public Trabajador(int cedula, String nombre, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
    }

    public double pagar() {
        return salario*1.10;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

}
