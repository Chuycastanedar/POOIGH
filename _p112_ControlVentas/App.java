package _p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mi Tienda", "Carlos Castaneda", "Av. Luis Moya 345");
        System.out.println("");

        Cliente cliente1 = new Cliente("Felipe Calderon", "La Lomaz 123", "calde@ms. com");
        cliente1.agregarVenta(new VentaContado("Martillo", 10, 60.50, 10, "Sacabrocados"));
        cliente1.agregarVenta(new VentaCredito("Pala", 2, 1170.55, 3, 10));
        tienda.agregarCliente(cliente1);

        Cliente cliente2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        cliente2.agregarVenta(new VentaCredito("Clavo", 2.5, 160.34, 2, 20));
        cliente2.agregarVenta(new VentaCredito("Cinta de Aislar", 5, 71.34, 6, 20));
        cliente2.agregarVenta(new VentaContado("Pinzas", 10, 650.33, 20, "Taladro"));
        tienda.agregarCliente(cliente2);

        Cliente cliente3 = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com");
        cliente3.agregarVenta(new VentaContado("Thiner", 50, 65.00, 10, "Aerosol"));
        tienda.agregarCliente(cliente3);

        Cliente cliente4 = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@presidencia.gob.mx");
        tienda.agregarCliente(cliente4);

        tienda.reporte();
    }
}
