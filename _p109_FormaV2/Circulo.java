package _p109_FormaV2;

public class Circulo extends Forma {
    private double Radio;

    public Circulo() {
    }
    public Circulo(String color, Boolean relleno, double radio) {
        super(color, relleno);
        Radio = radio;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        return Math.PI * Radio * Radio;
    }
    public double getPerimetro() {
        return 2 * Math.PI * Radio;
    }
    public String toString() {
        return "Circulo [" + super.toString() + "Radio=" + Radio + "]";
    }
}