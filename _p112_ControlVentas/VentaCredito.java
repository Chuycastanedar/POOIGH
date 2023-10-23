package _p112_ControlVentas;

public class VentaCredito extends Venta{
    private int Meses;
    private int Interes;
    
    public VentaCredito(String Articulo, double Cantidad, double Precio, int Meses, double Interes) {
        super(Articulo, Cantidad, Precio, Interes);
        Meses = Meses;
        Interes = Interes;
    }

    public double getTotalVenta(){
        return Total + (Total * Meses * Interes / 100);
    }

    public String toString() {
        return super.toString() + String.format(", Meses= %d, Interes= %.2f%%, TotalVenta= %.2f", Meses, Interes, getTotalVenta());
    }
}