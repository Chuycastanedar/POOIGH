// Convierte la temperatura ingresada en Centigrados a Farenheit, rango de valores

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        double tempInicial, tempFinal, resultado;
        char resp;
        Scanner obj = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Conversor de temperatura Grados Centigrados a Farenheit, rango de valores...");
            System.out.print("\nIngresa la temperatura inicial: "); tempInicial = obj.nextDouble();
            System.out.print("\nIngresa la temperatura final: "); tempFinal = obj.nextDouble();
            if (tempInicial < tempFinal){
                System.out.println("\n=================================");
                System.out.println("CENTIGRADOS\t\tFARENHEIT");
                System.out.println("=================================");
                
                while (tempInicial <= tempFinal){
                    resultado = (tempInicial * 1.8) + 32;
                    System.out.printf("%f\t\t%f\n", tempInicial, resultado);
                    tempInicial ++;
                }
            } else
                System.out.println("RANGO INCORRECTO... La Temperatura Final no puede ser menor a la Inicial.");
            System.out.print("\n\nDeseas continuar (S/N) ? "); resp =
            Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}