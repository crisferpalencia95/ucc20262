public class MainEstudiante {
    public static void main(String[] args) { 
        Estudiante estudianteUno = new Estudiante("Cristian Palencia", "1883949733", 31, "Ingeneria");
        Estudiante estudianteDos = new Estudiante("Maria", "118829942", 45, "Ingeneria Sistemas");
        Estudiante estudianteTres = new Estudiante("Carlos Pareira", "1883949733", 25, "Ingeneria Software");

        //Mostrar la informacion del 
        System.out.println(estudianteUno);
        System.out.println(estudianteDos);
        System.out.println(estudianteTres);

        //Uso de get y set

        System.out.println(estudianteUno.getEdad());
        System.out.println(estudianteTres.getEdad());

        //Cambiar el nombre del objeto "estudianteDos"
        estudianteDos.setNombre("Maria Jose");

        //Cambiar Programa del objeto "estudianteUno"
        estudianteUno.setPrograma("Ingeneria de Sistemas");

        System.out.println(estudianteUno);

        //validador con el metodo setEdad que la edad sea mayor o igual a cero

        estudianteDos.setEdad(30);
        System.out.println(estudianteDos);
        estudianteDos.setEdad(-30);

        //validar metodo setNombre que no reciba vacio
        estudianteTres.setNombre("");
        estudianteTres.setNombre("Auron Pereira");
        System.out.println(estudianteTres);

    }  
}