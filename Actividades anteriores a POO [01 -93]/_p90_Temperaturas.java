// Arreglo de numeros flotantes que muestra y reemplaza algunos elementos

public class _p90_Temperaturas {
    public static void main(String[] args) {
        double [] temperaturas = {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};

        System.out.println("\033[H\033[2J"); System.out.flush();
        System.out.print("El primer elemento del arreglo es: " + temperaturas[0]);
        System.out.print("\n\nEl tercer elemento del arreglo es: " + temperaturas[2]);

        System.out.print("\n\nTodos los elementos del arreglo: ");
        for (int i=0; i<9; i++)
            System.out.print(temperaturas[i]+" ");

        // Ponga a 0 todos los elementos mayores a 10
        System.out.println("\n\nPonga a 0 todos los elementos mayores a 10...");
        System.out.print("Todos los elementos del arreglo: ");
        for (int i=0; i<9; i++){
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
            System.out.print(temperaturas[i]+" ");
        }
    }
}