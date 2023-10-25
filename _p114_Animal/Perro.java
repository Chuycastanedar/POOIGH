package _p114_Animal;

public class Perro implements Animal {
    @Override
    public void dormir() {
        System.out.println("El perro duerme en la caja");
    }

    @Override
    public void sonido() {
        System.out.println("El perro hace guauf...");
    }
}