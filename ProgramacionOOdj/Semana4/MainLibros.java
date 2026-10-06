public class MainLibros {
    public static void main(String[] args) {

        // Crear instancias de libros
        Libro libro1 = new Libro(12345, "El Quijote", "Miguel de Cervantes", 1605, true);
        Libro libro2 = new Libro(67890, "Cien Años de Soledad", "Gabriel García Márquez", 1967, true);
        Libro libro3 = new Libro(11223, "Don Juan Tenorio", "José Zorrilla", 1844, true);
        Libro libro4 = new Libro(44556, "La Sombra del Viento", "Carlos Ruiz Zafón", 2001, true);
        Libro libro5 = new Libro(77889, "El Principito", "Antoine de Saint-Exupéry", 1943, true);
       
       // Imprimir información de los libros
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);

        // Prestar libros
        System.out.println(libro1.prestar("El Quijote"));
        System.out.println(libro1.prestar("El Principito"));
        System.out.println(libro1.prestar("El Quijote"));

        // Devolver libros
        System.out.println(libro1.devolver("El Quijote"));
        System.out.println(libro2.devolver("Cien Años de Soledad"));
        System.out.println(libro1.devolver("El Principito"));
    }
}
