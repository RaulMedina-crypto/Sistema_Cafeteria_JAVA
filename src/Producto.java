public class Producto {
    private String nombre;
    private double precio;
    private boolean disponible;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = true;
    }//constructor Producto

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }//getters and setters

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }//metodo mostrarInformacion
}//clase Producto
