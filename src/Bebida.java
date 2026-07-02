public class Bebida extends Producto implements Vendible {
    // Atributos específicos de Bebida
    private String tamano; // Small, Medium, Large
    private boolean friaOCaliente; // true si es fría, false si es caliente

    // Constructor
    public Bebida(String nombre, double precio, String tamano, boolean friaOCaliente) {
        super(nombre, precio);
        this.tamano = tamano;
        this.friaOCaliente = friaOCaliente;
    }

    // Getters y Setters
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isFriaOCaliente() {
        return friaOCaliente;
    }

    public void setFriaOCaliente(boolean friaOCaliente) {
        this.friaOCaliente = friaOCaliente;
    }

    @Override
    public void mostrarInformacion() {
        String temperatura = friaOCaliente ? "Fría" : "Caliente";
        System.out.println("Bebida: " + getNombre() + " (" + tamano + ", " + temperatura + ") - Precio Base: $" + getPrecio());
    }

    // Implementación de la interfaz Vendible
    @Override
    public double calcularPrecioFinal() {

        if (tamano.equalsIgnoreCase("Large")) {
            return getPrecio() + 15.0;
        }
        return getPrecio();
    }
}