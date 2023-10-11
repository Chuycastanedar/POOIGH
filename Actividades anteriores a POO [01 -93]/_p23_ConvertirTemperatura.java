// Covertir de centigrados a farenheit y viceversa

import java.util.Scanner;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        char op;
        double temp, res;
        Scanner obj = new Scanner (System.in);

        System.out.println("Convierte de grados centigrados a farenheit y viceversa...\n");
        System.out.println("[F]  arenheit a Centigrados");
        System.out.println("[C]  entigrados a Farenheit");
        System.out.println("Elije una opcion: ");

        op = Character.toUpperCase(obj.next().charAt(0) );

        if (op == 'F') {
            System.out.println("Dame la temperatura en Farenheit: ");
            temp = obj.nextFloat();

            res = (temp - 32 ) * (0.55555556);
            System.out.printf("\n%f grados Farenheit equivale a %f grados centigrados...", temp, res);
        }
        else if(op == 'C') {
            System.out.println("Dame la temperatura en Centigrados: ");
            temp = obj.nextFloat();

            res = (temp * 1.8 ) + 32;
            System.out.printf("\n%f grados Centigrados equivale a %f grados Farenheit...", temp, res);

        }
        else 
            System.out.println("\nOpcion invalida...");

        System.out.println("\nGracias por utilizar este programa...");
    }
}