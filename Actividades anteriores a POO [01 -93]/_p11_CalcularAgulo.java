// Calcula el tercer ángulo de un triángulo a partir de sus primeras 2 medidas 

import java.util.Scanner;

public class _p11_CalcularAgulo {
    public static void main(String[] args) {
        
        double medidaAngulo1, medidaAngulo2, medidaAngulo3;

        Scanner obj = new Scanner(System.in);

        System.out.print("\nIngresa la longitud del primer ángulo: ");
        medidaAngulo1 = obj.nextInt();
        System.out.print("Ingresa la longitud del segundo ángulo: ");
        medidaAngulo2 = obj.nextInt();
        
        medidaAngulo3 = 180 - (medidaAngulo1 + medidaAngulo2);

        System.out.println("\nMedidas ingresadas del triángulo: ");
        System.out.println(String.format("\nÁngulo 1: %.2f", medidaAngulo1));
        System.out.println(String.format("Ángulo 2: %.2f", medidaAngulo2));
        System.out.println(String.format("La medida del ángulo 3 es: %.2f", medidaAngulo3));

    }
}
