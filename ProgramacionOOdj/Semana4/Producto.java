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

    public void vender(String producto, int cantidad) {
        if (this.nombre.equals(producto) || this.codigo == Integer.parseInt(producto)) {
            if (cantidad <= stock) {
                stock -= cantidad;
                System.out.println("Se vendieron " + cantidad + " unidades de " + this.nombre);
            } else {
                //int vendidos = stock;
                //stock = 0;
                System.out.println("Solo hay disponibles " + stock + " unidades de " + this.nombre + ". No hay más stock disponible.");
            }
        } else {
            System.out.println("El producto no coincide con el nombre o codigo proporcionado: " + producto);
        }
    }

    public void reabastecer(String producto, int cantidad) {
        if (this.nombre.equals(producto) || this.codigo == Integer.parseInt(producto)) {
            stock += cantidad;
            System.out.println("Se reabastecieron " + cantidad + " unidades de " + this.nombre);
        } else {
            System.out.println("El producto no coincide con el nombre o codigo proporcionado: " + producto);
        }
    }

    public int valorInventario(int codigo) {
        if (this.codigo == codigo) {
            return (int) (precio * stock);
        } else {
            System.out.println("El producto no coincide con el codigo proporcionado: " + codigo);
            return 0;
        }   
    }

    public String toString() {
        return "Producto[ codigo :" + codigo +", nombre:'" + nombre + "', precio:" + precio +", stock:" + stock +"]";
    }
}
