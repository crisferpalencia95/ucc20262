public class MainProductos {
    public static void main(String[] args) {
        Producto p1 = new Producto(1, "Laptop", 1500000.56, 10);
        Producto p2 = new Producto(2, "Mouse", 150000.0, 50);  

        p1.vender(10);
        p2.reabastecer(20);

        p1.valorInventario();
        p2.valorInventario();

        p1.venderProducto("Laptop", 5);
    }
}
