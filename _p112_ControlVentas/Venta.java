package _p112_ControlVentas;

public abstract class Venta {
    protected String Articulo;
    protected double Cantidad;
    protected double Precio;
    protected double Total;
    
    public Venta(String articulo, double cantidad, double precio, double total) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        Total = Cantidad * Precio;
    }
    
    public abstract double getTotalVenta();
    
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + Total  + "]";
    }
}