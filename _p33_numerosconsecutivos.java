// Verificar y confirmar si los 3 numeros ingresados son consecutivos...

import java.util.Scanner;

public class _p33_numerosconsecutivos {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Verificar si los numeros ingresados son consecutivos...");
        System.out.print("\nIngresa el PRIMER numero: "); numero1 = obj.nextInt();
        System.out.print("\nIngresa el SEGUNDO numero: "); numero2 = obj.nextInt();
        System.out.print("\nIngresa el TERCER numero: "); numero3 = obj.nextInt();

        if (numero1 + 1 == numero2){
            if (numero2 + 1 == numero3);
                System.out.println("Los numeros ingresados SI son consecutivos...");
        }else
            System.out.println("Los numeros ingresados NO son consecutivos...");
    }
}
