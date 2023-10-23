package _p112_ControlVentas;

public class VentaContado extends Venta {
    private double Descuento;
    private String Regalo;
    
    public VentaContado(String Articulo, double Cantidad, double Precio, double Descuento,String Regalo) {
        super(Articulo, Cantidad, Precio, Descuento);
        Descuento = Descuento;
        Regalo = Regalo;
    }

    public double getTotalVenta(){
        return Total - (Total * Descuento / 100);
    }

    public String toString() {
        return String.format("Venta [Articulo= %s, Cantidad= %.1f, Precio= %.2f, Total= %.2f]", Articulo, Cantidad, Precio, Total);
    }
}