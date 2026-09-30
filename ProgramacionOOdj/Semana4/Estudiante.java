public class Estudiante {

    //Atributos de la Estudiante
    private String nombre;
    private String documento;
    private int edad;
    private String programa;

    //Costructor de la clase --> siempre debe tener el mismo nombre de la clase
    public Estudiante(String nombre, String documento, int edad, String programa) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.programa = programa;
    }

    //getter y setter

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        if(nombre.equals(""))
            System.out.println("Nombre vacio...");
        else
            this.nombre = nombre;
    }

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        if(edad >= 0)
            this.edad = edad;
        else
            System.out.println("Edad no puede ser negativa");

    }

    public String getPrograma(){
        return programa;
    }

    public void setPrograma(String programa){
        this.programa = programa;
    }

    public String toString() {
        return "Estudiante [ nombre: "+nombre+" documento: "+documento+" edad: "+edad+" programa: "+programa+" ]";
    }
    
}