// Verifica si la suma de dos numeros es igual a un tercer numero

import java.util.Scanner;

public class _p22_VerificarSuma {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush();

        float num1, num2, num3;

        Scanner obj = new Scanner (System.in);

        System.out.println("Verifica si la suma de dos numeros es igual a un tercer numero\n");
        System.out.print("Numero 1: "); num1 = obj.nextFloat();
        System.out.print("Numero 2: "); num2 = obj.nextFloat();
        System.out.print("Numero 3: "); num3 = obj.nextFloat();

        if (num1  + num2 == num3)
            System.out.println("Son iguales");
        else 
            System.out.println("Son diferentes");
    
     System.out.println("Gracias por usar este programa...");
    
    }
}
