public class Bebida extends Producto implements Vendible {
    // Atributos específicos de Bebida
    private String tamano; // Small, Medium, Large
    private boolean esFria; // true si es fría, false si es caliente

    // Constructor
    public Bebida(String nombre, double precio, String tamano, boolean esFria) {
        super(nombre, precio);
        this.tamano = tamano;
        this.esFria = esFria;
    }

    // Getters y Setters
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isEsFria() {
        return esFria;
    }

    public void setEsFria(boolean esFria) {
        this.esFria = esFria;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Muestra nombre, precio base y disponibilidad
        System.out.println("Tamaño: " + tamano);
        System.out.println("Temperatura: " + (esFria ? "Fría" : "Caliente"));
        System.out.println("Precio Final: $" + calcularPrecioFinal());
        System.out.println("--------------------------------");
    }

    @Override
    public double calcularPrecioFinal() {
        // Las bebidas tamaño Large aumentan $15
        if (tamano != null && tamano.equalsIgnoreCase("Large")) {
            return getPrecio() + 15.0;
        }
        return getPrecio();
    }
}