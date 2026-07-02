public class Alimento extends Producto implements Vendible {
    // Atributos específicos de Alimento
    private boolean esVegetariano;
    private int calorias;

    // Constructor
    public Alimento(String nombre, double precio, boolean esVegetariano, int calorias) {
        super(nombre, precio);
        this.esVegetariano = esVegetariano;
        this.calorias = calorias;
    }

    // Getters y Setters
    public boolean isEsVegetariano() {
        return esVegetariano;
    }

    public void setEsVegetariano(boolean esVegetariano) {
        this.esVegetariano = esVegetariano;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Muestra nombre, precio base y disponibilidad
        System.out.println("Vegetariano: " + (esVegetariano ? "Sí" : "No"));
        System.out.println("Calorías: " + calorias + " kcal");
        System.out.println("Precio Final: $" + calcularPrecioFinal());
        System.out.println("--------------------------------");
    }

    @Override
    public double calcularPrecioFinal() {
        // Los alimentos vegetarianos tienen 10% de descuento
        if (esVegetariano) {
            return getPrecio() * 0.90;
        }
        return getPrecio();
    }
}
