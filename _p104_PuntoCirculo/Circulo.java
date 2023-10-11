public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }
    public Punto getCentro() {
        return centro;
    }
    @Override
    public String toString() {
        return "Circulo [Centro= " + centro + ", Radio= " + radio + "]";
    }
}
