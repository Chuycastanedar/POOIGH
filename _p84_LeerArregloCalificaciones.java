// Leer un arreglo de n calificaciones flotantes, calcula la suma y el promedio

import java.util.Scanner;

public class _p84_LeerArregloCalificaciones {
    public static void main(String[] args) {
        int n = 0;
        float suma = 0, promedio = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("\033[H\033[2J"); System.out.flush();
        System.out.print("\nCuantas calificaciones deseas procesar? ");
        n = obj.nextInt();

        float [] califs = new float [n];
        System.out.printf("\nIntroduce las %d calificaciones...\n", n);
        for (int i=0; i<califs.length; i++){
            System.out.printf("Calificacion %d: ", i+1);
            califs [i] = obj.nextFloat();
        }

        System.out.println("Las calificaciones capturadas son: ");
        for (float cal : califs){
            System.out.printf("%.2f ", cal);
            suma = suma + cal;
        }

        promedio = suma/califs.length;
        System.out.printf("\n\nLa suma es: %.2f", suma);
        System.out.printf("\n\nEl promedio es: %.2f", promedio);
    }
}
