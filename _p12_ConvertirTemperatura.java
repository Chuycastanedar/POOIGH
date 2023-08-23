// Convierte temperatura de fahrenheit a celcius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        
        double fahrenheit, celcius;

        Scanner obj = new Scanner(System.in);

        System.out.print("\nIngresa la temperatura en grados FAHRENHEIT: ");
        fahrenheit = obj.nextInt();
        
        celcius = (fahrenheit - 32) * (0.55555556);

        System.out.println(String.format("\nLa temperatura: %.2f, grados Fahrenheit", fahrenheit));
        System.out.println(String.format("Corresponde a: %.2f, grados Celcius.", celcius));

    }
}
