// Imprime números impares de forma ascendente desde 1 hasta el número elegido

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int n, inicio, suma, cantidad, promedio;
        char resp;
        Scanner obj = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Imprimir números impares desde 1 hasta n, forma ascendente...");
            System.out.print("\nIngresa el número n: "); n = obj.nextInt();
            inicio = 1; suma = 0; cantidad = 0;
            if (n > inicio){
                while (inicio <= n){
                    System.out.printf("%d" + " ", inicio);
                    suma = suma + inicio;
                    inicio = inicio + 2;
                    cantidad ++;
                }
                System.out.printf("\n\nLa suma de los numeros impares es: %d", suma);
                promedio = suma / cantidad;
                System.out.printf("\nEl promedio corresponde a: %d", promedio);
            } else
                System.out.println("Debes ingresar un numero [n] mayor a 1...");
            System.out.print("\n\nDeseas continuar (S/N) ? "); resp =
            Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}