package _p108_Vehiculo;

public class Camioneta extends Vehiculo {
    private int Ejes;
    private double Capacidad;

    public Camioneta() {
    }
    public Camioneta(String serie, String marca, int año, double precio, int ejes, double capacidad) {
        super(serie, marca, año, precio);
        Ejes = ejes;
        Capacidad = capacidad;
    }
    public int getEjes() {
        return Ejes;
    }
    public void setEjes(int ejes) {
        Ejes = ejes;
    }
    public double getCapacidad() {
        return Capacidad;
    }
    public void setCapacidad(double capacidad) {
        Capacidad = capacidad;
    }
    public String toString() {
        return "Camioneta [" + super.toString() + "Ejes=" + Ejes + ", Capacidad=" + Capacidad + "]";
    }
}