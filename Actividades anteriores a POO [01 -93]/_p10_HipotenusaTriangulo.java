// Calcula la hipotenusa de un triángulo rectángulo a partir de sus medidas

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        
        double longitudLado1, longitudLado2, hipotenusa;

        Scanner obj = new Scanner(System.in);

        System.out.print("\nIngresa la longitud del primer lado: ");
        longitudLado1 = obj.nextInt();
        System.out.print("Ingresa la longitud del segundo lado: ");
        longitudLado2 = obj.nextInt();
        
        hipotenusa = Math.sqrt(longitudLado1 * longitudLado1 + longitudLado2 * longitudLado2);

        System.out.println("\nMedidas ingresadas del triángulo: ");
        System.out.println(String.format("\nLado 1: %.2f", longitudLado1));
        System.out.println(String.format("Lado 2: %.2f", longitudLado2));
        System.out.println(String.format("La medida de la hipotenusa es: %.2f", hipotenusa));

    }
}
