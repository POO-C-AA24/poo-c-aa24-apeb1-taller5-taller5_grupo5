
import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto> inventario;

    public Tienda() {
        inventario = new ArrayList<>();
    }

    public void agregarProductoInventario(Producto producto) {
        inventario.add(producto);
        System.out.println("Producto " + producto.getNombre() + " agregado al inventario.");
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

}
