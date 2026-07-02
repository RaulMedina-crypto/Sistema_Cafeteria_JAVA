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

    // Getters y setters
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
        String tipo = esVegetariano ? "Vegetariano" : "No Vegetariano";
        System.out.println("Alimento: " + getNombre() + " (" + tipo + ", " + calorias + " kcal) - Precio Base: $" + getPrecio());
    }

    @Override
    public double calcularPrecioFinal() {

        if (esVegetariano) {
            return getPrecio() * 0.90;
        }
        return getPrecio();
    }
}