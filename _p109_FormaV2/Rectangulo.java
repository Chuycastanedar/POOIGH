package _p109_FormaV2;

public class Rectangulo extends Forma {
    private double Ancho;
    private double Largo;
    public Rectangulo() {
    }
    public Rectangulo(String color, Boolean relleno, double ancho, double largo) {
        super(color, relleno);
        Ancho = ancho;
        Largo = largo;
    }
    public double getAncho() {
        return Ancho;
    }
    public void setAncho(double ancho) {
        Ancho = ancho;
    }
    public double getLargo() {
        return Largo;
    }
    public void setLargo(double largo) {
        Largo = largo;
    }
    public double getArea() {
        return Largo * Ancho;
    }
    public double getPerimetro() {
        return 2 * (Largo + Ancho);
    }
    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + ",Ancho=" + Ancho + ", Largo=" + Largo + "]";
    }
}