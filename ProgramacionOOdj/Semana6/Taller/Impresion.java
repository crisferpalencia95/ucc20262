package Taller;

public class Impresion extends Producto {

    private String color;
    private Foto[] fotos;

    public Impresion(int id, String color) {
        super(id);
        this.color = color;
        this.fotos = new Foto[3];
    }

    public void setFotos(Foto[] fotos) {
        this.fotos = fotos;
    }

    public Foto[] getFotos() {
        return this.fotos;
    }

    public String getColor() {
        return this.color;
    }

    public void imprmirFotos() {

        for (int i = 0; i < this.fotos.length; i++) {
            System.out.println("Foto " + (i + 1) + ": " + this.fotos[i]);
        }
    }
}
