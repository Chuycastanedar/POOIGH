package _p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Vehiculo[] Float = new Vehiculo[4];

        Float[0] = new Compacto("ZG100293049", "Ford", 2015, 150000, 5, 2);
        Float[1] = new Compacto("ZG100389485", "Nissan", 2021, 350000, 5, 4);
        Float[2] = new Camioneta("ZZ1002001983", "Chevrolet", 2000, 1000000, 8, 5);
        Float[3] = new Camioneta("ZZ1002001983", "Mercedes", 2024, 500000, 6, 5);

        System.out.println("Datos de los Vehiculos de la flota: ");
        for (Vehiculo vehiculo : Float) {
            System.out.println(vehiculo);
        }
        double sumaPrecios = 0;
        System.out.println("Calculando el total de precio de todos los vehículos... ");
        for (Vehiculo vehiculo : Float) {
            sumaPrecios += vehiculo.getPrecio();
        }
        System.out.println("La suma de precios es: " + sumaPrecios);
    }
}