// Imprime la secuencia de términos armónicos el número de renglones que el usuario desee y su suma...

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int i, numero;
        double j, suma;

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Se desea imprimir la secuencia de términos " + 
            "armónicos el número de renglones que el usuario desee y su suma...\n");
        System.out.print("Ingresa cuantos términos deseas: ");
        numero = obj.nextInt();

        suma = 0;
        for (i=1; i<=numero; i++) {
            if (i == 1){
                System.out.print("\nSalida: ");
                System.out.print(1);
            }else
                System.out.print(" + " + 1 + "/" + i);
            j = i;
            suma += 1/j;
        }
        System.out.print("\n\nSuma: " + suma);
        System.out.println("\nGracias por utilizar este programa...");
    }
}
