// Calcula el área de un triángulo a partir de sus datos

import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {
        
    int base, altura;
    double area;
    Scanner obj = new Scanner(System.in);

    System.out.print("Ingresa la base: ");
    base = obj.nextInt();
    System.out.print("Ingresa la altura: ");
    altura = obj.nextInt();

    area = base + altura /2;
    System.out.println(String.format("El triángulo de base: %d y altura: %d tiene un área de: %f", base, altura, area));

    }
}