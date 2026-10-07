public class MainTrabajadores {
    public static void main(String[] args) {
        //Arreglo de trabajadores objetos
        Trabajador[] trabajadores = new Trabajador[3];
        trabajadores[0] = new Operario(1011125635, "Jhon", 1000,120);
        trabajadores[1] = new Vendedor(95696365, "Mario", 5000, 21.1);
        trabajadores[2] = new Operario(14698852, "Lina", 1500, 60);

        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("Salario a pagar a " + trabajadores[i].getNombre() + ": " + trabajadores[i].pagar());
        }
    }
}
