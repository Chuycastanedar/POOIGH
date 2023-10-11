// Permite capturar n, calcular y mostras calificaciones por medio de un arreglo

import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        int n = 0;
        int mayores = 0;
        float suma = 0, promedio = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("\033[H\033[2J"); System.out.flush();
        //Tamaño del arreglo
        System.out.print("Cuantas calificaciones deseas procesar? ");       
        n = obj.nextInt();
        float [] calificaciones = new float [n];
        // Captura de calificaciones
        System.out.printf("\nIntroduce las %d calificaciones...\n", n);
        for (int i=0; i<calificaciones.length; i++){
            System.out.printf("Calificacion %d: ", i+1);
            calificaciones [i] = obj.nextFloat();
        }
        // Muestra de calificaciones capturadas
        System.out.println("\nLas calificaciones capturadas son: ");
        for (float cal : calificaciones){
            System.out.printf("%.2f ", cal);
            suma = suma + cal;
        }
        // Calculo y muestra del promedio y suma
        promedio = suma/calificaciones.length;
        System.out.printf("\n\nLa suma es: %.2f", suma);
        System.out.printf("\n\nEl promedio es: %.2f", promedio);
        // Identificar mayores al promedio
        System.out.print("\n\nElementos mayores al promedio: ");
        for (int i=0; i<n; i++){
            if (calificaciones[i]>promedio){
                System.out.print(calificaciones[i]+" ");
                mayores++;
            }
        }
        System.out.printf("\nHay %d calificaciones mayores al promedio... ",mayores);
    }
}
