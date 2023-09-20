// Imprime la secuencia de números mostrados del número de renglones que el usuario desee...

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int i, j, numero;

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Se desea imprimir la secuencia de números" + 
            " mostrados el número de renglones que el usuario desee:\n");
        System.out.print("Ingresa cuantos renglones deseas: ");
        numero = obj.nextInt();

        for (i=1; i<=numero; i++) {
            for (j=1; j<=i; j++){
                System.out.print(i + " ");
            } 
            System.out.print("\n");
        }
        System.out.println("\nGracias por utilizar este programa...");
    }
}