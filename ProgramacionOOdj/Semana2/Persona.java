import java.beans.ConstructorProperties;

import javax.management.ConstructorParameters;

public class Persona {
    
    //Atributos de persona
    private int id;
    private int cedula;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;

    /**
     * Constructor: el constructor de la clase se reconoce por 
     * tiene le mismo nombre de la calse. 
    **/

    public Persona (int id, int cedula, String nombres, String apellidos, int edad, double estatura){
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String toString(){
        return "EstudianteUCC { id: " + id + " cedula: " + cedula + " nombres: " +
                nombres + " apellidos: " + apellidos + " edad: " + edad + " estatura: " +
                estatura+"}";  
    }

}
