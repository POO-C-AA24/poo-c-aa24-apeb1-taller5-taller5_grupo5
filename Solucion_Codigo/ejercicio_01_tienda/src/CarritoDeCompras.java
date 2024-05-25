/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COSAS DE LA Y
 */
import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    private List<Producto> productos;
    private List<Integer> cantidades;

    public CarritoDeCompras() {
        productos = new ArrayList<>();
        cantidades = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidad() >= cantidad) {
            productos.add(producto);
            cantidades.add(cantidad);
            System.out.println("Producto " + producto.getNombre() + " agregado al carrito, cantidad: " + cantidad + ".");
        } else {
            System.out.println("No hay suficiente cantidad disponible para " + producto.getNombre() + ".");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio() * cantidades.get(i);
        }
        return total;
    }

    public void realizarPago(double montoPagado) {
        double total = calcularTotal();
        double descuento = 0;
        if (total > 1000) {
            descuento = total * 0.1; // Ejemplo: 10% de descuento
            total -= descuento;
        }
        if (montoPagado >= total) {
            System.out.println("Pago realizado. Total: $" + total + ". Monto pagado: $" + montoPagado + ".");
            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
                int cantidad = cantidades.get(i);
                producto.setCantidad(producto.getCantidad() - cantidad);
            }
            productos.clear();
            cantidades.clear();
            System.out.println("Gracias por su compra!");
        } else {
            System.out.println("Pago insuficiente. Faltan: $" + (total - montoPagado) + ".");
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la compra:");
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i);
            System.out.println(producto.getNombre() + " - Cantidad: " + cantidad + " - Precio unitario: $" + producto.getPrecio());
        }
    }
}
