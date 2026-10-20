package Taller;

public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public String toString() {
        return "fichero: " + fichero;
    }
}
