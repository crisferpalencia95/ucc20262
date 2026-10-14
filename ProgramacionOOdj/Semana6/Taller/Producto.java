package Taller;

public class Producto {
    private int id;

    public Producto(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Producto [id=" + id + "]";
    }
    
}
