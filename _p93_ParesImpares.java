// Declara dos arreglos y muestra de acuerdo a las condiciones 

import java.util.Random;

public class _p93_ParesImpares {

    public static void GeneraAleatorio(int[] nums) {
        int min = 0, max = 20;
        Random rnd = new Random();
        for (int i = 0; i < nums.length; i++)
    
            nums[i] = Math.abs(rnd.nextInt(max - min)) + min;
    
    }
    public static void Mostrar(int[] nums) {
        for (int n : nums)
            System.out.printf("%d ", n);

        System.out.println("\n");
    }
    public static void ParesImpares(int[] nums){
        int pares = 0;
        System.out.print("\nPARES: ");
        for (int n : nums){
            if (n % 2 == 0){
                System.out.print(n + " ");
                pares ++;
            } 
        }
        System.out.println("\n* Número de elementos pares: "+ pares+"\n");
        int impares = 0;
        System.out.print("\nIMPARES: ");
        for (int n : nums){
            if (n % 2 != 0){
                System.out.print(n + " ");
                impares ++;
            } 
        }
        System.out.println("\n* Número de elementos impares: "+ impares);
    }
    
    public static void main(String[] args) {
        int MAX = 100;
        int[] A = new int[MAX];
        int[] B = new int[MAX];

        System.out.println("\033[H\033[2J"); System.out.flush();
        // Arreglo A
        System.out.println("ARREGLO [A] ALEATORIOS GENERADOS:\n");
        GeneraAleatorio(A);
        Mostrar(A);
        ParesImpares(A);
        System.out.println("\n---------------------------------------"+
        "------------------------------------------------------------");
        // Arreglo B
        System.out.println("\nARREGLO [B] ALEATORIOS GENERADOS:\n");
        GeneraAleatorio(B);
        Mostrar(B);
        ParesImpares(B);
    }
}
