package _p112_ControlVentas;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private List<Venta> Ventas;
   
    public Cliente(String nombre, String domicilio, String correo) {
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
        Ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta) {
        Ventas.add(venta);
    }

    public double getTotal() {
        double total = 0;
        for (Venta venta : Ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }

    public String toString() {
        return String.format("Cliente [ Nombre= %s, Domicilio= %s, Correo= %s, Ventas= %d, Total= %.2f ]", Nombre, Domicilio, Correo, Ventas.size(), getTotal());
    }

    public Venta[] getVentas() {
        return null;
    }
}