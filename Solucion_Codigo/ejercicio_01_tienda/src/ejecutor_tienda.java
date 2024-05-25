
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ejecutor_tienda {
    
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.agregarProductoInventario(new Producto("mani", 1.5, 100));
        tienda.agregarProductoInventario(new Producto("manjar", 1.0, 50));
        tienda.agregarProductoInventario(new Producto("cocholate", 1.2, 75));

        CarritoDeCompras carrito = new CarritoDeCompras();

        Producto producto = tienda.buscarProducto("mani");
        if (producto != null) {
            carrito.agregarProducto(producto, 5);
        }

        producto = tienda.buscarProducto("manjar");
        if (producto != null) {
            carrito.agregarProducto(producto, 10);
        }


        carrito.mostrarDetalleCompra();


        double total = carrito.calcularTotal();
        System.out.println("Total de la compra: $" + total);

        double montoPagado = 20;
        carrito.realizarPago(montoPagado);
    }
}
//profe le queme los datos, no importa???