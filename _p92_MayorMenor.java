// Permite capturar n numeros, muestra y encuentra al mayor y menor

import java.util.Scanner;

public class _p92_MayorMenor {
    public static void main(String[] args) {
        int n = 0;
        int menor, mayor;
        Scanner obj = new Scanner(System.in);

        System.out.println("\033[H\033[2J"); System.out.flush();
        //Tamaño del arreglo
        System.out.print("Cuantos números deseas procesar? ");       
        n = obj.nextInt();
        int [] numeros = new int [n];
        // Captura de elementos
        System.out.printf("\nIntroduce los %d elementos...\n", n);
        for (int i=0; i<numeros.length; i++){
            System.out.printf("Elemento %d: ", i+1);
            numeros [i] = obj.nextInt();
        }
        // Muestra de calificaciones capturadas
        System.out.print("\nLas calificaciones capturadas son: ");
        for (int cal : numeros){
            System.out.printf("%d ", cal);
        }
        // Identificar al menor y mayor
        menor = mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros [i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i]<menor) {
                menor = numeros[i];
            }
        }
        System.out.println("\nEl menor es: " + menor);
        System.out.println("\nEl mayor es: " + mayor);
    }
}
