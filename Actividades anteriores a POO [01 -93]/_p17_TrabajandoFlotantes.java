// Trabajando con números flotantes

public class _p17_TrabajandoFlotantes {
    public static void main(String[] args) {
        float num1 = 423.45f;
        float num2 = 123f;
        float num3 = 1.94e-8f;
        double num4 = 1232312321.434343d;
        double num5 = .3456;

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nUso de String.format para formateo de números flotantes: ");
        System.out.println(String.format("num1 y num2 en formato flotante                         : %f %f",num1,num2));
        System.out.println(String.format("num1 y num2 en formato flotante con decimales           : %.2f %.3f",num1,num2));
        System.out.println(String.format("num1 alineado en formato flotante alineado              : %10.2f",num1));
        System.out.println(String.format("num2 alineado en formato flotante alineado              : %10.2f",num2));
        System.out.println(String.format("num3 alineado en formato flotante exponencial           : %e",num2));
        System.out.println(String.format("num3 alineado en formato flotante exponencial decimales : %.3e",num2));
        System.out.println(String.format("num5 en formato flotante                                : %,.2f",num5));
        System.out.println(String.format("num5 en formato flotante separador miles                : %,.2f",num5));

        System.out.println("\nUso de System.out.prinf para dar formato a números flotantes: ");
        System.out.printf("num1, num2 en formato floante                   : %f %f \n", num1,num2);
        System.out.printf("num3, num4 en formato flotante con decimales    : %.2f %.2f \n", num3,num4);
        System.out.printf("num4, num5 en formato exponencial               : %e %e \n", num4,num5);
        System.out.printf("num4, num5 en formato exponencial con decimales : %.2e %.2e \n", num4,num5);

        System.out.println("\nUso MIN_VALUE y MAX_VALUE conocer los rangos de los números flotantes: ");
        System.out.println(String.format("\nTipo: float, Min: %f Max: %f",Float.MIN_VALUE, Float.MAX_VALUE));
        System.out.println(String.format("\nTipo: double, Min: %f Max: %f",Double.MIN_VALUE, Double.MAX_VALUE));

    }   
}