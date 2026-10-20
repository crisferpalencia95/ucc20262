package Taller;

public class MainCompra {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("1234567890", "Juan Perez");

        Producto productos[] = new Producto[3];

        productos[0] = new Impresion(1, "Color", new Foto[] { new Foto("foto1.jpg"), new Foto("foto2.jpg"), new Foto("foto3.jpg") });
        productos[1] = new Impresion(2, "Blanco y Negro", new Foto[] { new Foto("foto4.jpg"), new Foto("foto5.jpg"), new Foto("foto6.jpg") });
        productos[2] = new Camara(0, "Canon", "Modelo XYZ");

        Pedido pedido1 = new Pedido(cliente1, productos, new java.util.Date(), 1234567890);

        System.out.println(pedido1);
        Impresion impresion1 = (Impresion) productos[0];
        impresion1.imprmirFotos();
    }
}
