// Imprimir numeros de 1 a N, N a 1 segun sea necesario

import java.util.Scanner;

public class _p55_SumaParesImpares {
    public static void main(String[] args) {
        int n, op, p, suma;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("*Numeros pares de 2 a n y su suma.... [ 1 ]");
            System.out.println("*Numeros impares de n a 1 y su suma.... [ 2 ]");
            System.out.println("*Salir .................................. [ 3 ]");
            System.out.print("\nCual eliges: "); op = obj.nextInt();
            switch(op) {
                case 1:
                    suma = 0;
                    System.out.println("\nImprime numeros pares de 2 a [N] ");
                    System.out.print("\nIngresa hasta donde [N]... "); n = obj.nextInt();
                    for(int i=2; i<=n; i+=2){
                    System.out.printf("%d ",i);
                    suma += i;
                    }
                    System.out.printf("\n\nLa suma de los numeros es: %d", suma); break;
                case 2:
                    suma = 0;
                    System.out.println("\nImprime numeros impares de [N] a 1 ");
                    System.out.print("\nIngresa desde donde [N]... "); n = obj.nextInt();
                    p = ( n%2==0 ? --n : n);
                    for(int i=n; i>=1; i-=2){
                    System.out.printf("%d ",i);
                    suma += i;
                    }
                    System.out.printf("\n\nLa suma de los numeros es: %d", suma); break;
                case 3:
                    System.out.println("\nTe vas por que quieres nadie te corre...");break;
                default:
                    System.out.println("\nOpcion Invalida...");break;
        }
        System.out.println("\nPresiona <Enter> para continuar..."); obj.nextLine();obj.nextLine();
        } while( op != 3);
        System.out.println("\nProceso Terminado ....");
    }
}    