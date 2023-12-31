package _p98_Circulo;
public class Circulo {
    private double radio;

    public Circulo() {
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getArea() {
        return Math.PI * radio * radio;
    }
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }
    @Override
    public String toString() {
        return "Círculo [radio=" + radio + "]";
    }
}
