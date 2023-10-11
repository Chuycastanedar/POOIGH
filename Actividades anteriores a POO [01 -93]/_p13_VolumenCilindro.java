// Calcula el volumen de un cilindro a partir de su radio y altura

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        
        double radio, altura, volumen;

        Scanner obj = new Scanner(System.in);

        System.out.print("\nIngresa la medida del RADIO: ");
        radio = obj.nextInt();
        System.out.print("\nIngresa la medida de la ALTURA: ");
        altura = obj.nextInt();

        volumen = (3.1416 * (radio * radio)) * altura;

        System.out.println("\nMedidas ingresadas del cilindro:");
        System.out.println(String.format("\nRADIO: %.2f", radio));
        System.out.println(String.format("ALTURA: %.2f", altura));
        System.out.println(String.format("El volumen del cilindro es: %.2f", volumen));

    }
}
