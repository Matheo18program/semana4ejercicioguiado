public class Producto {


    private String nombre;
    private double precio;
    private String categoria;


    private static int totalProductos = 0;


    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        totalProductos++; // se incrementa en cada objeto creado
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public static int getTotalProductos() {
        return totalProductos;
    }


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Categoría: " + categoria);
        System.out.println("-------------------");
    }
}