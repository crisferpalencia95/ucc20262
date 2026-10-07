public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Se vendieron " + cantidad + " unidades de " + this.nombre);
        } else {
            System.out.println("Solo hay disponibles " + stock + " unidades de " + this.nombre + ". No hay más stock disponible.");
        }
    }

    public void reabastecer(int cantidad) {
        stock += cantidad;
        System.out.println("Se reabastecieron " + cantidad + " unidades de " + this.nombre);
    }

    public void valorInventario() {
        System.out.println("Valor inventario de " + this.nombre + ": " + (precio * stock));
    }

    public void venderProducto(String producto, int cantidad) {
        if (this.nombre.equals(producto) || this.codigo == Integer.parseInt(producto)) {
            vender(cantidad);
        } else {
            System.out.println("El producto no coincide con el nombre o codigo proporcionado: " + producto);
        }
    }

    public String toString() {
        return "Producto[ codigo :" + codigo +", nombre:'" + nombre + "', precio:" + precio +", stock:" + stock +"]";
    }
}
