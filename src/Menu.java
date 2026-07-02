import java.util.HashMap;
import java.util.Map;

public class Menu {
    private HashMap<String, Producto> catalogo;

    public Menu() {
        this.catalogo = new HashMap<>();
    }

    public void agregarProducto(String codigo, Producto producto) {
        catalogo.put(codigo, producto);
    }

    public void mostrarMenu() {
        System.out.println("\n--- MENÚ DE LA CAFETERÍA ---");
        if (catalogo.isEmpty()) {
            System.out.println("El menú está vacío.");
        } else {
            for (Map.Entry<String, Producto> entrada : catalogo.entrySet()) {
                String codigo = entrada.getKey();
                Producto prod = entrada.getValue();
                
                System.out.print("[" + codigo + "] ");
                
                prod.mostrarInformacion(); 
            }
        }
        System.out.println("----------------------------\n");
    }

    public Producto buscarProducto(String codigo) {
        return catalogo.get(codigo);
    }
}