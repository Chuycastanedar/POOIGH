//Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        
        double horas, dias, minutos, segundos;

        Scanner obj = new Scanner(System.in);

        System.out.print("\nIngresa la cantidad de HORAS: ");
        horas = obj.nextInt();
        
        dias = horas / 24;
        minutos = horas * 60;
        segundos = minutos * 60;

        System.out.println(String.format("\nLas horas: %.2f, corresponden a...", horas));
        System.out.println(String.format("DIAS: %.2f", dias));
        System.out.println(String.format("MINUTOS: %.2f", minutos));
        System.out.println(String.format("SEGUNDOS: %.2f", segundos));

    }
}
