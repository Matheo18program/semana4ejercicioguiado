//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Mouse", 20, "Tecnología");
        Producto producto2 = new Producto("Cuaderno", 3.5, "Papelería");
        Producto producto3 = new Producto("Audífonos", 35, "Tecnología");

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();

        // Se usa el nombre de la clase, no un objeto
        System.out.println("Total de productos creados: " + Producto.getTotalProductos());
    }
}