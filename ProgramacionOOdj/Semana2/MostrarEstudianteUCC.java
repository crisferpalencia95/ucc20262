public class MostrarEstudianteUCC {

    public static void main(String[] args) {

        // Creacion de objeto Objetoestudiante que se crea apartir de la clase Persona
        Persona objEstudiante1 = new Persona(1, 1142854539, "Mario", "Bross", 35, 1.65); //Mostrar la informacion que tiene el objeto "objEstudiante1"
        Persona objEstudiante2 = new Persona(2, 1143453539, "Maria", "Suarez", 26, 1.00);//Mostrar la informacion que tiene el objeto "objEstudiante2"

        System.out.println(objEstudiante1);
        System.out.println(objEstudiante2);    
    }

}
