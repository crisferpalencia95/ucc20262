package Taller;

public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int id, String marca, String modelo) {
        super(id);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString() {
        return "Camara [marca=" + marca + ", modelo=" + modelo + "]";
    }
    
}
