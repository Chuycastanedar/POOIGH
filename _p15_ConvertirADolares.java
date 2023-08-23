// Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        
        double pesos, dolares, equivalente;

        Scanner obj = new Scanner(System.in);

        System.out.print("\nIngresa la cantidad en PESOS: ");
        pesos = obj.nextInt();
        System.out.print("\nIngresa la cotización del DOLAR: ");
        dolares = obj.nextInt();

        equivalente = pesos / dolares;

        System.out.println(String.format("\nPESOS: %.2f, corresponden a: %.2f, DOLARES...", pesos, equivalente));

    }
}
