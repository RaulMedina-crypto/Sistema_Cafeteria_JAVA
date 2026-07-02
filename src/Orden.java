import java.util.ArrayList;

public class Orden {
    private ArrayList<Producto> listaProductos;

    public Orden() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarAOrden(Producto producto) {
        if (producto != null) {
            listaProductos.add(producto);
            System.out.println(producto.getNombre() + " agregado a la orden.");
        } else {
            System.out.println("Error: Producto no encontrado en el menú.");
        }
    }

    public void mostrarElementos() {
        System.out.println("\n--- TU ORDEN ACTUAL ---");
        if (listaProductos.isEmpty()) {
            System.out.println("Tu orden está vacía.");
        } else {
            for (Producto prod : listaProductos) {
               
                prod.mostrarInformacion(); 
            }
        }
        System.out.println("Total de artículos: " + contarProductos());
        System.out.println("-----------------------\n");
    }

    public int contarProductos() {
        return listaProductos.size();
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto prod : listaProductos) {
            // Evaluamos si el producto implementa Vendible para calcular el precio correcto
            if (prod instanceof Vendible) {
                // Se usa el precio final 
                total += ((Vendible) prod).calcularPrecioFinal(); 
            } else {
                total += prod.getPrecio(); 
            }
        }
        return total;
    }
}