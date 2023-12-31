package _p112_ControlVentas;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String Nombre;
    private String Propietario;
    private String Domicilio;
    private List<Cliente> Clientes;

    

    public Tienda(String nombre, String propietario, String domicilio) {
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
        Clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }

    public double getTotal() {
        double total = 0;
        for (Cliente cliente : Clientes) {
            total += cliente.getTotal();
        }
        return total;
    }

    public void reporte() {
        System.out.println("Reporte de clientes sin ventas : " + this);
        for (Cliente cliente : Clientes) {
            System.out.println(">> " + cliente);
        }
        System.out.println("Reporte de ventas de los clientes : " + this);
        for (Cliente cliente : Clientes) {
            System.out.println(">> " + cliente);
            for (Venta venta : cliente.getVentas()) {
                System.out.println(venta);
            }
        }
    }

    @Override
    public String toString() {
        return "Tienda [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes + "]";
    }
}