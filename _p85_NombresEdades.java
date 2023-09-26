// Leer un arreglo de n nombres y n edades, calcula el promedio de edades

import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        int n = 0, s = 0, p = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("\033[H\033[2J"); System.out.flush();
        System.out.print("\nCuantas personas deseas procesar? "); n = obj.nextInt();
        String [] nombres = new String[n];
        int [] edades = new int [n];
 
        System.out.printf("\nIntroduce los nombres y edades de las %d personas que dijiste...", n);
        for (int i=0; i<n; i++){
            obj.nextLine();
            System.out.printf("\nDame el nombre %d: ", i+1); nombres [i] = obj.nextLine();
            System.out.print("Dame la edad: "); edades [i] = obj.nextInt();
        }

        System.out.print("\n=========================================================");
        System.out.println("\nLos nombres y las edades de las personas capturadas son:");
        System.out.println("Nombre:\tEdad:\n");
        for (int i=0; i<n; i++){
            System.out.printf("%s\t%d\n", nombres[i], edades[i]);
            s = s + edades[i];
        }
        p = s / n;
        System.out.println("\nEl promedio de edades es: " + p);
    }
}
