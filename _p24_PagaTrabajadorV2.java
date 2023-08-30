// Calcula la paga de un trabajador, las horas extra se pagan al doble

import java.util.Scanner;

public class _p24_PagaTrabajadorV2 {
    public static void main(String[] args) {
        int horas, extr;
        float paga, total;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calcula la paga de un trabajador, la horas extra se pagan al doble\n");
        System.out.print("Horas trabajadas: "); horas = obj.nextInt();
        System.out.print("Paga x hora: "); paga = obj.nextFloat();

        if (horas > 40 ) {
            extr = horas - 40;
            total = 40 * paga + (2 * paga * extr);
            System.out.printf("\nHoras extra: %d", extr);
        }
        else
            total = horas * paga;

        System.out.printf("\nPago total: %.2f", total);

    }
}
