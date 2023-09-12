// Imprime los primeros n elementos de la serie de Fibbonaci...

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        int valorMax, elementos, termino, numero1, numero2;
        char resp;
        Scanner obj = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Generador de los primeros [n] elementos de la serie Fibbonaci...");
            System.out.print("\nIngresa el valor [n] maximo: "); valorMax = obj.nextInt();
            System.out.printf("\nLa sucesion Fibbonaci hasta el elemento: %d es...\n", valorMax); 
            elementos = 1; numero1 = 0; numero2 = 1; termino = 1;
            if (valorMax > 1){
                while (elementos <= valorMax){
                    System.out.printf("%d"+" ",numero1);
                    termino = numero1 + numero2;
                    numero1 = numero2;
                    numero2 = termino;
                    elementos++;
                }
            } else
                System.out.println("VALOR INCORRECTO... El elemento final debe de ser mayor a 1...");
            System.out.print("\n\nDeseas continuar (S/N) ? "); resp =
            Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
