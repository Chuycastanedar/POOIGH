// Imprime la secuencia de términos, el número de renglones que el usuario desee y su suma...

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i, j, suma, numero, terminoInt;
        String termino; 

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.println("Se desea imprimir la secuencia de términos, " + 
            "el número de renglones que el usuario desee y su suma...\n");
        System.out.print("Ingresa cuantos términos deseas: ");
        numero = obj.nextInt();

        suma = 0; termino = ""; terminoInt = 0;

        for (i=1; i<=numero; i++) {
            for (j=1; j<=i; j++) {
                termino += "1";
            }
            System.out.print(termino);
            if (i < numero)
                System.out.print(" + ");
            terminoInt = Integer.parseInt(termino);
            suma += terminoInt;
            termino = "";
        }
        System.out.print("\n\nSuma: " + suma);
        System.out.println("\nGracias por utilizar este programa...");
    }
}