// Imprimir numeros de 1 a N, N a 1 segun sea necesario

import java.util.Scanner;

public class _p54_ArribaAbajo {
    public static void main(String[] args) {
        int n, op;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("*Numeros de 1 a n .... [ 1 ]");
            System.out.println("*Numeros de n a 1 .... [ 2 ]");
            System.out.println("*Salir ............... [ 3 ]");
            System.out.print("\nCual eliges: "); op = obj.nextInt();
            switch(op) {
                case 1:
                    System.out.println("\nImprime numeros de 1 a [N] ");
                    System.out.print("\nIngresa hasta donde [N]... "); n = obj.nextInt();
                    for(int i=1; i<=n; i++)
                    System.out.printf("%d ",i);
                    break;
                case 2:
                    System.out.println("\nImprime numeros de [N] a 1 ");
                    System.out.print("\nIngresa desde donde [N]... "); n = obj.nextInt();
                    for(int i=n; i>=1; i--)
                    System.out.printf("%d ",i);
                    break;
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