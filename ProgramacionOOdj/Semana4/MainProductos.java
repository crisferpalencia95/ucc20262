public class MainProductos {
    public static void main(String[] args) {
        Producto p1 = new Producto(1, "Laptop", 1500000.56, 10);
        Producto p2 = new Producto(2, "Mouse", 150000.0, 50);

        p1.vender("Laptop",10);
        p2.reabastecer("Mouse", 20);

        System.out.println("Valor inventario p1: " + p1.valorInventario(1));
        System.out.println("Valor inventario p2: " + p2.valorInventario(2));
    }
}
