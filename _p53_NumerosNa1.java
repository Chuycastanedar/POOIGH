// Imprime numeros de N a 1 con paso de P

import java.util.Scanner;

public class _p53_NumerosNa1 {
    public static void main(String[] args) {
        int n,p;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Imprime numeros de [N] a 1 con paso de [P]");
        System.out.print("\nIngresa desde donde [N]... "); n = obj.nextInt();
        System.out.print("\nIngresa el paso [P]... "); p = obj.nextInt();
        
        for(int i=n; i>=1; i-=p) {
            System.out.printf("%d ",i);
        }
        System.out.println("\nProceso terminado...");
    }
}