import java.util.ArrayList;
import java.util.List;

public class Main {
    static class Producto {
        private String nombre;
        private double precio;
        private String tipo; // "Bebida" o "Alimento"

        public Producto(String nombre, double precio, String tipo) {
            this.nombre = nombre;
            this.precio = precio;
            this.tipo = tipo;
        } // producto

        public String getNombre() { return nombre; }
        public double getPrecio() { return precio; }
        public String getTipo() { return tipo; }
    } // class producto

    public static void main(String[] args) {


        Producto bebida1 = new Producto("Café Americano", 2.50, "Bebida");
        Producto bebida2 = new Producto("Jugo de Naranja", 3.00, "Bebida");
        Producto bebida3 = new Producto("Agua Mineral", 1.50, "Bebida");

        Producto comida1 = new Producto("Croissant de Jamón", 4.20, "Alimento");
        Producto comida2 = new Producto("Sándwich Gourmet", 6.50, "Alimento");
        Producto comida3 = new Producto("Pastel de Chocolate", 3.80, "Alimento");


        List<Producto> menu = new ArrayList<>();
        menu.add(bebida1);
        menu.add(bebida2);
        menu.add(bebida3);
        menu.add(comida1);
        menu.add(comida2);
        menu.add(comida3);


        List<Producto> orden = new ArrayList<>();
        orden.add(menu.get(0)); // Café Americano
        orden.add(menu.get(3)); // Croissant de Jamón
        orden.add(menu.get(1)); // Jugo de Naranja
        orden.add(menu.get(4)); // Sándwich Gourmet


        double total = 0;

        System.out.println("==============================================");
        System.out.println("               RESTAURANTE JAVA               ");
        System.out.println("==============================================");
        System.out.printf("%-25s %-10s %-10s\n", "Producto", "Tipo", "Precio");
        System.out.println("----------------------------------------------");

        for (Producto prod : orden) {
            System.out.printf("%-25s %-10s $%6.2f\n", prod.getNombre(), prod.getTipo(), prod.getPrecio());
            total += prod.getPrecio();
        }

        System.out.println("----------------------------------------------");
        System.out.printf("%-36s $%6.2f\n", "TOTAL A PAGAR:", total);
        System.out.println("==============================================");
        System.out.println("         ¡Gracias por su preferencia!         ");
        System.out.println("==============================================");
    }
}// class Main

