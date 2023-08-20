// Calcula el pago que recibe un trabajador a partir de algunos parámetros

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        
        String nombre;
        int horas;
        float paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);
        //Entrada
        System.out.print("Ingresa tu nombre: "); nombre = obj.nextline();
        System.out.print("Ingresa tus horas trabajadas: "); horas = obj.nextline();
        System.out.print("Ingresa tu pago por hora: "); paga = obj.nextline();

        tasa = 0.3f;
        //Cálculo
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        //Salida
        System.out.println("Resumen de pagos: \n");
        System.out.println(String.format("El trabajador %s, trabajo %d horas, con una paga de %.2f pesos por hora,",
                  "se asume una tasa de impuesto de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta %.2f", pagabruta));
        System.out.println(String.format("Impuestos %.2f", impuesto));
        System.out.println(String.format("Paga neta %.2f", paganeta));

    }
}